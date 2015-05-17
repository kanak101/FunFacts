package com.scgit.islamicFunFact;

import java.util.Random;

/**
 * Created by tanbir on 4/16/2015.
 */
public class FactBook {
    public String[] mFacts = {
            "Islam means surrender or submission to God.",
            "Muslim means anyone or anything that surrenders itself to the true will of God.",
            "Islam is not a new religion or cult. It is a universal way of life and civilization.",
            "There are 1.8 billion people in the world identify their religion as Islam.",
            "There are five pillar of Islam.",
            "Muslim scholars Ibn Rushd and Ibn Sina were primarily responsible for saving the works of Aristotle, whose ideas would later dominate both the Christian and Muslim worlds.",
            "The Islamic Golden Age, which is traditionally dated as being the 8th–13th centuries, was marked by the ascension of the Abbasid Caliphate.",
            "Many academic traditions, including the distinction between graduates and undergraduates began at the Islamic university Al-Azhar (“the resplendent”) University in Cairo.",
            "A Muslim woman retains her own family name upon marriage, rather than taking the name of her husband. This symbolic act emphasizes that she remains her own person, with her own valid identity."




    };

    public String getFact(){






        //The button was clicked to update the fact label with new fact
        String fact ="";
        //Randomly select a fact
        Random randomGenerator = new Random(); // counstruct a new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
