package com.divise.divise.entity;

import com.divise.divise.entity.request.UserRequestDto;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Users")
public class User {

    @Id
    public String userId;
    public String name;
    public String email;
    public String phoneNumber;

    public User(UserRequestDto userRequestDto) {
        name = userRequestDto.getName();
        email = userRequestDto.getEmail();
        phoneNumber = userRequestDto.getPhoneNumber();
    }
}
