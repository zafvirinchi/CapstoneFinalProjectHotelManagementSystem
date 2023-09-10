package com.tcs.guest.mapper;

import org.springframework.stereotype.Component;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;
import com.tcs.guest.dto.UserDto;
import com.tcs.guest.entity.User;

@Component
public class UserMapperImpl implements UserMapper{

	@Override
	public User convert(UserDto userDto) {
		JMapperAPI api = new JMapperAPI()
				.add(JMapperAPI.mappedClass(User.class));

		JMapper<User,UserDto> jMapper = new JMapper<>(User.class, UserDto.class, api);
		return jMapper.getDestination(userDto);
	}

	@Override
	public UserDto convert(User user) {
		JMapperAPI api = new JMapperAPI()
				.add(JMapperAPI.mappedClass(UserDto.class));

		JMapper<UserDto,User> jMapper = new JMapper<>(UserDto.class, User.class, api);
		return jMapper.getDestination(user);
	}
}
