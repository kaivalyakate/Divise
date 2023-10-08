package com.divise.divise.Controllers;

import com.divise.divise.Entity.Group;
import com.divise.divise.Entity.Request.GroupRequestDto;
import com.divise.divise.Services.IGroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {

    private IGroupService groupService;

    @PostMapping(value = "/group/create", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Group> createGroup(@RequestBody GroupRequestDto groupRequest) {
        Group group = groupService.create(groupRequest);
        return ResponseEntity.ok(group);
    }
}
