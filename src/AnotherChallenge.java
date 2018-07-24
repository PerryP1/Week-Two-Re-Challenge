import java.util.Scanner;
import java.util.Random;

public class AnotherChallenge {
    public static void main(String[] args) {

        //Scanners gonna scan
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        //The variables may vary
        String response = "";
        String name, category;
        double priority;
        double choresDoneTotal = 0;
        boolean isDone;
        int choresDoneCounter = 0;
        int choresIncompleteCounter = 0;
        double lowPriorityTotal = 0;
        double mediumPriorityTotal = 0;
        double highPriorityTotal = 0;

        //Let the loop begin
        while (!response.equals("quit")) {
            System.out.print("Enter the item you have to do:");
            name = keyboard.next();
            System.out.println(name);

            System.out.print("Enter the category of this item:");
            category = keyboard.next();
            System.out.println(category);

            //Have to add a +1 to bound to get rid of 0.
            priority = rand.nextInt(3) + 1;
            System.out.println("Priority: " + priority);

            System.out.print("Is Chore done, enter true or false:");
            isDone = keyboard.nextBoolean();
            System.out.println("Chores Done: " + isDone);

            //This is counting trues and falses
            if (isDone == true) {
                choresDoneCounter = choresDoneCounter + 1;
            } else if (isDone == false) {
                choresIncompleteCounter = choresIncompleteCounter + 1;
            }

            //This subtitutes 1's & 2's for trues & falses, and adds some 3's
            if (priority == 1) {
                lowPriorityTotal = lowPriorityTotal + 1;
            } else if (priority == 2) {
                mediumPriorityTotal = mediumPriorityTotal + 1;
            } else if (priority == 3) {
                highPriorityTotal = highPriorityTotal + 1;
            }

            // conditions to check if the chore isDone or is it NOT done
            // if it is done then increment the choresDoneTotal by 1

            choresDoneTotal = (choresDoneTotal + 1);
            System.out.println("choreTotal: " + choresDoneTotal);

            //"Quit" stops the loopyness
            System.out.print("Do you have another item? Press yes or quit to exit.");
            response = keyboard.next();

        }

        //Some printouts
        System.out.println("========================================");

        System.out.println("The total # of Low-level chores is: " + lowPriorityTotal);

        System.out.println("The total # of Medium-level chores is: " + mediumPriorityTotal);

        System.out.println("The total # of High-level chores is: " + highPriorityTotal);

        System.out.println("The total # of chores is: " + choresDoneTotal);

        System.out.println("The total # of chores done is: " + choresDoneCounter);

        System.out.println("The total # of chores incomplete is: " + choresIncompleteCounter);

        System.out.println("Have a nice day!");

    }

    static void print (String print) {
        System.out.println(print);
    }
}

  