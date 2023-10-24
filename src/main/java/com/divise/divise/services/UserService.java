package com.divise.divise.services;

import com.divise.divise.entity.request.UserRequestDto;
import com.divise.divise.entity.User;

public class UserService implements IUserService{

    @Override
    public User create(UserRequestDto userRequestDto) {
        return new User(userRequestDto);
    }
}
