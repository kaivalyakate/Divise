package com.divise.divise.Entity.Request;

import com.divise.divise.Entity.Expense;
import com.divise.divise.Entity.User;
import lombok.Data;

import java.util.List;

@Data
public class GroupRequestDto {
    public String groupName;
    public List<User> users;
    public List<Expense> expenses;
}
