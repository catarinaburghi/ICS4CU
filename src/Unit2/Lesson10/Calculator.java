package Unit2.Lesson10;
/*Catarina Fagundes Burghi
 * Date: April 4th 2022
 * This class is the class for the FrmAverageCalculator.java file
 * This program calculates the average by adding all the numbers together and 
 * divides the result by 4 and returns the average
 */
public class Calculator {

    public int averagecalculate (int mark1, int mark2, int mark3, int mark4){

        // declaring variables
        int Average;

        // doing the calculations
        Average=mark1+mark2+mark3+mark4;
		Average=Average/4;		

		//average=average*100;
		//average=Math.round(average);
        //average=average/100;

        // return statement
        return (Average);
		
    }
}
