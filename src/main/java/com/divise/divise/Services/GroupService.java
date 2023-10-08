package com.divise.divise.Services;

import com.divise.divise.Entity.Group;
import com.divise.divise.Entity.Request.GroupRequestDto;
import com.divise.divise.Repository.IGroupRepository;
import org.springframework.stereotype.Component;

@Component
public class GroupService implements IGroupService{

    private IGroupRepository groupRepository;

    @Override
    public Group create(GroupRequestDto groupRequestDto) {
        return null;
    }
}
