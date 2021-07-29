package EmpWagePb;

class WageCalculation {
    public static final int ABSENT = 0;
    public static final int FULLTIME = 1;
    public static final int PARTTIME = 2;

    public int calculateWorkinghours(int no_of_days, int hours_in_month) {
        int empHour = 0;
        int totalWorkingHours = 0;
        for(int i=1;i<=no_of_days;i++) {
            int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;
            switch (empCheck) {
                case ABSENT:
                    empHour = 0;
                    break;
                case FULLTIME:
                    empHour = 8;
                    break;
                case PARTTIME:
                    empHour = 4;
                    break;
            }
            totalWorkingHours += empHour;
            if(totalWorkingHours >= hours_in_month)
                break;
        }
        //System.out.println(totalWorkingHours);
        return totalWorkingHours;
    }
    public void totalEmpWage(String companyName, int totalWorkingHours,  int empWagePerHour) {
        int totalEmpWage = (empWagePerHour * totalWorkingHours);
        System.out.println("Wages per month of the employee working in " + companyName + " is : Rs." +totalEmpWage);
    }
}

