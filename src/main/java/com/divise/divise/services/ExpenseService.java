package com.divise.divise.services;

import com.divise.divise.entity.Expense;
import com.divise.divise.entity.Group;
import com.divise.divise.entity.request.ExpenseRequestDto;
import com.divise.divise.repository.IExpenseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ExpenseService implements IExpenseService{

    private final IExpenseRepository expenseRepository;
    private final IGroupService groupService;

    private final Logger logger = LoggerFactory.getLogger(ExpenseService.class);

    public ExpenseService(IExpenseRepository expenseRepository, IGroupService groupService) {
        this.expenseRepository = expenseRepository;
        this.groupService = groupService;
    }

    @Override
    public Expense create(ExpenseRequestDto expenseRequestDto) {
        Expense expense = new Expense(expenseRequestDto);
        Group group = groupService.get(expense.getGroupId());
        if (group == null) {
            logger.info("Group with "+expense.getGroupId()+" not found. Error Adding Expense");
            return null;
        }
        groupService.addExpense(group.getGroupId(), expense.getExpenseId());
        return expenseRepository.save(expense);
    }

    private Expense initializeExpenseObj(Expense expense) {
        Group group = groupService.get(expense.getGroupId());
        if (group != null) {
            //expense.setDiviseFactor(group);
            group.addExpense(expense);
        }
        return null;
    }
}
