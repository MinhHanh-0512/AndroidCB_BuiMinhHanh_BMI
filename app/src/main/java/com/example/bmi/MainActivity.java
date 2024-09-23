package com.example.bmi;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TinhBMI();
    }

    public void TinhBMI()
    {
        Button btnbmi= (Button) findViewById(R.id.bt_bmi);
        EditText Ten, Cao, Nang, BMI, ChuanDoan;
        btnbmi = (Button) findViewById(R.id.bt_bmi);
        Ten = (EditText) findViewById(R.id.ed_ten);
        Cao = (EditText) findViewById(R.id.ed_cao);
        Nang = (EditText) findViewById(R.id.ed_nang);
        BMI = (EditText) findViewById(R.id.ed_bmi);
        ChuanDoan = (EditText) findViewById(R.id.ed_cd);
                double H= Double.parseDouble(Cao.getText()+"");
                double W= Double.parseDouble(Nang.getText()+"");
                double bmi= W/(H*H);
                String chuandoan="";

                if (bmi < 18) {
                    chuandoan = "Bạn gầy";
                } else if (bmi <= 24.9) {
                    chuandoan = "Bạn bình thường";
                } else if (bmi <= 29.9) {
                    chuandoan = "Bạn béo phì độ 1";
                } else if (bmi <= 34.9) {
                    chuandoan = "Bạn béo phì độ 2";
                } else {
                    chuandoan = "Bạn béo phì độ 3";
                }
                DecimalFormat dcf = new DecimalFormat("#.0");
                BMI.setText("");
                BMI.setText(dcf.format(bmi));
                ChuanDoan.setText("");
                ChuanDoan.setText(chuandoan);


    }
}