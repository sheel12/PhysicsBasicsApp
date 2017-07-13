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

public class Physics_Chapter_4_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics_chapter_4);
        final TreeMap<String,String> coachMap = new TreeMap<String, String>();
        coachMap.put("QA. What is Work","Work is defined as the change in the energy of an object when a force acting on it "
                    +"moves it through a certain displacement collinear to the direction of the force.\nWork is a scaler quantity.\n"
                     +"If a force F\u20d7 acts on an object at an angle \u03b8 with the horizontal, and object moves a displacement of "
                     +"\u2206d in the horizontal direction, then\n W = (Fcos\u03b8)\u2206d, where\n"
                      +"Fcos\u03b8 = horizontal component of force collinear to the displacement. It's unit is Nm = 1 joule.");

        coachMap.put("QB. Practice questions on Work","(1) A boy pushes a trunk horizontally for 5 meters on a frictionless floor.\n"
                    +"(a) Find the work done, if the force applied is 18 N in the horizontal direction.\n"
                    +"(b) Find the work done if the force applied is 18 N at an angle of 27.8\u00b0 below the horizontal.\n"
                     +"(c) If coefficient of kinetic friction is 0.11, find the work done in both (a) and (b)\n\n"
                     +"(2) A boy raises a bag of mass 10 Kg at a constant velocity from the floor to a table 2.1 m above "
                     +"the floor. Later on, he lowers the bag on another table 1.2 m above the floor. Find the work done on the bag\n" +
                      "(a) by the boy as the bag rises\n(b) by the gravity as the bag rises\n(c) by the boy as the bag is lowered.");
        coachMap.put("QC. When is work done zero","The work done on an object is zero in the following cases:\n"
                    +"(a) When the displacement \u2206d = 0\n(b) When F\u20d7 =0\n(c) When the force F\u20d7 is inclined at "
                     +"90\u00b0 with the direction of displacement. In this case\nW=F\u2206dcos90\u00b0 = 0.\nAn example of the situation is "
                     +"as below:\nThe motion of an object tied to a string in a circular path i.e. under uniform circular motion.\n"
                     +"In such a case, the centrepetal force F\u20d7\u209c is directed towards the centre of the circle and the object "
                      +"is always moving tangential to the circle at every instant. Thus, the force and the displacement are "
                      +"perpendicular to each other. So work done by the centripetal force in a circular motion = 0." );
        coachMap.put("QD. When is work done negative","The work done is negative when the force applied acts opposite to the direction of "
                    +"the displacement \u2206d\u20d7.\nThus, W=F\u2206dcos180\u00b0 =-F\u2206d.\n"
                    +"Example: Friction force acting on the object causing it to stop. The friction force always acts "
                    +"opposite to the direction of the motion and hence work done is negative.");
        coachMap.put("QE. What is energy and Work energy theorem","Energy: Energy of an object is defined as it's capacity to do work. It's unit is Joules.\n\n"
                    +"Work energy theorem:An object stationed at a point A has a certain energy associated with it say E\u2081.\n"
                    +"Since, the object is at rest, so work done = 0. Let under the influence of a net force F\u20d7 it covers "
                    +"a displacement \u2206d to reach point B. Let the energy associated with the object at position B is E\u2082.\n"
                    +"The change in the energy is \u2206E = E\u2082 - E\u2081.\nAlso, work done W = F\u2206d.\nBy work energy theorem, "
                    +"work done is equal to change in energy i.e.\n\u2206E = W =F\u2206d.\nIf total work done is > 0, object's energy increases and we say work is being done on the object "
                   +"and if total work done <0, object's energy decreases and we says the work is being done by the object on the surroundings.\n"
                   +"Example of positive work done:When force and displacement are in same direction.\nExample of negative work done:"
                      +"When force and displacement are in opposite direction such as friction force acting on the moving object.");
        coachMap.put("QF. Briefly outline various forms of energy","(a) Thermal energy: This is the energy possessed by the atoms and molecules "
                +"of a substance. Thermal energy increases with the increase in the motion of atoms and molecules.\n"
                +"(b) Electrical energy: This form of energy is possessed by the charged particles. The charges can transfer "
                +"the energy as they move through an electric circuit.\n(c)Radiant energy: This form of energy travels by means of "
                +"waves without requiring partucles of matter. These waves can travel in the vacuum at the speed of the light, 3 \u00d7 10\u2078 m\u2044s. "
                +"Visible light and other types of radiant energy belong to this group and called electromagnetic spectrum and have "
                +"different wavelengths and frequencies.\n(d) Nuclear Potential energy: The nucleus of every atom has stored energy. This "
                +"energy can be released by nuclear reactions such as nuclear fusion and nuclear fission.\n"
                +"(e) Gravitational potential energy: It is the energy possessed by an object due to its raised position above "
                 +"some reference level.\n(f) Kinetic energy: It is the energy possessed by an object due to virtue of its motion.\n"
                  +"(g) Elastic potential energy: This is the potential energy stored in the objects that are compressed or stretched.\n"
                  +"(h) Sound energy: This form of energy is produced by the vibrations and it travels by waves through a material to "
                  +"the reciever.\n(i) Chemical potential energy: This is the amount of energy absorbed or relleased when new molecules "
                  +"are formed in a chemical reaction.");
        coachMap.put("QG. What is kinetic energy (E\u2096)","It is the energy of the motion. If a mass m moves from position A (at initial velocity v\u2081) "
                +"to position B (at final velocity v\u2082), then\ntotal work done:\n W = 1\u20442mv\u2082\u00b2 - 1\u20442mv\u2081\u00b2.\n"
                +"The quantity 1\u20442mv\u00b2 is called kinetic energy E\u2096 of the object at a particular location.\n"
                +"Thus E\u2096 = 1\u20442mv\u00b2.\nSo, W = E\u2096\u2082-E\u2096\u2081 =\u2206E\u2096.\n"
                +"If v\u2081 = 0, then E\u2096\u2081 = 0 and\n E\u2096\u2082 = E\u2096 = 1\u20442mv\u00b2.");
        coachMap.put("QH. Practice Questions on kinetic energy","(1) A plane of mass 5.65 \u00d7 10\u2075 Kg increases its speed from "
                   +"100 m\u2044s to 200 m\u2044s under the influence of the engine force. Find\n(a)total work done and,\n(b)change in energy.\n\n"
                   +"(2) A truck of mass 20,000 Kg is travelling at some initial speed. It has a -4.9 MJ of work done on it, so that "
                   +"it's speed becomes 9 m\u2044s. Find the initial speed of the truck.");
        coachMap.put("QI. What is the gravitational potential energy at the earth's surface (Eg)","It is the energy possessed by an object due to it's elevation above the earth's surface.\n"
                +"The surface of the earth or the ground is considered at level zero.\nLet an object of mass m is moved up a height of "
                +"h above the floor. Then\nWork done W =F\u2206dcos\u03b8=F\u2206d as \u03b8 =0.\nSo, W = (mg)\u2206d=\u2206Eg\n"
                 +"Consider floor at level zero, then \u2206d=h-0 =h and\n W = mgh = Eg\nThe values of \u2206d and Eg are positive "
                  +"if the displacement is upward and negative if displacement is downward.");
        coachMap.put("QJ. Practice questions on gravitational potential energy","(1) A diver of mass 63 Kg is standing on the edge of "
                     +"a jumping board 4.00 m high above the water level. Find the gravitational potential energy of the diver "
                     +"with respect to the water level.\n\n(2) A 70 Kg skier rides a 3.1 Km ski lift from the base of a mountain "
                     +"to the top. The lift is at an angle of 14.5\u00b0 to the horizontal. Find the gravitational "
                     +"potential energy of the skier at the top of the mountain relative to the base of the mountain.\n[5.32 \u00d7 10\u2075 J]");
        coachMap.put("QK. What is the total mechanical energy", "It is defined as the sum of gravitational potential energy and the kinetic energy "
                    +"at a certain point.\nIt is expressed as :\nE\u209c = Eg + E\u2096.");
        coachMap.put("QL. What is an isolated system","It is a system of particles that is completely isolated from the outside influences. "
                +"The environment outside the isolated system is called surroundings.");
        coachMap.put("QM. What is the law of conservation of energy","It states that energy can neither be created nor be destroyed "
                    +"but can be converted from one form to the other form.\nExample 1:In terms of total mechanical energy:\nE\u209c = Eg + E\u2096\n"
                    +"Example 2:Energy transformations taking place in cooking the food on a microwave. The transformation equation "
                    +"can be stated as: Electrical Energy(from electrical outlet)\u2192Radiant energy(microwave)\u2192Thermal energy "
                    +"(stored in the food being cooked).");
        coachMap.put("QN. Practice questions on conservation of energy","(1) A basket ball leaves the hand of a player at a speed of "
                +"6.2 m\u2044s from a height of 2.1 m above the ground. Find the speed of the basket ball as it touches the hoop "
                 +"which is 3.2 m above the floor.\n\n(2) A pendulum 90 cm long is at rest so that it's amplitude is 26 cm from the "
                 +"lowest central position. Use energy concepts to find the maximum speed of the pendulum bob after release.");
        coachMap.put("QO. What is heat","Heat is the transfer of energy from a hot body to a colder one.");
        coachMap.put("QP. What is temperature","It is the measure of average kinetic energy of the atoms or molecules of a substance "
                +"which increases if the motion of the particles increase.");
        coachMap.put("QQ. What is thermal energy","It is the internal energt associated with the motion of atoms and molecules. "
                  +"In other words, it is the total of kinetic energy and potential energy (caused by electrical forces) of atoms or molecules. "
                  +"It depends on the mass, temperature, nature and state of the substance. It is caused by many ways such as heating the substance. "
                  +"It can also be caused by the frictional force subjected to the moving object.\nSince, the kinetic force of friction "
                   +"acts opposite to the direction of motion, so \n work done W = (F\u2096(cos\u03b8)\u2206d\nW=-F\u2096\u2206d, since \u03b8 = 180\u00b0 "
                   +"as F\u2096 acts opposite to the direction of motion. Thus friction transforms kinetic energy of the object into thermal "
                   +"energy by law of conservation of energy.");
        coachMap.put("QR. How are thermal energy, heat and temperature related","(a) When average kinetic energy (Temperature) in one sample is same "
                   +"as in the other sample, then no heat transfer takes place if samples are mixed.\nExample: "
                   +"Consider a sample of 50 grams of water at 70\u2103 and another sample of 200 grams of water also at 70\u2103. "
                   +"Both the samples have same temperature, but larger mass of 200 grams of water sample has more thermal energy. "
                   +"When these samples are mixed, no heat transfer takes place between them since they are at the same temperature.\n\n"
                   +"(b) When the two samples are of the same mass, then the one with the higher temperature has both higher average "
                   +"kinetic energy and higher thermal energy. So when these samples are mixed, heat flows from higher temperature to the lower temperature.\nExample:Consider a sample of 100 grams of water at 40\u2103 and another "
                   +"sample of 100 grams of water at 80\u2103. The second sample has higher temperature and hence has both temperature "
                   +"and thermal energy higher than first sample. So, when these samples are mixed, the heat would flow from sample "
                   +"with higher temperature to the sample with lower temperature till both the samples have same temperature.");
        coachMap.put("QS. What are the methods of heat transfer","There are three methods of heat transfer:\n\n(a) Conduction\n\n"
                    +"(b) Convection\n\n(c) Radiation");
        coachMap.put("QT. Explain conduction method of heat transfer","Conduction is the process of transferring heat through a meterial by the "
                +"collision of atoms.\nExample: A metal rod when heated at one end causes the atoms at that end to gain kinetic energy "
                +"and so vibrate faster. They collide with adjacent atoms, thereby causing latter to vibrate faster. This action "
                + "continues along the rod from the hotter end towards the colder end therby heating the whole rod.\n"
                + "Conduction occurs best in the substances in which the atoms are free to move such as metals. But is much less in "
                +"solids like concrete, bricks and glass and is very less in gases and liquids.");
        coachMap.put("QU. Explain convection method of heat transfer","Convection is the process of transferring heat by a circulating "
                +"path of fluid particles. This circular path is called convection current. The particles of fluid actually move "
                +"carrying energy with them.\nExample:Consider some water being heated in a kettle kept on a burner. The molecules "
                +"of the water closer to the burner gain thermal energy and move faster. As they collide more, they spread apart. "
                +"So, heated water becomes less dense than the water above it. The warmer water rises and is replaced by denser cooler "
                +"water. This process repeats and a convection current is formed which distributes energy throughout the water "
                +"in the kettle.");
        coachMap.put("QV. Explain the radiation method of heat transfer","Radiation is the process in which energy is transferred "
                +"by means of electromagnetic waves.\nExample:Visible light, microwave,radar waves, X rays and infrared waves. "
                +"Radiation method does not need particles to transfer energy and it can be transferred in vaccuum "
                +"unlike conduction and convection which need particles to transfer energy.");
        coachMap.put("QW. Practice questions on heat transfer","(1) State true or false\n(a) In heat conduction, energy is transferred "
                +"but particles are not themselves transferred.\n(b) In radiation, both energy and particles are transferred.\n"
                +"(c) Density of a substance remains same when it is heated.\n(d) When two substances at different temperatures "
                +"are mixed, the heat transfer from warmer substance to lower substance stops after some times.\n\n"
                +"(2) Explain which is more effective:placing an electric room heater near the floor or near the ceiling of a room.");
        coachMap.put("QX. What are the effects of heat transfer","The transfer of heat from one body to another causes either a "
                + "temperature change or a change of state or both. In the former case, there is a temperature change and "
                + "hence there is a change in the kinetic energy of the atoms and molecules\n.In the latter case, the temperature remains same. So "
                 +"there is no change in the kinetic energy of the atoms and molecules of the substance. The extra energy "
                 +"required to change the state is the potential energy. It is the energy which is required to break the "
                +"bonds in the substance so that a change of state can occur.\nExample: Consider a sample of ice at -10\u2103 "
                +"is subjected to heat. Due to heat transfer, the temperature of ice increases from -10\u2103 to 0\u2103.\n"
                 +"Further addition of heat keeps the temperature same but additional heat converts ice at 0\u2103 to "
                  +"water at 0\u2103.\nOn further heating, temperature of water increases from 0\u2103 to 100\u2103.\n"
                  +"Further adding heat keeps the temperature same but additional heat changes the water at 100\u2103 to steam at "
                  +"100\u2103.\nFurther heating increases the temperature of the steam above 100\u2103 and becomes superheated steam." );
        coachMap.put("QY. What is specific heat capacity (c) ","It is defined as the amount of energy required to raise the "
                +"temperature of 1 Kg of a substance by 1.0\u2103.\nIt's unit is Joules per kilogram per degree celuius(J\u2044Kg\u2103).\n"
                +"Specific heat capacities of some substances in J\u2044kg\u2103 are as below:\n" +
                "Glass=8.4 \u00d7 10\u00b2\nIron=4.5 \u00d7 10\u00b2\nBrass=3.8 \u00d7 10\u00b2\nSilver=2.4 \u00d7 10\u00b2\n"
                 +"Lead=1.3 \u00d7 10\u00b2\nWater=4.18 \u00d7 10\u00b3\nAlcohol=2.5 \u00d7 10\u00b3\nIce=2.1 \u00d7 10\u00b3\n"
                 +"Steam=2.1 \u00d7 10\u00b3\nAluminium=9.2 \u00d7 10\u00b2\n");
        coachMap.put("QZ. What is the quantity of heat (Q)","The quantity of heat lost or gained by a body is the total heat "
                +"required to change the temperature of m kg of a substance by \u2206T =T\u2082 -T\u2081.\nThus, Q = mc\u2206T");
        coachMap.put("QZA. Practice questions on quantity of heat","(1) How much heat is needed to raise the temperature of 5.2 Kg of "
                +"water from 25\u2103 to 100\u2103\n\n(2)How much heat is lost when 4.7 Kg of alcohol cools from 29\u2103 to 20\u2103.\n\n"
                +"(3) An electric immersion rod delivers 6000 J of energy to 6 Kg of water to change its temperature from 25\u2103 to "
                +"45\u2103. Find the specific heat of the liquid.");
        coachMap.put("QZB. What is the principal of heat exchange","It states that when heat is transferred from one body to another,"
                +"the amount of heat lost by the hot body equals the amount of heat gained by the cold body.\nQ(lost) + Q(gain) =0. "
                +"\n\nm\u2081c\u2081\u2206t\u2081(heat lost) + m\u2082c\u2082\u2206t\u2082(heat gained) = 0.\n\nThe final temperature t is "
                +"same for both the mixed substances and heat transfer stops at this final temperature.");
        coachMap.put("QZC. Practice questions on principal of heat exchange","(1) A 500 grams of iron piece at 450\u2103 is submerged "
                +"in 400 grams of water at 15\u2103. Find the final temperature of iron and water.\n\n(2) A 150 grams of jug at 26\u2103 "
                +"is filled with 270 grams of water at 85\u2103. Assuming no heat lost to the surroundings, find the final temperature "
                 +" of water. Specific heat of jug is 8.1 \u00d7 10\u00b2 J\u2044(kg\u2103.");
        coachMap.put("QZD. What is latent heat","It is the thermal energy absorbed or released by a substance when it changes it's "
                + "physical state (phase change). This occurs without the change in temperature.\nIt's unit is joules or calories per mole "
                 +"or per unit mass of the substance. "
                +"is the latent heat of the substance.\n\nLatent heat is of two types:\n(1) Latent heat of Fusion\n(2)Latent heat of Vaporization.");
        coachMap.put("QZE. What are latent heat of fusion and latent heat of vaporization","(1) Latent heat of Fusion: It is the amount of thermal energy required to change a liquid to solid or "
                +"a solid to liquid. In the former case, heat is taken out of the body and in the latter case, heat is taken into the body.\n\n"
                +"Latent heat of Vaporization: It is the amount of thermal energy required required to change a liquid to vapour "
                +"or a vapour to liquid.\nIn the former case heat is gained by the substance and in the latter case, heat is "
                +"lost by the system.\nIn both cases, energy required is\nQ = mL, where m is the mass of the substance and L is the "
                +"specific latent heat of fusion or vaporization (heat energy released or absorbed to change the state of 1 Kg of the substance).");
        coachMap.put("QZF. Specific heat of fusion(Lf) and vaporization(Lv) for some substances(KJ\u2044Kg)","(1)Water:Lf = 334 at 0\u2103, Lv=2258 at 100\u2103" +
                "\n\n(2)Ethanol:Lf = 109 at -114\u2103, Lv = 838 at 78\u2103\n\n(3)Chloroform:Lf = 74 at -64\u2103, Lv =254 at 62\u2103\n\n"
                +"(3)Ethanoic acid:Lf = 192 at 17\u2103, Lv = 395 at 118\u2103\n\n(4)Mercury:Lf = 11 at -39\u2103, Lv = 294 at 357\u2103\n\n"
                +"(5)Sulphur:Lf = 54 at 115\u2103, Lv = 1406 at 445\u2103\n\n(6)Hydrogen:Lf = 60 at -259\u2103, Lv = 449 at -253\u2103\n\n"
                 +"(7)Oxygen:Lf = 14 at -219\u2103, Lv = 213 at -183\u2103\n\n(8)Nitrogen:Lf = 25 at -210\u2103, Lv = 199 at -196\u2103");
        coachMap.put("QZG. Practice question on Latent heat of vaporization and fusion","100 grams of ice at -10\u2103 is heated to "
                +"110\u2103. Find the total heat gained by the substance.\n\nHint:From ice at -10\u2103 to ice at 0\u2103, use Q\u2081 =mc\u2206t.\n"
                 +"From ice at 0\u2103 to water at 0\u2103, use Q\u2082 = mLf(State change occurs).\nFrom water at 0\u2103 to water at 100\u2103, use Q\u2083 = mc\u2206t\n"
                 +"From water at 100\u2103 to steam at 110\u2103, use Q\u2084 = mLv(state change occurs).\n Total heat gained:\nQ = Q\u2081 +Q\u2082 +Q\u2083 + Q\u2084");
        coachMap.put("QZH. What is Hooke's law","It states that the magnitude of the force exerted by a spring or an elastic device is "
                +"directly proportional to the distance the spring or the elastic device has moved from the equilibrium position.\n"
                +"Hooke's law is applied to an ideal spring-a spring that experiences no friction, internally or externally.\n"
               +"Explanation of Hooke's law:\n(a)Consider a spring attached to a wall.\n(b)Let the equilibruim position is free end "
               +"of the spring, where x =0, where x = position of the spring relative to it's equilibrium position.\n(c)If the spring "
               +"is stretched to the right by an external force F by a distance x =d, then the spring exerts a force F\u2093 to the left.\n"
               +"Then F\u2093 \u221d -d, since both F\u2093 and x = d are in opposite direction.\nThen F\u2093 = -kd, where\n"
               +"k = Force constant for the spring. Springs with high k values require a large force to extend or compress.\n"
               +"Thus from above equation, if spring is stretched in the +ve x direction, it pulls back in the opposite direction (-ve x direction).\n"
                +"Also, if spring is compressed in the -ve x direction, it exerts the force in the +ve x direction.\n"
                 +"Thus, if x > 0, then F\u2093 < 0\nand if x < 0, then F\u2093 >0.\n Also force F applied to the spring to stretch or compress "
                +"is opposite in direction to F\u2093 but has the same magnitude by Newton's third law of motion. Thus F =-F\u2093 = kd.");
        coachMap.put("QZI. Practice questions on Hooke's law","(1) A boy stretches a spring horizontally by a distance of 20 mm by "
                +" applying a force of 0.21 N[E].\n(a)Find the force constant of the spring.\n(b)What is the force exerted "
                +"by the spring on the boy.\n\n(2)A stone of mass 0.09 Kg is hung from a vertical spring. Under it's own weight it is "
                +"stretched from it's initial unstretched position (with no stone attached) to it's final stretched position 0.20 m "
                +"below the initial one.\n(a)Find the force constant of the spring\n(b)If the stone is returned to the spring's "
                +"initial unstretched equilibruim position and is again allowed to fall,find the acceleration of the stone "
                +"when it has dropped 0.065 m.");
        coachMap.put("QZJ. What is the elastic potential energy","It is defined as the energy stored in the objects which are  "
                +"stretched, bent, compressed or twisted\n" +
                "For a spring or any elastic body, it is given as\nE\u2091 =kx\u00b2, where\nk = force constant and\n"
                +"x = displacement from equilibruim position.\n This is also equal to the work done(W) on the object.\n"
                +"Thus, W =kx\u00b2 =E\u2091.\nIt is also equal to the area under the graph of F\u2093 and x.\nExample 1:"
                +"When a guitar string is stretched, E\u2091 is stored in the string. When released, it is converted to sound energy\n" +
                "Example 2: When a bow is stretched, it stores the elastic potential energy into the bow. When the bow is released, "
                +"this potential energy is converted into kinetic energy.");
        coachMap.put("QZK. Practice questions on elastic potential energy","(1)A stone of mass 0.30 Kg is attached to a vertical spring "
                +"with a force constant of 11.3 N\u2044m. It is initially held in it's unstretched equilibruim position. Subsequently, "
                +"it falls under it's own weight. Neglect mass of spring and it's kinetic energy.\n(a) Find elastic potential energy "
                +"stored in the spring when the stone has fallen by 13 cm.\n(b)What is it's speed at above position.\n\n"
               +"(2) A spring is placed at the top of a launching pad inclined at an angle of 40 degrees with the horizontal. "
               +"The spring is stretched so that it leaves the launching pad and strikes a target which is 4.5 m at the same "
                +"elevation as the top of the launching pad.\nFind the stretch needed for the spring to reach the target if mass of the "
                 +"spring is 18 grams and force constant is 26.5 N\u2044m.");
        coachMap.put("QZL. What is Simple Harmonic motion","It is defined as the periodic vibratory motion in which the force (and "
                +"acceleration) is directly proportional to the displacement.\nExplanation: (a)Consider a spring placed horizontally attached " +
                "to a wall on its left end and to a mass m on the right end.\n(b)Let the right end is at x =0, the equilibruim position.\n(c)Let this mass spring system is pulled "
                +"in the longitudinal direction by a force F towards right till the mass m  reaches to a maximum distance of x =A from the equilibruim position.\n"
                +"(d)The mass is then released from the rest.\n(e)The force F\u2093 exerted by the spring will pull the mass towards left with an "
                +"acceleration towards left causing an increase in speed of the mass.\n(e)As the mass passes the equilibruim position, it's speed becomes "
                + "maximum.\n(f)The mass keeps on moving towards left with decrease in acceleration and therby decrease in speed.\n"
                +"(g)The speed becomes zero when the mass reaches its maximum displacement of x =-A from the equilibruim position.\n"
                +"(h)At this position, the mass gets compressed by a displacement of x =-A.\n(i) The force exerted by the spring "
                +"causes the mass to move towards right with acceleration towards right and causing increase in it's speed.\n(j)This speed "
                +"again becomes maximum as it passes through the equilibruim position.\n(k)The mass keeps on moving towards "
                +"right till it again reaches a maximum dispacement of x =A from the equilibruim position.\n(l)This completes one cycle in time T. "
                +"\n(m)Assuming air resistance as zero, this cycle keeps on repeating.\n(n)This repeated/periodic motion of spring-mass system can be expressed "
                +"as Simple Harmonic Motion (SHM) with time period T.\nThe maximum distance x = \u007cA\u007c of the mass m from the equilibruim position is called amplitude "
                +"of the SHM.");
        coachMap.put("QZM. Mathematical description of spring-mass system under SHM.","In a spring mass system, when the mass is pulled "
                +"towards right by a distance x =A from it's equilibruim position, the spring exerts a force on F\u2093 =-kx in the " +
                "direction opposite to x.\nNeglecting friction, F\u2093=F\u2099\u2091\u209c =ma\u20d7=-kx\u20d7.\nSo, a\u20d7 =-kx\u20d7\u2044m\n"
                +"or, a\u20d7 \u221d x\u20d7 and F\u2093 \u221d x\u20d7.\nThus, force exerted by the spring and hence the acceleration of the spring is proportional "
                +"to the displacement which is the definition of the objects under SHM.\nNote 1:Acceleration of the object under SHM is "
                +"not uniform and increases with the increase in the force(and the displacement).\nNote 2:SHM is also referred as the sinusoidal "
                +"motion i.e. the graph of sin\u03b8 vs \u03b8 or cos\u03b8 vs \u03b8.\nNote 3:The motion of an object under SHM can be expressed "
                +"by three sinusoidal graphs namely, (a)displacement vs time (b)velocity vs time (c)acceleration vs time.\nNote 4: "
                +"When the displacement is maximum (amplitude), then velocity of object =0 and the acceleration is maximum in the "
                +"opposite direction.\nNote 5: When the displacement of the object under SHM = 0(amplitude =0), velocity is maximum "
                +"and the acceleration =0.");
        coachMap.put("QZN. How Period and frequency of a Simple Harmonic Oscillator (SHO) are calculated.","An object that vibrates with SHM is called "
                    +"Simple Harmonic Oscillator (SHO). Since SHM can be expressed as a sinusoidal function also called circular functions, "
                    +"the period of an SHO can be derived by considering the motion of an object travelling with uniform circular motion.\n"
                    +"This means that the path of a vibrating object being repetitive can considered as a circular path with radius r = A(amplitude).\n"
                    +"Speed (v) of the object travelling around the circle =d\u2044t.\nFor one cycle, d = 2\u03c0r =2\u03c0A and t = T(time period "
                    +"for one cycle).\n\u2234 v =2\u03c0A\u2044T.\nSince, 1\u20442kA\u00b2 =1\u20442mv\u00b2\n\u2234 A\u00b2\u2044v\u00b2 = m\u2044k\n"
                    +"\u2234 A\u2044v = \u221Am\u2044k.\n\u2235 v =2\u03c0A\u2044T,\n\u2234 T =2\u03c0A\u2044v.\n\u2235 A\u2044v = \u221Am\u2044k,\n"
                      +"\u2234 T = 2\u03c0\u221Am\u2044k\n\nPeriod T depends on following factors:\n(a) Force constant k of the spring\n(b)"
                     +"Mass m of the oscillator.\n\n Frequency of the SHO = f =1\u2044T.");
        coachMap.put("QZO. Practice questions on objects under SHM","(1)A 0.30 Kg mass vibrates at the end of a horizontal spring "
                +"with k = 34 N\u2044m along a frictionless surface.\nWhat is the period of the vibration.\n\n(2) A 3.1 N mass "
                +"vibrates at the end of a vertical spring. If the frequency of the vibration is 1.3 Hz, find the spring constant k.\n\n"
                 +"(3) A 0.050 Kg mass vibrates in SHM at the end of a spring. If the maximum displacement of the mass is 0.040 cm and "
                 +"period is 0.55 s, find the maximum acceleration of the object.");

        coachMap.put("QZP. Explain SHM in a simple pendulum","A simple pendulum is under SHM and undergoes back and forth through a "
                +"small angle \u03b8 that it's string makes with the vertical.\nIn the mass spring system, restoring force F\u2093 is "
                +"the elastic force of the spring.\n In a simple pendulum,  restoring force F\u2093 is a component of the weight of "
                +"the pendulum bob which is tangent to the direction of movement of the bob.\nIf L =length of the string to which "
                +"the bob is attached, then time period T = 2\u03c0\u221a(L\u2044g).\nThe stiffness(force constant) k = mg\u2044L.\n"
                 +"T for simple pendulum depends on following factors:\n(a) Length of the pendulum (length of string attached to bob)\n"
                  +"(b)Acceleration due to gravity g.");
        coachMap.put("QZQ. Practice questions on simple pendulum in SHM","(1)Find the length of a pendulum that has a period of 0.80 seconds.\n\n"
                +"(2)Find the acceleration due to gravity at a location where a pendulum 0.90 m long has a frequency of 0.67 Hz.\n\n"
                +"(3)A 0.020 Kg pendulum bob drops from a height h above it's equilibruim position. When the bob reaches it's "
                +"equilibruim position, the string breaks and the bob then acts like a projectile. After the string breaks, the bob falls "
                +"1.7 m while moving 2.5 m horizontally. Calculate the height (h) from which the bob was released.");
        coachMap.put("QZR. Explain energy transformation in SHM","Elastic Potential energy stored in an ideal spring-mass system stretched or compressed "
                +"by a displacement x = E\u2091=1\u2044kx\u00b2.\nWhen the mass is stretched to the maximum displacement , x =\u007cA\u007c "
                +",then maximum elastic potential energy is E\u2091 = 1\u20442kA\u00b2.\n\u2235 before release of mass, speed v of the mass =0 "
                +"So, kinetic energy of the mass =1\u20442mv\u00b2 = 0.\n\u2234 total energy E\u209c = 1\u20442kA\u00b2.\n"
                +"When mass is released, by law of conservation of energy,\nE\u2091 =1\u20442kx\u00b2  + 1\u20442mv\u00b2,\nwhere v "
                 +"=instantaneous speed of the mass.");
        coachMap.put("QZS. Practice questions on energy transformation in SHM.","(1)A 60 gram mass is attached to horizontal spring with "
                +"force constant k = 26 N\u2044m. The spring is compressed to a maximum position of A = 9.6 cm to the left of the "
                +"equilibruim position. The box is then released and undergoes SHM.\n(a)Find the speed of the box when it is at the "
                +"position x = 5.3 cm from the equilibruim position.\n(b)Find the maximum speed of the mass.\n\n" +
                "(2)A 5.0 N box slides along a friction less surface towards East while travelling at a speed of 2.3 m\u2044s. The "
                +"box hits an ideal spring which is compressed by 2.1 cm.\n(a)What is the average net force acting on the spring\n"
                +"(b)If the average net force acting on the spring is 30 N, what is the compression of the spring.");
        coachMap.put("QZT. What is damped harmonic motion","It is the periodic or repeated motion in which the amplitude of "
                +"the vibration and energy decrease with time.\n\nExamples of Damping:\n(1) Bathroom scales\n\n(2)System of springs "
                +"and shock absorbers in a car.");

        coachMap.put("QZU. What is a simple machine","It is a device that helps in accomplising a job in an easier and better way.\n"
                +"There are 6 basic simple machines:\n(a)Lever\n\n(b)Wheel and axle\n\n(c)Inclined plane\n\n(d)Wedge\n\n(e)Pulley\n\n(f)Screw"
                );
        coachMap.put("QZV. What is the efficiency of a machine (\u03b7)","It is the ratio of useful energy output to the energy input.\n"
                +"\u03b7 = useful energy output(E\u2092)\u2044input energy(E\u1d62) \u00d7 100");

        coachMap.put("QZW. Practice question on efficiency of simple machines","(1)A 4.00 Kg box is slided along an inclined plane to be "
                +" loaded into a truck. The back of the truck is 75 cm above the ground. The inclined plan is 3.5 m long. "
                +"An average force of 1600 N is required to slide the box up the plane.\n(a)Find the work done in loading the box.\n"
                +"(b)Calculate the efficiency (\u03b7) of the inclined plane.\n(c)What happens to the rest of the input energy.\n"
                +"(d)Can efficiency of a machine be more than 100%.");

        coachMap.put("QZX. What is Power (P)","Power is defined as the rate of doing work or rate of change of transformation of energy.\n\n"
                +"P = W\u2044\u2206t =\u2206E\u2044t.\nWhere W = work done, \u2206t = time elapsed and \u2206E = Change or transformation "
                +"of energy.\nIt's units are joules\u2044sec = Watt");
        coachMap.put("QZY. Practice questions on Power","(1)3.7 \u00d7 10\u2075 Joules of energy is transformed by a runner in 4 minutes. Find the  "
                +"power.\n\n(2)A 60 Kg man climbs 4.0 m stairs in 5.7 s.\n(a)Find the gravitational potential energy at the top of the  "
                + "stairs.\n(b)Power of the climber.\n\n(3)Power rating of a generator is 2.5 \u00d7 10\u2076 (2.5 MW).\n"
                +"Find the time required by it to produce 0.9 \u00d7 10\u00b9\u00b3 joules of energy.");




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
