import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.text.DecimalFormat;


public class WeekTwoRechallenge {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        NumberFormat percent = NumberFormat.getPercentInstance();
/*
        int customerid;
        String itemName, taxcode;
        double amount, tax = 0.00, total, subtotal;
        String itemName01, itemName02, header1, header2;
        double itemPrice01, itemPrice02, answer;
        int itemQuantity01, itemQuantity02;
        int totalQuantity1;
        double cost1, cost2, totalCost1;*/


        String response = "yes";
        int quantitiy = 0;
        double price, subcost;
        String foodname;
        double subtotal = 0;

        while (!response.equals("quit")) {
            System.out.print("Enter food item");
            foodname = keyboard.next();
            System.out.println(foodname);

            System.out.print("What is your food price? ");
            price = keyboard.nextDouble();
            System.out.println(price);

            System.out.print("Enter food quantitiy? ");
            quantitiy = keyboard.nextInt();
            System.out.println(quantitiy);

            subcost = (price * quantitiy);
            subtotal = subtotal + subcost;
            System.out.println("subcost : " + subcost);
            System.out.println("subtotal : " + subtotal);

            System.out.print("Do you have another item to enter, or type quit?");
            response = keyboard.next();
        }
        double salestax = subtotal * .06;
        System.out.println("salestax $ " + salestax);

        double total = subtotal + salestax;
        System.out.println("total $ " + total);


/*
        System.out.print("Greetings. What is your first food item 1? ");
        itemName01 = keyboard.nextLine();

        // Require the scanner to accept "int" or numerical values
        System.out.print("How much is item 1?");
        itemName01 = keyboard.nextDouble();

        System.out.print("How many of item 1?");
        itemName01 = keyboard.nextInt();

        System.out.println("Enter State Tax code:");
        taxcode = keyboard.next();

        cost1 = (itemPrice01 * itemQuantity01);
        System.out.println("Cost1 : " + (itemPrice01 * itemQuantity01));

        System.out.println("What is item 2?");
        itemName02 = keyboard.next();

        System.out.print("How much is item 2?");
        itemPrice02 = keyboard.nextDouble();

        System.out.print("How many of item 2?");
        itemQuantity02 = keyboard.nextInt();

        System.out.println("Enter State Tax code:");
        taxcode = keyboard.next();

        cost2 = (itemPrice02 * itemQuantity02);
        System.out.println("Cost2 : " + (itemPrice02 * itemQuantity02));

        totalQuantity1 = (itemQuantity01 + itemQuantity02);
        System.out.println("Total Quantity : " + (itemQuantity01 + itemQuantity02));

        totalCost1 = (itemPrice01 * itemQuantity01) + (itemPrice02 * itemQuantity02);
        System.out.println("Total Cost : " + (totalCost1));


        System.out.println("Item Name   Price   Quantity    Cost");
        System.out.println(itemName01 + "\t" + itemPrice01 + "\t" + itemQuantity01 + "\t" + cost1);
        System.out.println(itemName02 + "\t" + itemPrice02 + "\t" + itemQuantity02 + "\t" + cost2);
        System.out.println("_____________________________________");
        System.out.println("" + "\t" + totalQuantity1 + "\t" + totalCost1 + "\t");

*/
/*
        switch (taxcode.toUpperCase()) {
            case "DC":
                tax = 0.0575;
                break;

            case "MD":
                tax = 0.06;
                break;

            case "VA":
                tax = 0.053;
                break;

            case "Other":
                tax = 0.05;
                break;

        }*/
//// use %.2f/n to round two digits?
        /*subtotal = amount * tax;
        total = amount + subtotal;
*/
        //Print out receipt

/*
        System.out.println("Item Name:" + itemName);
        System.out.println("Sales Amount:" + amount);
        System.out.println("Tax Code:" + taxcode.toUpperCase());
        System.out.println("Total Amount Due: $" + total);*/
    }
}





/*import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class ComplexInvoiceApp {

    public static void main(String[] args) {

        // Declare and initialize a scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Declare and initialize a random number generator for the tax code
        Random rand = new Random();

        // Generate a tax code from 0-3
        int taxCode = rand.nextInt(4);
        outputLine("My current tax code is: " + taxCode);

        // Declare a variable to hold the tax rate
        double taxRate = 0.0;

        // This is the condition to assign a tax rate depending on the random
        // number generator code for 0-3
        if (taxCode == 1) {
            taxRate = 0.06;
        }
        else if (taxCode == 2) {
            taxRate = 0.053;
        }
        else if (taxCode == 3) {
            taxRate = 0.0575;
        }
        else {
            taxRate = 0.05;
        }

        // Delcare and initialize computation variables
        String result = "";
        double subTotal = 0.0;
        double taxableTotal = 0.0;

        outputLine("================================================");
        outputLine("Welcome to the Behind-The-Door Break Room Cafe!");

        String userInput="";

        while(!userInput.equalsIgnoreCase("quit")) {
            output("Enter a food item you want: ");
            String foodName = sc.next();

            output("Price: ");
            double foodPrice = sc.nextDouble();

            output("Taxable? True or False: ");
            boolean taxable = sc.nextBoolean();

            output("Quantity: ");
            int foodQuantity = sc.nextInt();

            // Use a string formatter to get 2 decimal places of each food price
            String formatPrice = String.format("%.02f", foodPrice);

            // Build the string to hold all the entries
            result += foodName + "\t\t" + foodQuantity + "\t\t\t$" + formatPrice + "\t\t" + taxable + "\n";

            // Add the item cost's in subtotal
            subTotal += (foodPrice * foodQuantity);

            // Check if the taxable field is true to add to the taxableTotal
            if (taxable == true) {
                taxableTotal += (foodPrice * foodQuantity);
            }

            output("Do you want to add another item? (Type 'quit' to exit): ");
            userInput = sc.next();
        }

        // Calculate the sales tax for ONLY taxable items
        double salesTax = taxableTotal*taxRate;
        // Calculate the total amount (sales tax + sub total)
        double totalAmount = salesTax + subTotal;

        // Series of string formats to ensure everything stays within 2 decimal places
        String formatSubTotal = String.format("%.02f", subTotal);
        String formatSalesTax = String.format("%.02f", salesTax);
        String formatTotalAmount = String.format("%.02f", totalAmount);

        // Format the tax rate to a readable percentage
        NumberFormat percent = NumberFormat.getPercentInstance();
        String formatTaxRate = percent.format(taxRate);

        outputLine("================================================");
        outputLine("Item Name" + "\t\t" + "Quantity" + "\t" + "Price" + "\t\t" + "Taxable");
        outputLine(result);
        outputLine("Sub-Total = $" + formatSubTotal);
        outputLine("Tax Rate = " + formatTaxRate + " (Tax code = " + taxCode + ")");
        outputLine("Sales Tax = $" + formatSalesTax );
        outputLine("________________________________________________");
        outputLine("Total = $" + formatTotalAmount);
    }

    public static void outputLine(String message) {
        System.out.println(message);
    }

    public static void output(String message) {
        System.out.print(message);
    }



}*/