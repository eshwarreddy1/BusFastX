package com.hexaware.busfastx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.busfastx.entities.Users;


public interface IUsersRepository extends JpaRepository <Users, Long>{

}
