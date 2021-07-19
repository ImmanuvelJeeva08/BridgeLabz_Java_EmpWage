/**********************************************************************************************************************************************************************
  **************************************************** Calculate Empwages for assume 100 hours and 20 days ************************************************************
  ********************************************************** Using class methods and class variables ******************************************************************
  ******************************************************* Compute Employee Wage for Multiple Companies ****************************************************************
  *
  * @author : Immanuvel Jeeva
  * @Since  : 19-07-2021
  *
  *********************************************************************************************************************************************************************/


public class Uc8 {

	// Initialize class variables 
	static int FULL_TIME=0;
	static int PART_TIME=1;
	
	// Initialize class Method calculWageMonth
	static void calculWageMonth (String company,int WagePerHour,int Max_Working_Days,int Max_Hours) {

		int EmpHours=0;
		int TotalWorkingHours=0;
		int TotalWorkingDays=0;

		while (TotalWorkingHours  <= Max_Hours && TotalWorkingDays < Max_Working_Days) {

			TotalWorkingDays++;
  			int num = (int) Math.floor((Math.random() *10 ) % 2);
  			System.out.println(num);
  			if(num == FULL_TIME) {

				EmpHours=8;
  			}
  			else if(num == PART_TIME) {

				EmpHours=4;
  			}
  			else {
        			System.out.println("Went Wrong");
			}
		
  			TotalWorkingHours += EmpHours;
  			System.out.println("TotalWorkingHours = "+TotalWorkingHours);
		
		}
		int TotalEmpWage=TotalWorkingHours*WagePerHour;
		System.out.println("Company Name : "+company);
	
                System.out.println("TotalEmpWage = "+TotalEmpWage);			
 	}

 	public static void main(String[] args) {

		// Compute EmployeeWage for Multiple companies				
  		calculWageMonth("Infosis" , 20, 25, 100);
		calculWageMonth("Zoho" , 30, 27, 120);
		
  	}
}


