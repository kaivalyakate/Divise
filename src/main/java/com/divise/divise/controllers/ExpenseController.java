package com.divise.divise.controllers;

import com.divise.divise.entity.Expense;
import com.divise.divise.entity.request.ExpenseRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

    @PostMapping(value = "/expense/create", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Expense> createExpense(@RequestBody ExpenseRequestDto expenseRequestDto) {
        return ResponseEntity.badRequest().build();
    }
}
