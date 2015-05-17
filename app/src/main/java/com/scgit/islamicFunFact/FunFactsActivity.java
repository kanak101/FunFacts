package com.scgit.islamicFunFact;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.scgit.islamicFunFacts.R;

public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColors = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view varibles and assigne view from the layoutfile
        final TextView factLabel = (TextView) findViewById(R.id.FacttextView);
        final Button Showfactbutton = (Button) findViewById(R.id.Showfactbutton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                //Dynamically display fun facts
                factLabel.setText(fact);
                int color = mColors.getColors();
                relativeLayout.setBackgroundColor(color);
                Showfactbutton.setTextColor(color);


            }

        };

    Showfactbutton.setOnClickListener(listener);

    //Toast.makeText(this,"Yay! Our activity was created",Toast.LENGTH_LONG).show();
        Log.d(TAG,"We are logging from onCreate() method!");

    }


}
