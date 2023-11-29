package com.crudoperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperations.model.Applicant;
import com.crudoperations.repository.ApplicantRepository;

//ApplicantServiceImpl.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//ApplicantServiceImpl.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantServiceImpl implements ApplicantService {

 @Autowired
 private ApplicantRepository applicantRepository;

 @Override
 public List<Applicant> getAllApplicants() {
     return applicantRepository.findAll();
 }

 @Override
 public Applicant getApplicantById(Long id) {
     return applicantRepository.findById(id).orElse(null);
 }

 @Override
 public void saveApplicant(Applicant applicant) {
     applicantRepository.save(applicant);
 }

 @Override
 public void deleteApplicant(Long id) {
     applicantRepository.deleteById(id);
 }
}

