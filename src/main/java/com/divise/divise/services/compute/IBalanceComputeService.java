package com.divise.divise.services.compute;

import com.divise.divise.entity.Balance;
import com.divise.divise.entity.Group;
import org.springframework.stereotype.Service;

@Service
public interface IBalanceComputeService {
    void settleBalance();
    Balance getBalance(String userId, Group groupId);
}
