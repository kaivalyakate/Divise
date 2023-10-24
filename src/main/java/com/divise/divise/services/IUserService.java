package com.divise.divise.services;

import com.divise.divise.entity.request.UserRequestDto;
import com.divise.divise.entity.User;

public interface IUserService {
    User create(UserRequestDto userRequestDto);
}
