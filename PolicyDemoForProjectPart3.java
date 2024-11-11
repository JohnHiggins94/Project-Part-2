import java.util.Scanner; 

public class PolicyDemoForProjectPart3 { 
   public static void main(String[] args) { 
   
      Scanner scan = new Scanner(System.in); 
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
      System.out.println("Enter Hegiht in Inches: "); 
      double height = scan.nextDouble(); 
      System.out.println("Enter Weight in Pounds: "); 
      double weight = scan.nextDouble(); 
      
      PolicyHolder policyHolderObject1 = new PolicyHolder(pNum, proName, firstN, lastN, howOld, smokeStatus, heightInInches, weightInPounds); 
      Policy policyObject1 = new Policy(pNum, proName, firstN, lastN, howOld, smokeStatus, heightInInches, weightInPounds); 
      
      System.out.println(policyHolderObject1.toString()); 
      
      System.out.println(policyObject1.toString()); 
   } 
}
      
