package com.example.sheelchopra.physicsmathschembasics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
/**
 * Created by sheelchopra on 2017-04-17.
 */

public class PhysicsTopicsActivity extends Activity implements View.OnClickListener,AdapterView.OnItemSelectedListener{
    private Button physicsTopic_btn;
    private String dd;
    private int position;
    private String [] topicPhysicsValue;
    private String [] topicPhysicsKey;
    private TreeMap<String,String> topicPhysicsMap;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics_topics);
        topicPhysicsMap = new TreeMap<String, String>();
        topicPhysicsMap.put("Chapter_A","Topic A:Kinematics");
        topicPhysicsMap.put("Chapter_B","Topic B:Dynamics");
        topicPhysicsMap.put("Chapter_C","Topic C:Circular Motion");
        topicPhysicsMap.put("Chapter_D","Topic D:Work,Power and Energy");
        topicPhysicsMap.put("Chapter_E","Topic E:Momentum");
        topicPhysicsMap.put("Chapter_F","Topic F:Gravitation");
        topicPhysicsMap.put("Chapter_G","Topic G:Electric charges, Electrical forces and Electric Fields");
        topicPhysicsMap.put("Chapter_H","Topic H:Magnetic fields, Magnetic Forces and Electromagnetism");
        topicPhysicsMap.put("Chapter_I","Topic I:Light and waves nature of light");
        topicPhysicsMap.put("Chapter_J","Topic J:Introduction to Einstein's Special Theory of Relativity");
        topicPhysicsMap.put("Chapter_K","Topic K:Introduction to Quantum Theory");
        topicPhysicsMap.put("Chapter_L","Topic L:Introduction to Radioactivity and Elementary Particles");

        final List<String> topicsPhysicsKeyList = new ArrayList<String>(topicPhysicsMap.keySet());
        final List<String> topicsPhysicsValues = new ArrayList<String>(topicPhysicsMap.values());
        final Object key [] = topicsPhysicsKeyList.toArray();
        final Object value [] =topicsPhysicsValues.toArray();
        topicPhysicsValue = new String[value.length];
        topicPhysicsKey = new String[key.length];
        for (int i =0;i<key.length;i++) {
            topicPhysicsKey[i] = (String)key[i];
            topicPhysicsValue[i] =(String) value[i];
        }
         physicsTopic_btn =(Button) findViewById(R.id.selectedtopic_btn);
         physicsTopic_btn.setOnClickListener(this);
        Spinner topicsList = (Spinner) findViewById(R.id.spinner_physics_topics);

        ArrayAdapter<String> arrayAdpt = new ArrayAdapter<String>(this,R.layout.textview_with_font_change,topicPhysicsValue);
        arrayAdpt.setDropDownViewResource(R.layout.textview_with_font_change);
        topicsList.setAdapter(arrayAdpt);
        topicsList.setOnItemSelectedListener(this);

    }

    @Override
    public void onClick(View v) {
        HashMap<String,String>  chapters = new HashMap<String,String>();
        String chapter ="Chapter_";
        for (int i=0;i<topicPhysicsKey.length;i++) {
           chapters.put(topicPhysicsKey[i],chapter + (i+1));
        }
        String activity_Class = chapters.get(topicPhysicsKey[position]);
            String className = "com.example.sheelchopra.physicsmathschembasics.Physics_" + activity_Class +"_Activity";
            try {
               // Class c = Class.forName("com.example.sheelchopra.physicsmathschembasics.Physics_Chapter_1_Activity");
                Class c = Class.forName(className);
                startActivity(new Intent(this,c));

            }catch (Exception e ) {

            }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        this.position =position;
        physicsTopic_btn.setText("Click here for " + topicPhysicsValue[position]);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        physicsTopic_btn.setText("Select a Topic from the list ");
    }
}
