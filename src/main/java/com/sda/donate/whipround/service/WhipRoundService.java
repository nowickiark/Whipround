package com.sda.donate.whipround.service;

import com.sda.donate.whipround.model.Donation;
import com.sda.donate.whipround.model.WhipRound;
import com.sda.donate.whipround.model.WhiproundSum;
import com.sda.donate.whipround.repository.DonationRepository;
import com.sda.donate.whipround.repository.WhipRoundRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WhipRoundService {

    private WhipRoundRepository whipRoundRepository;
    public DonationRepository donationRepository;

    public WhipRoundService(WhipRoundRepository whipRoundRepository, DonationRepository donationRepository) {
        this.whipRoundRepository = whipRoundRepository;
        this.donationRepository = donationRepository;
    }


    public List<WhiproundSum> getWhiprounds(){

        List<WhipRound> allWhiprounds = whipRoundRepository.findAll();
        List<WhiproundSum> whiproundsWithNotAchievedGoal = new ArrayList<>();
        allWhiprounds.forEach(whipround -> {
            List<Donation> byWhiproundId = donationRepository.findByWhipRoundId(whipround.getId());
            BigDecimal sum = calculateSum(byWhiproundId);
            if (sum.compareTo(whipround.getGoal()) < 0) {
                whiproundsWithNotAchievedGoal.add(new WhiproundSum(whipround, sum));
            }
        });

        return whiproundsWithNotAchievedGoal;
    }

    private BigDecimal calculateSum(List<Donation> donations) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Donation donation : donations) {
            sum = sum.add(donation.getDonation());
        }

        return sum;
    }



    public WhipRound getWhipround(long id){
        return whipRoundRepository.findById(id).get();
    }



    public void addDonation(Donation donation){
        donationRepository.save(donation);
    }


}
