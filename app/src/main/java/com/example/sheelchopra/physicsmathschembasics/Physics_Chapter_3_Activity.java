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
 * Created by sheelchopra on 2017-04-18.
 */

public class Physics_Chapter_3_Activity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics_chapter_3);
        final TreeMap<String,String> coachMap = new TreeMap<String, String>();
        coachMap.put("QA. What is a uniform circular motion","It is a motion that occurs when an object has constant speed and constant radius."
                +" Thus, the velocity vector changes continously since it's direction changes. The instantaneous velocity "
                +"vector is tangential to the circular path traversed by the object and is perpendicular to the "
                +"instantaneous position vector also called radius vector.\n\n"
                +"Examples of circular motion : (1) Electric fans and motors\n(2) Rotating wheels\n(3)Objects or particles "
                +"orbiting around other objects or particles such as planets orbiting around the sun. In all the above examples, "
                +"objects spin at a constant rate.\nIf the magnitude of the velocty is not constant, the path traversed by "
                  +"the object is not circular but elliptic.");
        coachMap.put("QB. What is centripetal acceleration","It is the instantaneous acceleration directed towards the centre of the circle. "
                +"Centripetal acceleration and instantaneous velocity are perpendicular to each other. It's magnitude is given as :\n"
                +"a\u20d7c = v\u00b2\u2044r\n where a\u20d7c = centripetal acceleration,\nv = speed of the object and\n"
                +"r = radius of the circular path.");
        coachMap.put("QD. Practice questions on centripetal acceleration ","(1)A child on a merry-go round is 5.7 meters from the "
                +"centre of the ride which is travelling at a constant speed of 2.1 m\u2044s. Find the magnitude of "
                   +"child's centripetal acceleration.\n\n(2)A ball tied to a string is being spun around in a circle."
                   +"The diameter of the vircle formed is 21.4 cm and is rotating at 900 rpm (revolutions per minute) "
                   +"in counterclockwise direction. Find the magnitude and direction of centripetal acceleration at the instant ball is moving \n"
                    +"(a) Westward\n(b)Eastward\n(c)Southward\n(d)Northward.");
        coachMap.put("QC. Describe various relationships of a\u20d7c","It is known that around a circle for 1 cycle, v=2\u03c0r\u2044T, "
                +"whereT = time period of 1 cycle, 2\u03c0r = circumference of the circle.\nSince, ac = v\u00b2\u2044r,\n"
                +"ac =4\u03c0\u00b2r\u2044T\u00b2.\nAlso frequency f = 1\u2044T, so ac = 4\u03c0\u00b2rf\u00b2.\n"
                +"\u2234 ac = v\u00b2\u2044r = 4\u03c0\u00b2r\u2044T\u00b2 = 4\u03c0\u00b2rf\u00b2.");
        coachMap.put("QE. What is a centripetal force","An object undergoing uniform circular motion experiences centripetal acceleration "
                +"directed towards the centre of the circle. By Newton's second law of motion, this acceleration should be caused by "
                +"an unbalanced or net force directed towards the centre of the circle. This is called centripetal force.\n"
                +"It is not any new type of force, but is the net force.\nIt can be supplied by a string as tension force, a frictional force,"
                +"gravitational force when moon orbits around the Earth or an electrical force such as when electron orbits the proton."
                 +"It is this force that keeps the object moving in the cicular path.\n F\u20d7c = F\u20d7\u2099\u2091\u209c = ma\u20d7c\n"
                +"F\u20d7c=mv\u00b2\u2044r = 4\u03c0\u00b2rm\u2044T\u00b2 = 4\u03c0\u00b2rmf\u00b2.");
        coachMap.put("QF. Practice question on Centripetal force","A 0.30 gram flea sits at a distance of 7.0 cm from the centre of a rotating "
                +"LP record. If record rotates at 80 rpm, what centripetal force must be provided by the friction to cause the flea "
                +"to maintain it's uniform circular motion.");
        coachMap.put("QG. How is vertical circular motion analysed","When an object moves around a vertical circle tied to a string, "
                    +"centripetal force varies from point to point.\n\nAt the top of the circle:\n"
                    +"F\u20d7c = F\u20d7\u2099\u2091\u209c=F\u20d7\u209c +F\u20d7g\nAt bottom of the circle:\n"
                    +"F\u20d7c = F\u20d7\u2099\u2091\u209c=F\u20d7\u209c -F\u20d7g\nFor minimum speed required at the top of the circle "
                     +"to keep the object in it's circular path to avoid falling, F\u20d7\u209c (Tension force in the string) is assumed =0.\n"
                    +"\u2234 F\u20d7c=F\u20d7g.\n mv\u00b2\u2044r = mg\n \u2234 v = \u221arg.\nFor maximum speed, consider F\u2099\u2091\u209c=Fc at the bottom.");
        coachMap.put("QH. Practice questions on vertical circular motion","(1) A 30 grams pebble is hanging from a long massless string. "
                    +"It is spun in a vertical circle at a speed of 5.0 m\u2044s. If the string is 1 meter long, find the tension "
                    +"in the string at the top and bottom of the circle.\n\n(2) an object swings in a vertical circle with a redius of 0.90 meter. "
                    +"What is the minimum speed of the object at the top of the circle that will keep te object in circular motion.\n\n"
                     +"(3)A string requires a 150 N to break. A 3.0 Kg mass is tied to the string and spun in a vertical circle with a "
                     +"radius of 1.2 m. What is the maximum speed that this mass can be spun without breaking.");
        coachMap.put("QI. Explain relationship between centripetal force and banked curves","When a car travels along a level curve, "
                    +"the centripetal force is usually provided by the frictional force (static) between the car's tires and the "
                    +"road's surface.\nThus F\u20d7\u209b = \u03bc\u209bF\u20d7\u2099 = mv\u00b2\u2044r =F\u20d7c, where\n"
                    +"F\u20d7\u209b is force of static friction, \u03bc\u209b is the coefficient of static friction and "
                    +"F\u20d7\u2099 is the normal force.\nTo reduce the reliance on friction, the curve can be inclined or banked "
                    +"relative to the horizontal (raised above the ground at an angle). For a given banked curve, there is one speed "
                   +"at which the centripetal force is provided strictly by a component of the normal force which is the unbalanced horizontal "
                   +"component of the normal force and is given as :\nF\u2099sin\u03b8 = Fc = mv\u00b2\u2044r, where "
                   +" \u03b8 = angle of bank with horizontal.\n Also, F\u2099cos\u03b8 -mg =0 (\u2235 \u03a3Fy =0)."
                   +"\n\u2234 F\u2099 = mg\u2044cos\u03b8.\nAt this speed, the object does not need a frictional force to "
                   +"undergo uniform circular motion.");
        coachMap.put("QJ. Practice questions on banked curves", "(1) A 1200 Kg car enters a level curve at 23 m\u2044s. If the radius "
                +"of the curve is 90 meters\n(a) What centripetal force is supplied by the friction to keep the car from skidding.\n"
                 +"(b) What is the minimum coefficient of friction needed to prevent the car from skidding.\n(c) Does the weight"
                 +"of car has any effect on it's motion through the curve. Explain.\n\n(2)The above car (1200 Kg mass) "
                 +"travels around a frictionless, banked curve with a radius of 90 meters. The banking is inclined at 18\u00b0 "
                 +"to the horizontal.\n(a) At what specific speed must the car travel to maintain a constant radius.\n"
                 +"(b)What happens if car goes faster than the speed in (a).\n(c)What happens when car goes slower than speed in (a).");
        coachMap.put("QK. More Practice questions on Banked curves and vertical motion","(1) A car of mass 1200 Kg travels around a banked curve"
                     +" of radius 90 meters. The angle of banking is 20\u00b0 to the horizontal.\n(a) What force "
                     +"provides the centripetal acceleration.\n(b) What constant speed must the car maintain to travel "
                     +"safely around the curve.\n(c) If now a truck with mass of 5000 Kg passes through the curve, "
                     +"what will be it's speed to pass safely.\n(d) Repeat (a)-(c) if \u03bc\u209b = 0.49.\n\n"
                    +"(2) A 4.0 Kg ball swings on the end of a rigid steel rod at a constant speed in a vertical circle "
                    +"of radius 1.5 meters with a frequency of 1.5 Hz.\nFind the magnitude of tension in the rod at the top and "
                    +"bottom of the circle.");
        coachMap.put("QL. What is centrifugal force", "It is defined as a fictitious force in rotating (accelerating) frame of reference.\n\n"
                    +"Explanation:Acceleration frame of reference is a noninertial frame in which Newton's law of inertia does not hold."
                     +"As an object in circular motion is accelerating, any motion observed within that object is in a noninertial frame. "
                      +"The passenger sitting in the car feels a force pushing him against the side door. from the Earth's frame "
                      +"of reference (inertial frame), force felt can be explained by Newton's first law of motion, i.e. "
                      +"passenger tends to maintain initial velocity when the car turns left or right and passenger tends to go "
                     +"straight and car door pushes him and makes him to move along the circular path.\nSo there is a centripetal "
                     +"force acting left on his body when the car turns left and is acting right when the car turns right.\n"
                     +"Now, if same situation is considered from accelerating frame of reference of car (noninertial frame),"
                     +"passenger feels that is being pushed towards outside of circle in tangential direction and away from the centre. "
                     +"Since law of inertia cannot be applied here, so this force acting away from the centre is a fictitious force "
                      +"called the Centrifugal force.");
        coachMap.put("QM. What is Newton's law of gravitation","It states that, the force of attraction between any two objects "
                +"is directly proportional to the product of the masses of the objects and inversely proportional to the square "
                +"of the distance between their centres. Mathematically, it is expressed as:\nFG \u221d = m\u2081m\u2082 and \n"
                +"FG \u221d 1\u2044r\u00b2.\n\u2234 FG \u221d m\u2081m\u2082\u2044r\u00b2\n or FG = Gm\u2081m\u2082\u2044r\u00b2, where\n"
                 +"G = Gravitational constant = 6.67 \u00d710\u207b\u00b9\u00b9 N-m\u00b2\u2044Kg\u00b2, m\u2081 and m\u2082 are "
                    +"the two masses in interaction and r is the centre to centre distance between the two masses.");
        coachMap.put("QN. Practice questions on Newton's law of Gravitation","(1) Find the magnitude of the force of attraction between two balls "
                +"of masses 5.5 Kg each when they are seperated by 40 cm centre to centre.\n\n(2) Earth's gravitational pull "
                +"on a spacecraft at some distance away is 150 N in magnitude. What will be the magnitude of the gravitational force "
                +"on a second aircraft with 1.5 times the mass of first spacecraft at a distance from Earth's centre which is "
                +"0.75 times as great.");
        coachMap.put("QO. Explain concept of satellite orbiting around Earth","Any satellite orbiting around the Earth, artificial "
                +"or natural is in constant free-fall as it moves in it's orbit. It is prevented from falling onto the earth " +
                "because of its orbital velocity.\nThere is a relationship between the speed of a satellite and radius of "
                +"of its orbit. The force of gravitation (FG) acting on the satellite is the centrepetal force that keeps "
                +"the satellite moving in a circular path.\n\u2234 F\u20d7c = F\u20d7G\nSo, m\u209bv\u00b2\u2044r = Gm\u209bm\u2091\u2044r\u00b2\n"
                +"\u2234 v=\u221aGm\u2091\u2044r where\n m\u2091 = mass of Earth or central body around which satellite revolves and \n"
                +"m\u209b = mass of satellite.\nSo to calculate orbiting velocity of the satellite, its mass is not needed.");
        coachMap.put("QP. What is the period of the satellite","It is the time taken by a satellite to travel around Earth once. It is "
                +"It is determined mathematically as below:\n \u2235 v = distance(d)\u2044\u2206t and d = 2\u03c0r for one time period(T) and \u2206t =T,\n"
                +"\u2234 v = 2\u03c0r\u2044T = \u221a(Gm\u2091\u2044r)\n\u2234 T = 2\u03c0\u221br\u00b2\u2044\u221a(Gm\u2091).");
        coachMap.put("QQ. Practice questions on satellite motion","(1) Find the speed of an artificial satellite in a circular orbit around "
                +"the Earth. The radius of the orbit r = 7.9 \u00d7 10\u2076 from the surface of the Earth.\n\n"
                +"(2) A satellite has a mass of 4000 Kg. How high above the Earth's surface must the satellite be in order to maintain "
                +"geosynchronous Earth orbit. \nTake period of Earth =23 hours, 56 minutes and 4 seconds.\n\n"
                +"Assume radius of earth =6370 Km and mass of Earth\nm\u2091 = 5.97 \u00d7 10\u00b2\u2074 Kg.");
        coachMap.put("QR. What is apparent weight","When you stand on a weighing scale, the reading on the scale gives your weight. "
                +"The reading on the scale is the normal force being exerted on you by the weighing scale.\n When the weighing machine is at "
                +"rest, the reading on the scale = F\u20d7\u2099 =mg\u20d7 (Weight of the object).\nNow if you are standing on the scale "
                +"in the lift accelerating upwards with an acceleration a\u20d7, then F\u20d7\u2099\u2091\u209c = ma\u20d7=F\u20d7\u2099 -mg\u20d7\n"
                +"So, F\u2099 = ma + mg. So reading on the scale is more than the actual weight i.e. your apparent weight is more than actual weight.\n"
                +"Now, if lift is moving downward with acceleration a\u20d7, then F\u20d7\u2099\u2091\u209c = ma\u20d7 = mg-F\u2099\n"
                +"So, F\u2099 = mg-ma. So reading on the scale is lower than your actual weight, i.e. your apparent weight is "
                +"lower than the actual weight.\nWhen a = g, F\u2099 = 0. So if lift is accelerating downward under free fall, you feel "
                +"weightlessness as reading on the scale = 0. This also happens when an astonaut in an orbit is in free fall.");
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
