package com.divise.divise.Entity;

import com.divise.divise.Entity.Request.GroupRequestDto;
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
    public List<User> users;
    public List<Expense> expenses;
    

    public Group(GroupRequestDto groupRequestDto) {
        groupName = groupRequestDto.getGroupName();
        users = groupRequestDto.getUsers();
        expenses = groupRequestDto.getExpenses();
    }
}
