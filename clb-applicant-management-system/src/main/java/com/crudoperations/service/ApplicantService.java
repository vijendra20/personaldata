package com.crudoperations.service;

import java.util.List;

import com.crudoperations.model.Applicant;

	public interface ApplicantService {
	    List<Applicant> getAllApplicants();
	    Applicant getApplicantById(Long id);
	    void saveApplicant(Applicant applicant);
	    void deleteApplicant(Long id);
	}



