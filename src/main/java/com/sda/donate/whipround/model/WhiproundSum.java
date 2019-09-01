package com.sda.donate.whipround.model;

import java.math.BigDecimal;

public class WhiproundSum {

    private WhipRound whipRound;
    private BigDecimal sum;

    public WhipRound getWhipRound(){
        return whipRound;
    }

    public WhiproundSum(WhipRound whipRound, BigDecimal sum) {
        this.whipRound = whipRound;
        this.sum = sum;
    }

    public BigDecimal getPercentage(){

        if(sum.compareTo(BigDecimal.ZERO) > 0){
            return sum.divide(whipRound.getGoal().multiply(BigDecimal.valueOf(100)));
        }

        return BigDecimal.ZERO;

    }

}
