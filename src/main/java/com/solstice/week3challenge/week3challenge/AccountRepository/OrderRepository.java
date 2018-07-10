package com.solstice.week3challenge.week3challenge.AccountRepository;

import com.solstice.week3challenge.week3challenge.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>
{
    Iterable<Order> findByDate(Date date);

    @Query(value = "SELECT * FROM orders INNER JOIN account ON orders.accountId = account.accountId " +
            "WHERE orders.orderDate = ? ORDER BY orders.date", nativeQuery = true)
    Iterable<Order> getAllOrdersForAccount(@Param("accountId") Integer accountId);
}
