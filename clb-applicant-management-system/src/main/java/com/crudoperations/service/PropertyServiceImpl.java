package com.crudoperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperations.model.Property;
import com.crudoperations.repository.PropertyRepository;
@Service
public class PropertyServiceImpl implements PropertyService {
	@Autowired
    private PropertyRepository propertyRepository;

    @Override
    public List<Property> getAllProperties() {
        return propertyRepository.findAll();
    }

    @Override
    public Property getPropertyById(Long id) {
        return propertyRepository.findById(id).orElse(null);
    }

    @Override
    public void saveProperty(Property property) {
        propertyRepository.save(property);
    }
        

	@Override
	public void deleteProperty(Long id) {
		propertyRepository.deleteById(id);
		
	}
}