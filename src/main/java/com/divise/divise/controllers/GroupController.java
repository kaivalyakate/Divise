package com.divise.divise.controllers;

import com.divise.divise.entity.Group;
import com.divise.divise.entity.request.GroupRequestDto;
import com.divise.divise.services.IGroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {

    private final IGroupService groupService;

    public GroupController(IGroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping(value = "/group/create", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Group> createGroup(@RequestBody GroupRequestDto groupRequest) {
        Group group = groupService.create(groupRequest);
        return ResponseEntity.ok(group);
    }


}
