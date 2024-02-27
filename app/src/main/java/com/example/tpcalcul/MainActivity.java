package com.example.tpcalcul;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    ImageView img;
    EditText number1 , number2;
    TextView result;
    RadioGroup radioGroup;
    RadioButton radio1, radio2, radio3, radio4;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.image);
        number1 = findViewById(R.id.editText1);
        number2 = findViewById(R.id.editText2);
        result = findViewById(R.id.textView);
        radioGroup = findViewById(R.id.radioGroup);
        radio1 = findViewById(R.id.radioButton1);
        radio2 = findViewById(R.id.radioButton2);
        radio3 = findViewById(R.id.radioButton3);
        radio4 = findViewById(R.id.radioButton4);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float num1 = Float.parseFloat(number1.getText().toString());
                Float num2 = Float.parseFloat(number2.getText().toString());
                if(radio1.isChecked()){
                    result.setText(num1 + num2 + "");
                }else if(radio2.isChecked()){
                    result.setText(num1 - num2 + "");
                }else if(radio3.isChecked()) {
                    result.setText(num1 * num2 + "");
                }else if(radio4.isChecked()){
                    result.setText(num1 / num2 + "");
                }else{
                    result.setText("Please checked operate logique");
                }

            }

        });
    }
}