# Aquarium Lab

# Introduction

You will be learning about and enhancing the Aquarium simulation program. 

1. The `AquaSimApplication` class contains the main method to start the program.
2. An `Aquarium` object represents the aquarium in which fish will swim.
3. `AquaFish` objects represent the fish swimming in the aquarium.
4. An `AquaSimGUI` object provides a graphical user interface (display and control button) for the simulation.

# Aquarium

Run the Aquarium simulation using main. As a quick way to become familiar with what the Aquarium simulation program does, compile and run the program using the main method in the `AquaSimApplication` class. You should see a window appear with a Start button and some instructions at the bottom. This is the program's graphical user interface. When you press the Start button, you should see an empty blue background (the aquarium). That is all the program does for now. Close the graphical user interface window.

# Task 1

1. Edit the `AquaSimApplication` class and modify the first output statement to welcome users to the fish aquarium program rather than state that it will be an aquarium simulation.
2. Test the modified program. 
3. Does it behave any differently? 

# Task 2 part 1

Read the initial version of the main method in AquaSimApplication.java. This method has three sections. 

1. The first constructs the objects needed to run the simulation. 
2. The second and third sections, which are currently much shorter, run the simulation (or will, when we have added some more functionality to it) and wrap up the program, reminding the user how to quit.

# Task 2 part 2

1. Research the class documentation of (or specification for) the AquaFish class to discover how to construct a fish. 
2. Notice that there are two `AquaFish` constructors, so there are two different ways to construct a fish. 
3. For this lab, just concentrate on the simpler, one-parameter constructor. 
4. Edit the main method in AquaSimApplication.java to declare and construct three fish variables at the end of the first section. Give your new variables names that convey their purpose. 
5. Using blank lines, separate this sequence of new statements, which together perform a single function, from the existing code around them. 
6. Add a single comment preceding them that describes the purpose of the sequence.

# Task 2 part 3

1. Before you test your modified program, decide whether you expect this modification to change the appearance of the display or not, and, if so, how you expect it to be different. 
2. Then test the program. Was the actual result what you expected or not? 
3. If not, did you have the wrong expectation, or is the behavior of the program wrong?

*Hint: look at the comment above the statement that tells the user interface to show the aquarium. This exercise directed you to construct three fish, but have they been added to the aquarium yet?*

# Task 3 Part 1

1. Research the class documentation for the Aquarium class to discover how to add a fish to an aquarium. 
2. Modify the main method in the `AquaSimApplication` class to add all three of your new fish to the aquarium. 
3. Again, before you test your modified program, decide whether you expect this modification to change the appearance of the display or not, and, if so, how you expect it to be different. 
4. Then test the program. Was the actual result what you expected or not? If not, did you have the wrong expectation, or is the behavior of the program wrong?

# Task 4 Part 1

1. Now it is time to start running the aquarium simulation. 
2. Research the class documentation for the `AquaFish` class to discover how to make a fish move forward. 
3. Add statements to the main method to move your three fish one step forward. (Where should these statements be added?) 
4. After you make the fish move, redisplay the aquarium. (Do you need to read the class documentation for the AquaSimGUI class to know how to do that, or do you have an example in the main method already?) 
5. Make sure there are blank lines that separate this sequence of new statements, which together perform a single function, from the existing code around them. 
6. Make sure that the internal comments reflect the behavior of your code.

# Task 4 Part 2

1. Test your modified program. 
2. Was the behavior as you expected or not? If not, did you have the wrong expectation, or is the behavior of the program wrong? You may occasionally only see two fish (or even one!). 
3. This can happen when a larger fish overlaps and hides a smaller fish. Run your program a number of times to verify that you usually see three fish.

# Task 5 If Statements part 1

1. In your previous testing of the program you may or may not have noticed that fish swim only to the right and get stuck at the right wall. 
2. To verify the problem, make a copy of the statement that sets the dimensions of the aquarium. (Stop and Think: where is the statement that sets the dimensions of the aquarium? In what class, and what method?) 
3. "Comment out" the original, and change the dimensions in the copy to be 100 x 200. Copy the code that moves and redisplays the fish to let them move a second time. Now run the program several times and make sure you see the problem.

# Task 5 Part 2

1. Research the AquaFish specification to find out how to determine whether a fish is at a wall and how to make it reverse direction. 
2. Modify the main method to have each fish check whether to change direction whenever it moves forward. (Stop and Think: You could check whether to reverse direction or not and then move forward, or you could move forward first and then check whether to reverse direction. 
3. Does the order matter?  Consider three cases: a) for a fish that was constructed along the left wall, b) for a fish that was constructed in the middle of the aquarium, and c) for a fish that was constructed along the right wall. Now ask yourself again: Does the order matter?)

# Task 6 Part 1

1. Research the AquaFish class documentation to discover how to specify the color of a fish as you create it. 
2. Modify the main method to make your first fish Color.RED and your other two fish Color.BLUE. (Color.RED and Color.BLUE are constant Color values defined in the standard Java Color class. 
3. Notice that the AquaSimApplication class has an import java.awt.Color; statement at the top of the file; this allows you to use the standard Java Color class even though it isn't one of the classes you defined.)
4. Identify in advance what behavior you expect from your program when you test it. Do you know which fish will be which color? Do you know how many fish you should get of each color? Test your program to make sure that your results are what you expect.

# RNG or how to assign grades

One of the standard Java packages, `java.util`, includes a `Random` class that can be used to create what are known as pseudo-random numbers.

`import java.util.Random;`

Then in your code you will get [0,10)

```
Random generator = new Random();

int randNum = generator.nextInt(10);
```

# Task 7 Part 1

1. Edit your `main` method to construct a random number generator right before you construct your three fish.
2. Give your new variable a name that conveys its purpose. (Note: The `AquaSimApplication` class has an `import java.util.Random;` statement at the top of the file; this allows you to use the standard Java Random class even though it isn't one of the classes you defined.)

# Task 7 part 2

1. After you construct your random number generator above the code that constructs your three fish, create a new integer variable that can store the a random number. 
2. Don't actually generate the random numbers yet, though. Give your new variable a name that conveys its purpose. For example, your variable declaration might look like the following line.

`int randNum;`

# Task 7 Part 3

1. Just above the statement that constructs each fish, set your random number variable to a different random number (0 or 1). Then use the variable in an if statement to randomly construct each fish as either `Color.RED` or `Color.BLUE`.
2. Identify in advance what behavior you expect from your program when you test it. Do you know which fish will be which color? Do you know how many fish you should get of each color? Test your program to make sure that your results are what you expect.

# Task 8 Rainbow Fish

Modify your program to create fish with the colors of the rainbow. Each fish should have an equal probability of having one of the following colors: Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, or Color.MAGENTA.

# Task 9 Play Favorites

Modify your program to give your fish different probabilities of being constructed different colors. Construct additional fish to test this modification. 

# Task 10 Part 1.  Loops

1. Modify the main method in the AquaSimApplication class to make your program become a simulation of three fish moving in the aquarium over time. 
2. For this exercise, make your fish move 10 times. 
3. Choose one of the loop control styles above and use it correctly. 
4. Make sure that your loop body includes moving and displaying the fish.
5. Test your modified program.

# Task 11 - Part 1

1. It is possible to create an AquaSimGUI object that prompts the user for the number of times the fish should move (the number of steps for our aquarium simulation)?
2. Read the class documentation for the AquaSimGUI class, to learn how to use its two-parameter constructor. (You may need to read the Constructor Details to discover how to use the second parameter correctly.) 
3. Modify your program to use this constructor, updating the internal documentation as appropriate, and test your program.

# Task 11 - Part 2 (Think)

1. Before you test your modified program, think clearly about what you think the modified behavior will be. Then test it. 
2. Does your program work as you expected? Why or why not? 
3. If it does not, does the difference reflect an error in your program or an error in your expectations?

# Task 11 - Part 4 (Thnk)

1. Where's the earliest point in your program that it would make sense to ask for the number of simulation steps? 
2. Where's the latest point?
3. Test your modified program. As always, identify your expected results before testing.

# Task 12 - Part 1 (Exercise)

1. Review your use of the Random class to determine how to calculate a one in four chance of changing direction for any given fish. 
2. Modify the Aquarium Simulation program so that each fish changes direction  
  a. if it is up against a wall  
  b. or if it "chooses" to do so (it has a one in four chance of "choosing" to change direction).

# Task 12 - Part 2 (Think)

1. Where should you add your complex expression?
2. Do you need to construct a new Random generator object for this exercise, or is there a generator object that is accessible to you already?
3. Should you use an AND (&&) or an OR (||) operator in your complex condition?
4. Does it matter which expression comes first in your complex condition?
5. Test your modified program.
