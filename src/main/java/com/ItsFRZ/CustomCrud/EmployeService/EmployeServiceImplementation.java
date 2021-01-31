package com.ItsFRZ.CustomCrud.EmployeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ItsFRZ.CustomCrud.Model.EmployeModel;
import com.ItsFRZ.CustomCrud.Repository.EmployeRepository;

@Service
public class EmployeServiceImplementation implements EmployeService{

	@Autowired
	private EmployeRepository repository;
	
	
	
	public EmployeRepository getRepository() {
		return repository;
	}

	public void setRepository(EmployeRepository repository) {
		this.repository = repository;
	}

	@Override
	public EmployeModel saveEmployeData(EmployeModel model) {
		// TODO Auto-generated method stub
		return repository.save(model);
	}

	@Override
	public EmployeModel updateEmployeData(EmployeModel model) {
		// TODO Auto-generated method stub
		return repository.save(model);
	}

	@Override
	public void deleteEmployeData(int id) {
		// TODO Auto-generated method stub
		
		repository.deleteById(id);
		
	}

	@Override
	public Optional<EmployeModel> findEmployeDataById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<EmployeModel> findAllEmployeData() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
