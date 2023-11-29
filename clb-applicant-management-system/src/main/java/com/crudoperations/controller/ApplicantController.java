package com.crudoperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crudoperations.model.Applicant;
import com.crudoperations.service.ApplicantService;

@Controller
@RequestMapping("/applicants")
public class ApplicantController {

	    @Autowired
	    private ApplicantService applicantService;

	    @GetMapping
	    public String listApplicants(Model model) {
	        List<Applicant> applicants = applicantService.getAllApplicants();
	        model.addAttribute("applicants", applicants);
	        return "applicant/list";
	    }

	    @GetMapping("/form")
	    public String showForm(Model model) {
	        model.addAttribute("applicant", new Applicant());
	        return "applicant/form";
	    }

	    @PostMapping("/save")
	    public String saveApplicant(@ModelAttribute Applicant applicant) {
	        applicantService.saveApplicant(applicant);
	        return "redirect:/applicants";
	    }

	    @GetMapping("/edit/{id}")
	    public String editApplicant(@PathVariable Long id, Model model) {
	        Applicant applicant = applicantService.getApplicantById(id);
	        model.addAttribute("applicant", applicant);
	        return "applicant/form";
	    }

	    @GetMapping("/delete/{id}")
	    public String deleteApplicant(@PathVariable Long id) {
	        applicantService.deleteApplicant(id);
	        return "redirect:/applicants";
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



 