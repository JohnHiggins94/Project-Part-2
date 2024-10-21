/**
   The Policy class creates an object to store information relating to an indivudals insurence policy
*/ 


public class Policy { 
   
   private String policyNumber;
   private String providerName; 
   private String fName; 
   private String lName; 
   private int age; 
   private String smokerStatus; 
   private double height; 
   private double weight; 
   final private double BASE_COST = 600; 
   final private double BMI_CALC = 703; 
   
   /* 
      Constructor no-arg
   */ 
   public Policy() { 
      policyNumber = "Null";
      providerName = "Null"; 
      fName = "Null"; 
      lName = "Null";
      age = 0;
      smokerStatus = "Null"; 
      height = 0.0; 
      weight = 0.0; 
   }
   
   /*
      Constructor for all fields 
      @perma pNum The value to be applied to the policyNumber field 
      @perma proName The value to be applied to the providerName field 
      @perma firstN The value to be applied to the fName field 
      @perma lastN The value to be applied to the lName field 
      @perma howOld The value to be applied to the age field 
      @perma smokeStatus The value to be applied to the smokerStatus field 
      @perma heightInInches The value to be applied to the height field 
      @perma eightInPounds The value to be applied to the weight field 
   */ 
   
   public Policy(String pNum, String proName, String firstN, String lastN, int howOld, 
                           String smokeStatus, double heightInInches, double weightInPounds) { 
      
      policyNumber = pNum; 
      providerName = proName; 
      fName = firstN; 
      lName = lastN; 
      age = howOld; 
      smokerStatus = smokeStatus; 
      height = heightInInches;  
      weight = weightInPounds;
   } 
   
   /* 
      The setPolicyNumber sets the policyNumber field
      @perma pNum The policy number 
   */ 
   
   public void setPolicyNumber(String pNum) { 
   
      policyNumber = pNum; 
   } 
   
   /*
      The getPolicyNumber returns the policyNumber field 
      @return The policy number
   */ 
   
   public String getPolicyNumber() { 
      return policyNumber; 
   } 
   
   /* 
      The setProviderName sets the providerName field 
      @perma The name of the insurence provider 
   */ 
   
   public void setProviderName(String proName) {
      providerName = proName; 
   } 
   
   /* 
      The getProviderName method returns the providerName field 
      @return providerName The name of the provider 
   */ 
   
   public String getProviderName() { 
      return providerName; 
   }   
   
   /* 
      The setFirstName method sets the fName field
      @perma firstN The first name of the policy holder
   */ 
   
   public void setFirstName(String firstN) {
      fName = firstN; 
   } 
   
   /*
      The getFirstName method 
      @return The fName field 
   */ 
   
   public String getFirstName() { 
      return fName; 
   }   
   
   /*
      The setLastName field sets the lName field
      @perma lastN The last name of the policy holder 
   */ 
   
   public void setLastName(String lastN) {
     lName = lastN; 
   } 
   
   /*
      The getLastName method
      @return lName The last name of the policy holder 
   */ 
   
   public String getLastName() { 
      return lName; 
   } 
   
   /*
      The setAge method sets the age field 
      @perma howOld The age of the policy holde r
   */ 
   
   public void setAge(int howOld) { 
      age = howOld; 
   } 
   
   /*
      The getAge method 
      @return age The age field 
   */ 
   
   public int getAge() { 
      return age; 
   } 
   
   /*
      The setSmokerStatus method sets the smokerStatus field 
      @perma smokeStatus The string value indicating if the policy holder is a "smoker" or non "non-smoker" 
   */ 
   
   public void setSmokerStatus(String smokeStatus) { 
      smokerStatus = smokeStatus; 
   } 
   
   /*
      The getSmokeStatus method
      @return the field for smokerStatus
   */ 
   
   public String getSmokerStatus() { 
      return smokerStatus; 
   } 
   
   /*
      The setHeight method sets the height field 
      @perma heightInInches The height of the policy holder in inches
   */ 
   
   public void setHeight (double heightInInches) { 
      height = heightInInches; 
   } 
   
   /*
      The getHeight method
      @perma height The value for the height field 
   */ 
   
   public double getHeight() { 
      return height; 
   } 
   
   /*
      The setWeight method 
      @perma wightInPounds The value to be applied to the weight field
   */ 
   public void setWeight(double weightInPounds) { 
      weight = weightInPounds;
   }
   
   /*
      The getWeight method 
      @return The value for the weight field 
   */ 
   
   public double getWeight() { 
      return weight; 
   }    
   
   /*
      The getBMI method calculates the user's Body Mass Index using the weight and height fields 
      @perma weight The weight field 
      @perma height The height filed
      @return The calcualted Body Mass Index 
   */ 
   
   public double getBMI() { 
      return (weight * BMI_CALC) / (height * height); 
   } 
   
   /*
      The calcInsurenceCost method calcualtes the cost of the insurence policy based on 
         a few fields from the object 
   */ 
   
   public double calcInsurenceCost() { 
      double cost = 0.00; 
      double bodyMassIndex = getBMI(); 
      cost += BASE_COST; 
      
      if (age > 50) 
         cost += 75; 
      if (smokerStatus.equalsIgnoreCase("SMOKER"))  
         cost+= 100;     
      if (bodyMassIndex > 35.0) 
         cost+= (bodyMassIndex - 35.0) * 20.0; 
      return cost; 
   }  
} 
  
         
         
   
      
   
   
     
     

   