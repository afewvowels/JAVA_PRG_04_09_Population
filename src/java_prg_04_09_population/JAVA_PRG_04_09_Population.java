/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_09_population;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * Write a program that will predict the size of a population of organisms. The
 * program should ask for the starting number of organisms, their average
 * daily population increase (as a percentage), and the number of days they will
 * multiply. For example, a population might begin with two organisms, have an
 * average daily increase of 50 percent, and will be allowed to multiply for
 * seven days. The program should use a loop to display the size of the
 * population for each day.
 * 
 * Input Validation: Do not accept a number less than 2 for the starting size
 * of the population. Do not accept a negative number for average daily population
 * increase. Do not accept a number less than 1 for the number of days they
 * will multiply.
 */
public class JAVA_PRG_04_09_Population {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // String to hold user input
        String strUserInput;
        
        // Population size
        float fltPopSize;
        // Population increase percentage
        float fltPercentIncrease;
        
        // Number of days to multiply
        int intDays;
        
        // First do/while for validation gets starting number
        // of organisms
        do {
            strUserInput = JOptionPane.showInputDialog("How many starting"
                    + " individuals are present?");
            fltPopSize = Float.parseFloat(strUserInput);
        } while (fltPopSize < 2.0f || fltPopSize > 1000000.0f);
        
        // Second validation loop gets percent increase population growth
        // and converts from whole number to decimal suitable for use
        // in the final for loop below
        do {
            strUserInput = JOptionPane.showInputDialog("What percentage does"
                    + " the population grow by in whole numbers?");
            fltPercentIncrease = Float.parseFloat(strUserInput);
            // Convert from whole number percent to decimal percent
            fltPercentIncrease = fltPercentIncrease / 100.0f;
        } while(fltPercentIncrease < 0.0f || fltPercentIncrease > 100.0f);
        
        // Finally, get number of days that the population will grow for
        do {
            strUserInput = JOptionPane.showInputDialog("How many days will"
                    + " the population grow for?");
            intDays = Integer.parseInt(strUserInput);
        } while (intDays < 1 || intDays > 1000000);
        
        // Based on number of days population grows for, loop through
        // and perform the following calculation once per day.
        for(int i = 0 ; i < intDays ; i++)
        {
            fltPopSize = fltPopSize + (fltPopSize * fltPercentIncrease);
        }
        
        // Round and format results for output to user
        strUserInput = String.format("After " + intDays + " days your population "
            + "grew to be %.0f individuals.", fltPopSize);
        
        // Output message to user
        JOptionPane.showMessageDialog(null, strUserInput);
        
        // For use with JOptionPane
        System.exit(0);
    }
    
}
