package com.scgit.islamicFunFact;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by tanbir on 5/1/2015.
 */
public class ColorWheel {

    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#ff00ff", // magenta
            "#800000", // maroon
            "#00fa9a", // medium spring green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

public int getColors(){






        //The button was clicked to update the fact label with new fact
        String color ="";
        //Randomly select a fact
        Random randomGenerator = new Random(); // counstruct a new random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
    int colorAsInt = Color.parseColor(color);


        return colorAsInt;
        }
}
