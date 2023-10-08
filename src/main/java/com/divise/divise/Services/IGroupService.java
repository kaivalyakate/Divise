package com.divise.divise.Services;

import com.divise.divise.Entity.Group;
import com.divise.divise.Entity.Request.GroupRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface IGroupService {
    Group create(GroupRequestDto groupRequestDto);
}
