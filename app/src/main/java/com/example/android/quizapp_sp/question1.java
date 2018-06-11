package com.example.android.quizapp_sp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class question1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
    }
    public void onRadioButtonClicked(View view) {
    }
    public void onCheckboxClicked(View view) {
    }
    public void displayresults() {
    }
    public void blockselrg(RadioGroup rg)
    {
        for(int i = 0; i < rg.getChildCount(); i++){
            ((RadioButton)rg.getChildAt(i)).setEnabled(false);
        }
    }
    int countt = 0, countf=0,countua=0;
    public void endtheq(View view) {
        RadioGroup ansval1 = (RadioGroup) findViewById(R.id.rdgp01);
        RadioButton anschk12 = (RadioButton) findViewById(R.id.op12);
        TextView anssol1 = (TextView) findViewById(R.id.sol01);
        if (anschk12.isChecked()) {
            countt++;
            anssol1.setBackgroundResource(R.color.limegreen);
            anssol1.setTextColor(getColor(R.color.white));
            anssol1.setText(R.string.corr01);
        } else if (ansval1.getCheckedRadioButtonId() == -1) { countua++;
            anssol1.setTextColor(getColor(R.color.darkgrey));
            anssol1.setBackgroundResource(R.color.black);
            anssol1.setText(String.valueOf("No Option Selected\nOption B. is the correct answer"));
        } else { countf++;
            anssol1.setTextColor(getColor(R.color.white));
            anssol1.setBackgroundResource(R.color.w1);
            anssol1.setText(String.valueOf("INCORRECT ANSWER \nOption B. is the correct answer"));
        }
        RadioButton anschk21 = (RadioButton) findViewById(R.id.op21);
        TextView anssol2 = (TextView) findViewById(R.id.sol02);
        RadioGroup ansval2 = (RadioGroup) findViewById(R.id.rdgp02);
        if (anschk21.isChecked()) {
            countt++;
            anssol2.setBackgroundResource(R.color.limegreen);
            anssol2.setTextColor(getColor(R.color.white));
            anssol2.setText(R.string.corr01);
        } else if (ansval2.getCheckedRadioButtonId() == -1) { countua++;
            anssol2.setTextColor(getColor(R.color.darkgrey));
            anssol2.setBackgroundResource(R.color.black);
            anssol2.setText(String.valueOf("No Option Selected\nOption A. is the correct answer"));
        } else { countf++;
            anssol2.setBackgroundResource(R.color.w1);
            anssol2.setTextColor(getColor(R.color.white));
            anssol2.setText(String.valueOf("INCORRECT ANSWER\nOption A. is the correct answer"));
        }
        RadioGroup ansval3 = (RadioGroup) findViewById(R.id.rdgp03);
        RadioButton anschk33 = (RadioButton) findViewById(R.id.op33);
        TextView anssol3 = (TextView) findViewById(R.id.sol03);
        if (anschk33.isChecked()) {
            countt++;
            anssol3.setTextColor(getColor(R.color.white));
            anssol3.setBackgroundResource(R.color.limegreen);
            anssol3.setText(R.string.corr01);
        } else if (ansval3.getCheckedRadioButtonId() == -1) { countua++;
            anssol3.setTextColor(getColor(R.color.darkgrey));
            anssol3.setBackgroundResource(R.color.black);
            anssol3.setText(String.valueOf("No Option Selected\nOption C. is the correct answer"));
        } else { countf++;
            anssol3.setBackgroundResource(R.color.w1);
            anssol3.setTextColor(getColor(R.color.white));
            anssol3.setText(String.valueOf("INCORRECT ANSWER\nOption C. is the correct answer"));
        }
        RadioGroup ansval4 = (RadioGroup) findViewById(R.id.rdgp04);
        RadioButton anschk44 = (RadioButton) findViewById(R.id.op44);
        TextView anssol4 = (TextView) findViewById(R.id.sol04);
        if (anschk44.isChecked()) {
            countt++;
            anssol4.setTextColor(getColor(R.color.white));
            anssol4.setBackgroundResource(R.color.limegreen);
            anssol4.setText(R.string.corr01);
        } else if (ansval4.getCheckedRadioButtonId() == -1) { countua++;
            anssol4.setTextColor(getColor(R.color.darkgrey));
            anssol4.setBackgroundResource(R.color.black);
            anssol4.setText(String.valueOf("No Option Selected\nOption D. is the correct answer"));
        } else { countf++;
            anssol4.setBackgroundResource(R.color.w1);
            anssol4.setTextColor(getColor(R.color.white));
            anssol4.setText(String.valueOf("INCORRECT ANSWER\nOption D. is the correct answer"));
        }
        RadioGroup ansval5 = (RadioGroup) findViewById(R.id.rdgp05);
        RadioButton anschk53 = (RadioButton) findViewById(R.id.op53);
        TextView anssol5 = (TextView) findViewById(R.id.sol05);
        if (anschk53.isChecked()) {
            countt++;
            anssol5.setTextColor(getColor(R.color.white));
            anssol5.setBackgroundResource(R.color.limegreen);
            anssol5.setText(R.string.corr01);
        } else if (ansval5.getCheckedRadioButtonId() == -1) { countua++;
            anssol5.setTextColor(getColor(R.color.darkgrey));
            anssol5.setBackgroundResource(R.color.black);
            anssol5.setText(String.valueOf("No Option Selected\nOption C. is the correct answer"));
        } else { countf++;
            anssol5.setBackgroundResource(R.color.w1);
            anssol5.setTextColor(getColor(R.color.white));
            anssol5.setText(String.valueOf("INCORRECT ANSWER\nOption C. is the correct answer"));
        }
        CheckBox anschk61 = (CheckBox) findViewById(R.id.op61);
        CheckBox anschk63 = (CheckBox) findViewById(R.id.op63);
        CheckBox anschk62 = (CheckBox) findViewById(R.id.op62);
        CheckBox anschk64 = (CheckBox) findViewById(R.id.op64);
        TextView anssol6 = (TextView) findViewById(R.id.sol06);
        if ((anschk61.isChecked()) && (anschk63.isChecked()) && (anschk62.isChecked() == false) && (anschk64.isChecked() == false)) {
            countt++;
            anssol6.setTextColor(getColor(R.color.white));
            anssol6.setBackgroundResource(R.color.limegreen);
            anssol6.setText(R.string.corr01);
        } else if ((anschk61.isChecked() == false) && (anschk63.isChecked() == false) && (anschk62.isChecked() == false) && (anschk64.isChecked() == false)) {
            anssol6.setTextColor(getColor(R.color.darkgrey)); countua++;
            anssol6.setBackgroundResource(R.color.black);
            anssol6.setText(String.valueOf("No Option Selected\nOption A & C are the correct answers"));
        } else { countf++;
            anssol6.setBackgroundResource(R.color.w1);
            anssol6.setTextColor(getColor(R.color.white));
            anssol6.setText(String.valueOf("INCORRECT ANSWER\nOption A & C are the correct answers"));
        }
        CheckBox anschk71 = (CheckBox) findViewById(R.id.op71);
        CheckBox anschk72 = (CheckBox) findViewById(R.id.op72);
        CheckBox anschk73 = (CheckBox) findViewById(R.id.op73);
        CheckBox anschk74 = (CheckBox) findViewById(R.id.op74);
        CheckBox anschk75 = (CheckBox) findViewById(R.id.op75);
        CheckBox anschk76 = (CheckBox) findViewById(R.id.op76);
        CheckBox anschk77 = (CheckBox) findViewById(R.id.op77);
        CheckBox anschk78 = (CheckBox) findViewById(R.id.op78);
        TextView anssol7 = (TextView) findViewById(R.id.sol07);
        if ((anschk71.isChecked() == false) && (anschk72.isChecked()) && (anschk73.isChecked()) && (anschk74.isChecked()) && (anschk75.isChecked()) && (anschk76.isChecked()) && (anschk77.isChecked() == false) && (anschk78.isChecked() == false)) {
            countt++;
            anssol7.setTextColor(getColor(R.color.white));
            anssol7.setBackgroundResource(R.color.limegreen);
            anssol7.setText(R.string.corr01);
        } else if ((anschk71.isChecked() == false) && (anschk72.isChecked() == false) && (anschk73.isChecked() == false) && (anschk74.isChecked() == false) && (anschk75.isChecked() == false) && (anschk76.isChecked() == false) && (anschk77.isChecked() == false) && (anschk78.isChecked() == false)) {
            countua++;
            anssol7.setTextColor(getColor(R.color.darkgrey));
            anssol7.setBackgroundResource(R.color.black);
            anssol7.setText(String.valueOf("No Option Selected\nOption B, C, D, E & F are the correct answers"));
        } else { countf++;
            anssol7.setBackgroundResource(R.color.w1);
            anssol7.setTextColor(getColor(R.color.white));
            anssol7.setText(String.valueOf("INCORRECT ANSWER\nOption B, C, D, E & F are the correct answers"));
        }
        CheckBox anschk81 = (CheckBox) findViewById(R.id.op81);
        CheckBox anschk82 = (CheckBox) findViewById(R.id.op82);
        CheckBox anschk83 = (CheckBox) findViewById(R.id.op83);
        CheckBox anschk84 = (CheckBox) findViewById(R.id.op84);
        CheckBox anschk85 = (CheckBox) findViewById(R.id.op85);
        CheckBox anschk86 = (CheckBox) findViewById(R.id.op86);
        TextView anssol8 = (TextView) findViewById(R.id.sol08);
        if ((anschk81.isChecked() == false) && (anschk82.isChecked() == false) && (anschk83.isChecked()) && (anschk84.isChecked()) && (anschk85.isChecked() == false) && (anschk86.isChecked())) {
            countt++;
            anssol8.setTextColor(getColor(R.color.white));
            anssol8.setBackgroundResource(R.color.limegreen);
            anssol8.setText(R.string.corr01);
        } else if ((anschk81.isChecked() == false) && (anschk82.isChecked() == false) && (anschk83.isChecked() == false) && (anschk84.isChecked() == false) && (anschk85.isChecked() == false) && (anschk86.isChecked() == false)) {

            countua++;
            anssol8.setTextColor(getColor(R.color.darkgrey));
            anssol8.setBackgroundResource(R.color.black);
            anssol8.setText(String.valueOf("No Option Selected\nOption C, D & F are the correct answers"));
        } else { countf++;
            anssol8.setBackgroundResource(R.color.w1);
            anssol8.setTextColor(getColor(R.color.white));
            anssol8.setText(String.valueOf("INCORRECT ANSWER\nOption C, D & F are the correct answers"));
        }
        EditText edtEditText = (EditText) findViewById(R.id.rdgp09);
        String content = edtEditText.getText().toString();
        TextView anssol9 = (TextView) findViewById(R.id.sol09);
        if (content.equalsIgnoreCase("Dalvik Debug Monitor Service")) {
            countt++;
            anssol9.setTextColor(getColor(R.color.white));
            anssol9.setBackgroundResource(R.color.limegreen);
            anssol9.setText(R.string.corr01);
        } else if (content.matches("")) { countua++;
            anssol9.setTextColor(getColor(R.color.darkgrey));
            anssol9.setBackgroundResource(R.color.black);
            anssol9.setText(String.valueOf("No Input\nDalvik Debug Monitor Service is the correct full form"));
        } else { countf++;
            anssol9.setBackgroundResource(R.color.w1);
            anssol9.setTextColor(getColor(R.color.white));
            anssol9.setText(String.valueOf("INCORRECT ANSWER"));
        }
        TextView resj = (TextView) findViewById(R.id.resss);
        resj.setTextSize(30);
        resj.setText("RESULT");
        resj.setBackgroundResource(R.color.black);
        resj.setTextColor(getColor(R.color.white));
        TextView resj2 = (TextView) findViewById(R.id.resss2);
        double perc = (countt * 100) / 9;
        String mssg="No. of Correct Answers: "+ countt+"\nNo. of Unanswered Questions: "+countua+"\nNo. of Wrong Answers: "+countf+ "\nPercentage: " + perc;
        resj2.setText(mssg);
        Toast.makeText(this, mssg, Toast.LENGTH_SHORT).show();

        blockselrg(ansval1); blockselrg(ansval2); blockselrg(ansval3); blockselrg(ansval4); blockselrg(ansval5);

        anschk61.setEnabled(false); anschk62.setEnabled(false); anschk63.setEnabled(false); anschk64.setEnabled(false);
        anschk71.setEnabled(false); anschk72.setEnabled(false);anschk73.setEnabled(false);anschk74.setEnabled(false);anschk75.setEnabled(false);anschk76.setEnabled(false);
        anschk77.setEnabled(false); anschk78.setEnabled(false);
        edtEditText.setEnabled(false);
        anschk81.setEnabled(false);anschk82.setEnabled(false);anschk83.setEnabled(false);anschk84.setEnabled(false);anschk85.setEnabled(false);anschk86.setEnabled(false);
        countf=0;
        countua=0;
        countt=0;
    }
}
