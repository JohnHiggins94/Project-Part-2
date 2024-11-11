import java.util.Scanner; 

public class PolicyDemoForProjectPart3Updated { 
   public static void main(String[] args) { 
      
      Scanner scan = new Scanner(System.in); 
      
      System.out.println("Enter Height in Inches: "); 
      double height = scan.nextDouble(); 
      System.out.println("Enter Weight in Pounds: "); 
      double weight = scan.nextDouble(); 
      scan.nextLine(); //Clear Buffer
      System.out.println("Enter Policy Number: "); 
      String pNum = scan.nextLine();
      System.out.println("Enter Provider Name: "); 
      String proName = scan.nextLine();  
      System.out.println("Enter First Name: "); 
      String firstN = scan.nextLine(); 
      System.out.println("Enter Last Name: "); 
      String lastN = scan.nextLine(); 
      System.out.println("Enter Age: ");
      int age = scan.nextInt(); 
      System.out.println("Do you Smoke? ('Y' or 'N'"); 
      String smokerStatus = scan.nextLine(); 
    
      
      PolicyHolderUpdated2 policyHolderObject1 = new PolicyHolderUpdated2(pNum, proName, firstN, lastN, age, smokerStatus, height, weight); 
      PolicyUpdated2 policyObject1 = new PolicyUpdated2(pNum, proName, firstN, lastN, age, smokerStatus, height, weight); 
      
      
      System.out.println(policyHolderObject1.toString()); 
      
      System.out.println(policyObject1.toString2()); 
   } 
}