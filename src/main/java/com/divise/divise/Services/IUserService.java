package com.divise.divise.Services;

import com.divise.divise.Entity.Request.UserRequestDto;
import com.divise.divise.Entity.User;

public interface IUserService {
    User create(UserRequestDto userRequestDto);
}
