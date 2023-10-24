package com.divise.divise.entity.request;

import lombok.Data;

import java.util.List;

@Data
public class GroupRequestDto {
    public String groupName;
    public List<String> users;
    public List<String> expenses;
}
