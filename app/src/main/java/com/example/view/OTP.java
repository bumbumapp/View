package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.TextView;

public class OTP extends AppCompatActivity {
    TextView telefonnummer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        WindowCompat.setDecorFitsSystemWindows(getWindow(),false);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OTP.this,Finish.class));
            }
        });

        telefonnummer=findViewById(R.id.telefon_nummer);
        SpannableString span = new SpannableString(getString(R.string.telefon_nummer));
        span.setSpan(new TextAppearanceSpan(getBaseContext(),R.style.telefonnummer),0,10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        telefonnummer.setText(span, TextView.BufferType.SPANNABLE);
    }
}