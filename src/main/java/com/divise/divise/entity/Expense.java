package com.divise.divise.entity;

import com.divise.divise.entity.request.ExpenseRequestDto;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document("Expenses")
public class Expense {

    @Id
    public String expenseId;
    public String userId;
    public String paidBy;
    public String groupId;
    public LocalDateTime expenseDateTime;
    public Double amount;
    public List<String> usersInvolved;
    public DivideFactor divideFactor;

    public Expense(ExpenseRequestDto expenseRequestDto) {
        this.userId = expenseRequestDto.getUserId();
        this.paidBy = expenseRequestDto.getPaidBy();
        this.groupId = expenseRequestDto.getGroupId();
        this.expenseDateTime = expenseRequestDto.getExpenseDateTime();
        this.amount = expenseRequestDto.getAmount();
        this.usersInvolved = expenseRequestDto.getUsersInvolved();
        this.divideFactor = new DivideFactor(expenseRequestDto.getAmount(), usersInvolved.size());
    }
}

