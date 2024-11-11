/**
*/ 

public class PolicyHolderUpdated2 { 
   
      private String policyNum;
      private String provName; 
      private String firstName; 
      private String lastName; 
      private int ageNum; 
      private String smokeStatuss; 
      private double h; //height
      private double w; //weight
      private static int objectCount = 0;
      
      
   public PolicyHolderUpdated2() { 
      policyNum = "Null";
      provName = "Null"; 
      firstName = "Null"; 
      lastName = "Null";
      ageNum = 0;
      smokeStatuss = "Null"; 
      h = 0.0; 
      w = 0.0; 
      objectCount++; 
   } 
   
    /*
      Constructor for all fields to be add
      @perma pNum The value to be applied to the policyNumber field 
      @perma proName The value to be applied to the providerName field 
      @perma firstN The value to be applied to the fName field 
      @perma lastN The value to be applied to the lName field 
      @perma howOld The value to be applied to the age field 
      @perma smokeStatus The value to be applied to the smokerStatus field 
      @perma heightInInches The value to be applied to the height field 
      @perma eightInPounds The value to be applied to the weight field 
   */ 
   
   public PolicyHolderUpdated2(String pNum, String proName, String firstN, String lastN, int howOld, 
                           String smokeStatus, double heightInInches, double weightInPounds) { 
      
      policyNum = pNum; 
      provName = proName; 
      firstName = firstN; 
      lastName = lastN; 
      ageNum = howOld; 
      smokeStatuss = smokeStatus; 
      h = heightInInches;  
      w = weightInPounds;
      objectCount++; 
   } 
   
   /* 
      The setPolicyNumber sets the policyNumber field
      @perma pNum The policy number 
   */ 
   
   public void setPolicyNum(String pNum) { 
   
      policyNum = pNum; 
   } 
   
   /*
      The getPolicyNumber returns the policyNumber field 
      @return The policy number
   */ 
   
   public String getPolicyNum() { 
      return policyNum; 
   } 
   
   /* 
      The setProviderName sets the providerName field 
      @perma The name of the insurence provider 
   */ 
   
   public void setProvName(String proName) {
      provName = proName; 
   } 
   
   /* 
      The getProviderName method returns the providerName field 
      @return providerName The name of the provider 
   */ 
   
   public String getProvName() { 
      return provName; 
   }   
   
   /* 
      The setFirstName method sets the fName field
      @perma firstN The first name of the policy holder
   */ 
   
   public void setFName(String firstN) {
      firstName = firstN; 
   } 
   
   /*
      The getFirstName method 
      @return The fName field 
   */ 
   
   public String getFName() { 
      return firstName; 
   }   
   
   /*
      The setLastName field sets the lName field
      @perma lastN The last name of the policy holder 
   */ 
   
   public void setLName(String lastN) {
     lastName = lastN; 
   } 
   
   /*
      The getLastName method
      @return lName The last name of the policy holder 
   */ 
   
   public String getLName() { 
      return lastName; 
   } 
   
   /*
      The setAge method sets the age field 
      @perma howOld The age of the policy holde r
   */ 
   
   public void setAgeNum(int howOld) { 
      ageNum = howOld; 
   } 
   
   /*
      The getAge method 
      @return age The age field 
   */ 
   
   public int getAgeNum() { 
      return ageNum; 
   } 
   
   /*
      The setSmokerStatus method sets the smokerStatus field 
      @perma smokeStatus The string value indicating if the policy holder is a "smoker" or non "non-smoker" 
   */ 
   
   public void setSmokeStatus(String smokerStatus) { 
      smokeStatuss = smokerStatus; 
   } 
   
   /*
      The getSmokeStatus method
      @return the field for smokerStatus
   */ 
   
   public String getSmokeStatus() { 
      return smokeStatuss; 
   } 
   
   /*
      The setHeight method sets the height field 
      @perma heightInInches The height of the policy holder in inches
   */ 
   
   public void setH (double heightInInches) { 
      h = heightInInches; 
   } 
   
   /*
      The getHeight method
      @perma height The value for the height field 
   */ 
   
   public double getH() { 
      return h; 
   } 
   
   /*
      The setWeight method 
      @perma wightInPounds The value to be applied to the weight field
   */ 
   public void setW(double weightInPounds) { 
      w = weightInPounds;
   }
   
   /*
      The getWeight method 
      @return The value for the weight field 
   */ 
   
   public double getW() { 
      return w; 
   }    
   
   /*
   */ 
   
   public static int getObjectCount() { 
      return objectCount; 
   } 
   
   /*
      toString method
   */ 
  
   public String toString() {
      return "\nProvider name: " + policyNum + 
           "\nFirst Name: " + provName + 
           "\nLast Name: " + lastName + 
           "\nAge: " + ageNum + 
           "\nSmoker Status: " + smokeStatuss + 
           "\nHeight: " + h + 
           "\nWeight: " + w;
   }
}
   
   
      
   

                