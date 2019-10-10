import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

/** Aquarium Lab Series: <br>    
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
    private static Random generator = new Random();
    public static void main(String args[])
    {
        System.out.println("Welcome to the AquaSim application.");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to set the steps? y/n");
        String nSteps = s.nextLine();
        boolean promptSteps=false;
        if (nSteps.equals("y")) promptSteps = true;
        
        int randNum;
        Color colorFish = Color.WHITE;
        
        // int randNum = generator.nextInt(10);

        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;                 // create reference to an Aquarium ...
        //aqua = new Aquarium(600, 480); // ... object that has now been created
        aqua = new Aquarium(600, 480);
        // Construct fish and add them to the aquarium.
        
        colorFish = randomColor();
        AquaFish fish1 = new AquaFish(aqua, colorFish);aqua.add(fish1);
        colorFish = randomColor();
        AquaFish fish2 = new AquaFish(aqua, colorFish);aqua.add(fish2);
        colorFish = randomColor();
        AquaFish nemo = new AquaFish(aqua, colorFish);aqua.add(nemo);
        
        // Construct a graphkical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI userInterface;              // create reference to GUI ...
        userInterface = new AquaSimGUI(aqua, promptSteps);
        
        // ... and then GUI itself

        // Tell the user how to start the aquarium simulation.
        System.out.println("Press the Start button to start the simulation.");

        // Now wait for the user to press the start button.
        userInterface.waitForStart();

        // Draw the initial view of the aquarium and its contents.
        userInterface.showAquarium();


        // RUN THE AQUARIUM SIMULATION.
        
        // Remind user how to quit application.
        userInterface.println ("Close GUI display window to quit.");
        // Make the fish move and redisplay
        int steps = userInterface.getNumberOfSteps();
        System.out.println(steps);
        for(int i = 0; i<steps; i++) {
        
        if (fish1.atWall() || randomDirDecis()==0) fish1.changeDir();fish1.moveForward();
        if (fish2.atWall() || randomDirDecis()==0) fish2.changeDir();fish2.moveForward();
        if (nemo.atWall() || randomDirDecis()==0) nemo.changeDir();nemo.moveForward();
        
        userInterface.showAquarium();
        }
        userInterface.println("Aquarium run for " + steps + " steps."); 

        // WRAP UP.

    }//end main
    
    public static Color randomColor() {
        int randNum = generator.nextInt(1000);
        if (randNum < 140) return Color.RED;
        if (randNum < 280) return Color.ORANGE;
        if (randNum < 420) return Color.YELLOW;
        if (randNum < 560) return Color.GREEN;
        if (randNum < 800) return Color.BLUE;
        if (randNum < 900) return Color.MAGENTA;
        return Color.WHITE;
        
        /*
        switch (randNum) {
            case 0: return Color.RED;
            case 1: return Color.ORANGE;
            case 2: return Color.YELLOW;
            case 3: return Color.GREEN;
            case 4: return Color.BLUE;
            case 5: return Color.MAGENTA;
            default: return Color.WHITE;
        }
        */
    }
    
    public static int randomDirDecis() {return generator.nextInt(4);}
}//end class
