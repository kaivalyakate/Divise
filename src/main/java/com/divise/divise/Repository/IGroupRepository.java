package com.divise.divise.Repository;

import com.divise.divise.Entity.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IGroupRepository extends MongoRepository<Group, String> {

}
