import java.awt.Color;
import java.util.Random;

/** Aquarium Lab Series: Paste this answer into the AquaSimApplication class.<br>    
 *      The AquaSimApplication class contains the main function that will
 *      run the Aquarium Simulation. (This description should be updated
 *      when the behavior of the program changes.)<br>
 *
 * Modifications: <br>
 *   23 March 2008,  Alyce Brady,  Created skeleton main that constructs and
 *                                 displays an empty aquarium.<br>
 *   (date), (your name), Modified to .... <br>
 *
 *  @author  Alyce Brady  (should be Your Name)
 *  @version 23 March 2008  (should be today's date)
 *  @see AquariumController
 **/
public class AquaSimApplication
{
    /**
     *  This is the main function.  It executes the program.
     *  @param    String args[] is never used
     **/
     
     private static Random generator;
     
     
    public static void main(String args[])
    {
        // *** TASK 01 : Change Hellow World
        System.out.println("Where is Nemo?");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.

        // *** Task 06: Random Colors
        generator = new Random();
        
        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;                 // create reference to an Aquarium ...
        aqua = new Aquarium(600, 480); // ... object that has now been created

        
       // Construct fish and add them to the aquarium.
       //  *** Task 02 : Construct 3 fishes
       //  *** Task 03 : Add 3 fishes
       // *** Task 06 Color
       // *** Task 07 Random Color
       // *** Task 08 Rainbow
        AquaFish miles = new AquaFish(aqua, getColor());
        aqua.add(miles);
        
        AquaFish kilo = new AquaFish(aqua, getColor());
        aqua.add(kilo);
        
        AquaFish mitre = new AquaFish(aqua, getColor());
        aqua.add(mitre);
        

        // Construct a graphical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI userInterface;              // create reference to GUI ...
        // *** Part 11
        userInterface = new AquaSimGUI(aqua, true);  // ... and then GUI itself

        // Tell the user how to start the aquarium simulation.
        System.out.println("Press the Start button to start the simulation.");

        // Now wait for the user to press the start button.
        userInterface.waitForStart();

        // Draw the initial view of the aquarium and its contents.
        userInterface.showAquarium();


        // RUN THE AQUARIUM SIMULATION.

        // Make the fish move and redisplay.
        // *** Part 04 Make Fish Move and redisplay
        // *** Task 05 Reverse Direction
        // *** Task 10 Move Fish
        // **8 Task 11 Make people specify how much to move Fish.

        for (int i=0 ; i<userInterface.getNumberOfSteps() ; i++)
        {
            if (miles.atWall()|| changeDir())     // Task 05, Task 12
                miles.changeDir();
            miles.moveForward(); // Task 04
         
            if (kilo.atWall() || changeDir())     // Task 05, Task 12
                kilo.changeDir();
            kilo.moveForward(); // Task 04
        
            if (mitre.atWall() || changeDir())     // Task 05, Task 12
                mitre.changeDir();
            mitre.moveForward(); // Task 04
            
            userInterface.showAquarium();
            
        } // END  for (int i=0 ; i<userInterface.getNumberOfSteps() ; i++)

        
        userInterface.showAquarium();


        // WRAP UP.

        // Remind user how to quit application.
        userInterface.println ("Close GUI display window to quit.");

    }//end main
    
    
    // *** Task 07 : Random Colors
    // *** Task 08 : Rainbow
    // *** Task 09 : Favorites
    public static Color getColor()
    {
        int color = generator.nextInt(12);
        
        if (color==0|| color==1 || color==2)
            return Color.RED;
        else if (color==3||color==4)
            return Color.YELLOW;
        else if (color==5)
            return Color.ORANGE;
        else if (color==6||color==7||color==8||color==9)
            return Color.BLUE;
        else if (color==10)
            return Color.GREEN;
        else 
            return Color.MAGENTA;
         
    }
    
    public static boolean changeDir()
    {
        if (generator.nextInt(4) ==0)
            return true;
        return false;
    }
    

}//end class
