package com.crudoperations.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudoperations.model.Bid;
@Repository
public interface BidRepository extends JpaRepository<Bid, Long>{

	List<Bid> findByProperty();

}
