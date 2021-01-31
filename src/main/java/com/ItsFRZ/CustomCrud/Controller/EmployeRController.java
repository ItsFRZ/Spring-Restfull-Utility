package com.ItsFRZ.CustomCrud.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ItsFRZ.CustomCrud.EmailService.EmailService;
import com.ItsFRZ.CustomCrud.EmailUtility.APIDTO.MailRequest;
import com.ItsFRZ.CustomCrud.EmailUtility.APIDTO.MailResponse;
import com.ItsFRZ.CustomCrud.EmployeService.EmployeService;
import com.ItsFRZ.CustomCrud.Model.EmployeModel;

@RestController
@RequestMapping("/dataapi")
public class EmployeRController {

	@Autowired
	private EmployeService service;

	@Autowired
	private EmailService service2;


	@PostMapping("/email")
	public MailResponse sendEmail(@RequestBody MailRequest request) 
	{
		
		Map<String, Object> model = new HashMap<String, Object>();
		return service2.sendEmail(request, model);
		
	}
	
	@GetMapping
	public List<EmployeModel> getAllEmploye() 
	{
		
//		return repository.findAll();
		return service.findAllEmployeData();
	}
	
	@PostMapping
	public EmployeModel saveEmployeData(@RequestBody EmployeModel model) 
	{
//		return repository.save(model);
	
		
		return service.saveEmployeData(model);
	}
	
	@PutMapping
	public EmployeModel updateEmployeData(@RequestBody EmployeModel model) 
	{
		
		return service.saveEmployeData(model);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployeData(@PathVariable("id") int id) 
	{
		
		 service.deleteEmployeData(id);
	}
	
	
	@GetMapping("/{id}")
	public Optional<EmployeModel> getEmployeDataById(@PathVariable("id") int id) 
	{
		
		 return service.findEmployeDataById(id);
	}
	
	
}
