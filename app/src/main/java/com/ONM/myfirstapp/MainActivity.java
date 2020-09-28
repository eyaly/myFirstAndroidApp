package com.ONM.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button sumButton;
    private TextView resultTextView;
    private EditText editNum1;
    private EditText editNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNum1 = (EditText)findViewById(R.id.editNum1);
        editNum2 = (EditText)findViewById(R.id.editNum2);
        sumButton = (Button)findViewById(R.id.sumButton);
        resultTextView = (TextView)findViewById(R.id.resultTextView);

    }

    public void onClickSumButton(View view){
        String strNum1 = editNum1.getText().toString();
        String strNum2 = editNum2.getText().toString();

        int num1 = strNum1.isEmpty()? 0: Integer.parseInt(strNum1);
        int num2 = strNum2.isEmpty()? 0: Integer.parseInt(strNum2);

        int sum = num1 + num2;
        resultTextView.setText(Integer.toString(sum));
    }
}