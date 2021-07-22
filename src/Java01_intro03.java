import java.util.*;

public class Java01_intro03 {
}


// JAVA IF... Else
  /* Java conditions and If statements
     you use the usual logical mathimatical conditions to perform different actions for different decisions.

    Java has the following conditional statements:

      -use 'if'         to specify a block of code to be executed if a condition is 'true'
      -use 'else'       to specify block of code to be executed if condition is 'false'
      -use 'else if'    to specify a new condition to test if the first condition is 'false'
      -use 'switch'     to specify alternative blocks of code to be executed

 // 'if' statement
    if (20 > 18) {
        System.out.println("20 is greater than 18")
        }       // will print out the text above because the 'if' statement is 'true'

 // 'if' testing variables

    int x = 20;
    int y = 18;
    if (x > y) {
        System.out.println("x is greater than y");
        }  // will print out the above because the 'if' statement is 'true'

 // 'else' statement
        int time = 20;
          if (time < 18) {
          System.out.println("Good day.");
          } else {
             System.out.println("Good evening.");
             }   // this will output "Good evening." because the variable time is greater than 18

 // 'else if' statement
           int time = 22;
            if (time < 10) {
            System.out.println("Good morning.");
         } else if (time < 20) {
         System.out.println("Good day.");
         } else {
         System.out.println("Good evening.");
         }  // will output "Good evening." because the variable time is greater than 10 or 20

 // Ternary Operator -- shorthand 'if... else' statement - it consists of 3 operands
       instead of writing:

        int time = 20;
          if (time < 18) {
            System.out.println("Good day.");
            } else {
            System.out.println("Good evening.");
          }

     we can write the Ternary Operator:

       int time = 20;
       String result = (time < 18) ? "Good day." : "Good evening.";
       System.out.println(result);


 */


// JAVA 'switch' Statement

    /* use 'switch' state to select one of many code blocks to be executed
            1. the 'switch' expression is evaluated once
            2. the value of the expression is compared with the value of each 'case'
            3. if there is a match the associated block of code is executed
            4. the 'break' and 'default' keywords are optional

  // Days of the week example

            int day = 4;
                switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                 case 2:
                    System.out.println("Tuesday");
                    break;
                  case 3:
                    System.out.println("Wednesday");
                    break;
                   case 4:
                    System.out.println("Thursday");
                    break;  // this 'switch' statement will print "Thursday" and break out of the 'switch block'

     */

// BREAK -- will stop the execution of code and 'case testing' inside the 'switch block'. it saves execution time
        // because it ignores executing the rest of the code in the switch block

// DEFAULT -- specifies a piece of code if there is NO 'case' match
        // 'default' statement is the last statement of the 'switch block'



// LOOPS -- Java Loops

    // WHILE 'while' loop - loops through as long as the condition is 'true'

            /* int i = 0;
                while (i < 5) {
                System.out.println(i);
                i++;
                }    // be certain to increase the variable otherwise the loop will be recursive
             */

    // DO / WHILE 'do/while' loop - the loop executes the code block once before checking to see if the
                    // condition is 'true'. it will repeat the loop as long as the condition is 'true'

            /*  int i = 0;
                do {
                System.out.println(i);
                i++
                }
                while (i < 5);   // will always execute at least 1 time even if the condition is 'false' because the
                                        code block is executed before the condition is tested

             */

  // FOR 'for' Loop -- when you know how many times to loop through the code then use the 'for' loop
        /* 1- statement 1 is executed one time before the execution of the code block
           2- defines condition for executing code block
           3- executed every time after the code block has been executed
         */

    /*  for (int i=0; i < 5; i++) {
         System.out.println(i);  // will print the numbers 0-4
     */
       /*in above code:
           1-  the variable is set before the loop starts (int i=0)
           2-  the condition is defined for the loop to run (i < 5) if the condition is 'true' the loop will start again
            if false the loop will end
           3-  the third statement increases the value (i++) each time the code block loop is executed
        */

 // FOR LOOP (ex 2)
        /*  for (int i = 0; i <= 10; i = i + 2) {
                System.out.println(i);
                }  // this will print out even values from 0-10
         */


// FOR-EACH 'for-each' loop is used to loop through an ARRAY:

    /*   String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (String i : cars) {
            System.out.println(i);
            }
     */


// BREAK and CONTINUE  -- 'break' stops a loop and jumps out of the code block once a condition is met
//                         'continue' breaks 1 iteration of the loop if a condition is met and then 'continues' with
//                                      the next iteration

// JAVA ARRAYS - used to store multiple values in a single variable

  /* declare with [] square brackets
      ex:  String[] cars;
   */

// ARRAY Literal - insert values using comma-seperated list {inside curly braces}
 /*
  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
     or for integers:
  int[] myNum = [10, 20, 30, 40};
  */

// ACCESS ELEMENTS of ARRAY -- using the index #
    /*
    String[] cars = {"Volvo", "BMW", "Mazda", "Ford"};
       System.out.println(cars[0]);   // will output "Volvo"
     */

    /* changing the VALUE of an Array Element using the index:

    cars[0] = "Toyota";
    System.out.println(cars[0]); // now outputs "Toyota"
     */

// ARRAY Length '.length' -- use '.length' property
    /*
    String[] cars = {"Volvo", "BMW", "Mazda", "Ford"};
    System.out.println(cars.length); // outputs 4
     */

// LOOP Through an ARRAY -- use a 'for' loop & '.length' property to specify how long it should run
    /*
    String[] cars = {"Volvo", "BMW", "Mazda", "Ford"};
    for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
        }
     */

// LOOP using FOR-EACH loop 'for-each' -- used to loop through elements of an Array
    /*
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
        System.out.println(i);
        } // for each String element 'i' (the array index) in cars, print the value of 'i'
     */

// MULTIDIMENSIONAL ARRAYS
    /* an ARRAY with 1 or more ARRAYS
      ex: of Two Dimensional Array:
            int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
            int x = myNumbers[1][2];
            System.out.println(x);  // outputs 7  (first points to array 1, second points to index 2)

   /* using a 'for loop' inside another 'for-loop' to get elements of a 2-d array

     */


     */











