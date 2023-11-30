package com.crudoperations.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
	public class Bid {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @ManyToOne
	    private Applicant applicant;
	    
	    @ManyToOne
	    private Property property;
	    
	    private double amount;
	    // Add other fields and methods as needed
	    
	}


