package com.blue.it.bluedemo.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.blue.it.bluedemo.dataAccess.concretes.UserCreateDTO;
import com.blue.it.bluedemo.dataAccess.concretes.UserUpdateDTO;
import com.blue.it.bluedemo.dataAccess.concretes.UserViewDTO;

public interface UserService {

	UserViewDTO getUserById(Long id);

	List<UserViewDTO> getUsers();
	
	UserViewDTO userCreate(UserCreateDTO userCreateDTO);

	UserViewDTO updateUser(Long id, UserUpdateDTO userUpdateDTO);

	void deleteUser(Long id);

	List<UserViewDTO> slice(Pageable pageable);

}
