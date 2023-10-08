package com.divise.divise.Repository;

import com.divise.divise.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRepository extends MongoRepository<User, String> {

}
