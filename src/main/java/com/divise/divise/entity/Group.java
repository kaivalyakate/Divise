package com.divise.divise.entity;

import com.divise.divise.entity.request.GroupRequestDto;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("Groups")
public class Group {

    @Id
    public String groupId;
    public String groupName;
    public String createdBy;
    public List<String> users;
    public List<String> expenses;
    public Double owesAmountToUsers;
    public Double amountOwedToUser;

    public Group(GroupRequestDto groupRequestDto) {
        groupName = groupRequestDto.getGroupName();
        users = groupRequestDto.getUsers();
        expenses = groupRequestDto.getExpenses();
    }

    public void addExpense(Expense expense) {
        this.expenses.add(expense.getExpenseId());
        this.rebalance();
    }

    public void removeExpense(Expense expense) {
        this.expenses.removeIf(x -> x.equals(expense.getExpenseId()));
        this.rebalance();
    }

    private void rebalance() {

    }
}
