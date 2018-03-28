package com.crud.library.mapper;

import com.crud.library.domain.User;
import com.crud.library.domain.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {
    public User mapToUser(final UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getSurname(),
                userDto.getCreateAccountDate());
    }

    public UserDto mapToUserDto(final User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getSurname(),
                user.getCreateAccountDate());
    }

    public List<UserDto> mapToUserDtoList(final List<User> userList) {
        return userList.stream()
                .map(t -> new UserDto(t.getId(), t.getFirstName(), t.getSurname(), t.getCreateAccountDate()))
                .collect(Collectors.toList());

    }
}
