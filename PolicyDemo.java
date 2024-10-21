import java.util.Scanner;

/*
   The PolicyDemo class creates a Polciy Object, parameters passed come from 
   user input 
*/
public class PolicyDemo 
{  //Main method 
   public static void main(String[] args)
   {
      //declare variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      Scanner scan = new Scanner(System.in);
   
      //Inputs 
      System.out.print("Please enter the Policy Number: ");
      policyNumber = scan.nextLine();
            
      System.out.print("Please enter the Provider Name: ");
      providerName = scan.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = scan.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = scan.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = scan.nextInt();
      scan.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = scan.nextLine();
      //Input validation 
      while (!smokingStatus.equalsIgnoreCase("SMOKER") && !smokingStatus.equalsIgnoreCase("NON-SMOKER")) { 
         System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         smokingStatus = scan.nextLine();
      } 
         
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = scan.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = scan.nextDouble();
      
      //Policy object created
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      
      //Inofmration displayed
      System.out.println("Policy Number: " + policy.getPolicyNumber() + "/n");
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokerStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.calcInsurenceCost());
   }
}