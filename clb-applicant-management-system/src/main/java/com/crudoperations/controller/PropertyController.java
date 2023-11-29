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

import com.crudoperations.model.Property;
import com.crudoperations.service.PropertyService;

@Controller
@RequestMapping("/properties")
public class PropertyController {
	
	@Autowired
    private PropertyService propertyService;

    @GetMapping()
    public String listProperties(Model model) {
        List<Property> properties = propertyService.getAllProperties();
        model.addAttribute("properties", properties);
        return "properties/list";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("property", new Property());
        return "property/form";
    }

    @PostMapping("/save")
    public String saveProperty(@ModelAttribute Property property) {
    	propertyService.saveProperty(property);
        return "redirect:/properties";
    }

    @GetMapping("/edit/{id}")
    public String editProperty(@PathVariable Long id, Model model) {
        Property property = propertyService.getPropertyById(id);
        model.addAttribute("property", property);
        return "property/form";
    }


	

}
