package com.divise.divise.Services;

import com.divise.divise.Entity.Request.UserRequestDto;
import com.divise.divise.Entity.User;
import com.divise.divise.Repository.IUserRepository;

public class UserService implements IUserService{

    private IUserRepository userRepository;

    @Override
    public User create(UserRequestDto userRequestDto) {
        return null;
    }
}
