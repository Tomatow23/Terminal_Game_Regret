# Terminal_Game_Regret
A terminal game coded completely in vanilla java.

This is a game intended for learning, and understanding vanilla java more indepthly.
As of 12/28/2021 this is a not a reflection of the end product. 

In this project I have learned how to implement interfaces, and classes together to create less crowded code.
Better utilization of loops by using nested while loops with switches, and if-else conditions with large groups of objects.
Better understanding of object oriented programming by attempting to use multiple classes that involve inheritance and compositioning.
Creating a randomized value, and inputting that value to construct objects.






Bugs Log ---------------------------------------------------------------------------------------------------------------------------------------------

Bug 01 – Tomatow

Struggling to create an Orc object
Problem 1 (Solved): when using orc.getWeapnons() I am only receiving the reference (Dagger@f184fc6), or it’s coming back null.

Problem 2 (Solved): when creating randomized stats for orc with bounds, it only returns 0.
Solution 1(Worked) : I am going to attempt to put the randomized stat creator in the Orc class. 
Detail: by putting it in the Monsters class which Orc is extending from I put an override method in the Orc class to specifically make a stat randomizer for the Orc. This makes for better less redunant code.

Problem 3 (Solved) When trying to add the stats from a weapon onto a monster it would give a class cast error. On top of that the stat change wouldn’t be effective.
Solution 1(Worked): I had to put a Override method in the specific monster class that would set the new int within that specific monsters class. 
