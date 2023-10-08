package com.divise.divise.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("Groups")
public class Group {

    @Id
    public String groupId;
    public List<User> users;
    public List<Expense> expenses;
    public double balance;
}
