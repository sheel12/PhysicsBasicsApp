package com.example.sheelchopra.physicsmathschembasics;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.TreeMap;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.content.Intent;
/**
 * Created by sheelchopra on 2017-04-18.
 */

public class Physics_Chapter_1_Activity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics_chapter_1);
        final TreeMap<String,String> coachMap = new TreeMap<String, String>();
        coachMap.put("QA. What is kinematics","Kinematics is the study of motion");
        coachMap.put("QB. What is linear motion","It is the motion in one direction. \nExample-A boy running on level ground 30 m westward and then 60 m eastward undergoes motion in one direction");
        coachMap.put("QC. What is motion in multidimension","It is the motion of an object in more than one direction. \nExample -A boy running on level ground 30 m westward and then 60 m southward undergoes motion in two dimensions");
        coachMap.put("QD. What is a scaler quantity","It is the quantity that only has magnitude. \nExample- Speed, distance, reading on a speedometer, etc.");
        coachMap.put("QE. What is an instantaneous speed","It is the speed of an object at a particular instant. \nExample-speed observed on a speedometer");
        coachMap.put("QF. What is an average speed (V\u2090\u1d65)","It is the total distance of travel divided by total time of travel. It is given as: \nV\u2090\u1d65 = d\u2044(t\u2082-t\u2081)=d\u2044∆t, \nwhere d is distance travelled and ∆t=(t\u2082-t\u2081) is total time elapsed"
                    +" to travel the distance d.");
        coachMap.put("QG. Practice Question on Average speed","A car travels a distance of 3.90 Km at an average speed of 100 Km\u2044h. \nFind \na)Average speed in m\u2044s. \nb) Time in seconds to travel the distance");
        coachMap.put("QH. What is position","It is the directed distance of an object from a reference point such as origin.\nIt is a vector quantity.\n"
                     +"Example: An object is at a distance 30 meteres East of the reference point (origin). So, it's position d\u20d7 is expressed as \n"
                     +"d\u20d7=30 m[E]");
        coachMap.put("QI. What is displacement","Displacement is the change in position of an object in a given direction.\nIt is a vector quantity. It is expressed as \nDisplacement(∆d\u20d7) =final position (d\u20d7\u2082) - initial position(d\u20d7\u2081)");
        coachMap.put("QJ. Practice Question on displacement", "A cyclist's initial position is 200 m[W]. It moves to a new position 120 m [W].\nFind the displacement of the cyclist");
        coachMap.put("QK. What is a vector quantity","It is the quantity that has both magnitude and direction.\nExamples-Velocity, position, displacement, force, etc.\n"
                    +"A velocity vector V can be expressed by writing the symbol V with arrow at the top(V\u20d7)");
        coachMap.put("QL. What is velocity","It is the rate of change of position with respect to time");
        coachMap.put("QM. What is average velocity","It is defined as change of position divided by the time interval for that change (V\u20d7\u2090\u1d65). \nV\u20d7\u2090\u1d65 = (final position d\u20d7\u2082 -initial position d\u20d7\u2081)\u2044(t\u2082-t\u2081)\n "
                     +"=displacement\u2044time elapsed = ∆d\u20d7\u2044∆t");
        coachMap.put("QN. What is instantaneous velocity","It is the velocity at a particular instance");
        coachMap.put("QO. Practice question on average velocity","A runner starts running at a distance of 100 m[E] from his home and covers further 200 m[E] from home in 15 seconds.\nFind\n(a)His average velocity.\n(b)If the runner turns around  "
                       +"and travels 600 meters [w], find the average velocity for the entire trip.");
        coachMap.put("QP. What is position time graph","It is the plot of position(d\u20d7) vs time(t) with position on y axis and time on x axis");
        coachMap.put("QQ. What is velocity time graph","It is the plot of velocity(v\u20d7) vs time(t) with velocity on y axis and time on x axis");
        coachMap.put("QR. What is acceleration time graph","It is the plot of acceleration(a\u20d7) vs time(t) with acceleration on y axis and time on x axis");
        coachMap.put("QS. What is the relationship between position-time(d\u20d7-t), velocity-time(v\u20d7-t) and acceleration-time(a\u20d7-t) graphs","(a)The slope of "
                    +"tangent at a point on the (d\u20d7-t) graph represents instantaneous velocity(v\u20d7\u1d62\u2099\u209b) at that point.\nThe slope of tangent at a point on the (v\u20d7-t) graph represents  "
                    +"instantaneous acceleration(a\u20d7\u1d62\u2099\u209b) at that point.\n"
                    + "(b) Area under (a\u20d7-t) graph between two time instances t\u2081 and t\u2082 is the change in velocity(∆v\u20d7) between this time interval(∆t).\n"
                     + " Area under (v\u20d7-t) graph between two time instances t\u2081 and t\u2082 is the displament(∆d\u20d7) between these time intervals(∆t).");
        coachMap.put("QT. Illustration on relationship between d\u20d7-t, v\u20d7-t \nand a\u20d7-t graphs","If "
                 +"position-time graph is a polynomial of degree 2, then velocity-time graph is a polynomial of degree 1(linear equation)\n "
                  +"acceleration-time graph is a polynomial of degree 0(constant term) ");
        coachMap.put("QU. What are the compass directions","In a horizontal plane, the four compass directions are North (\u2191), South(\u2193), West(\u2190) and East(\u2192).\n"
                     +"Sign Conventions for the directions-North(\u2191) and East(\u2192) are considered positive directions and South(\u2193) and West(\u2190) are considered negative directions.");
        coachMap.put("QV. How is the direction of vectors expressed in two dimensions","The direction of a vector in two dimensions is represented "
                    + "in two ways.\n(a) Compass directions representation: Example:N60•E means vector is located 60 degrees East of North\n"
                    + "(b) Bearing representation: A bearing is an angle made by the vector in reference to North direction while rotating in the clockwise direction");
        coachMap.put("QW. What is component method of vectors","In the component method, a vector V\u20d7 inclined at an angle of \u03b8 "
                     +"with the horizontal can be divided into two mutually perpendicular compass directions as below:\n"
                      +"(a) Horizontal component V\u20d7\u2095= V\u20d7cos\u03b8\n(b) Vertical Component V\u20d7\u1d65=V\u20d7sin\u03b8\n"
                      +"such that\n \u007cV\u20d7\u007c =\u221aV\u2095\u00b2 + V\u1d65\u00b2 and\n \u03b8 =tan\u207b\u00b9(V\u1d65\u2044V\u2095)\n where"
                      +" \u03b8 is the angle that vector V\u20d7 makes with it's horizontal component V\u20d7\u2095.");
        coachMap.put("QX. What is the resultant vector","The resultant vector is the vector sum of individual vectors.\n"
                     +"Example:Consider following displacement vectors ∆d\u20d7\u2081,∆d\u20d7\u2082,....,∆d\u20d7\u2099. The resultant vector "
                     +"∆d\u20d7\u1d63 is given as :\n ∆d\u20d7\u1d63 = ∆d\u20d7\u2081 + ∆d\u20d7\u2082 +....+∆d\u20d7\u2099");
        coachMap.put("QY. What are the methods to find the resultant vectors","There are two main methods to find the resultant vector. These are:\n"
                     +"(a) Geometrical method\n(b) Analytical method");
        coachMap.put("QZ. Describe the geometrical method to find a resultant vector","Consider the displacement vectors ∆d\u20d7\u2081,∆d\u20d7\u2082,....,∆d\u20d7\u2099."
                    +"\nDraw the vector ∆d\u20d7\u2081 with the given magnitude to some scale and in the given direction using a protactor "
                +"on a paper. From the tip of ∆d\u20d7\u2081, draw ∆d\u20d7\u2082 with the given magnitude and direction. This process is repeated"
                +" for all the vectors upto ∆d\u20d7\u2099.\nThen, the direction and magnitude of resultant vector ∆d\u20d7\u1d63 is determined "
                +"measuring the direction and magnitude of the line joining the tail of first vector ∆d\u20d7\u2081 and tip of last vector ∆d\u20d7\u2099.");
        coachMap.put("QZA. Describe the analytical method of adding vectors","The component method of the vectors is a convenient method.\n"
                    +"Consider the displacement vectors ∆d\u20d7\u2081,∆d\u20d7\u2082,....,∆d\u20d7\u2099.\nFind the horizontal(∆d\u20d7\u1d62\u2095) and vertical(∆d\u20d7\u1d62\u1d65) components of each vector\n"
                    +"Then, the horizontal component of the resultant displacement is given as :\n∆d\u20d7\u1d63\u2095 =∆d\u20d7\u2081\u2095 + ∆d\u20d7\u2082\u2095 +...+ ∆d\u20d7\u2099\u2095.\n"
                    +"The vertical component of the resultant is given as :\n∆d\u20d7\u1d63\u1d65 =∆d\u20d7\u2081\u1d65 + ∆d\u20d7\u2082\u1d65 +...+ ∆d\u20d7\u2099\u1d65\n"
                    +" Then, \u007c∆d\u20d7\u1d63\u007c = \u221a∆d\u20d7\u1d63\u2095\u00b2 + ∆d\u20d7\u1d63\u1d65\u00b2 and\n"
                     +" angle \u03b8 = tan\u207b\u00b9(∆d\u1d63\u1d65/∆d\u1d63\u2095), where \n \u03b8 is the angle that the "
                    +"resultant ∆d\u1d63 makes with the horizontal");
        coachMap.put("QZB. Practice question of adding vectors","A runner runs 30 m N30\u00b0E from the start point. Then he runs 40 m E40\u00b0S "
                    +"and then finally runs 60 m S20\u00b0W. Find\n(a) Resultant displacement ∆d\u20d7\u1d63 by geometrical method.\n"
                    +"(b) Resultant displacement ∆d\u20d7\u1d63 by analytical method");
        coachMap.put("QZC. What is acceleration (a\u20d7)","Acceleration is the rate of change of velocity with respect to time. It is a vector quantity.\n"
                     + "The SI unit of acceleration is m/s\u00b2");
        coachMap.put("QZD. What is average acceleration(a\u20d7\u2090\u1d65)","It is the change in velocity divided by the time interval for that change\n"
                     +"a\u20d7\u2090\u1d65 =(v\u20d7\u2082-v\u20d7\u2081)\u2044(t\u2082-t\u2081) = ∆v\u2044∆t\n"
                     +"where,v\u20d7\u2082 is the final velocity at time t\u2082 and  v\u20d7\u2081 is the initial velocity at time t\u2081");
        coachMap.put("QZE. Practice question on average acceleration","A car is travelling at a velocity of 30 m\u2044s with an average "
                     +"acceleration of 6 m\u2044s\u00b2[S]. Find:\nThe velocity after 5 seconds.");
        coachMap.put("QZF. What is a uniform motion","It is the motion with uniform velocity.\nThis means for the given time interval"
                     +", the initial and final velocities are same and acceleration is zero");
        coachMap.put("QZG. What is a motion with uniform acceleration.","It is the motion with constant acceleration.\n"
                    +"Example- In this situation, the position-time relation is quadratic, velocity-time relation is linear and acceleration -time relation "
                     +"is a constant horizontal line.");
        coachMap.put("QZH. Practice question on plotting p\u20d7-t, v\u20d7-t and a\u20d7-t graphs from given p\u20d7-t data","Consider"
                     +" the following experimental p\u20d7-t data.\nt(s)   \u007c     p\u20d7(m)[E]\n"
                     +"\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\n0.0    \u007c    0.0\n2.0    \u007c    8.0\n4.0    \u007c    32.0\n6.0    \u007c   72.0\n8.0    \u007c   128.0\n"
                      +"\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015"
                      +"\n\nSteps:(a)Draw the p\u20d7-t graph from the given data.\n(b)Find the slope of the tangent at some time t on p\u20d7-t graph, say at t= 1s,3s,5s and 7s. This gives instantaneous velocity at these times t.\n"
                     +"(c)Draw the v\u20d7-t graph from data in step(b)\n(d)Find the slope of tangents on v\u20d7-t graphs at some time t as in step (b). This gives instantaneous acceleration at these times t.\n"
                      +"(e)Draw the a\u20d7-t graph from data in step (d).");
        coachMap.put("QZI. What are the constant acceleration equations","Following are the constant acceleration equations also called kinematics equations.\n"
                    +"\n(a)v\u20d7\u2082 = v\u20d7\u2081 + a\u20d7∆t\nMissing variable:∆d\u20d7\n\n" +
                     "(b)∆d\u20d7=v\u20d7\u2081∆t + (1\u20442)a\u20d7∆t\u00b2\nMissing variable:v\u20d7\u2082\n\n"
                     +"(c)∆d\u20d7 =(1\u20442)(v\u20d7\u2081 + v\u20d7\u2082)∆t\nMissing variable:a\u20d7\n\n"
                     +"(d)v\u00b2\u20d7\u2082 = v\u00b2\u20d7\u2081 +2a\u20d7∆d\u20d7\nMissing variable:∆t\n\n"
                      +"(e)∆d\u20d7=v\u20d7\u2082∆t - (1\u20442)a\u20d7∆t\u00b2\nMissing variable:v\u20d7\u2081\n\n" +
                     "Where v\u20d7\u00b2\u2081 = initial velocity\nv\u20d7\u00b2\u2082 = final velocity\na\u20d7 = uniform acceleration"
                     +"\n∆t = time interval\n∆d\u20d7 = displacement in the time interval ∆t");
        coachMap.put("QZJ. Practice questions on kinematics equations","(1)A car travelling at an initial speed of 18 m\u2044s[W] increases speed "
                     +"up for 5 seconds at a constant acceleration of 4m\u2044s\u00b2[W]. Find car's displacement over this time interval\n\n"
                   +"(2)A stone is sliding on a plain surface at a constant acceleration of 3 m\u2044s\u00b2[E]. It travels 35 meters [W] before coming to rest."
                   +"Find (a)the initial velocity (b)Time of travel");
        coachMap.put("QZK. When does acceleration in two directions occur","It occurs when the velocity of a body moving in a plane undergoes"
                     +" a change in the magnitude or direction or both magnitude and direction.\n" +
                     "in such a situation, the average acceleration is determined in horizontal (a\u20d7\u2095\u2090\u1d65) and in "
                    +"vertical direction (a\u20d7\u1d65\u2090\u1d65 as below:\na\u20d7\u2095\u2090\u1d65=∆v\u2095\u2044∆t\n"
                     +"a\u20d7\u1d65\u2090\u1d65 =∆v\u1d65\u2044∆t\n\nThen magnitude of resultant acceleration\n \u007ca\u20d7\u1d63\u2090\u1d65\u007c=\u221aa\u20d7\u2095\u2090\u1d65\u00b2 + a\u20d7\u1d65\u2090\u1d65\u00b2\n"
                      +"And \u03b8 =tan\u207b\u00b9(a\u20d7\u1d65\u2090\u1d65\u2044a\u20d7\u2095\u2090\u1d65), where \u03b8 is the angle that the resultant acceleration\n"
                       + " a\u20d7\u1d63\u2090\u1d65 makes with a\u20d7\u2095\u2090\u1d65.");
        coachMap.put("QZL. Practice questions on two dimensional average acceleration.","(1) A car with a velocity of 30 m\u2044s[E] changes it's "
                    +" velocity to 30 m\u2044s[N] in 12 seconds. Find the average acceleration.\n" +
                     "(2) A ball travelling at a velocity of 35 m\u2044s[W22\u00b0N] strikes a wall and is deflected with a velocity of 25 m\u2044s[E27\u00b0N]."
                     +"\nFind the average acceleration if ball takes 10 ms to deflect");
        coachMap.put("QZM. What is a free fall motion.","It is the motion towards the centre of Earth with no other force acting on the object except the gravitational force");
        coachMap.put("QZN. What is the acceleration due to gravity(g\u20d7)","It is the acceleration of the object falling vertically towards the centre of the earth.\n"
                     +"It is always acting downwards and by sign conventions, it's sign is negative.\nThe value of g\u20d7 near the surface of the earth "
                     +"is =-9.8m\u2044s\u00b2. Since, value of g\u20d7 is constant, so kinematics equations can be applied by replacing a\u20d7 by g\u20d7");

        coachMap.put("QZO. practice questions on acceleration due to gravity","(1) A ball is thrown with an initial velocity of 10m\u2044s with "
                     +"negligible air resistance. Find\n(a) The maximum height the ball reaches.\n(b) Time interval after which the ball reaches back to the ground.\n"
                    +"\n(2) A ball is thrown vertically upwards and passes beside a tower 60 meters high. It's initial velocity is 45 m\u2044s. "
                     +"At what times the ball passes the top of the tower on its way up and down.");
        coachMap.put("QZP. What is the terminal speed of an object","It is the maximum speed of a falling object at which point the speed "
                    +"remains constant and there is no further acceleration. It happens when the downward force due to weight of the object "
                    +"is balanced by upward air resistance force.\nTerminal speed increases with the increase in the mass and decreases with increase "
                    +"in the surface area of the object.");
        coachMap.put("QZQ. What is a projectile motion","It is the motion of the object that moves through the air along a trajectory "
                    +"without any propulsion system. In this motion,\n(a)the horizontal component of the velocity is constant\n"
                     +"(b)The object experiences a constant downward acceleration due to gravity.\n(c)The horizontal and vertical components of motion "
                    +"of the object are independent of each other, but they have a common time.\n(d)The air resistance is neglected.");
        coachMap.put("QZR. How does the projectile motion analyzed.","(a) At time t =0, the object is thrown with an initial velocity v\u20d7\u2081 inclined at an angle \u03b8 with the horizontal.\n"
                    +"(b)It's horizontal component = v\u2081\u2095 = \u007cv\u20d7\u2081\u007ccos\u03b8 and vertical component = v\u2081\u1d65 = \u007cv\u20d7\u2081\u007csin\u03b8\n"
                    +"(c)After the time ∆t has passed, the object's velocity v\u20d7\u2082 has the same horizontal component and different vertical component v\u2082\u1d65.\n"
                    +"(d)The horizontal displacement of the object at any instant is called horizontal range ∆x = v\u2081\u2095∆t.\n" +
                    "(e)The vertical motion of the object is under constant acceleration due to gravity and so kinematics equations in the vertical direction can be applied "
                   +"with acceleration a replaced by g = -9.8 m\u2044s\u00b2.");
        coachMap.put("QZS. What are the kinematics equations for Projectile Motion","(a)Horizontal motion (h). ∆x=v\u2081\u2095∆t=(v\u00b2\u2081\u2044g)sin2\u03b8.\n"
                    +"(b)Vertical motion (v). The five kinematics equations for constant acceleration are applied in vertical direction. "
                    +"The value of constant acceleration = a\u1d65 = g=-9.8m\u2044s\u00b2.\n"
                     +"The five kinematics equations are given below.\n"
                     +"(a)v\u2082\u1d65 = v\u2081\u2095 + a\u1d65∆t\nMissing variable:∆d\u1d65\n\n"
                     +"(b)∆d\u1d65=v\u2081\u1d65∆t + (1\u20442)a\u1d65∆t\u00b2\nMissing variable:v\u2082\u1d65\n\n"
                     +"(c)∆d\u1d65 =(1\u20442)(v\u2081\u1d65 + v\u2082\u1d65)∆t\nMissing variable:a\u1d65\n\n"
                     +"(d)v\u00b2\u2082\u1d65 = v\u00b2\u2081\u1d65 +2a\u1d65∆d\u1d65\nMissing variable:∆t\n\n"
                     +"(e)∆d\u1d65=v\u2082\u1d65∆t - (1\u20442)a\u1d65∆t\u00b2\nMissing variable:v\u2081\u1d65\n" +
                     "The above equations do not contain any vector notation in the variables as these variables represent "
                     +"the components of the vectors and not the vectors themselves.");
        coachMap.put("QZT. Practice questions for projectile motion","(1)A bag is thrown off a building with a horizontal initial velocity of 22 m\u2044s. "
                     +"Find\n(a)Position of bag at 1.5s, 2.5s and 3.0s\n(b)Sketch these positions\n(c)What type of curve it is?\n\n"
                     +"(2)A ball rolls along a slide and leaves it with a velocity of 5 m\u2044s horizontally and lands on the ground 4 meters below the slide. Find\n"
                     +"(a)The time of flight\n(b)The horizontal displacement of the ball.\n(c)The velocity of the ball on striking the ground.\n\n"
                     +"(3)A footballer strikes a ball on the level ground. The ball leaves the ground with an initial velocity of 6 m\u2044s[E35\u00b0N].Find\n"
                     +"(a)Total horizontal range\n"
                      +"(b)Maximum height achieved\n"
                       +"(c)Horizontal displacement when ball is 14 meters above the ground.");
        coachMap.put("QZU. What is relative velocity of an object","It is the velocity of an object relative to a specific frame of reference."
                   +"It involves situations with at least two frames of references at a time.\nThe examples of such situations are:\n(a)boat travelling in a flowing water"
                   +"\n(b)aircraft flying with wind blowing relative to the ground\n(c)passengers walking in a moving train."
                   +"\nLet P is a plane travelling at a velocity of V\u20d7\u209a\u2091 relative to Earth's frame of reference,E. Let wind be "
                   +" another frame of reference and V\u20d7\u209a\u2090 be velocity of plane with respect to wind or air. Let V\u20d7\u2090\u2091"
                   + "be velocity of wind or air with respect to earth. Then\nV\u20d7\u209a\u2091 = V\u20d7\u209a\u2090 + V\u20d7\u2090\u2091.\n"
                   +"The above vector equation is applied in one dimension or multidimension.Further comments on navigation:\n"
                   +"(a) A westward wind blows from west and its velocity vector points towards east. Thus a westward wind might be blowing at 50 Km\u2044h[E].\n"
                    +"(b) A southwest wind has the direction [45\u00b0N of E].\n(c)Air speed is the speed of a plane relative to the air.\n"
                    +"(d)Ground speed is the speed of the plane with respect to the ground.\n(e)The heading is the direction in which the plane is aimed.\n"
                    +"(f)The course or track is the path relative to Earth or the ground.");
        coachMap.put("QZV. Practice questions on relative motion","(1) A motorboat can travel in still water at a speed of 6 m\u2044s. "
                    +"It crosses a river flowing with a velocity of 2.5 m\u2044s[E]. The width of the river is 300 m.\n"
                    +"(a)If the boat is aimed northward, find the velocity of the boat with respect to the bank\n"
                    +"(b)How long the boat takes to cross the river.\n(c)Where does the boat land on the other bank relative to its starting position\n"
                    +"(d)if the boat landed directly across from the starting position, at what angle would the boat would have aimed.\n\n"
                     +"(2) The wind speed of a plane is 180 Km\u2044h. The wind is blowing at 57 Km\u2044h from the west. Find the "
                      +"velocity of the plane with respect to the ground if the pilot keeps the plane aimed in the direction [43\u00b0 E of N].");



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
        questionsList.setOnItemSelectedListener(new OnItemSelectedListener() {
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
