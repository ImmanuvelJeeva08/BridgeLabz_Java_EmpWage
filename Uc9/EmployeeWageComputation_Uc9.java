/**********************************************************************************************************************************************************************
  *
  * Ability to save the Total Wage for Each Company - Note: You can Create EmpWageBuilder for each Company
  * Use Instance Variable instead of function parameters
  *
  * @author : Immanuvel Jeeva
  * @Since  : 19-07-2021
  *
  *********************************************************************************************************************************************************************/
package EmpWagePb;

public class EmployeeWageComputation_Uc9 {
        public static void main(String args[]) {
            
            WageCalculation wageCalculateInfosis = new WageCalculation();
          
            int calculatedTotalWorkingHoursInfosis = wageCalculateInfosis.calculateWorkinghours(20,100);
            //Calculation of the total wages of the employee working in DMart
            wageCalculateDMart.totalEmpWage("Infosis",calculatedTotalWorkingHoursInfosis,25);

           
            WageCalculation wageCalculateAccenture = new WageCalculation();
            
            int calculatedTotalWorkingHoursAccenture = wageCalculateAccenture.calculateWorkinghours(25, 150);
            //Calculation of the total wages of the employee working in Reliance Retails
            wageCalculateReliance.totalEmpWage("Accenture",calculatedTotalWorkingHoursAccenture,20);
        }
    }

