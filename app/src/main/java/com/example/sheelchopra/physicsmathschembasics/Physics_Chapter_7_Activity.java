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

public class Physics_Chapter_7_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics_chapter_7);
        final TreeMap<String,String> coachMap = new TreeMap<String, String>();
        coachMap.put("QA. What is a charge on a matter or an object","It is the excess or deficiency of the electrons in a matter or an object. "
                +"The object is negatively charged, if there is an excess of electrons and is positively charged if there is a deficiency "
                +"of the electrons. This excess or deficiency of electrons is with respect to the quantity of electrons needed "
                +"to make the object neutral.\n(For a neutral matter, number of electrons = number of protons).\nThe charge is denoted by Q.\n"
                +"It's units are Coulombs.\nThe elementary charge:It is the charge on one electron or a proton.\n For an electron:e\u207b = -1.6 \u00d7 10\u207b\u00b9\u2079 C\n"
                +"For a proton: \ne = 1.6 \u00d7 10\u207b\u00b9\u2079 C\n\u2234, Q = Ne Coulombs, where N = number of excess or deficient electrons.\n"
                +"Example:If an object has charge of -1 coulomb, then the # of excess electrons are\n=N =1C\u2044(1.6 \u00d7 10\u207b\u00b9\u2079)\n="
                +"6.25 \u00d7 10\u00b9\u2078");
        coachMap.put("QB. Practice questions on the charge on a matter","A pith ball has a positive charge of 5.4 \u00d7 10\u207b\u00b9\u2079 C. "
                +"How many electrons have been removed from it.\n(Hint: Use N = Q\u2044e)\n\n(2)A strip has  charge of -6.2 \u00d7 10\u207b\u2077 C. "
                +"What is the excess number of electrons on the strip.");
        coachMap.put("QC. What is static electricity","It is defined as a build up of stationary electric charge on a substance. The charge "
                +"remains at the same place and does not move.");
        coachMap.put("QD. Describe Bohr-Rutherford model of an atom","This model helps in understanding the electrical structure of a matter. "
                +"It's main concepts are:\n(1)Matter is composed of atoms\n(2)Within a atom, there are electrons(carry -ve charge) and protons "
                +"(carry +ve charge).\n(3)Protons are located in a very small region at the centre of an atom. this region is called nucleus.\n"
               +"(4)Electrons move in the space around the nucleus. They are small, very light particles (mass of an electron \u2248 1\u2044(2000)th "
                +"mass of a proton. But the magnitude of the charge on an electron = magnitude of the charge on a proton.\n(5)Atoms are in "
                +"general neutral since the # of electrons = # of protons.\n(6)Another small particles called neutrons which are slightly heavier than "
                +"a proton are also found in the nucleus along with the protons. They are neutral.\n(7)If an atom gains an electron, it becomes "
               +"a -vely charged atom called a negative ion.\n(8)If an atom loses an electron, it will have a deficit of electrons and "
                +"becomes +vely charged atom called a positive ion.");
        coachMap.put("QE. What are the fundamental laws of the electric charges","(1) Opposite charges attract each other.\n\n(2)Similar charges "
                +"repel each other.\n\n(3)Charged objects attract some neutral objects.");
        coachMap.put("QF. What are the conductors","These are the solids in which the charges can flow freely.\nExamples: Most metals such "
                +"such as copper, silver, gold, etc. are the excellent conductors.\nOn a sperical conductor, charge spread out evenly.\n"
                +"On the other shapes, charges are concentrated on the pointed end.");
        coachMap.put("QG. What are insulators","They are the solids in which the charges do not flow freely.\nExample: Plastic cork, fur, "
                +"glass, rubber, wool, etc are the excellent insulators.\nIf a wool is rubbed on one end of a plastic strip, the wool "
                +"develops a charge at the rubbed end. But it's other end remains neutral due to very low mobility of charges in the insulator");
        coachMap.put("QH. What is an electroscope","It is a device which is used to detect the presence of an electric charge and also "
                +"determines it's sign (+ve or -ve).\n\nCommom type of electroscopes:\n(a)Pith Ball Electroscope: It is a light, metal coated "
                 +"ball tied to an insulating thread.\nIf the ball is -vely charged previously and charged object is brought closer "
                +"to it, the ball repels if the charge on the object is -ve and attracts if the charge on the ball is +ve.\n\n"
                +"(b)Metal-leaf Electroscope: It consists of two thin metal leaves suspended from a metal rod in a glass container.\n"
                +"To the top of metal rod is attached a metal knob. Any charge on the metal rod is spread out over the entire knob and  "
                +"the leaves.Thus, the leaves have similar charge and hence they repel indicating the presence of charge on the knob.\n"
                +"Let an electroscope is -vely charged such that leaves are far apart with -ve charge. Now, if a charged object is brought closer to the knob, "
                +"then if the leaves are spread further apart, the object is -vely charged. This is because, the electrons in the knob "
                +"are pushed away due to repulsion towards the leaves thereby increasing the amount of electrons in the leaves and thus "
                +"the charges on the leaves have more strength and hence spread further.\nIn the other situation, if the object "
                +"is positively charged, it attracts electrons causing the flow of electrons from the leaves to the knob. This decreases the "
                 +"concentration of -ve charge in the leaves causing the leaves to move closer to each other.");
        coachMap.put("QI. What are the methods of charging an object","(1)Charging by friction\n\n(2)Charging by contact\n\n(3)Charging by induction");
        coachMap.put("QJ. Explain charging by friction","When two objects are rubbed together, one object gets -vely charged and the "
                +"other gets +vely charged.\nExample:When an ebonite rod is rubbed with a fur, some of the electrons from the atoms in "
                +"the fur are captured by the atoms in the ebonite rod as the latter has stronger affinity towards the electrons than the fur. "
                +"So, after rubbing, the ebonite rod gets an excess of electrons and is -vely charged and fur has a deficit of the electrons "
                +"and is +vely charged.");
        coachMap.put("QK. What is an electrostatic series chart", "It is a chart that shows a substance's tendency to gain or lose the  "
                +"electrons. When two substances in the series are rubbed together, the substance at the top of the series will lose the  "
                +"electrons to the substances lower in the series.\n\nTable of electrostatic series:\nacetate\n                electrons held weakly "
                +"\nglass\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u007c\nwool\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u007c\ncat fur,human hair\t\t\t\t\t\t\t\t\t\t\t\t\t\u007c\n"
                +"calcium,magnesium,lead\t\t\t\u007c\nsilk\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u007c\n"
                +"aluminium, zinc\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u007c\ncotton\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u007c\n"
                +"paraffin wax\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u007c\nebonite\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u007c\n"
                +"polyethlene(plastic)\t\t\t\t\t\t\t\t\t\t\t\u007c\ncarbon,copper,nickel\t\t\t\t\t\t\t\t\t\t\u007c\n"
                +"rubber\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u007c\nsulphur\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u007c\n "
                +"platinum,gold\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u2193\n                 electrons held strongly\n");
        coachMap.put("QL. Explain charging by contact","When a -vely charged ebonite rod touches a neutral pith-ball electroscope or "
                +"the knob of a metal-leaf electroscope, some excess electrons on the ebonite rod are repelled by their neighbours "
                +"and move to the pith ball or the knob and thus they both share the electrons and hence both of them become -vely charged. "
                +"\nSimilarly, when a +vely charged glass rod is used, some of the electrons from the neutral pith ball or metal-leaf electroscope "
                +"are attracted to the glass rod until the electroscope shares the deficit of the electrons that the rod previously had and  "
                +"so both have net positive charge.\nThis is a permanent charge, i.e. if the charged rod is removed, the electroscope "
                +"still remains charged.");
        coachMap.put("QM. Explain charging by induction","When a -vely charged ebonite rod is brought closer to the knob of a neutral metal-leaf "
                +"electroscope, electrons on the knob move as far away as possible from the -ve charged rod.This leads to the induced charge " +
                "seperation (which is the distribution of the charge due to change in the position of electrons in an object).\n"
                +"Thus the nearer end(knob) acquires induced opposite charge of the rod(+ve) and farther end (leaves) get induced "
                +"-ve charge.\nIf the charged rod is removed, the electrons will return to their original distribution and the electroscope "
                +"will be neutral.\nHowever, if the electroscope is grounded(a connection of an object to Earth through a conductor) by  "
                +"touching it, some electrons are induced to flow through the finger and leave the electroscope. Once the ground is removed "
                +"and then the rod is also removed, the electroscope has a permanent deficiency of the electrons and is +vely charged.\n"
                +"So, both the objects have net final opposite charge.\nSimilarly, if a +vely charged glass rod is brought closer to the "
                +"grounded neutral electroscope, the electrons from the Earth are attracted into the electroscope and thus move into it thereby "
                +"creating excess electrons in the electroscope making it -vely charged. So when the ground is removed and then the charged "
                +"rod is also moved away, there is net opposite charges on both the objects.");
        coachMap.put("QN. Summary of the charging methods","(1)Charging by friction:\n(a)Initial charges:Here both objects are neutral\n"
                +"(b)Steps:Two objects are rubbed together.\n(c)Final charges:Both the objects are oppositely charged as per electrostatic series.\n\n"
                +"(2)Charging by contact:\n(a)Initial charge:one object is neutral and the other is charged.\n(b)Steps:Neutral object is "
                +"touched with the charged object.\n(c)Final charges:Both the objects acquire similar charges.\n\n(3)Charging by induction and grounding:\n"
                +"(a)Initial charges:one object is neutral and the other is charged.\n(b)Steps:charged object is brought closer to the "
                +"neutral grounded object. Then, first the ground is removed and the charged object is removed.\n(c)Final charges: "
                 +"Both the objects are oppositely charged.");
        coachMap.put("QO.  Practice questions on charging methods","(1)State the type of the charge that each object would get when rubbed together\n"
                +"(a)wool and ebonite rod\n(b)glass and paraffin wax\n(c)polyethylene and fur\n\n(2)There are four pith balls A,B,C and D. "
                +"C and D repel each other. A attracts both B and D. If A is attracted by fur that had been previously rubbed by an ebonite "
                +"rod, what are the possible charges on each pith ball.\n\n(3)Explain why an ebonite rod when rubbed with fur becomes -vely "
                +"charged,\n\n(4)If the knob of a +vely charged electroscope is approached by a -vely charged rod, explain what happens "
                +"to the leaves of the electroscope.\n\n(5)A -vely charged ebonite rod is brought near a neutral sphere supported on an "
                +"insulating stand. What type of charge is expected on the side of the sphere nearest to the rod and on the side "
                +"farther from the rod if the sphere is a \n(a) conductor\n(b)an insulator.");
        coachMap.put("QP. What is Coulomb's law of force","It states that the force of attraction or the repulsion between the two point "
                +"charges (F\u2091)  is inversely proportional to the square of the centre to centre distance (r) between the two point charges and "
                +"directly proportional to the magnitude of the product of the two charges q\u2081 and q\u2082.\nSo, F\u2091 \u221d 1\u2044r\u00b2 and\n"
                +"F\u2091 \u221d q\u2081q\u2082.\n\u2234F\u2091 \u221d q\u2081q\u2082\u2044r\u00b2\nor F\u2091 = kq\u2081q\u2082\u2044r\u00b2, where\n"
                +"k = Coulomb's constant.\nk= 9.0 \u00d7 10\u2079 Nm\u00b2\u2044C\u00b2, where\nF\u2091 is in newtons, q\u2081 and q\u2082 are in Coulombs (C) and "
                +"r is in meters (m) in SI units.\n\nExample 1:For unlike point charges:\n\n-q\u2081\u25cb\u2192F\u2091      F\u2091\u2190\u25cb+q\u2082\n"
                +"Here F\u2091 is the force of attraction between the two point charges.\n\n"
                +"Example 2:For like charges:\n\nF\u2091\u2190\u25cb+q\u2081       +q\u2082\u25cb\u2192F\u2091.\nwhere, F\u2091 is the force of repulsion between "
                +"two point charges.");
        coachMap.put("QQ. practice questions on Coulomb's law","(1) Two similar point charges of 1.0 \u00d7 10\u207b\u00b9\u00b2 C each are "
                +"0.5 m apart. Find the force of repulsion between the charges.\n\n(2)The magnitude of the electrostatic force of attraction "
                +"between the two point charges is 0.6 \u00d7 10\u207b\u2074 N. Find the force between the charges \n(a)if only distance "
                +"between them is tripled and charges remain same\n(b)if seperation is same, but the charge on one is doubled and on the other "
                +"is reduced by one third.\n(c)Both changes in (a) and (b) occur simultaneously\n\n(3)Two identical small charged spheres "
                +" having same charge and same mass of 0.5 g are attached to the two ends of an insulating thread of length 0.5 m. "
                +"The spheres are suspended by a hook in the ceiling from the centre of the thread. The spheres repel from each other and "
                +"hang in the static equilibruim with an angle of 25\u00b0 between the two halves of the string. Find the magnitude of "
                +"the charge on each sphere.");
        coachMap.put("QR. Similarities between Coulomb's law and Newton's law of universal gravitation ","Coulomb's law:F\u2091 =kq\u2081q\u2082\u2044r\u00b2\n"
                +"Universal gravitation law of Newton: Fᴳ = Gm\u2081m\u2082\u2044r\u00b2\nThe similarities between the two laws are as below:\n"
                +"(a)Both are inverse square laws with respect to seperation r.\n(b)Both are also directly proportional to the product of "
                +"the two quantities; for gravity, it is the product of masses and for the electric force, it is the product of two charges.\n"
                +"(c)The force acts along the line joining the centre of the masses or charges.\n(d)Mass or charge is assumed to be concentrated "
                +"at the centre of the sphere. So, distance r between the two objects is measured from the centre of the spheres.");
        coachMap.put("QS. Differences between Coulomb's law and Newton's law of Universal gravitation", "The differences between the two laws are as below:\n "
                +"(a)Gravitational force can only attract but electric force can either attract or repel.\n(b) Value of gravitational constant "
                +"G = 6.67 \u00d7 10\u207b\u00b9\u00b9 Nm\u00b2\u2044Kg\u00b2 is very small as compared to Coulomb's constant "
                +"k = 9.0 \u00d7 10\u2079 N.m\u00b2\u2044C\u00b2. So Fᴳ between the small masses can be ignored, but F\u2091 even between "
                 +"the small charges cannot be ignored.");
        coachMap.put("QT. Practice question on comparison between Coulomb's law and Universal gravitation law", "Two 12.0 Kg masses each carry a "
                +"charge of 1.5 C.They are seperated by a distance of 0.400 Km in the space.\n(a)Find the force of gravity between "
                +"the two objects.\n(b)Find the electric force between the two objects.\n(c)Draw FBD of both the objects showing all the forces.\n"
                +"(d)Find net force on each object and it's direction\n(e)Find the initial acceleration of each object.\n(f)Repeat "
                +"(c)-(e) ignoring gravitational force.\n(g)Compare the two results.");
        coachMap.put("QU. What is the method of superposition to find net electric force on a charge", "Let there are more than two point charges "
                +"such as q\u2081, q\u2082,q\u2083 and q\u2084 in the space. Then the net force acting on a single charge say q\u2084 is the vector sum "
                +"of all the independently calculated electric forces acting on it due to the other charges.\n"
                +"\u2234 \u03a3F\u20d7\u2084\u2091 = F\u20d7\u2084\u2081\u2091 +  F\u20d7\u2084\u2082\u2091 + F\u20d7\u2084\u2083\u2091\n"
                +"where, \u03a3F\u20d7\u2084\u2091 is the net electric force acting on charge q\u2084 due to the other charges,\n"
                +"F\u20d7\u2084\u2081\u2091 is the electric force acting on charge q\u2084 due to charge q\u2081,\nF\u20d7\u2084\u2082\u2091 is "
                +"the electric force acting on the charge q\u2084 due to charge q\u2082 and\nF\u20d7\u2084\u2083\u2091 is the electric force acting on the charge "
                +"q\u2084 due to charge q\u2083.");
        coachMap.put("QV. What is an electric field (\u03b5\u20d7)", "It is defined as a region in which a force is exerted on an "
                +"electric charge. It is also defined as the electric force per unit positive charge.\nExplanation:Consider a primary charge "
                +"q\u2081 and another small positive test charge q\u2082 seperated by a distance r.\nThen, electrostatic force exerted on q\u2082 "
                +"by q\u2081 is given as:\nF\u20d7\u2082\u2081\u2091 = kq\u2081q\u2082\u2044r\u00b2.\nThen F\u20d7\u2082\u2081\u2091\u2044q\u2082 "
                +"=kq\u2081\u2044r\u00b2 =electric field \u03b5\u20d7 due to charge q\u2081.\nIt's units are Newton\u2044Coulomb(N\u2044C). It is a vector quantity.\n"
                +"The test charge by convention is taken as a unit +ve charge.\n\u2234 a unit positive charge can be used to determine the "
                +"direction of the electric field lines around a charge.\nElectric field lines around a charge give the direction of the "
                +"electric field due to a central primary charge q\u2081. These field lines are closer near the primary charge and are farther "
                +"apart as distance from the primary charge increases.\nCase a:When primary charge q\u2081 is +ve:The direction of electric "
                +"field is away from the primary charge.\n\u2190\u25cb\u2192\nCase b:When primary charge q\u2081 is -ve: "
                +"Direction of electric field is towards the charge q\u2081.\n\u2192\u25cb\u2190.");
        coachMap.put("QW. How is electric field of a primary charge represented", "Electric fields due to a primary charge q\u2081 are repeesented by the electric field lines. They "
                +"They represent the direction of the net force acting on a test charge due to q\u2081. At any point, the direction of the tangent to the "
                +"field line curve gives the direction of the electric field at that point.\nThey start on the positive charge and end on the "
                +"negative charge as shown below:\n(a)Primary charge q\u2081 is positive:\n\u2190\u2190\u2190(+q\u2081)\u2192\u2192\u2192\n\n"
                +"(b)Primary charge q\u2082 is -ve:\n\u2192\u2192\u2192(-q\u2081)\u2190\u2190\u2190\n\n(c)Two primary charges +q\u2081 and -q\u2082:\n"
                +"(+q\u2081)\u2192\u2192\u2192\u2192\u2192(-q\u2082)\n");

        coachMap.put("QX. What are the properties of electric field lines", "(1)Field lines never cross each other. If they cross, it would mean "
                +"that the charge at that point has two different net forces acting at that point with two different directions i.e. "
                +"at the point of intersection, there would be two tangents with different directions which is not possible.\n(2)The electric "
                +"field lines are closer nearer to the primary charges indicating presence of strong electric field near the charge.\n"
                +"(3)Spacing of electric field lines is more at points farther from the primary charge indicating weak electric fields "
                +"away from the primary charge.\n(4)The number of field lines approaching a -ve primary charge or leaving a +ve primary charge "
                +"is proportional to the magnitude of the charges.");
        coachMap.put("QY. Discuss the properties of electric field produced by parallel plates", "(1) Two parallel conducting plates are "
                +"connected to a power supply such that both the plates acquire the charge q which is equal in magnitude but opposite "
                +"in sign.\n(2) The electric field is constant everywhere in the space between the parallel plates. The electric field "
                +"lines are straight, equally spaced and perpendicular to the parallel plates.\n(3) The direction of the electric field "
                +"between the plates is from +ve plate towards the -ve plate.\n(4) The electric field in the region outside the parallel "
                +"plates is zero (except for a slight bulging of the field near the edges of the plates).\n(5)The magnitude of the electric "
                +"field at any point between the plates (except near the edges) depends only on the magnitude of the charge on each plate.\n"
                 +"(6) The electric field \u03b5\u20d7 \u221d q, where\n q is the charge per unit area of each plate.");
        coachMap.put("QZ. Practice questions on electric field", "(1) Find the electric field 0.70 m away from a small sphere having "
                +"a negative charge of 1.5 \u00d7 10\u207b\u2079 C.\n\n(2) Two charges q\u2081 = 4 \u00d7 10\u207b\u2079 C and "
                +"q\u2082 = -7.4 \u00d7 10\u207b\u2079 C are 45 cm apart.\nFind the net electric field at a point A, 25 cm from the "
                +"+ve charge on the line connecting the charge.\n\n(3)The magnitude of the electric field between the two parallel plates "
                +"is 4.2 \u00d7 10\u00b2 N\u2044C. How will the magnitude of the field change\n(a)if charge on each plate is doubled,\n(b) "
                +"if the plate seperation is doubled.\n\n(4)At a certain point A in an electric field, the magnitude of the electric "
                +"field is 140 N\u2044C [E].\nFind the magnitude and direction of the electric force that would be exerted on a point charge of -3.5 \u00d7 10\u207b\u2079 C "
                +"located at A.");
        coachMap.put("QZA. What is electric potential energy(E\u2091)", "It is defined as the energy stored in a system of two charges "
                +"q\u2081 and q\u2082 seperated by a centre to centre distance r\nE\u2091 =kq\u2081q\u2082\u2044r.\n  "
                +"E\u2091 is -ve if q\u2081 and q\u2082 are of opposite charges and electrical potential energy of the system decreases.\nE\u2091 is +ve, if q\u2081 and q\u2082 are like charges. "
                +"In this case, energy is stored in the system by moving them closer and hence electric potential energy of the system increases.\nAs r  \u2192 \u221d, E\u2091 \u2192 0.\n"
                +"This means if the two charges are infinite distance apart, then potential energy of the system = 0.\n"
                +"It is also defined as the work done in bringing a charge q\u2082 from infinity to a distance r from the charge q\u2081.\n"
               +"\u2235 Work done = Change in energy =\u0394E\u2091 = E\u2091\u2082 - E\u2091\u2081\n =kq\u2081q\u2082\u2044r -0\n = kq\u2081q\u2082\u2044r\n"
                +"=E\u2091 when q\u2082 is at a point distance r from q\u2081.");
        coachMap.put("QZB. What is electric potential(V)", "It is defined as the potential energy per unit positive test charge, when "
                +"it is in the field of a primary central charge q\u2081.\nIt is also defined as the amount of work necessary to move a "
                +"unit +ve test charge from rest at infinity to rest at any specific point at a distance r from q\u2081 in the field "
                +"of q\u2081. It is also called absolute potential.\nLet q\u2081 is a spherical point charge, then electric potential at a distance r from it is given by "
                +"\n V = E\u2091\u2044q\n=kq\u2081q\u2044rq\n\u2234 V = kq\u2081\u2044r.\nIt is expressed in Joules\u2044Coulomb(J\u2044C) =Volt\n"
                +"\u2234 1 J\u2044C = 1 Volt.\nIf q\u2081 >0, V >0 and\nif q\u2081 <0, V <0.\nAs r \u2192 \u221d, V \u2192 0.\n"
                +"Also, from above E\u2091 = qV, where q is any charge placed in the electric field of q\u2081.\nExplanation:Let the electric "
                +"potential at a point in the electric field of charge q\u2081 is 14 Volts (i.e. the electric potential energy "
                +"possessed by a unit +ve charge is 12 joules at that point).\nThen, electric potential energy possessed by a +2 coulombs of "
                +"charge at that point is 2 \u00d7 12 = 24 Joules.");
        coachMap.put("QZC. What is electric potential difference(\u0394V)", "It is defined as the amount of work required per unit charge to "
                +"to move a +ve charge from one point A to another point B in the presence of an electric field.\nEarth's potential =0.\n "
                +"Two conducting objects connected by a conducting wire are at the same electric potential so that their potential difference "
                +"is equal to zero.This process is used in grounding wherin the object is placed at the same potential as Earth.");
        coachMap.put("QZD. What is electric potential in the electric circuits", "An electric circuit has four essential components, namely: "
                +"(a)Source battery(ex:electrochemical cells) (b)conducting wires (c)a load (d)an on/off switch.\nThe circuit has locations "
                +"of high(+ve terminal of the cell) and low potential(-ve terminal of the cell). Charge moving through the wires of the circuits "
                +"encounter change in the electric potential as it flows through the circuit.\nWithin the electrochemical cells of the battery, "
                +"an electric field is established directed from the +ve terminal towards the -ve terminal. So, the movement of "
                +"+ve test charge through the cells from the -ve terminal to the +ve terminal would require work and hence increases the "
                +"potential energy of every coulomb of charge that moves along the path.\n\u2234 it is a movement of the +ve charge against the "
                +"electric field.\nBecause of this, +ve terminal is described as the high potential terminal.\nSimilarly, when the +ve charge "
                +"is moved from +ve terminal to the -ve terminal in the external conducting wires connecting the load, it is moving in the "
                +"direction of the electric field and does not require work. The charge loses potential energy as it flows through the loads and "
                +"reaches the -ve terminal of the cell with a low potential and then cycle repeats.\nSo, -ve terminal of the cell is described "
                +"as the low potential terminal.\nConvention of charge flow: The +ve charge moves from -ve terminal to the +ve terminal inside "
                +"the battery and from +ve terminal of the battery to the -ve terminal of the battery in the external wired circuit.");
        coachMap.put("QZE. Examples on Electric Potential energy and electric potential", "(1)If work is done on a +ve test charge by an "
                +"external force to move it from one location to another, then\n(a)Does it's potential energy increases or decreases.\n(b) "
                +"Does it's electric potential increases or decreases\n(c)What is the direction of the charge movement.\nAnswer:(a)The "
                +"potential energy of the charge increases.\n(b)It's electric potential also increases.\n(c)The direction of movement of charge "
                +"is opposite to the direction of the electric field.\n\n(2)The arrows in the figures below show the direction "
                +"of the electric field. A charge q is shown at point A. for each figure determine if\n(a)work is done upon the charge "
                +"to move it from point A to B.\n(b)Which point has higher electrical potential energy.\n(c)Which point has higher electric potential.\n"
                +"Figure 1:\n\u2192\u2192\u2192\u2192\u2192\u2192\u2192\n\u2192\u2192\u2192\u2192\u2192\u2192\u2192\n\u25cfA(+q)\u2192\u2192\u2192\u25cfB\n\u2192\u2192\u2192\u2192\u2192\u2192\u2192\n"
                +"\u2192\u2192\u2192\u2192\u2192\u2192\u2192\nAnswer:(a)No work is done on the charge as +ve charge is moving along the direction "
                +"of the electric field.\n(b)Electric PE is greatest at A since when a +ve charge moves naturally in the direction of the "
                +"electric field, it is moving from higher PE to the lower PE.\n(c)Electric potential is greatest at A as for the same charge, the "
                +"electric potential is greatest at locations of higher potential energy.\nFigure 2:\n"
                +"\u2192\u2192\u2192\u2192\u2192\u2192\u2192\n\u2192\u2192\u2192\u2192\u2192\u2192\u2192\n\u25cfB\u2192\u2192\u2192\u25cfA(+q)\n\u2192\u2192\u2192\u2192\u2192\u2192\u2192\n"
                +"\u2192\u2192\u2192\u2192\u2192\u2192\u2192\nAnswer:(a)Work is done on the charge since the +ve charge is moving against the "
                +"direction of the electric field.\n(b)Electric PE is greatest at B since work is done to move a +ve charge against the electric field."
                +"So, the PE of charge increases as it moves from A to B.\n(c)Electric potential is greatest at B since for the same charge, "
                +"the electric potential is greatest at locations of higher potential energy.\nFigure 3:\n"
                +"\u2192\u2192\u2192\u2192\u2192\u2192\u2192\n\u2192\u2192\u2192\u2192\u2192\u2192\u2192\n\u25cfA(-q)\u2192\u2192\u2192\u25cfB\n\u2192\u2192\u2192\u2192\u2192\u2192\u2192\n"
                +"\u2192\u2192\u2192\u2192\u2192\u2192\u2192\nAnswer:(a)Work is done on the charge since the -ve charge is moving along the"
                +"direction of the electric field.\n(b)Electric PE is greatest at B since work is done to move a -ve charge in the direction of the electric field."
                +"So, the PE of charge increases as it moves from A to B.\n(c)Electric potential is greatest at B since for the same charge, "
                +"the electric potential is greatest at locations of higher potential energy.\nFigure 4:\n"
                +"\u2192\u2192\u2192\u2192\u2192\u2192\u2192\n\u2192\u2192\u2192\u2192\u2192\u2192\u2192\n\u25cfB\u2192\u2192\u2192\u25cfA(-q)\n\u2192\u2192\u2192\u2192\u2192\u2192\u2192\n"
                +"\u2192\u2192\u2192\u2192\u2192\u2192\u2192\nAnswer:(a)No work is done on the charge as -ve charge is moving against the direction "
                +"of the electric field.\n(b)Electric PE is greatest at A since when a -ve charge moves against the direction of the "
                +"electric field, it is moving from higher PE to the lower PE.\n(c)Electric potential is greatest at A as for the same charge,"
                +"electric potential is greatest at locations of higher potential energy.");

        coachMap.put("QZF. Describe change in electric potential energy of a moving charge within a field", "Let there is an existing electric field \u03b5\u20d7 due to a "
                +"point charge q. Let a +ve test charge q\u2080 is brought from infinity to a point 1 at a distance r\u2081 from q in the electric field of charge q. Let this "
                +"charge q\u2080 is moved in this electric field to the point 2 at a distance r\u2082 from q within the "
                +"electric field of q. This is shown as below:\n(q)\u2192\u2192\u2192\u2192\n\t\t\t\t\t\t\t\tA(q\u2080)\n\u2192\u2192\u2192\u2192\n "
                +"\u2192\u2192\u2192\u2192\n\t\t\t\t\tB\n\u2192\u2192\u2192\u2192\n.Regardless of the actual path taken by q\u2080, "
                +"the difference between the electric potential at 2 and 1 = Work done per unit charge performed in moving the charge q\u2080 "
                +"from 1 to 2 within the electric field of charge q.\n\u2234 \u0394E\u2091 = q\u2080V\u2082 - q\u2080V\u2081\n=q\u2080(V\u2082 - V\u2081)\n"
                +"or \u0394E\u2091 = q\u2080\u0394V,\n where \u0394V is the potential difference between the points 2 and 1 in the field.\n"
                +"The potential of the charge q\u2080 increases if it moves in the opposite direction of \u03b5\u20d7 and decreases "
                +"if q\u2080 moves along the direction of \u03b5\u20d7.\n\u2235 for a point charge q,\n\u0394V = V\u2082 - V\u2081\n"
                +"=kq(1\u2044r\u2082 - 1\u2044r\u2081).\nFollowing cases arise:\nCase a:If r\u2081 > r\u2082  and q >0, then \u0394V >0\nCase b:If r\u2082 > r\u2081 and q >0, then \u0394V <0\n"
                +"Case c:If r\u2081 > r\u2082  and q < 0, then \u0394V <0\nCase d:If r\u2082 > r\u2081  and q <0, then \u0394V >0\n"
                +"Conclusion:Case a: Point 2 is at higher potential than point 1 and q\u2080 moves opposite to the direction of \u03b5 and \u0394E\u2091 =q\u2080\u0394V >0 "
                 +"thereby increasing the potential energy of the charge q\u2080.\nCase b: Point 2 is at a lower potential than point 1 and q\u2080 "
                 +"moves in the direction of the \u03b5\u20d7 and \u0394E\u2091 < 0 thereby decreasing the electrical potential energy of q\u2080.\n"
                 +"Case c: Point 2 is at a lower potential than point 1 and q\u2080 moves in the direction of the \u03b5\u20d7 and \u0394E\u2091 < 0 "
                +"thereby decreasing the potential energy of q\u2080.\nCase d:Point 2 is at a higher potential than point 1 and charge q\u2080 "
                +"moves opposite to the direction of \u03bf\u20d7 and \u0394E\u2091 > 0 thereby increasing the potential energy of q\u2080.");
        coachMap.put("QZG. Expressions for potential difference between two large oppositely charged parallel plates", "Consider two large parallel plates "
                +"seperated by a distance r (Area A >>> r). Then the electric field \u03b5\u20d7 = F\u20d7\u2091\u2044q\u2080 is a constant, "
                +"\nwhere q\u2080 is a unit +ve test charge. Let plate A is +vely charged and plate B is -vely charged. Then the direction "
                +"of the electric field between the plates is from plate A to plate B. The figure is shown as below:\n"
                +"\u2015\u2015\u2015\u2015 (+) Plate A\n\u2193\u2193\u2193\u2193\u2193\u2193\n\n\u2191F\u20d7\n(+q\u2081)\n\u2193F\u20d7\u2091\n\u2015\u2015\u2015\u2015(-) Plate B\n"
                +"Let a +ve charge q\u2081 is moved from -ve plate B to the +ve plate A. Since it is moving against the electric field, "
                +"the work has to be done on the charge q\u2081 to move it from B to A. This causes an increase in the electrical potential "
                +"energy of the charge q\u2081. This work is done by applying a force F\u20d7, equal in magnitude but opposite in direction "
                +"of the electrical force of repulsion F\u20d7\u2091 acting in the direction of the electrical field over a distance r.\n"
                 +"The magnitude of the work done is \n=W = Fr (F and r in the same direction)\n\u2235 F=F\u2091 = q\u2081\u03b5,\n\u2234 W = q\u2081\u03b5r\n"
                 +"\u2235 W = \u0394E\u2091 = q\u2081\u0394V\n\u2234 q\u2081\u0394V = q\u2081\u03b5r\n\u2234 \u03b5 = \u0394V\u2044r,\nwhere \u0394V =V(BA) =V(A) -V(B).\n"
                 +"From above, \u0394V = \u03b5r.\n\u2235 \u03b5 is a constant,\n\u2234 \u0394V  \u221d r.\nThis means that if electric potential "
                 +"difference between the two plates seperated by a distance r is \u0394V and a charge q\u2081 moves one third of distance between "
                 +"the plates, then it will experience a potential difference = \u0394V\u20443.");
        coachMap.put("QZH. Practice questions on electric potential ", "(1) Analyse all the cases (a-d) as in question QZF if q\u2080 is -ve.\n\n "
                +"(2) Find the electric potential at a distance of 0.60 m from a sperical point charge of +7.40 \u00d7 10\u207b\u2076 C.\n "
                +"(hint:V at infinity is 0 and use V = kq\u2044r)\n\n(3) Find the work done to increase the potential of a charge of 2.0 \u00d7 10\u207b\u2077 C "
                +"by 100 V.\n(hint: W = \u0394E=q\u0394V)\n\n(4)In a uniform electric field, the potential difference between the two "
                +"points 15.0 cm apart is 200 V. Find the magnitude of the electric field strength.\n(hint:\u03b5 =\u0394V\u2044r)\n\n"
                +"(5) The magnitude of the electric field strength between the two parallel plates is 500 N\u2044C. The plates "
                +"are connected to a battery with an electric potential difference of 105 V. Find the plate seperation.\n(hint:\u03b5=\u0394V\u2044r)");
        coachMap.put("QZI. Comparison of the electric fields near the spheres of different sizes connected by a conductor", "Consider two spheres S\u2081 and S\u2082 of "
                +"radius r\u2081 and r\u2082 and charges q\u2081 and q\u2082 connected by a conductor. Let r\u2082 > r\u2081.The figure is "
                +"shown as below:\n\n\u25cb(S\u2081)\u23af\u23af\u23af\u25ef(S\u2082)\nSince they are connected by a conductor, they are "
                +"at the same potential.\n\u2235 V\u2081 = V\u2082\n\u2234 kq\u2081\u2044r\u2081 = kq\u2082\u2044r\u2082\nor q\u2081\u2044q\u2082 = r\u2081\u2044r\u2082\n "
                +"The magnitude of electric fields near each sphere is as below:\n\u03b5\u2081 =kq\u2081\u2044r\u00b2\u2081 and\n"
                +"\u03b5\u2082 =kq\u2082\u2044r\u00b2\u2082.\n\u03b5\u2081\u2044\u03b5\u2082 = q\u2081r\u00b2\u2082\u2044q\u2082r\u00b2\u2081\n "
                +"=r\u2081r\u00b2\u2082\u2044r\u2082r\u00b2\u2081\n\u2234 \u03b5\u2081\u2044\u03b5\u2082 = r\u2082\u2044r\u2081.\n\u2235 r\u2082 > r\u2081\n"
                 +"\u2234 \u03b5\u2081 > \u03b5\u2082\n\u2234 electric field near the smaller sphere can be increased by decreasing it's size "
                 +"relative to the larger sphere.\n\u2234 there is a more concentration of charges near the smaller spheres or pointed ends "
                  +"of an object.");
        coachMap.put("QZJ. How does the lightning rod protects the buildings", "Lightning rods are long, thin, pointed metal rods which are "
                +"usually placed at the highest point on a building and connected to the ground with a conductor. The lightning bolt follows "
                +"the ionized path which is created in the air, that is otherwise an insulator.\nExplanation:As explained in QZI, electric "
                +"field near smaller sphere can be increased by decreasing it's size. similarly, the top of a lightning rod has a very small "
                +"radius of curvature as compared to adjoining roof surface. So, the electric field near the top of the pointed tip of the rod "
                +"is very large enough to ionize the air near it and thus this mass of air becomes conductor and so influences the path of "
                +"any nearby lightning. Thus this lightning hits the rod and safely passes along the grounding wire into the Earth without "
                +"striking the nearby roof surface.");
        coachMap.put("QZK. More Practice questions on electric field and electric potential ", "(1) The electric potential difference between "
                +"inside and outside of a neuron cell membrane of thickness 4.5 nm is about 0.075 V.\n(a)Calculate the magnitude of the  "
                +"electric field in the membrane.\n(b)Calculate the work to be done on a single sodium ion, of charge of 1.8 \u00d7 10\u207b\u00b9\u2079 C "
                +"to move it through the membrane from the region of lower potential to the higher potential.\n(hint: inner and outer "
                +"surfaces of the membrane are like two parallel plates.)\n\n(2)Charge q\u2081 is 0.20 m away from point A.Charge q\u2082 "
                +"is 0.50 m away from point A. Electric potential at A = 0.\nFind the ratio q\u2081\u2044q\u2082.\n(Hint: Equate the potential "
                +"at A due to q\u2081 to the potential at A due to q\u2082.)\n\n(3)Two parallel plates are connected to a 150 V power supply "
                +"and seperated by an air gap. The largest electric field in the air is 3.6 \u00d7 10\u2076 N\u2044C.\nFind the "
                +"smallest possible gap between the plates.\n\n(4)Three charges q\u2081 = +5.0 \u03bcC, q\u2082 = 4.0\u03bcC and "
                +"q\u2083 = +3.0 \u03bcC are placed at three corners of an equilateral triangle of length 2.0 m.\n(a)Find the "
                 +"total electric potential energy of the group of charges.\n(Hint:Total P.E.\n = kq\u2081q\u2082\u2044r\u2081\u2082 + "
                 +"kq\u2081q\u2083\u2044r\u2081\u2083 +kq\u2082q\u2083\u2044r\u2082\u2083)\n(b)Find the electric potential at the midpoint of each "
                 +"side of the triangle.");
        coachMap.put("QZL. What is Millikan experiment", "Millikan conducted an experiment to determine the elementary charge or the charge "
                +"on an electron. To measure the charge, a uniform electric field between two oppositely charged parallel plates was used. "
                +"A mist of charged oil drops was sprayed through a small hole in the upper positive plate and by adjusting the potential "
                +"difference between the two plates, it was possible to balance the charged oil drop in the air in such a way that the electric "
                +"force acting on it is balanced by the downward gravitational force acting on the oil drop.");
        coachMap.put("QZM. Finding value of elementary charge by Millikan experiment set up", "Consider two oppositely charged parallel plates seperated "
                +"by a distance r. Let the positive plate is at the top. Then direction of the uniform electric field is directed downwards. "
                +"A mist of -vely charged oil drops of mass m is sprayed through a small hole in the upper plate. The potential difference \u2206V\u2092 "
                +"between the two plates is adjusted in such a way that the electric force F\u2091 acting upward on the oil drop is balanced "
                +"by the downward gravitational force on the oil drop Fᴳ. The figure is shown as below:\n"
                +"\u2015\u2015\u2015\u2015 (+) Plate A\n\u2193\u2193\u2193\u2193\u2193\u2193\t\t\u03b5\u20d7\n\u2193\u2193\u2193\u2193\u2193\u2193\n\u2191F\u20d7\u2091\n(-q\u2081)\n\u2193F\u20d7ᴳ\n\u2015\u2015\u2015\u2015(-) Plate B\n"
                +"From above, F\u20d7\u2091 = q\u03b5\u20d7 (\u2191)\n\u2235 droplet is balanced at \u2206V = \u2206V\u2092\n\u2234 F\u2091 = Fᴳ\n"
                +"or, q\u03b5 = mg\n\u2235 \u03b5 = \u2206V\u2092\u2044r\n\u2234 q\u2206V\u2092\u2044r = mg\nor q = mgr\u2044\u2206V\u2092\n"
                +"Thus, knowing mass m, q can be calculated. Mass m of the oil drop can be measured by determining it's terminal speed with which "
                +"it falls when the electrical balancing force is removed.\nThe above experiment was repeated many times with oil droplets of different "
                +"masses and charges in each trial was determined. The list of values of the charges indicated that all values were a simple "
                +"multiple of some smallest value and many droplets of oil had this charge and no droplet had a charge lower than this charge.\n"
                +"This smallest value of the charge was considered as elementary charge i.e. a charge on an electron which is :\n"
                 +"e\u207b = - 1.602 \u00d7 10\u207b\u00b9\u2079 C.\nSimilarly, charge on proton is :\n e = 1.602 \u00d7 10\u207b\u00b9\u2079 C");
        coachMap.put("QZN. Practice questions on Millikan experiment ", "(1) Find the charge on a small sphere with an excess of 6.25 \u00d7 10\u00b9\u2075 electrons.\n\n"
                +"(2) Two horizontal plates are 3.0 cm apart. a charged sphere of mass 1.6 \u00d7 10\u207b\u00b9\u2075 Kg remains stationary "
                +"when the potential difference between the plates is 480 Volts and also upper plate is +ve.\n(a)Is the sphere +vely or "
                +"-vely charged.\n(b)Find the magnitude of the charge on the sphere.\n(c)How many excess or deficit electrons are on the sphere.");
        coachMap.put("QZO. Motion of charged particle in an electric field  ", "Consider two +ve charges q\u2081 and q\u2082 seperated by a distance r. "
                +"Let there masses be m\u2081 and m\u2082. Let the charge q\u2081 is fixed. The figure is shown as below:\n "
                +"\u25ef(+q\u2081)\u23af\u23af\u23af\u23af\u23af(+q\u2082)\u25ef\u2192F\u20d7\u2091\n(m\u2081)\t\t\t\t\t\t\t\t\t\t\u2190r\u2192\t\t\t\t\t\t\t\t\t\t\t(m\u2082)\n"
                +"\nLet m\u2082 <<<m\u2081 such that the gravitational force on the mass m\u2082 can be neglected.\nCharge q\u2082 experiences "
                +"a force of repulsion F\u2091 = kq\u2081q\u2082\u2044r\u00b2 as shown in the figure.\nIf q\u2082 is free to move, it will "
                 +"accelerate in the direction of F\u20d7\u2091 which is the net force on the charge q\u2082. Then the acceleration a\u20d7 of the charge q\u2082 is given by Newton's second "
                  +"law of motion and so \n a\u20d7 = F\u20d7\u2091\u2044m\u2082.\nSubsequent motion of the charge q\u2082 becomes "
                 +"difficult because as it moves away from charge q\u2081, r increases and F\u20d7\u2091 decreases.\nFor this reason, the "
                  +"motion of a charged particle is best described from energy considerations.\nLet after repulsion, charge q\u2082 that was initially "
                  +"at rest now moves to a distance r\u0027.\nThe figure is shown as below:\n"
                  +"\u25ef(+q\u2081)\u23af\u23af(+q\u2082)\u25ef\u2192F\u20d7\u2091\u23af\u25ef(+q\u2082)\n(m\u2081)\t\t\t\t\u2190r\u2192\t\t\t\t(v=0)\t\t\t\t\t\t\t\t(v\u0027)\n"
                  +"\u2190\u2190\u2190\u2190\u2190\u2190r\u0027\u2192\u2192\u2192\u2192\u2192\u2192\n\nAs the seperation distance between q\u2081 and q\u2082 increases, electric "
                  +"potential energy of q\u2082 decreases and it's kinetic energy increases. By law of conservation of energy, total energy "
                  +"remains constant as q\u2082 moves away from q\u2081.\ni.e E\u209c = E\u0027\u209c\nor E\u2091 + E\u2096 = E\u0027\u2091 + E\u0027\u2096\n"
                  +"kq\u2081q\u2082\u2044r + m\u2082v\u00b2\u20442 = kq\u2081q\u2082\u2044r\u0027 + m\u2082v\u00b2\u0027\u20442\n"
                  +"kq\u2081q\u2082\u2044r - kq\u2081q\u2082\u2044r\u0027 =m\u2082v\u0027\u00b2\u20442 -0\n(\u2235 v =0)\n"
                   +"or -(kq\u2081q\u2082\u2044r\u0027 - kq\u2081q\u2082\u2044r) = m\u2082v\u0027\u00b2\u20442\n"
                  +"\u2234 -\u2206E\u2091 = \u2206E\u2096.\nThis means as the charged particle q\u2082 moves in the electric field of "
                   +"charge q\u2081, the electric potential energy it loses (-\u2206E\u2091) = gain in it's kinetic energy (\u2206E\u2096)");
        coachMap.put("QZP. Motion of charged particle in a uniform electric field", "Consider a charge q of mass m moving in a uniform electric field \u03b5\u20d7.\n"
                +"Then electric force F\u20d7\u2091 on the charge \n=q\u03b5\u20d7.\nF\u20d7\u2091 is constant since \u03b5\u20d7 is a constant.\n"
                +"\u2234 acceleration of the charge q is given by Newton's second law of motion as:\n a\u20d7 = F\u20d7\u2091\u2044m.\n"
                +"This acceleration is also constant and\n \u2234 the charged particle q moves with a uniform acceleration within \u03b5\u20d7.\n"
                +"The work done by the electric force in moving a charge q by a distance r is given as:\nW = F\u2091rcos\u03b8, where \u03b8 is the "
                +"angle between F\u2091 and r.\nFor a parallel plate apparatus with plate separation r, \u03b8 = 0.\n\u2234 W = Fr is the "
                +"work done in moving the charge q from one plate to the other plate.\nFrom above,\nW = \u03b5qr \n=\u2206Vqr\u2044r = \u2206Vq\n"
                +"Note:This work done W is the change in the electric potential energy or the change in kinetic energy of the particle "
                +"as it moves from one plate to the other.");

        coachMap.put("QZQ. Practice questions on moving charges  in an electric field", "(1) A charge q\u2081 = 6 \u00d7 10\u207b\u2076 C is "
                +"fixed at a point. Another charge q\u2082 = 2 \u00d7 10\u207b\u2076 C is free to move. The initial seperation of two charges "
                +"is 0.30 m along a horizontal line.\n (a)How fast the charge be moving when they are 0.75 m apart\n(b)Find the work done "
                +"in moving the charge for this distance.\n\n(2) an electron is fired horizontally from the bottom plate at a speed of 2.5 \u00d7 10\u2076 m\u2044s "
                +"between two horizontal plates 9.5 cm long. The magnitude of the electric field between the plates is 140 N\u2044C. "
                +"The seperation between the plates is great enough to allow the electron to just escape. Neglect edge effects and the "
                +"gravitation forces.\n(a)Find the velocity of the electron as it just escapes from these plates.\n(b)Find the seperation distance");


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
