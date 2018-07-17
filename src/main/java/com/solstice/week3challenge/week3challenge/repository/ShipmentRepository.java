package com.solstice.week3challenge.week3challenge.repository;

import com.solstice.week3challenge.week3challenge.model.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment, Integer>
{

}
