package com.crudoperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudoperations.model.Applicant;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long>{

}
