package com.crudoperations.controller;

import java.util.Collection;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crudoperations.model.Applicant;
import com.crudoperations.model.Bid;
import com.crudoperations.model.Property;
import com.crudoperations.repository.ApplicantRepository;
import com.crudoperations.repository.BidRepository;
import com.crudoperations.repository.PropertyRepository;

//BidController.java
@Controller
@RequestMapping("/bids")
public class BidController {
 
 @Autowired
 private BidRepository bidRepository;
 
 @Autowired
 private PropertyRepository propertyRepository;
 
 @Autowired
 private ApplicantRepository applicantRepository;

 @GetMapping("/list")
 public String bidList(Model model) {
     Collection<Bid> bids = bidRepository.findAll();
     model.addAttribute("bids", bids);
     return "bidList";
 }

 @GetMapping("/create")
 public String showBidForm(Model model) {
     Collection<Property> properties = propertyRepository.findAll();
     Collection<Applicant> applicants = applicantRepository.findAll();
     
     model.addAttribute("properties", properties);
     model.addAttribute("applicants", applicants);
     model.addAttribute("bid", new Bid());
     
     return "bidForm";
 }

 @PostMapping("/create")
 public String processBidForm(@ModelAttribute Bid bid) {
     bidRepository.save(bid);
     return "redirect:/bids/list";
 }
}
