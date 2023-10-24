package com.divise.divise.repository;

import com.divise.divise.entity.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IGroupRepository
        extends MongoRepository<Group, String> {
}
