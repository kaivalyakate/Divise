package com.divise.divise.repository;

import com.divise.divise.entity.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IExpenseRepository extends MongoRepository<Expense, String> {

}
