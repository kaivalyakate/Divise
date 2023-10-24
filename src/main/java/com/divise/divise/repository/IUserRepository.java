package com.divise.divise.repository;

import com.divise.divise.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRepository extends MongoRepository<User, String> {

}
