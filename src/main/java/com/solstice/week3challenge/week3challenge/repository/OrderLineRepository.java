package com.solstice.week3challenge.week3challenge.repository;

import com.solstice.week3challenge.week3challenge.model.Order;
import com.solstice.week3challenge.week3challenge.model.OrderLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderLineRepository extends CrudRepository<OrderLine, Integer>
{

}
