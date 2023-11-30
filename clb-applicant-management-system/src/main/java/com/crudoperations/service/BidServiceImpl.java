package com.crudoperations.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudoperations.model.Bid;
import com.crudoperations.model.Property;
import com.crudoperations.repository.BidRepository;

@Service
public class BidServiceImpl implements BidService{

	
	private BidRepository bidRepository;
	@Override
	public List<Bid> findByProperty(Property property) {
	
		return bidRepository.findByProperty();
	}

}
