package com.sda.donate.whipround.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Donation {

    @Id
    @GeneratedValue(generator = "donationSeq")
    @SequenceGenerator(name = "donationSeq", sequenceName = "donation_seq", allocationSize = 1)
    private long id;
    private BigDecimal donation;
    @ManyToOne(targetEntity = WhipRound.class)
    private WhipRound whipRound;

    @Embedded
    public User user;

    public Donation(){
        this.user = new User();
    };

    public Donation(BigDecimal donation, WhipRound whipRound) {
        this.donation = donation;
        this.whipRound = whipRound;
        this.user = new User();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getDonation() {
        return donation;
    }

    public void setDonation(BigDecimal donation) {
        this.donation = donation;
    }

    public WhipRound getWhipRound() {
        return whipRound;
    }

    public void setWhipRound(WhipRound whipRound) {
        this.whipRound = whipRound;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return id == donation.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
