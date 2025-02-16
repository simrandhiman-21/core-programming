import java.util.*;
public class bonusofEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int employe=3;
        double[] salary=new double[employe];
        double[] bonus=new double[employe];
        double[] years=new double[employe];
        double[] newsalary=new double[employe];

        double totalbonus=0;
        double totalNewsalary=0;
        double totalOldsalary=0;


        for(int i=0;i<employe;i++){

            System.out.println("Enter salary for employe ");
            double inputsalary=sc.nextDouble();
            
            if(inputsalary<0)  System.out.println("Enter years of service for employe ");
             
          
            System.out.println("Enter Years of Experience ");
            double inputyears=sc.nextDouble();

            if(inputyears<0) System.out.println("Invalid years of service ! ");
            

            salary[i]=inputsalary;
            years[i]=inputyears;

        }

        
        for(int i=0;i<employe;i++){
            if(years[i]>5){
                bonus[i]=salary[i]*0.05;
            }
            else{
                bonus[i]=salary[i]*0.02;
            }
            newsalary[i]=salary[i]+bonus[i];
            totalbonus+=bonus[i];
            totalOldsalary+=salary[i];
            totalNewsalary+=newsalary[i];
            
        }

        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < employe; i++) {
            System.out.println("Employee " + (i + 1) + " - Old Salary: $" + salary[i] + ", Bonus: $" + bonus[i] + ", New Salary: $" + newsalary[i]);
        }
        
        System.out.println("\nTotal Old Salary: $" + totalOldsalary);
        System.out.println("Total Bonus Payout: $" + totalbonus);
        System.out.println("Total New Salary: $" + totalNewsalary);        
    }
    
}
