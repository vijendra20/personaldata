package com.crudoperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperations.model.Property;
import com.crudoperations.repository.PropertyRepository;
@Service
public class PropertyServiceImpl implements PropertyService {
	@Autowired
	// private ApplicantRepository applicantRepository;
	private PropertyRepository propertyRepository;

	
	@Override
	public List<Property> getAllProperties() {
		// TODO Auto-generated method stub
		return propertyRepository.findAll();

			}

	@Override
	public Property getPropertyById(Long id) {
		// TODO Auto-generated method stub
		return propertyRepository.findById(id).orElse(null);
	}
	      
	    
	@Override
	public void saveProperty(Property property) {
		// TODO Auto-generated method stub
		propertyRepository.save(property);
		
	}
	     }
	
	