# climbing-stickman
Climbing Stickman Project - Introduction to Computer Engineering

1.	PROBLEM DESCRIPTION

We were asked to write a Java program that uses two parameters which are given by arguments to give an output ASCII stickman climbing the stairs. The program should use at least two static methods except for the main method, without printing the lines separately with System.out.print statements and with minimum redundancy and minimum use of for loop statements. In the first place, we should determine the variables that change depending on frames and arguments (stairHeight&stickmanHeight). Then, we needed to determine how much each variable changes in each frame. We also should find some mathematical equations related to the stairHeight, stickmanHeight, frame number and so on. We should write “for loops” for repetitive characters/lines. Besides this, we should create new methods for repetitive ‘for loops’. Each frame should have the same height for specific arguments. The height of the frames should vary according to the arguments relating to stickmanHeight+stairHeight.

2.	PROBLEM SOLUTION

- I used 3 static methods whose names are stickman(), repetitivespaces() and stars() in addition to my main method and 7 for loops (two of my 7 loops are in static methods). Even though I found different ways that have more or less than three methods, I think that the best readable format of the code should have neither more for loops nor more methods. Firstly, I created a main method whose name is stickman. I wrote most of the for loops in this method since I want to create the general picture of the frame in a specific method. In this method, the first thing I did was creating a loop for frame number since some variables change according to the frame number. Actually, I write all my other codes in this for loop, so I was able to get inclusive 'for loop'. In the first loop, I created a new loop for the number of blank lines at the beginning of each output frame. Not only to provide that stickman step up to the next step(highest one) in each frame but also since each frame should have the same total height, which has the relation stickmanHeight + stairHeight, I have to create this ‘for loop’.

![climbing-stickman](https://github.com/bahricanyesil/climbing-stickman/blob/main/screenshots/Case1.7-3.png)

- Then, I noticed that there is an equal number of spaces at the beginning of each line varying by the number of frame and some other things. The number of spaces per line changes regularly according to the formula [3*(frame number -1)] and so on. For this reason, I created a for loop for this repeating situation. In addition to this, because this loop repeats in each line also, I created a new method for this ‘for loop’ whose name is ‘repetitivespaces’. When I need it, I recalled the ‘repetitivespaces method’ in the ‘stickman method’.  

- The aim of writing the last method which has for loop to create the stars in each step is the fact that the number of stars in each step, actually increasing with a constant value(3*sth.). However, since these stars are in different for loops, they had to have different parameters, so I created a new method for the stars that have various parameters such as frame, stickmanHeight and so on. Then, I just recalled this method when I need it with specific parameters. 

- After that, I realized that the torsos of the stickman which don’t have any other thing after them (moving to a new line) are repeating according to a mathematical equation depending on stickmanHeight, frame number and stairHeight. I wrote a new ‘for loop’ for this repetitive situation. Since each line should have ‘repetitivespaces’ method, I added it to this ‘for loop’ also. 

![climbing-stickman](https://github.com/bahricanyesil/climbing-stickman/blob/main/screenshots/Case2.5-2.png)

- The next thing I have to do is creating the torsos which have the steps of the stair after a specific number of blanks (In other words, don’t moving to a new line). Since this method has not only torsos but also floor of the stair and the stars, I wrote the ‘for loop’ whose name is ‘cizgi loop’, recall the other methods also to create the blanks between torsos and print out the stars.  

- After the torsos part of the stickman, I passed to the new line and recall the ‘repetitivespaces method’ again. After that, I wrote System.out.print("/ \\"); statement. I put the next print parts (“___|” and “*”) in the next ‘for loop’. 

- After I wrote the all parts of each frame that contains at least one part of the stickman, I started to think about how I can write the end of the foot line and recent lines that have only some blanks and the steps of the stair (In other words, don’t have any part of the stickman). Then, I decided to create new ‘for loop’ for this part which has its own integer (var) and depends on only frame number. Since this ‘for loop’ is the continuation of the foot line, I started with System.out.print(“___|”) statement and continued with ‘stars method’ to print out the stars between the beginning and the end of the stair. After, I continued with the System.out.println(“|”) statement to pass to the new line and ‘repetitivespaces method’ to leave required blank in that line of code. 

- After all of this, to have 3 empty lines after each frame, I wrote the system.out.println(“\n\n”) statement. In order to decrease the number of for loops (I could also write a fixed ‘for loop’ for this, but it would not be so efficient) and shorten the code, I applied this type of solution.

![climbing-stickman](https://github.com/bahricanyesil/climbing-stickman/blob/main/screenshots/Case3.6-3.png)
