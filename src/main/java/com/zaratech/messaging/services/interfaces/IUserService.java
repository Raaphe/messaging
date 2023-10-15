package com.zaratech.messaging.services.interfaces;

import com.zaratech.messaging.payloads.UserDto;

public interface IUserService {

    public boolean CreateUser(UserDto userDto);
}
