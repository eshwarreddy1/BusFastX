package com.hexaware.busfastx.service;

import java.util.List;

import com.hexaware.busfastx.entities.Users;

public interface IUsersService {
	public Users createUser(Users user);
	public Users updateUser(Users user,Long userId);
	public void  deleteUser(Long userId);
	public Users getUserById(Long userId);
	public List<Users>getAllUserCustomers();
	public List<Users> findByName(String userName);

	

}
