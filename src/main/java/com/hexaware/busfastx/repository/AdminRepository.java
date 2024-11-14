package com.hexaware.busfastx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.busfastx.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	List<Admin> findByEmail(String email);

}
