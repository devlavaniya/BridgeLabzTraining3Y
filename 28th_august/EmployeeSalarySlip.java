package BridgeLabzTraining3Y.28th_august;

public class EmployeeSalarySlip {
    public static void main(String[] args) {
        String[] names = {"Amit", "Neha", "Raj", "Priya"};
        int[] basicSalary = {40000, 55000, 30000, 70000};

        System.out.println(" Employee Salary Slips ");

        for(int i=0 ; i<names.length ; i++){
            String name = names[i];
            int basic = basicSalary[i];

            double hra = basic * 0.20;
            double da = basic * 0.10;
            double total = basic + hra + da;

            // Apply tax if salary > 50,000
            double tax = 0;
            if(total>50000){
                tax=total*0.10;
            }
            
            double netSalary = total - tax;

       
            System.out.println("\n Salary Slip ---");
            System.out.println("Employee Name : " + name);
            System.out.println("Basic Salary  : " + basic);
            System.out.println("HRA (20%)     : " + hra);
            System.out.println("DA (10%)      : " + da);
            System.out.println("total Salary  : " + total);
            System.out.println("Tax Deduction : " + tax);
            System.out.println("Net Salary    : " + netSalary);

        }
    }
    
}

