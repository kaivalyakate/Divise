package com.divise.divise.entity;

import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class DivideFactor {
    public DivideType divideType;
    public List<Double> divideFactor;

    public DivideFactor(double amount, int usersInvolved) {
        double dividePercentage = amount/usersInvolved;
        Collections.fill(divideFactor, dividePercentage);
    }
}

//["gsokhi", 21.45]
//["kchou", 45.67]
