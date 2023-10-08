package com.divise.divise.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Expenses")
public class Expense {

    @Id
    public String expenseId;
    public String groupId;
}
