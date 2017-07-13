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

public class Physics_Chapter_2_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics_chapter_2);
        final TreeMap<String,String> coachMap = new TreeMap<String, String>();
        coachMap.put("QA. What is dynamics","Dynamics is the study of how a motion occurs. Thus it studies about the forces and their effects on the motion.\n"
                    +"A force is defined as a push or pull. Force is a vector quantity (F\u20d7).");
        coachMap.put("QB. What are the common type of forces","The common type of forces are:\n\n(a)Force of gravity(F\u20d7g)\n\n(b)Normal Force(F\u20d7\u2099)\n\n"
                    +"(c)Tension Force(F\u20d7\u209c)\n\n(d)Friction force(F\u20d7\u1d63\u2091\u209b)\n\n(e)Static friction(F\u20d7\u209b)\n\n(f)Kinetic friction(F\u20d7\u2096)\n\n"
                    +"(g)Air resistance (F\u20d7\u2090)\n\n(h)Applied force(F\u20d7\u2090\u209a\u209a)");
        coachMap.put("QC. What is force of gravity(F\u20d7g) ","It is the force of attraction between the objects and is action-at-distance force, i.e. contact between the objects is "
                    +"not needed.The force of gravity of an object always acts vertically downwards.");
        coachMap.put("QD. What is a normal force(F\u20d7\u2099)","It is the force perpendicular to the surfaces of the objects in contact.\n"
                    +"It acts vertically upwards when the surface is horizontal.");
        coachMap.put("QE. What is a tension force(F\u20d7\u209c)","It is the force exerted by materials such as ropes, fibres, springs and cables that can be stretched.\n"
                     +"It always acts away from the object. Along the length of the string, it has the same magnitude even if the direction is changed.");
        coachMap.put("QF. What is a friction force (F\u20d7\u1d63\u2091\u209b)","It is the force that resists the motion or an attempted motion of an object "
                +"in contact with a surface. It acts in the direction opposite to the motion or attempted motion.");
        coachMap.put("QG. What is a static friction (F\u20d7\u209b","It is the force that tends to prevent a stationary object from starting to move.");
        coachMap.put("QH. What is kinetic friction (F\u20d7\u2096)","It is the force that acts against the motion of on object along a surface");
        coachMap.put("QI. What is air resistance (F\u20d7\u2090)","It is the frictional force that opposes an object's motion through air.");
        coachMap.put("QJ. What is an applied force (F\u20d7\u2090\u209a\u209a)", "It is an externally applied force such as push, pull or thrust that "
                    +"does not fall into the category of previously defined forces.");
        coachMap.put("QK. What is a free body diagram (FBD)","FBD of a single object shows all the forces in their respective directions acting on the object."
                );
        coachMap.put("QL. What is a system diagram","It is the diagram of the whole system.\nIt is helpful to draw these diagrams for complex problems.");
        coachMap.put("QM. practice questions on FBD","(1) A ball is thrown vertically up in the air. Draw the FBD before it leaves the ground.\n\n"
                +"(2) Draw the FBD diagram of the ball in (1) when in air.\n\n(3) A man is pushing a trunk with a horizontal force."
                +"But the trunk remains stationary. Draw FBD of the trunk.\n\n(4) A man pulls box upwards at a constant velocity"
                +" along a ramp inclined at an angle \u03b8 with the horizontal.Draw the FBD of the box.");
        coachMap.put("QN. What is the net force(\u03a3F or F\u2099\u2091\u209c)","It is defined as the algebraic sum of all forces acting "
                    +"on the object.In two dimensional problems, algebraic sum of the horizontal components of all the forces (\u03a3F\u2095) and "
                    +"the algebraic sum of vertical components of all the forces (\u03a3F\u1d65) is determined. Then\n"
                    +"\u007c\u03a3F\u007c =\u221a(\u03a3F\u00b2\u2095 + \u03a3F\u00b2\u1d65) and\n\u03b8 =tan\u207b\u00b9(\u03a3F\u1d65\u2044\u03a3F\u2095)\n"
                    +"where \u03b8 = angle that \u03a3F makes with \u03a3F\u2095");
        coachMap.put("QO. Practice questions on net force","(1) A player throws a basketball up by applying a force of 12 N[E40\u00b0N] for 4.0 ms."
                +"The mass of the ball is 500 grams. Find the net force on the ball as it is being struck.\n" +
                "(2)A boat is tied to a pier on the bank of a river with two horizontal ropes. A wind is blowing offshore (\u2190).\n"
                +"The tension in the ropes are F\u20d7\u2081 = 50 N[E20\u00b0N] and F\u20d7\u2082 = 50 N[E20\u00b0].\n"
                +"(a) draw FBD of the boat.\n(b)Find the force of the wind acting on the boat if net horizontal force is zero.\n"
                +"(3) Following force vectors are given: F\u20d7\u2081 = 3.0 N[S30\u00b0W]  F\u20d7\u2082 = 5.0 N[W18\u00b0N]  F\u20d7\u2083 =3.5 N[S24\u00b0E]. Find \n"
                +"(a)F\u20d7\u2081 + F\u20d7\u2082 +F\u20d7\u2083\n(b)F\u20d7\u2081 - F\u20d7\u2082");
        coachMap.put("QP. What is inertia","It is the property of the matter that causes an object to resist changes to it's current state."
                     +"It means, inertia tends to keep a stationary object at rest or in motion in a staright line at a constant velocity.\n"
                     +"Examples: (1) A person sitting in a car tends to fall backward, if the car accelerates suddenely since the person "
                      +"tends to remain in the same initial position of rest while the car has moved forward.\n"
                     +"(2) A person sitting in a car moving at constant velocity tends to fall forward, if the brakes are applied suddenely "
                     +"because person continues to move forward at the same velocity that he was travelling before the brakes are applied to the car.");
        coachMap.put("QQ. What is Newton's first law of motion","Newton's first law states that an object remains in it's state of rest or "
                    +"in state of motion at constant velocity if external net force acting on the object is zero. Internal forces have no effect "
                    +"on the object's state. First law is also called the law of inertia.");
        coachMap.put("QR. Practice questions on Newton's first law of motion ","(1) An aircraft of mass 20000 Kg is travelling at a speed of 900 Km\u2044h[E].\n"
                    +"What is the net force acting on the aircraft.\n\n(2) A force of 100 N[N] is exerted on an object to move it in upward direction "
                    +"with a constant velocity.\nFind the force of gravity on the object.");
        coachMap.put("QS. What is Newton's second law of motion","If the external net force (\u03a3F\20d7) acting on an object is not equal to zero,then "
                +"the object accelerates in the direction of net force.\nThe acceleration (a\u20d7) is directly proportional to the net force "
                +"and inversely proportional to the mass(m) of the object.\nThe equation of Newton's second law of motion is given as\n"
                + "(b)\u03a3F\u20d7 or F\u20d7\u2099\u2091\u209c = ma\u20d7. The units of force in SI system is Kg.m\u2044s\u00b2 =1 Newton(N).\n"
                + "So, as per second law, a\u20d7 \u221d F\u20d7\u2099\u2091\u209c\n and a\u20d7 \u221d 1\u2044m.");
        coachMap.put("QT. Practice questions on Newton's second law of motion","(1)The mass of a hot air balloon including passengers is 1200 Kg. "
                +"The force of gravity on the balloon is 9200 N[S]. The buoyant force (Upward thrust due to air) is 10000 N[N].\n "
                +"Find the vertical acceleration.\n\n(2) A 9.0 Kg ball is travelling at a velocity of 6.24 m\u2044s[W]. It strikes a pebble "
                +"staright on. The collission last for 1.5 ms and changes the velocity of ball to 5.4 m\u2044s [W] just after the collission. "
                +"Find the net force on the ball during collission.");
        coachMap.put("QU. What is weight","It is the force with which an object is pulled towards the centre of Earth.\n"
                +"It is also called the force of gravity.\n Weight = F\u20d7g = mg\u20d7, where g\u20d7 is the acceleration due to gravity =9.8m\u2044s\u00b2 [S] "
                +"near the surface of the earth.");
        coachMap.put("QV. What is force field and gravitational field strength","(a) Force field: The space surrounding an object in which "
                +"a force exists is called a force field.\nExample: The gravitational force field surrounding Earth extends from Earth's surface "
                +"far into the space.\n\n(2) Gravitational field strength(g\u20d7): Near the surface of the Earth, amount of force "
                +"per unit mass is called gravitational field strength.\nThe value of g\u20d7 = 9.8 N\u2044Kg [\u2193]. It has the "
                +"same value as the average acceleration due to gravity at the Earth's surface. Also units N\u2044Kg=m\u2044s\u00b2.");
        coachMap.put("QW. What is Newton's third law of motion","For every action force, there is a simultaneous equal in magnitude and "
                +"opposite in direction reaction force.\nIt explains the situation where force is exerted on one object by a second object.\n"
                +"\nExamples: (a) When a boat is rowed, oar exerts an action force backward on water and water exerts a reaction force forward on the oar.\n\n"
                +"(b) While walking, your feet exerts an action force downward and backward on the floor and floor exerts a reaction "
                 +"force upwards and forward on your feet.");
        coachMap.put("QX. Practice questions on Newton's third law of motion","Describe the action and reaction pairs of forces in each case\n\n"
                +"(a)An inflated balloon is released from your hand and travels eastward.\n"
                   +"\n(b)A hockey player slides on the ground and experiences force of friction.\n\n"
                   +"(c)A swimmer's hands exert a backward force on water.\n\n"
                   +"(d)Earth exerts a gravitational force on the car.");
        coachMap.put("QY. Describe steps in applying Newton's laws of motion","Step 1:Draw a system diagram with all the given numerical quantities indicated on the diagram.\n"
                +"\nStep 2:Draw FBD of the object (or group of objects) and label all the forces. Choose the +x and +y directions."
                +"\n(Choose one of these directions as the direction of the acceleration).\n\nStep 3: Calculate and label x and y components"
                +" of all the forces on the FBD.\n\nStep 4:Write the Newton's second law equation.\n\u03a3F\u2095 = ma\u2095 and \u03a3F\u1d65 = ma\u1d65\n\n"
                +"Step5: Repeat steps 2-4 for all the objects as needed.\n\nStep 6: Solve the resulting equations algebraically.");
        coachMap.put("QZ. Practice questions on applying Newton's laws of motion ","(1) A boy is pushing a trunk across a floor with "
                +"a constant velocity of 0.2 m\u2044s [E].The boy is exerting a constant horizontal force pf 95 N [E]. "
                +"The mass of the truck is 40 Kg. Find\n (a) Normal force F\u20d7\u2099 and friction force F\u20d7\u1d63\\u2091\u209b on the trunk.\n"
                +"(b) Total force applied by the floor.\n\n"
                +" (2) Sledges A and B are connected by a horizontal rope with A in front of B. Sledge A is pulled by a "
                +"horizontal rope with a tension of 31.0 N [E]. The masses of A and B are 6.0 Kg and 5.0 Kg respectively. "
                +"The friction forces acting on a and B are 8.0 N [W] and 7.0 N [W] respectively. Find\n"
                +"(a) The acceleration of two sledge system.\n(b)The tension in the rope connecting the sledges.\n"
                 +"(c) Acceleration of sledge B\n(d) Verify if Newton's third law is verfied.");
        coachMap.put("QZA. How do the directions in the pulley problems consdered","When a problem involving at least one pulley is solved, a general "
                +"positive direction of the entire system of the object is assumed, generally in the direction of the acceleration. "
                +"Then assign a +x and +y direction for each object so that it is in the general positive direction assumed.\n\n"
                +"Example: Consider three boxes A, B and C. Let box C is the heaviest, followed by B and C. Let the box B is "
                +"placed on a table. It is connected to pulleys both on its left and right side by strings. Mass A hangs in the air through "
                +"the string on left side of B and mass C hangs on the the right side of B. Since mass C is the heaviest, "
                  +"the system of objects will tend to accelarate in the clockwise direction.\n"
                  +"Then for mass A, positive direction is upward, for mass B, +ve direction is right and for mass C, +ve direction is downward.");
        coachMap.put("QZB. More practice questions on Newton's laws of motion and pulleys","(1)Two masses, m\u2081 = 10 grams and m\u2082=4 grams "
                + "are attached to the ends of a string. The string is put over a smooth pulley and the thread is held tight. "
                +"The thread is then released. Assume negligible friction and g\u20d7 = 9.8 m\u2044s\u00b2 [S]. Find\n"
                +"+ve direction of motion of each mass.\n(b)Acceleration of the masses.\n(c)The tension in the thread.\n\n"
               +"(2) A skater S\u2081 has a mass of 70 Kg and another skater S\u2082 has a mass of 16 Kg. S\u2081 pushes S\u2082 "
               +"with a constant applued force of magnitude 60 N [E] for 1.2 s. find\n(a)Acceleration of S\u2081\n"
                +"(b)Acceleration of S\u2082(c)The maximum velocity of S\u2082.");
        coachMap.put("QZC. What are static and kinetic frictions","Static friction acts on a stationary object and prevents it "
                +"from startng to move. The magnitude of the force needed to start a stationary object is called "
                +"maximum static friction F\u20d7\u209b\u2098\u0332\u2093.\nAfter the object starts moving, magnitude of the force needed to keep "
                 +"the object  moving at a constant velocity is called kinetic friction F\u20d7\u2096.");
        coachMap.put("QZD. What are the factors affecting static and kinetic frictions","(a) Surfaces in contact\n"
                +"(b)Normal force between the objects.");
        coachMap.put("QZE. what is the coefficient of friction (\u039c)","It is the ratio of magnitude of force of friction "
                +"between the two surfaces to the normal force between these two surfaces.\n"
                +"It depends on (a) Nature of two surfaces in contact.\n(b)Type of friction-static or kinetic.\n"
                +"Coefficient of static friction: \u039c\u209b=F\u209b\u2098\\u2090\u2093\u2044F\u2099\n\n"
                 + "Coefficient of kinetic friction: \u039c\u2096 = F\u2096\u2044F\u2099");
        coachMap.put("QZF. Practice qustions on friction and Newton's laws","(1) An object of mass 22.0 Kg rests on a floor. \u03a3\u209b =0.45 "
                +"and \u03a3\u2096=0.410. \u007cg\u007c = 9.8 m\u2044s\u00b2. What are the force of friction and acceleration when\n"
                +"(a) a horizontal force of 72.0 N [E] is applied to the object\n"
                 +"(b) a horizontal force of 100.0 N [E] is applied.\n\n"
                 +"(2) A dog is pulling a sledge carrying two children over a level snow. The mass of sledge and the children is 42 Kg. "
                   +"The sledge rope makes an angle of 29\u00b0 with the horizontal. \u03a3\u2096 = 0.11. Find the tension "
                   +"in the rope required to keep the sledge moving at a constant velocity.");

        coachMap.put("QZG. What are inertial and non inertial frames of reference", "Inertial Frame of reference : It is a frame of reference "
                +"in which the law of inertia is valid\n\nNon Inertial frame of reference : It is a frame of reference in which the law of "
                +"inertia is not valid.\n\nExplanation: Let a boy is travelling in a train moving at a constant speed in the forward direction "
                +"and a ball is placed on the floor of the train. It is at rest relative to the boy and the train which is similar to "
                +"the situation if the train is at rest. Thus ball in relation to the train is at rest if there is no net force acting "
                +"on it, i.e. it obeys newton's first law of motion or the law of inertia. So, the train at rest or in motion at a "
                +"constant velocity is an inertial frame of reference. Also, any other frame moving at a constant velocity relative to "
                +"the first frame is also an inertial frame i.e. a car moving at a constant velocity is also an inertial frame "
                +"of reference for the train. Similarly an observer standing on the road side is also an inertial frame of "
                +"reference for the train.\n Now, let the brakes are applied to the train and so it undergoes a deacceleration. "
                +"Due to inertia, ball moves or accelerates in the forward direction, but no net force has caused this acceleration."
                +"Thus law of inertia does not hold.\nThis happens because we are observing the motion from the accelerated frame of "
                  +"reference inside the train which is a non inertial frame.");
        coachMap.put("QZH. Practice questions on Inertial and non inertial frame of references","(1) A pingpong ball is suspended from the roof of a train "
                +"through a string. The string makes an angle of 9\u00b0 with the vertical as the bus is accelerating forward. " +
                "Find the magnitude of the acceleration of bus.\n\n(2) A ball of mass 30 grams is suspended by a strng from the "
                +"roof of a train moving westward. It slows down, so that the ball and the string are inclined at 12\u00b0 from "
                +"the vertical. Find\n(a)the acceleration of the train\n"
                +"(b) The magnitude of the tension in the string.");
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
