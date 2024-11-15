package com.hexaware.busfastx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.busfastx.entities.Admin;


@Repository
public interface IAdminRepo extends JpaRepository <Admin, Integer>{

	List<Admin> findByEmail(String email);

}
