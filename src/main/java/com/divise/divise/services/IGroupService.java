package com.divise.divise.services;

import com.divise.divise.entity.Group;
import com.divise.divise.entity.request.GroupRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface IGroupService {
    Group create(GroupRequestDto groupRequestDto);
    Group update(Group group);
    Group get(String groupId);
    void addExpense(String groupId, String expenseId);
}
