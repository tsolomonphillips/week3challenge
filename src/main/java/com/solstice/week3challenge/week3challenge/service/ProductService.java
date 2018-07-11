package com.solstice.week3challenge.week3challenge.service;

import com.solstice.week3challenge.week3challenge.model.Product;
import com.solstice.week3challenge.week3challenge.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    public Product findById(Integer productId)
    {
        return productRepository.findOne(productId);
    }

    public void addProduct(Product productId)
    {
        productRepository.save(productId);
    }

    public void deleteProduct(Product productId)
    {
        productRepository.delete(productId);
    }

    public void updateProduct(Product productId)
    {
        productRepository.save(productId);
    }
}
