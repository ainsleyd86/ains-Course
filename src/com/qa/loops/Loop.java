/*
package com.qa.loops;

public class Loop {

    public static void main(String[] args) {

//loops) allow us to repeat a block of code until a
// specified condition is met.
//Each loop will check for a condition and as soon as
// that condition is broken, the code will stop
// running that loop. There are three main loop types
// in Java:

//while()-loop - use w/BOOL like IF statement that dont
//stop executing until the condition is no longer met.

//do()-while()-loop -

//for()-loop
       */
/*WHILE loop example ----
        int notEnoughMoney = 1;
        boolean justEnoughMoney = true;

        while(justEnoughMoney) {
            System.out.println("More P's");

            notEnoughMoney++;

            if(notEnoughMoney > ) {
                justEnoughMoney = false;
            }
        }

        System.out.println("lets get those creps");
    }
}*//*


       */
/* do while loop example
    int playCount = 0;
    boolean playing = true;


            do {
                System.out.println("Playing");
                playCount++;

                if(playCount > 10) {
                    playing = false;

//In the main method we a running a do()-while()-loop
// that prints "Playing", then adds 1 to the variable playCount,
// then runs the conditional checking if playCount is
// greater than 10.
//If playCount is greater than 10, then we go into the
// if()-statement and set playing to false.

//DO always runs once

                }
            } while(playing);

            System.out.println("Game Over!");
        }
    }*//*


  */
/*  FOR LOOP most common - will use 90% of the time
*In the  example we have three statements
within the for()-loop.

*The first one - int i = 0; -
is initialising the counter for the
iteration as an integer with the name i and the value 0.

*Best practice for the name of your counter variable
is to use i.

*The second statement i < 10; is our condition, and
tells Java to run the code within the for()-loop
until i is greater than or equal to 10.

*The third statement i++ is simply telling Java to
increment our counter, in this case i, by 1 after it
executes the last line of code within our for loop.

*so this example we end up printing "Hello There" 10x
*//*


        //       for(int i = 0; i < 10; i++) {
        //         System.out.println("Hello There!");

 */
/*   Transfer and Control Statements
We can manipulate the flow of code through a number of keywords:

Break: Break statements break out of the current code block,
in loops this means that Java will skip the rest of the loop and move
onto executing the rest of the code.

Continue: Continue statements break out of the current iteration of a code
block, in loops this means that Java will skip the current iteration of
the code block and move onto the next.

Return: Return statements are used in methods to return values according to
the methods return type, ending the method.


    for(int i = 0; i < 26; i++) {
            if(i == 2) {
                continue;
            }
            if(i == 12) {
                continue;
            }
            if(i == 22) {
                continue;
            }
            if(i > 25) {
                break;
            }
            System.out.println(i);
        }*//*

*/
/*int i;
        for (i = 0; i < 30; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 12) {
                continue;
            }
            if (i == 22) {
                continue;
            }
            if (i > 25) {
                break;
//break stops loop
            }
            System.out.println(i);

// numbers 2, 12 and 25 won't show in this loop

        }
    }
}*//*


// ++ increment by 1
// -- reduces count by 1
// += add x each time
        //+2 increment by 2 each time
*/
