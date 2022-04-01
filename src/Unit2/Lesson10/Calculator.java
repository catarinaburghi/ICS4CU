package Unit2.Lesson10;

public class Calculator {
    public int Average(int mark1, int mark2, int mark3, int mark4, int average){

        average=mark1+mark2+mark3+mark4;
		average=average/4;		

		average=average*100;
		average=Math.round(average);
        average=average/100;

        return average;
		
    }
}
