package com.sda.donate.whipround.repository;

import com.sda.donate.whipround.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonationRepository extends JpaRepository<Donation, Long> {

    List<Donation> findByWhipRoundId(Long whiproundId);

}
