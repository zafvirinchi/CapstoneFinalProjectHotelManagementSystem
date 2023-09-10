package com.tcs.guest.mapper;

import com.tcs.guest.dto.UserDto;
import com.tcs.guest.entity.User;

public interface UserMapper {
   public User convert(UserDto userDto);
   public UserDto convert(User user);
}