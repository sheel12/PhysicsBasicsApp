package com.example.sheelchopra.physicsmathschembasics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by sheelchopra on 2017-04-17.
 */

public class EntryActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entryactivity);
        Button physics_btn=(Button) this.findViewById(R.id.physics_btn);
     //   Button maths_btn=(Button) this.findViewById(R.id.maths_btn);
      //  Button chem_btn=(Button) this.findViewById(R.id.chem_btn);
        physics_btn.setOnClickListener(this);
      //  maths_btn.setOnClickListener(this);
      //  chem_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.physics_btn :
                startActivity(new Intent(this,PhysicsTopicsActivity.class));
                break;
           // case R.id.maths_btn :
                //<code></code>
            //    break;
          //  case R.id.chem_btn :
                //<code></code>
          //      break;
        }

    }
}
