package com.divise.divise.entity.request;

import com.divise.divise.entity.DivideFactor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ExpenseRequestDto {
    public String userId;
    public String paidBy;
    public String groupId;
    public LocalDateTime expenseDateTime;
    public Double amount;
    public List<String> usersInvolved;
    public DivideFactor divideFactor;
}
