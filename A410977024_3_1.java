
import java.util.Scanner;

public class A410977024_3_1 {
		public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		      int a=0;
		      int b=0;
			while (true) {
		       a = input.nextInt();//input two numbers
			   b  =input.nextInt();
			   int quotient = 0;  int carrynum = 0;// declare two Global variables
		    if (a == 0 && b== 0) {
					break;  // as the sample input(4),if a=b=0,break
				}
			while (a != 0 || b != 0) { //except a=b=0,execute the program
				   if( (quotient+(a% 10)+(b%10))>=10){//use the remainder added to calculate
                       carrynum+=1;
                       quotient=1;//save the carrynumber1 to add on other digits 
                       // when the numbers added up would be a higher digit number
                       // such as(78+29)=107(two operations)
				   }
				  
                   else{
                	   quotient  = 0;
                   }
				 a = a/10;// get new remainder after once calculated
				 b = b/10;
				}
			if (carrynum == 0) {
					System.out.println("No carry operation.");}
			else if(carrynum == 1){
				System.out.println(carrynum + " carry operation.");}
			//one number calls operation
			
			else {
					System.out.println(carrynum + " carry operations.");}
			}
		}
	}


