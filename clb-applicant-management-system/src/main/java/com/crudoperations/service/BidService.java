package com.crudoperations.service;

import java.util.List;

import com.crudoperations.model.Bid;
import com.crudoperations.model.Property;

public interface BidService {

	
	List<Bid> findByProperty(Property property);

}
