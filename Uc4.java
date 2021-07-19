/*********************************************************************************************************************************************************************
  ****************************************************** Calculating EmpWage Using Switch case statement *************************************************************
  *
  * @author : Immanuvel Jeeva
  * @Since  : 19-07-2021
  *
  *******************************************************************************************************************************************************************/

public class Uc4 {

	// Declaration Part
	private static final int min=0;
	private static final int max=2;
	private static final int WagePerHour=20;
	private static final int FullTimeHour=8;
	private static final int PartTimeHour=4;

 	public static void main(String[] args)  {

  		int num=(int)(Math.random()*(max-min+1)+min);
  		System.out.println("Number = "+num);
  		switch (num) {
			case 0:     // 0 -> Employee Absent
   				System.out.println("Employee is Absent");
				break;

			case 1:     // 1 -> Employee FullTime Present
				System.out.println("Employee is FullTimePresent");
  				int sum=FullTimeHour*WagePerHour;
				System.out.println("Employee Wage = "+sum);
				break;

 			case 2:     // 2 -> Employee PartTime Present
				System.out.println("Employee is PartTimePresent");
				int sum1=PartTimeHour*WagePerHour;
 				System.out.println("Employee Wage = "+sum1);
				break;

			default:
 				System.out.println("Some Thing Went Wrong");
  		}
 	}
}
