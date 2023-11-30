package com.crudoperations.service;

import java.util.List;

import com.crudoperations.model.Property;


    
    
    public interface PropertyService {
        List<Property> getAllProperties();
        Property getPropertyById(Long id);
        void saveProperty(Property property);
        void deleteProperty(Long id);
    }
    
    
    

