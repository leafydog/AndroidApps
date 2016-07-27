package com.yose.lsu14.clickbuttonsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button ourButton;
    private TextView ourMessage;
    private int times = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ourButton = (Button)findViewById(R.id.button1);
        ourMessage = (TextView)findViewById(R.id.textView);

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                times++;
                String result = "THE BUTTON WAS CLICKED " + times + "TIME";

                if(times !=1){
                    result+="S...";
                }
                    ourMessage.setText(result);


            }

        };
        ourButton.setOnClickListener(ourOnClickListener);
        //Toast toastMessage = Toast.makeText(this,"Text Value Now Is" + ourMessage.getText(),Toast.LENGTH_LONG);
        //toastMessage.show();

    }
}
