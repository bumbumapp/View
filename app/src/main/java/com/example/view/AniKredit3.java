package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.view.adapter.MyPreviousCredit;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AniKredit3 extends AppCompatActivity {
    RecyclerView myprevious_credit;
    private MyPreviousCredit myPreviousCredit;
    ImageButton add;
    ImageView img_CreditNotFound;
    TextView txt_CreditNotFound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ani_kredit3);
        WindowCompat.setDecorFitsSystemWindows(getWindow(),false);
        init();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img_CreditNotFound.setVisibility(View.GONE);
                txt_CreditNotFound.setVisibility(View.GONE);
                setuprecycleview();
            }
        });




    }
    private void init(){
        add=findViewById(R.id.add);
        img_CreditNotFound=findViewById(R.id.img_creditnotfound);
        txt_CreditNotFound=findViewById(R.id.txt_creditnotfound);
    }

    private void setuprecycleview() {
        myprevious_credit=findViewById(R.id.previous_kredit);
        myprevious_credit.setHasFixedSize(true);
        myprevious_credit.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        myPreviousCredit=new MyPreviousCredit(this);
        myprevious_credit.setAdapter(myPreviousCredit);
    }
}