package com.ItsFRZ.CustomCrud.EmployeService;

import java.util.List;
import java.util.Optional;

import com.ItsFRZ.CustomCrud.Model.EmployeModel;

public interface EmployeService {

	EmployeModel saveEmployeData(EmployeModel model);
	EmployeModel updateEmployeData(EmployeModel model);
	void deleteEmployeData(int id);
	Optional<EmployeModel> findEmployeDataById(int id);
	List<EmployeModel> findAllEmployeData();
	
//	
//	
//
//	 EmpLocationEntity saveLocation(EmpLocationEntity location);
//	 EmpLocationEntity updateLocation(EmpLocationEntity location);
//	 void deleteLocation(EmpLocationEntity location);
//	 Optional<EmpLocationEntity> getLocationById(int lid);
//	 List<EmpLocationEntity> getAllEmployeeLocation();
//	
//	
}
