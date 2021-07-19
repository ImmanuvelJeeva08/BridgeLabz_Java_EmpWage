/*********************************************************************************************************************************************************************
  ************************************************************** Calculate Employee Wage Per Day *********************************************************************
  *
  * @author : Immanuvel Jeeva
  * @Since  : 19-07-2021
  *
  ********************************************************************************************************************************************************************/
public class Uc2 {

    // Declaration Part
    private static final int WagePerHour=20;
    private static final int FullDayHour=8;

    public static void main(String[] args) {

        int sum=WagePerHour*FullDayHour;
        System.out.println("Employee Wage Per Day = "+sum);
    }
}
