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

public class Physics_Chapter_5_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics_chapter_5);
        final TreeMap<String,String> coachMap = new TreeMap<String, String>();
        coachMap.put("QA. What is linear momentum(p\u20d7)","It is defined as the product of the mass m of a moving object and "
                +"it's velocity v\u20d7. It is a vector quantity.\np\u20d7 = mv\u20d7.\nIt's SI units are Kg.m\u2044s.\n\u2234 p\u20d7 \u221dm and\n"
                +"p\u20d7 \u221d v\u20d7\n\nExample:A truck has more momentum than a car moving at the same speed.\n\nMomentum expressed in "
                +"horizontal and vertical components:\np\u2095 =mv\u2095\np\u1d65 = mv\u1d65.");
        coachMap.put("QB. Practice questions on linear momentum","(1)Find the linear momentum of a fish of mass 900 Kg swimmimg at "
                +"a velocity of 9 m\u2044s.\n\n(2) A bullet travelling at 800 m\u2044s N35\u00b0E has a mass of 7 grams.\n"
                +"(b) Find the linear momentum of the bullet.");
        coachMap.put("QC. What is impulse","Impulse is equal to the change in momentum.\nExplanation:If p\u20d7\u2081 is the initial "
                +"momentum and p\u20d7\u2082 is the final momentum, then, change in momentum is :\n\u2206p\u20d7 = p\u20d7\u2082 - p\u20d7\u2081.\n"
                +"By Newton's second law of motion, the net force acting on the body of mass m and acceleration a\u20d7:\nF\u20d7\u2099\u2091\u209c=\u2211F\u20d7 =ma\u20d7\n"
                +"or \u2211F\u20d7 = m(v\u20d7\u2082 -v\u20d7\u2081)\u2044\u2206t,\nwhere v\u20d7\u2081, v\u20d7\u2082 and \u2206t are "
                +"respectively initial velocity, final velocity and time elapsed.\n\u2234 \u2211F\u20d7\u2206t = mv\u20d7\u2082 - mv\u20d7\u2081.\n"
                +"\n\u2234 \u2211F\u20d7\u2206t = p\u20d7\u2082 - p\u20d7\u2081 = \u2206p\u20d7.\nExpression \u2211F\u20d7\u2206t is called impulse.\n"
                +"\u2234 change in momentum = impulse.\n SI units of impulse is Newton.second(N.s)." );
        coachMap.put("QD. Application of expression \u2206p\u20d7=\u2211F\u20d7\u2206t","The expression means that the change in the momentum "
                +"of the object is equal to the product of the net force acting on the object and the time duration of the "
                +"application of the force during an impact or interaction.\nExample: Let a person A throws a ball at rest to person B. let the ball attains a final "
                +"velocity v\u20d7\u2082 just before touching the hand of B.\n\u2234 \u2206p\u20d7 = mv\u20d7\u2082 - mv\u20d7\u2081 = "
                +"mv\u20d7\u2082 -0 = mv\u20d7\u2082\n. The change in momentum of the ball is always constant as the final velocity will always "
                 +"be the same.\n\u2235 \u2206p\u20d7 = \u2211F\u20d7\u2206t,\n so if the hand after catching the ball is allowed to move along with "
                 +"the ball during the impact, the net force \u2211F\u20d7 acts for longer duration \u2206t.\n\u2234 the force felt on the hand is less,i.e. "
                 +"the hand gets less hurt.\nHowever, if the catching hand is not moved along with the ball during the impact, the net force acts for a short duration "
                 +"and is much more than in above case. So, in the latter case, the force on the hand is larger and is more hurt.");
        coachMap.put("QE. Expression \u2211F\u20d7\u2206t = \u2206p\u20d7 in component form","Horizontal component form:\n"
                +"\u2211F\u2095\u2206t = \u2206p\u2095.\n\nVertical component form:\n\u2211F\u1d65\u2206t = \u2206p\u1d65\n.");
        coachMap.put("QF. What is average net force on an object during impact","In the derivation of the equation \u2211F\u20d7\u2206t =\u2206p\u20d7,\n"
                +"acceleration of the object is assumed to be constant, thereby net force acting on the object during the time duration "
                +"of the impact \u2206t is assumed constant. But in the real world, the acceleration of the object during the impact is  "
                +"never constant. So \u2211F\u20d7 is also not constant during the impact. In such a case, the expression \u2211F\u20d7\u2206t =\u2206p\u20d7 "
                +"still can be used.\nBut the net force \u2211F\u20d7 =average force acting over the time duration \u2206t of the impact.\n"
                +"\nTo find this average force, a graph of Force(F\u20d7) (Newton) vs time t(s) is plotted during the collision. The area under the curve "
                +"between time intervals t\u2081 and t\u2082 gives the impulse given to the object during the impact duration \u2206t =t\u2082 -t\u2081. "
                +"Then average net force acting on the object during the time duration \u2206t of the collision/impact is the constant force "
                +"that would yield the same impulse as the non constant net force does in the same time interval.\n "
                +"\u2234 \u2211F\u2090\u1d65 =(area under the curve of graph of F and t)\u2044(t\u2082 - t\u2081).\n\n" +
                 "The average net force is also = area of the rectangle formed between the time interval \u2206t which is same as area under "
                +"the curve of graph of F vs t during the same time interval \u2206t divided by \u2206t.");
        coachMap.put("QG. Practice questions on impulse","(1)A ball of mass 250 grams is travelling horizontally at 42.5 m\u2044s[E]. "
                +"It hits a goal post and the collision lasts for 1.2 ms. After the collision, the ball travels at 52.5 m\u2044s[W].\n"
                +"(a) Find the initial momentum of the ball.\n(b) Find the final momentum of the ball.\n(c) Find the average force "
                +"applied by the goal post to the ball during the collision.\n(d)Why the force of gravity is ignored in this collision.\n"
                +"(Hint:The average force acting on the bodies during the collision is much higher then the other forces such as gravity "
                +"and so they are neglected.)\n\n(2)A 65 gram tennis ball is thrown upwards and on reaching maximum height it is at rest for "
               +"for a moment. At that time, it is hit by a racket horizontally with a force of 475 N for 6 ms.\n(a)Find the speed of the "
                +"ball immediately after the collision.\n(b)If time duration of the collision is 6.8 ms, find the speed of the ball after collision.");
        coachMap.put("QH. What is the law of conservation of momentum","It states that if the net force acting on a system of colliding objects "
                +"is equal to zero, then the linear momentum of the system before the collision is equal to the linear momentum after "
                +"the collision.\nThe law of conservation of momentum is valid for the isolated systems.\nExample:When two cars travelling "
                +"on a horizontal road collide with each other, the momentum is conserved since there is no net force acting on the system.\n"
                +"Example:In a second situation, if one object falls on a platform fixed to the supports, the momentum is not conserved.");
        coachMap.put("QI. Mathematical description of law of conservation of momentum","Consider two objects of masses m\u2081 and m\u2082 "
                +"approaching each other with velocities v\u2081 and v\u2082.\nTotal initial momentum of the system\n\u03c1\u20d7= "
                +"m\u2081v\u20d7\u2081 + m\u2082v\u20d7\u2082.\nLet these objects collide with each other.By Newton's third law of motion, "
                +"each object exerts an equal and opposite force on each other.\ni.e. F\u20d7\u2082\u2081 = -F\u20d7\u2081\u2082, where\n"
                +"F\u20d7\u2082\u2081 = force exerted by mass 2 on 1 and F\u20d7\u2081\u2082 = force exerted by mass 1 on 2.\n\u2234 F\u20d7\u2082\u2081 + F\u20d7\u2081\u2082 =0"
                 +"\u2235 F\u20d7\u2082\u2081 = -F\u20d7\u2081\u2082,\n\u2234 m\u2081a\u20d7\u2081 = -m\u2081a\u20d7\u2082.\n"
                 +"m\u2081\u2206v\u20d7\u2081\u2044\u2206t\u2081 = -m\u2082\u2206v\u20d7\u2082\u2044\u2206t\u2082.\n\u2235 collision time is "
                 +"same for both the objects,\n\u2234 \u2206t\u2081=\u2206t\u2082 = \u2206t\n\u2234 m\u2081\u2206v\u20d7\u2081 =-m\u2082\u2206v\u20d7\u2082"
                 +"or \u2206p\u20d7\u2081 = -\u2206p\u20d7\u2082.\n\u2234 when two objects collide, the change in momentum of the first object "
                 +"is equal in magnitude to the change in momentum of the second object but with opposite sign.\nThis is another definition "
                 +"of conservation of momentum.\nIf v\u20d7\u2081\u0027 and v\u20d7\u2082\u0027 are the final velocities of objects 1 and 2 respectively "
                 +"after the collision, then\nm\u2081(v\u20d7\u2081\u0027 - v\u20d7\u2081) =-m\u2082(v\u20d7\u2082\u0027 - v\u20d7\u2082).\n"
                 +"\u2234 m\u2081v\u20d7\u2081 + m\u2082v\u20d7\u2082 = m\u2081v\u20d7\u2081\u0027 + m\u2082v\u20d7\u2082\u0027.\n"
                 +"\u2234 Total momentum of the system before the collision = total momentum after the collision.\ni.e \u03c1(system) =\u03c1\u0027(system)\n"
                 +"This is the definition of the law of the conservation of momemntum.");
        coachMap.put("QJ. Conceptual questions on law of conservation of momentum","Law of conservation of momentum is not valid for all the "
                +"systems involving collisions. It is valid only in the systems where net force acting on whole of the system is zero.\n"
                +"Example 1:Two cars approaching each other on a horizontal road collide. By Newton's third law of motion, force exerted by "
                +"the car 1 on car 2 (F\u20d7\u2081\u2082) is equal in magnitude but opposite in sign to force exerted by car 2 on car 1 "
                +"(F\u20d7\u2082\u2081). The total normal force of both cars is balanced out with total weight of the cars. Since, collision "
                +"is for a short duration and if neglecting friction, the total net force acting on the system of two cars during collision =0 and "
                +"so, the law of conservation of momentum is applicable i.e. change in momentum of car 1 is equal in magnitude and opposite "
                +"in sign to the change in momentum of the second car.\n\nExample 2:Let a swimmer(object 1) jumps from rest on a wooden deck(object 2) fixed to the supports "
                +"on the ground. The swimmer is sprung again in the air after the collision. The forces acting on the system during collision are "
                 + "F\u20d7\u2082\u2081 and F\u20d7\u2081\u2082 which are equal and opposite to each other. In addition, there is a reaction force "
                 +"exerted by the supports of the deck preventing it to move which is unbalanced in the system. So, the net force on the system \u2260 0.\nAdditionally, change in the momentum "
                +"of the swimmer =\u2206\u20d7p\u2081(swimmer) = m\u2081(v\u20d7\u0027\u2081 - v\u20d7\u2081) = m\u2081(v\u20d7\u0027\u2081 - 0) \u2260 0 "
                +"since final velocity of the swimmer is \u2260 0. But the change in momentum of the deck is = 0 since it remains at rest "
                 +"before and after the collision. So the change in the momentum of the swimmer \u2260 change in the momentum of the deck. So "
                +"the law of conservation of momentum is not applicable in this situation.");
        coachMap.put("QK. What is an elastic collision", "It is defined as the collision in which the total kinetic energy of the system after "
                +"the collision is = total kinetic energy of the system before the collision. For systems under elastic collision\n"
                +"(a)Kinetic energy of the system before collision(E\u2096)= Kinetic energy of the system after the collision(E\u0027\u2096) and\n"
                +"(b)Initial momentum of the system(\u03c1) = Final momentum of the system(\u03c1\u0027)");
        coachMap.put("QL. What is an inelastic collision","It is a collision in which the initial kinetic energy of the system before collision not "
                +"equal to the final kinetic energy of the system after the collision.\nThe conditions of the inelastic collision are:\n"
               +"(a)Kinetic energy of the system before collision(E\u2096) \u2260 Kinetic energy of the system after the collision(E\u0027\u2096)"
               +"\n(b)Initial momentum of the system(\u03c1) = Final momentum of the system(\u03c1\u0027)");
        coachMap.put("QM. What is completely perfect inelastic collision","It is the inelastic collision in which the two objects stick together "
                +"and move with the same final velocity after the collision. It's conditions are:\n(a)E\u2096 > E\u2096\u0027 and\n" +
                "(b)\u03c1 = \u03c1\u0027.\n\nNote 1:In perfectly inelastic collisions, the colliding objects have the same final velocity.\n"
                +"Note 2:The kinetic energies compared in the elastic and inelastic collisions are before and after the collisions and  "
                +"not during the collision.");
        coachMap.put("QN. Illustrations for elastic, inelastic and perfectly inelastic collisions","Elastic collision: When two rubber balls collide "
                +"with each other, they bounce off with high speeds. in such a case kinetic energy before the collision is equal to the "
                +"kinetic energy after the collision. So it is an elastic collision.\n\nInelastic collision: When two tennis balls collide "
                +"with each other, they bump off each other with lower speeds. So initial kinetic energy of the system is not equal to the "
                +"final kinetic energy of the system. So, it is an inelastic collision.\n\nPerfectly inelastic collision: If after collision, two "
                +"balls stick with each other, they move with the same final velocity. So, initial kinetic energy of the system is not equal to "
                +"the final kinetic energy of the system. This is perfectly inelastic collision.\n\nIn all the above cases, momentum is "
                +"conserved before and after the collision.");
        coachMap.put("QO. Explain how energy is conserved in the system of colliding objects","Consider two objects attached to springs in front of "
                   +"them and approaching towards each other with initial velocities v\u20d7\u2081[E] and v\u20d7\u2082[W]. Just before the "
                   +"collision, speed and the kinetic energy of both the objects is maximum. when the two springs start compressing each other, the collision "
                    +"starts. So, the objects start slowing down causing fall in their kinetic energies. The decrease in the kinetic "
                    +"energies of the objects is transformed into the potential energies of the springs. (Assume no friction)."
                     +"When the springs are compressed upto the maximum, the speed of both the objects = 0 and hence their kinetic "
                     +"energies are also zero. At this stage, whole of their kinetic energies are transformed into the elastic potential energies "
                      +"of the springs. After the maximum compression is reached for the springs, the elastic force causes the objects to "
                      +"start moving back and elastic potential energy is slowly converted into kinetic energy of the objects. At any "
                      + "stage E(total) = E(kinetic) + E(Potential) is a constant. Finally when whole of the elastic potential "
                       +"energy is converted into kinetic energy of the objects, the original speed is attained.\n In case of inelastic "
                       +"collision, the final kinetic energy of the system is usually lower than the initial kinetic energy of the "
                       +"system as some of the energy is changed to other forms of energy such as thermal energy or the sound energy. "
                       +"But the total energy remains the same.");
        coachMap.put("QQ. Practice questions on elastic and inelastic collisions","(1) Two balls of same mass m and speeds v\u2081 and v\u2082 undergo "
                +"an head-on elastic collision. Both were initially at rest.Find the expressions for the final speeds.\n\n"
                +"(2) In an elastic collision, a mass m\u2081 = .03 Kg moving on a horizontal table at a speed of 3.3 m\u2044s collide "
                +"head on with a mass m\u2082 = .02 Kg at rest. Find the final velocities of each ball.\n\n(3)A bus of mass 2.1 \u00d7 10\u2074 Kg "
                +"is travelling at 100 Km\u2044h[N]. It collides with a van of mass 1.5 \u00d7 10\u00b3 Kg travelling at 40 Km\u2044[N]. "
               +"\n(a)Find the magnitude and the direction of the velocity of the vehicles after "
                +"the collision.\n(b)Find the total kinetic energy before and after the collision.\n(c)Is collision elastic or inelastic.");
        coachMap.put("QR. practice questions on conservation of momentum in two directions","(1) A 60 Kg man is standing on a 50 Kg boat. The "
                +"velocity of the boat is 1.5 m\u2044s[N] relative to water. The man starts walking on the boat with a velocity of "
                +"0.80 m\u2044s[E] relative to water.Neglect fluid friction between the boat and water.\nFind the resulting velocity of "
                +"the boat relative to water.\n\n(2)In a game of billiards, a collision occurs between two balls of mass m. One ball is "
                +"initially at rest. After the collision, second ball acquires a velocity of 1.5 m\u2044s at 50\u00b0 from the "
                +"original direction of the motion of the first ball. The speed of first ball after the collision is 1.25 m\u2044s.\n "
                +"(a)Find the initial speed of the first ball.\n(b)Find the direction of the first ball after the collision.");
        coachMap.put("QP. Discuss the procedure to solve collision problems","(1) Determine if collision is elastic, inelastic or perfectly "
                +"inelastic.\n(2)For all collisions, where net force on the system =0,\n\u03c1 = \u03c1\u0027 or\n"
                 +"m\u2081v\u20d7\u2081 + m\u2082v\u20d7\u2082 = m\u2081v\u20d7\u2081\u0027 + m\u2082v\u20d7\u2082\u0027\n(3)For inelastic "
                 +"collisions, only the above equation is applicable.\n(4) For perfectly inelastic collision, v\u20d7\u2081\u0027 = v\u20d7\u2082\u0027."
                 +"\n(5)For elastic collisions, an additional condition is used as below:\nKE(system) = KE\u0027(system) or\n"
                 +"1\u20442m\u2081v\u2081\u00b2 + 1\u20442m\u2082v\u2082\u00b2 = 1\u20442m\u2081v\u2081\u0027\u00b2 + 1\u20442m\u2082v\u2082\u0027\u00b2");
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
