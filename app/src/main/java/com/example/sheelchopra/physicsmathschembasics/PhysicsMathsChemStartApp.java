package com.example.sheelchopra.physicsmathschembasics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class PhysicsMathsChemStartApp extends AppCompatActivity implements  OnClickListener {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_maths_chem_start_app);
        b =(Button) this.findViewById(R.id.start_app);
        b.setOnClickListener(this);
    }
    public void onClick(View v) {
        startActivity(new Intent (this,EntryActivity.class));
    }
}
