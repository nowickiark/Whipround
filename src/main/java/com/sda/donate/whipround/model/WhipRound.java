package com.sda.donate.whipround.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class WhipRound {

    @Id
    @GeneratedValue(generator = "whipSeq")
    @SequenceGenerator(name = "whipSeq", sequenceName = "whip_seq", allocationSize = 1)
    private long id;
    private BigDecimal goal;
    private String description;


    public WhipRound(){};

    public WhipRound(BigDecimal goal, String description) {
        this.goal = goal;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getGoal() {
        return goal;
    }

    public void setGoal(BigDecimal goal) {
        this.goal = goal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WhipRound that = (WhipRound) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
