package com.hexaware.busfastx.service;

import java.util.List;

import com.hexaware.busfastx.entity.Admin;
import com.hexaware.busfastx.repository.AdminRepository;

public class AdminServiceImpl implements IAdminService{

	
	AdminRepository repo;
	
	@Override
	public Admin addAdmin(Admin admin) {
		return repo.save(admin);
	}

	@Override
	public Admin update(Admin admin) {
		return repo.save(admin);	}

	@Override
	public void deleteAdminById(int adminId) {
		repo.deleteById(adminId);
		
	}

	@Override
	public Admin getAdminById(int adminId) {
		return repo.findById(adminId).orElse(null);
	}

	@Override
	public List<Admin> getAllAdmins() {
		return repo.findAll();
	}

	@Override
	public List<Admin> getByEmail(String email) {
		return repo.findByEmail(email);
	}

}
