package com.example.sheelchopra.physicsmathschembasics;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by sheelchopra on 2017-04-19.
 */

public class Physics_Chapter_6_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics_chapter_6);
        final TreeMap<String,String> coachMap = new TreeMap<String, String>();
        coachMap.put("QA. What is a force field","A force field is the space surrounding an object within which the force is "
                +"exerted on the object. The force field is created due to the influence of another central massive object.\nExample:Gravitational "
                +"field:It is the space surrounding an object in which the force of gravity is exerted on the object existing in this space. "
                +"The force of gravity is created by the gravitational field of a central body of mass M and this gravitational field "
               +"influences any object of mass m placed in this field.");
        coachMap.put("QB. What is gravitational field strength(g\u20d7)","By the Universal gravitation law of Newton,\n Fᴳ =GMm\u2044r\u00b2, where\n "
                +"Fᴳ = magnitude of the force of gravitation between central mass M and any other object of mass m,\nr = centre to centre "
                +"distance between the two masses,\nG= Universal Gravitational constant.\nG= 6.67 \u00d7 10\u207b\u00b9\u00b9 N.m\u00b2\u2044Kg\u00b2.\n"
                +"\u2234 Fᴳ = gm, where g= GM\u2044r\u00b2 where g\u20d7= gravitational field strength of mass M.\nExample:For Earth: "
                +"For a mass m on or near the surface of the earth, r= radius of the earth = 6.38 \u00d7 10\u2076 m,\nMass M of Earth = M\u2091 = "
                +"5.98 \u00d7 10\u00b2\u2074 Kg,\n g\u20d7 = 9.8 N\u2044Kg which is = 9.8 m\u2044s\u00b2 = acceleration due to gravity.\n"
               +"\u2234 Near the surface of the Earth, Fᴳ = mg = Fᵍ = force of gravity of the Earth = Weight of the object.\nAs the distance of "
                +"the object  of mass m increases from the surface of the earth, value of g\u20d7 decreases. The above relation can be expressed "
                +"for any object of mass m lying near or on the surface of any other planet or any other celestial body.");
        coachMap.put("QC. Practice questions on gravitational field strength","If mass of Mars is 6.37 \u00d7 10\u00b2\u00b3 Kg and it's radius is 3.40 \u00d7 10\u2076.\n "
                +"(a)Find the gravitational field strength on Mars.\n(b)Find the ratio of the magnitude of the gravitational field "
                +"strength on the surface of Mars to that on the surface of the Earth.\n\n(2)If a planet has the same mass as the Earth "
                +"but a radius only 0.75 times the radius of the Earth, what is the magnitude of the planet's surface gravitational field "
                +"strength as a multiple of Earth's surface.\n\n(3)The magnitude of g\u20d7 at a point in the space is 6.42 \u00d7 10\u207b\u2079 N\u2044Kg.\n"
                +"What is the magnitude of the gravitational force at this point on an object of\n(a)mass 5 Kg\n(b)mass 11 \u00d7 10\u2075 Kg.");
        coachMap.put("QD. Ratio of gravitational field strengths of various planets as compared to Earth","(a) Mercury :0.375\n\n(b)Venus :0.898\n\n "
                +"(c) Earth: 1.00\n\n(d) Mars: 0.375\n\n(e)Jupiter: 2.53\n\n(f) Saturn: 1.06\n\n(g)Uranus: 0.914\n\n(h)Neptune: 1.14\n\n "
                +"(i)Pluto: 0.067");
        coachMap.put("QE. What is the orbital velocity of an object/satellite","It is the speed of an object or a satellite "
                +"which it should maintain for maintaining a circular orbit around a central planet/star/celestial body without "
                +"falling under the influence of gravitational attraction force of the central body.\nThis gravitational force is the net "
                +"force acting on the satellite and is called centripetal force.\nIf M is the mass of the the central body around which a satellite "
                +"of mass m is rotating in a circular orbit of radius r (centre to centre distance between the satelite and the central mass), then\n"
                +"the gravitational force Fᴳ =GMm\u2044r\u00b2 = centripetal force = mv\u00b2\u2044r, where v = speed of the satellite in the orbit."
                 +"\n\u2234 v = \u221a(GM\u2044r).\nPeriod of revolution = T = 2\u03c0r\u2044v.");
        coachMap.put("QF. Practice questions on orbital velocity","(1) Find the orbital speed of Venus and Earth round the Sun.\n"
                +"M\u209b=1.99 \u00d7 10\u00b3\u2070 Kg, G = 6.67 \u00d7 10\u207b\u00b9\u00b9 N.m\u00b2\u2044Kg\u00b2,\nr\u1d65 = 1.08 \u00d7 10\u00b9\u00b9 m,\n"
                +"r\u2091 = 1.49 \u00d7 10\u00b9\u00b9 m.\n\n(2)A satellite is in circular orbit 565 Km above the surface of Earth. Find\n"
                +"(a) Speed of the satellite\n(b)Period of revolution of satellite.\nM\u2091 = 5.98 \u00d7 10\u00b2\u2074 Kg and \nr\u2091 = 6.38 \u00d7 10\u2076");
        coachMap.put("QG. State Kepler's first law of Planetary motion","First Law: Each planet moves around the sun in an elliptical orbit "
                +"with the sun at one of it's focus.\nAn ellipse \u2b2d has two focii F\u2081 and F\u2082. If a satellite is at any point P on the "
                +"elliptical orbit, then by the properties of ellipse, PF\u2081 + PF\u2082 is always constant for any point P.");
        coachMap.put("QH. State Kepler's second law of planetary motion","Second Law: Straight lines joining a planet on the elliptical orbit and "
                +"sun at one of it's focus sweeps out equal areas in space in equal intervals of time.\nExplanation:Let a planet is at "
                +"a point P\u2081 on it's elliptical orbit around the sun with latter at one of the focus F\u2081.Then P\u2081F\u2081 is "
                +"the line joining the sun and the planet at the point P\u2081. Let the planet mpves to point P\u2082 in time \u2206t\u2081.\n"
                +"Let the area formed by the lines P\u2081F\u2081 and P\u2082F\u2081 and the arc P\u2081P\u2082 = A\u2081.\n"
                +"Now, let the planet moves to position P\u2083 from P\u2082 in the same time \u2206t\u2081.\nThen by the second law, "
                +"area formed by lines P\u2082F\u2082 and P\u2083F\u2083 and the arc P\u2082P\u2083 is same as =A\u2081 as above.\n"
                +"When the planet is closer to the sun, the length of the arc d\u2081 forming the sectoral area is more than the length of the "
                  +"arc d\u2082 formed when the planet is away from the sun.\n\u2235 \u2206t\u2081 =\u2206t\u2082 =\u2206t\n"
                  +"\u2234 v\u2081 =d\u2081\u2044\u2206t > v\u2082 =d\u2082\u2044\u2206t.\n\u2234 Every planet moves faster when near the sun.");
        coachMap.put("QI. State Kepler's third law of planetary motion","The cube of the average radius r of a planet's orbit is directly "
                +"proportional to the square of the period T of the planet's orbit.\ni.e. r\u00b3 \u221d T\u00b2.\n or r\u00b3 = C\u209bT\u00b2.\n"
                +"\u2234 C\u209b = r\u00b3\u2044T\u00b2, where\nC\u209b = constant of proportionality for the sun. It's SI units are m\u00b3\u2044s\u00b2.\n"
                +"\nAnother expression for C\u209b:\nFor a planet of mass m\u209a revolving around sun or any celestial body of mass M\u209b\n"
                +"centripetal force on the planet m\u209av\u00b2\u2044r = gravitational force between the sun and planet GM\u209bm\u209a\u2044r\u00b2.\n"
                +"From above, v=\u221a(GM\u209b\u2044r).\n\u2235 T = 2\u03c0r\u2044v\n\u2234 T = 2\u03c0r\u2044\u221a(GM\u209b\u2044r).\n"
                +"From above, T\u00b2 = 4\u03c0\u00b2r\u00b2\u2044(GM\u209b\u2044r) = 4\u03c0\u00b2r\u00b3\u2044GM\u209b\n"
                +"\u2234 r\u00b3\u2044T\u00b2 = C\u209b = GM\u209b\u20444\u03c0\u00b2.");
        coachMap.put("QJ. Practice questions on Kepler's law","(1) The average radius of the orbit of the Earth about the Sun is 1.496 \u00d7 10\u2078 Km. "
                +"The period of revolution is 365.26 days.\n(a)Find the constant C\u209b.\n(b) A satellite has a period of revolution around "
                +"the sun as 9.1 \u00d7 10\u2078 s. What is the average radius of it's orbit.\n\n(2) a satellite has a circular orbit about "
                +"the Earth (M\u2091 = 5.98 \u00d7 10\u00b2\u2074 Kg). It's time period is 5 hours.\n(a) Find the distance in Km between the "
                +"satellite and the centre of the earth (radius of earth = 6380 Km).\n(b)Find it's speed");
        coachMap.put("QK. What is gravitational potential energy of a system of two masses at a finite distance apart", "By universal law of gravitation "
                +"Fᴳ = GMm\u2044r\u00b2\u2081, where\n M and m are the two masses and r\u2081 = centre to centre distance between the "
                +"two masses.\n To increase the seperation between the two masses to r\u2082, work is needed to be done to overcome their "
                +"force of attraction.\nSo, the gravitational potential energy of the  system increases.\nThis work done =W = change in "
                +"the gravitational potential energy of the system =\u2206Eᵍ\u2081\u2082. By using integral calculus,\n"
               +"\u2206Eᵍ\u2081\u2082 =E\u2082 - E\u2081\n=GMm\u2044r\u2081 - GMm\u2044r\u2082\n=(-GMm\u2044r\u2082) - (-GMm\u2044r\u2081)\n"
               +"\u2234 gravitational potential energy at any point is -ve.\nFrom above, as r\u2082 \u2192 \u221e, E\u2082 \u2192 0.\n"
              +"\u2234 \u2206Eᵍ =0 -E\u2081 = -(-GMm\u2044r\u2081)\n=GMm\u2044r\u2081\n\u2234 gravitational potential energy of a system of "
               +"two masses M and m seperated by a c/c distance r is:\nEᵍ = -GMm\u2044r.\nAs r \u2192 \u221e, Eᵍ \u2192 0 and hence increases being less negative.\n This happens "
               +"when the masses are infinetly apart.\nFor mass m lying near the surface of Earth of mass M:\nr\u2081 = r\u2091 and "
                +"r\u2082 = r\u2091 + \u2206y.\n\u2235 \u2206y <<r\u2091\n\u2234 r\u2081r\u2082 \u2248 r\u00b2\u2091 and \n\u2206y=r\u2082 - r\u2081"
                +"\n\u2234 \u2206Eᵍ =(-GMm\u2044r\u2082) - (-GMm\u2044r\u2081)\n=GMm((r\u2082 - r\u2081)\u2044r\u2081r\u2082\n"
                +"\u2248 GMm\u2206y\u2044r\u00b2\u2091\n\u2235 by the univeral law of gravitation,\nFᴳ =GMm\u2044r\u00b2\u2091 = mg,\n"
                +"with g = GM\u2044r\u00b2\u2091.\n\u2234 \u2206Eᵍ \u2248 mg\u2206y near the surface of the Earth.\n"
                +"Note:\u2234, change in the gravitational potential energy at or near the Earth's surface is a special case of "
                +"the general expression.");
        coachMap.put("QM. What is escape energy"," It is the minimum kinetic energy needed to project a mass m from the surface "
                +"of mass M to just escape the influence of the gravitational force field of mass M. i.e. it is the kinetic energy needed to give "
                +"an object it's escape speed.\n\u2234 a rocket launched from the surface of Earth with a speed > the escape speed "
                +"moves away from the Earth thereby losing the kinetic energy (E\u2096) and gaining gravitational potential energy (Eᵍ-becoming less negative)"
                +"\n\u2235 E\u2096 > depth of Earth's gravitational potential well, it is never equal to 0 unlike Eᵍ which is zero at the top "
               +"of the gravitational potential well (equivalent to saying r \u2192 \u221e) .\n\u2234 E\u209c(total energy) >0.\n So, when a rocket reaches "
                +"a height of r \u2192 \u221e, it's gravitational potential energy Eᵍ =0, but some kinetic energy E\u2096 is still "
                +"left in it and the rocket leaves the Earth's gravitational well with some speed.");
        coachMap.put("QL. What is escape speed","It is the minimum speed needed to project a mass m from the surface of mass M to just "
                +"escape the gravitational force of mass M.\nExplanation(a) Let a rocket is at rest on the surface of the Earth with " +
                "the gravitational potential energy Eᵍ = -GMm\u2044r.\n(b)Kinetic energy E\u2096 =0.\nTotal mechanical energy E\u209c=E\u2096 + Eᵍ =Eᵍ\n"
                +"(c)Let the rocket is launched at a certain speed.\nThen E\u209c = E\u2096 + Eᵍ at some point B above the surface.\n"
                +"(d)AS the rocket rises up, it's gravitational potential energy becomes less negative and so increases and kinetic energy E\u2096 decreases.\n"
                +"(e)At a certain point C above B, E\u2096 =0, rocket stops and falls on the surface of the earth and hence cannot "
                +"escape the gravitational field of the earth or the potential well of the Earth.\n(f)To escape the potential well, "
                +"initial velocity and hence the kinetic energy must be equal to the depth of the potential well at the Earth's surface making "
                +"it's total energy zero,i.e. at an infinite distance, Eᵍ =0.\n(g)At this infinite distance, Eᵍ =0 and also E\u2096 =0 and "
                +"the rocket remains at rest at that position.\ni.e. E\u209c =E\u2096 + Eᵍ =0 or E\u2096 =-Eᵍ\n"
                +"1\u20442mv\u00b2 = -(-GM\u2091m\u2044r\u2091)\nor v=\u221a(2GM\u2091\u2044r\u2091)\n"
                +"\u2234 v = 11.2 Km\u2044s.\nThe above speed is the escape speed.");
        coachMap.put("QN. What is the binding energy","It is the amount of additional kinetic energy needed by a mass m to just escape "
                +"(final speed =0) the gravitational force field of Earth.\nFor a rocket of mass m lying at rest on the surface of Earth of mass "
                +"M\u2091\nE\u209c = E\u2096 + Eᵍ = 0 + (-GM\u2091m\u2044r\u2091)\nor E\u209c = -GM\u2091m\u2044r\u2091\n\u2234 "
                +"binding energy = GM\u2091m\u2044r\u2091 is required to be given to the rocket to just escape from the gravitational "
                +"potential well of the earth with final speed =0");
        coachMap.put("QO. What is the bindig energy of a satellite moving in a circular orbit of radius r within the potential well of the Earth without fall"," "
                +"The net force \u2211F required by the satellite to sustain the circular orbit with a speed v around the Earth = gravitational force Fᴳ = "
                +"centripetal force Fᶜ.\ni.e. mv\u00b2\u2044r = GM\u2091m\u2044r\u00b2\nTotal energy of the satellite E\u209c = E\u2096 + Eᴳ is constant.\n"
                +"\u2234 E\u209c = 1\u20442mv\u00b2 - GM\u2091m\u2044r\nor E\u209c =1\u20442GM\u2091m\u2044r - GM\u2091m\u2044r\n "
                +"=-1\u20442GM\u2091m\u2044r\n\u2234 E\u209c = Eᴳ\u20442.\n\u2234 The binding energy of a satellite of mass m moving in a "
                +"circular orbit of radius r around the Earth of mass M\u2091 with a speed v within the gravitational potential well of the Earth without "
                +"falling onto the surface of the Earth\n= 1\u20442GM\u2091m\u2044r.");
        coachMap.put("QP. General cases possible for an object's total energy and binding energy (E\u209c) in the potential well of the Earth","Case 1:\nE\u209c =0.\nThe "
                +"object just escapes with a speed =0\n\nCase 2:\nE\u209c >0.\nObject escapes with a speed >0.\n\nCase 3:\nE\u209c <0.\n"
                +"object is bound to the Earth.\n\nBinding energy needed for a rocket of mass m lying on the surface of the Earth to just escape it's gravitational "
                 +"potential well = GM\u2091m\u2044r\u2091.\n\nBinding energy needed for a satellite of mass m revolving around the Earth in a "
                 +"circular orbit of radius r to escape from the gravitational potential well of the Earth \n=GM\u2091m\u20442r.");
        coachMap.put("QQ. practice questions on escape speed and binding energy","(1) A 600 Kg satellite is to be placed into a circular "
                +"geosynchronous orbit around the Earth (Period = 24 hours for geosynchronous orbits-same as Earth's rotation about it's axis). "
                +"\n(a) Find the radius of the orbit of the satellite.\n(hint:Use mv\u00b2\u2044r = 4\u03c0\u00b2mr\u2044T\u00b2 = GM\u2091m\u2044r\u00b2)\n"
                +"(b)Find the gravitational potential energy of the satellite on the surface of the Earth.\n(hint:use E\u209c = -GM\u2091m\u2044r\u2091)\n"
                +"(c) Find the total energy of the satellite when in the orbit\n(hint:Use E\u209c = -GM\u2091m\u20442r)\n"
                +"(d) How much work must the launch rocket do on the satellite to place it into the orbit\n(hint:use W =\u2206E =E\u209c(orbit) - E\u209c(Earth))\n"
                +"(e) Once in the orbit,how much additional energy would the satellite require to escape from the gravitational potential well of the Earth.\n"
                +"(hint:use E\u209c = at least GM\u2091m\u20442r\n\n"
                +"(2)(a) What is the total energy required to place a 3000 Kg satellite into a circular orbit at an altidude of 400 Km from the "
                +"surface of the Earth.\n(b) How much additional energy would have to be supplied to the satellite once it was in the orbit to "
                 +"allow it to just escape from the Earth's gravitational field.");
        coachMap.put("QR. Briefly describe a Black hole","(a) Black hole: It is a small, very dense body with a very strong gravitational "
                +"field such that nothing can escape from it including light.\n\n(b)Event horizon: Surface of a black hole is called it's "
                +"event horizon.\n\n(c) Singularity: It is the dense centre of a black hole.\n\n(d)Schwartzschild radius: It is the "
                +"distance from the centre of the singularity to the event horizon.\n\n(e)Speed of the light = 3.0 \u00d7 10\u2078 m\u2044s");
        coachMap.put("QS. Practice question on Black hole", "Find Schwartzschild radius of a black hole whose mass is 35 times the mass of the Sun\n "
                +"(M\u209b = 1.99 \u00d7 10\u2078 Kg and speed of light c = 3 \u00d7 10\u2078 m\u2044s)\n\n\u2235 minimum escape "
                +"speed is v\u2091 = c (speed of light)\n\u2234 mv\u00b2\u20442 = GMm\u2044r\n or r = 2GM\u2044c\u00b2\nso, putting the "
                +"values of G, c and M, r = 103.2 Km");
        final List<String> keyList = new ArrayList<String>(coachMap.keySet());

        final List<String> values = new ArrayList<String>(coachMap.values());
        final Object key [] = keyList.toArray();
        final Object value [] =values.toArray();
        final String [] ansValue = new String[value.length];
        final String [] coachValue = new String[key.length];
        for (int i =0;i<key.length;i++) {
            coachValue[i] = (String)key[i];
            ansValue[i] =(String) value[i];
        }
        final TextView selectedOpt =(TextView) findViewById(R.id.selectedquestion);
        selectedOpt.setMovementMethod(new ScrollingMovementMethod());
        selectedOpt.setBackgroundColor(Color.BLACK);
        Spinner questionsList = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> arrayAdpt = new ArrayAdapter<String>(this,R.layout.textview_with_font_change,coachValue);
        arrayAdpt.setDropDownViewResource(R.layout.textview_with_font_change);
        questionsList.setAdapter(arrayAdpt);
        questionsList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
                selectedOpt.setText(ansValue[position]);
                //   selectedOpt.setText(coachMap.get((String)coachValue(position)));

            }


            public void onNothingSelected(AdapterView<?> parent) {
                selectedOpt.setText(" ");
            }
        });
    }
}
