/**********************************************************************************************************************************************************************
  *
  * Ability to manage Employee Wage of multiple companies 
  * Note: Refactor to have one EmpWageBuilder to manage for Wage for multiple Company
  * Create CompanyEmpWage class and let EmpWageBuilder has array of many CompanyEmpWage Object
  *
  * @author : Immanuvel Jeeva
  * @Since  : 19-07-2021
  *
  *********************************************************************************************************************************************************************/
class EmployeeWageComputation {
    public static void main(String args[]) {
        
        WageCalculation wageCalculateJio = new WageCalculation();
        
        int calculatedTotalWorkingHoursJio = wageCalculateJio.calculateWorkinghours(20,  100);
        //Calculation of the total wages of the employee working in Jio
        wageCalculateJio.totalEmpWage("Jio", calculatedTotalWorkingHoursJio, 30);

      
        WageCalculation Zoho = new WageCalculation();
      
        int calculatedTotalWorkingHoursZoho = wageCalculateZoho.calculateWorkinghours(30,  150);
        //Calculation of the total wages of the employee working in Reliance Retails
        wageCalculateZoho.totalEmpWage("Zoho", calculatedTotalWorkingHoursZoho, 20);
    }
}