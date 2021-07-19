/*********************************************************************************************************************************************************************
  **************************************************************** Check Employee is Present or Absent ***************************************************************
  *
  * @author : Immanuvel Jeeva
  * @Since  : 19-07-2021
  *
  *******************************************************************************************************************************************************************/
public class Uc1 {

    // Declaration Part
    private static final int PRESENT = 1;

    public static void main(String[] args) {

        // Generating Random number 0 or 1
        int Num = (int) Math.floor((Math.random() *10 ) % 2);
        if ( Num == PRESENT )  {  // Check Condition
            System.out.println("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");
    }
}



