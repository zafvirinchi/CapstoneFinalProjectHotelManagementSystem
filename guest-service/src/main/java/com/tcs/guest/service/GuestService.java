package com.tcs.guest.service;

import java.util.List;

import com.tcs.guest.dto.UserDto;
import com.tcs.guest.entity.User;

public interface GuestService {

	public User addUser(UserDto userDto);

	public List<User> getUsers();

	public User getUserById(int userId);

	public User updateUser(UserDto userDto, int userId);

	public String deleteUser(int userId);

	public User getUserByUserName(String username);

}
