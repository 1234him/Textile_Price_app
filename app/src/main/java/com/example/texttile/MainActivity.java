package com.example.texttile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RadioGroup radioGroup = findViewById(R.id.radioGrp);
        TextView textView = findViewById(R.id.textDisplayer);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText editText = findViewById(R.id.editText);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = radioGroup.findViewById(i);
                if (i==1) {
                    textView.setText(Integer.toString(Integer.parseInt(editText.getText().toString()) * 300));
                } else if (i==2) {
                    textView.setText(Integer.toString(Integer.parseInt(editText.getText().toString()) * 500));
                } else if (i==3) {
                    textView.setText(Integer.toString(Integer.parseInt(editText.getText().toString()) * 700));
                }
            }
   });
}
}