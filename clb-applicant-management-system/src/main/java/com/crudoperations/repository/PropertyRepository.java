package com.crudoperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudoperations.model.Property;
@Repository
public interface PropertyRepository extends JpaRepository<Property, Long>{

}
