package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        
        // calc tip and bill
        double tip = (cost * ((double)percent/100));
        double x = tip ;
        // tip = Math.round(x * 100.0) / 100.0; // I got the rounding from here: https://stackoverflow.com/questions/8825209/rounding-decimal-points
        double billTip = cost + tip;  
        
        // calc person per cost
        double personPerCost = cost / people ;
        double z = personPerCost ;
        
        
        // calc tip per person
        double tipPerPerson = tip/ people ;
        double a = tipPerPerson ;
        // tipPerPerson = Math.round(a * 100.0) / 100.0; 

        // calc total cost per person 
        double totalPerPerson = billTip / people ;
        double b = totalPerPerson ;
        
        tip = Math.round(x * 100.0) / 100.0;
        totalPerPerson = Math.round(b*100.0)/100.0;
        // tip = Math.round(x * 100.0) / 100.0 ; 
        tipPerPerson = Math.round(a * 100.0) / 100.0; 
        personPerCost = Math.round(z * 100.0) / 100.0; 
        billTip = Math.round(billTip* 100.0) / 100.0;
        

                       
        // outputs 
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + tip + "\n");
        result.append("Total Bill with tip: $" +  billTip + "\n");
        result.append("Per person cost before tip: $" + personPerCost + "\n");
        result.append("Tip per person: $" + tipPerPerson + "\n");
        result.append("Total cost per person: $" +  totalPerPerson + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
