package com.solstice.week3challenge.week3challenge.controller;

import com.solstice.week3challenge.week3challenge.model.Product;
import com.solstice.week3challenge.week3challenge.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController
{
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public Iterable<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping("/{productId}")
    public Product findById(@PathVariable Integer productId)
    {
        return productService.findById(productId);
    }

    @PostMapping("")
    public ResponseEntity addProduct(@RequestBody Product product)
    {
        productService.addProduct(product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @PutMapping("/{productId}")
    public void updateProduct(@PathVariable Integer id, @RequestBody Product product)
    {
        Product productToUpdate = productService.findById(id);

        productToUpdate.setDescription(product.getDescription());
        productToUpdate.setImage(product.getImage());
        productToUpdate.setName(product.getName());
        productToUpdate.setPrice(product.getPrice());

        productService.updateProduct(productToUpdate);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Integer id)
    {
        Product productToDelete = productService.findById(id);
        productService.deleteProduct(productToDelete);
    }
}
