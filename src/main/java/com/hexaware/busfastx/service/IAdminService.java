package com.hexaware.busfastx.service;

import java.util.List;

import com.hexaware.busfastx.entities.Admin;



public interface IAdminService {
	
	public Admin addAdmin(Admin admin);
	public Admin update(Admin admin);
	public void deleteAdminById(int adminId);
	public Admin getAdminById(int adminId);
	public List<Admin> getAllAdmins();
	
	public List<Admin> getByEmail(String email);

}
