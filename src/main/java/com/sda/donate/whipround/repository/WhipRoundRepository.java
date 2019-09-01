package com.sda.donate.whipround.repository;

import com.sda.donate.whipround.model.Donation;
import com.sda.donate.whipround.model.WhipRound;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WhipRoundRepository extends JpaRepository<WhipRound,Long> {
}
