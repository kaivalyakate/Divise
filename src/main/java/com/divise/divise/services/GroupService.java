package com.divise.divise.services;
import com.divise.divise.entity.Group;
import com.divise.divise.entity.request.GroupRequestDto;
import com.divise.divise.repository.IGroupRepository;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class GroupService implements IGroupService{

    private final IGroupRepository groupRepository;

    public GroupService(IGroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Group create(GroupRequestDto groupRequestDto) {
        return groupRepository.save(new Group(groupRequestDto));
    }

    @Override
    public Group update(Group updateGroup) {
        return groupRepository.save(updateGroup);
    }

    @Override
    public Group get(String groupId) {
        Optional<Group> group = groupRepository.findById(groupId);
        return group.orElse(null);
    }

    @Override
    public void addExpense(String groupId, String expenseId) {
        Group group = get(groupId);
        if (group != null) {
            group.expenses.add(expenseId);
            groupRepository.save(group);
        }
    }


}
