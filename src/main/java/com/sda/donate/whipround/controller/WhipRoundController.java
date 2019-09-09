package com.sda.donate.whipround.controller;

import com.sda.donate.whipround.model.Donation;
import com.sda.donate.whipround.model.WhipRound;
import com.sda.donate.whipround.service.WhipRoundService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WhipRoundController {

    private WhipRoundService whipRoundService;

    public WhipRoundController(WhipRoundService whipRoundService) {
        this.whipRoundService = whipRoundService;
    }

    @GetMapping("/")
    public ModelAndView showWhiprounds(){

        ModelAndView modelAndView = new ModelAndView("whipround");

        modelAndView.addObject("whip_rounds" ,whipRoundService.getWhiprounds());

        return modelAndView;
    }

    @GetMapping("/whipround/{id}")
    public ModelAndView whipRoundDetails(@PathVariable long id){

        Donation donation = new Donation();

        WhipRound whipround = new WhipRound();
        whipround.setId(id);

        donation.setWhipRound(whipround);

        ModelAndView modelAndView = new ModelAndView("whiproundDetails");

        /*modelAndView.addObject("whipround",whipround);*/
        modelAndView.addObject("donation",donation);

        return modelAndView;
    }


    @PostMapping("/whipround/donate")
    public String addDonation(@ModelAttribute Donation donation){
        whipRoundService.addDonation(donation);

        return "redirect:/";
    }

    //takie tam zmiany


}
