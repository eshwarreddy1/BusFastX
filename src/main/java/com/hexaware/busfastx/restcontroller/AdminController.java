package com.hexaware.busfastx.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.busfastx.entity.Admin;
import com.hexaware.busfastx.service.IAdminService;



@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired
	IAdminService service;
	
	@PostMapping("/add")
	public  Admin    add(@RequestBody Admin admin) {
		  
		  return service.addAdmin(admin);
		  		
		  
		  
	  }
	
	@PutMapping("/update")
	public Admin update(@RequestBody Admin admin) {
		return service.update(admin);
	}
	
	@DeleteMapping("/delete/{adminId}")
	  public String   delete(@PathVariable  int adminId) {
		  
		  
		  service.deleteAdminById(adminId);
		  
		  return "Record delete for admin id " +adminId;
		  
	  }
	
	@GetMapping("/getbyid/{adminId}")
	  public  Admin   getById(@PathVariable int adminId) {
		  
		  
		  return  service.getAdminById(adminId);
		  
		  
	  }
	
	@GetMapping("/getall")
	  public List<Admin>  getAll(){
		  
		  
		  return service.getAllAdmins();		  
	  }
	
	@GetMapping("/getbyemail/{email}")
	  public List<Admin> getByEmail(@PathVariable String email){
		  return service.getByEmail(email);
	  }
	

}
