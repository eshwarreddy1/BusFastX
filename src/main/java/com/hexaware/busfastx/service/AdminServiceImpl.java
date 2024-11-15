package com.hexaware.busfastx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.busfastx.entities.Admin;
import com.hexaware.busfastx.repository.IAdminRepo;
@Service
public class AdminServiceImpl implements IAdminService{

	@Autowired
	IAdminRepo repo;
	
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
