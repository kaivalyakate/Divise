package com.divise.divise.services;

import com.divise.divise.entity.Expense;
import com.divise.divise.entity.request.ExpenseRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface IExpenseService{
    Expense create(ExpenseRequestDto expenseRequestDto);
}
