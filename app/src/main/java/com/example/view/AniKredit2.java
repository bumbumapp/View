package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.view.adapter.MyPayings;

public class AniKredit2 extends AppCompatActivity {
     RecyclerView payingList;
     MyPayings myPayings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ani_kredit2);
        WindowCompat.setDecorFitsSystemWindows(getWindow(),false);
        setuprecycleview();
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AniKredit2.this,AniKredit3.class));
            }
        });


    }

    private void setuprecycleview() {
        payingList=findViewById(R.id.paying_list);
        payingList.setHasFixedSize(true);
        payingList.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        myPayings=new MyPayings(this);
        payingList.setAdapter(myPayings);
    }


}