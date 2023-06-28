import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project_Dominic_Camarco {
   Scanner keyboard = new Scanner(System.in);
   
   
   
   
   
   
   public static class InsurancePolicy {
    // Attributes
    private int policyNumber;
    private String providerName;
    

    /**
     * No-arg constructor.
     */
    public InsurancePolicy() {
        this.policyNumber = 0;
        this.providerName = "";
    }

    /**
     * Constructor.
     * @param policyNumber The policy number.
     * @param providerName The name of the insurance provider.
     */
    public InsurancePolicy(int policyNumber, String providerName) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
    }

    // Getters and Setters
    // Getters
    /**
     * @return The policy number.
     */
   public int getPolicyNumber() {
       return policyNumber;
   }
   
   /**
    * @return The provider name.
    */
   public String getProviderName() {
       return providerName;
   }
   
      
   // Setters
   /**
    * @param policyNumber The policy number to set.
    */
   public void setPolicyNumber(int policyNumber) {
       this.policyNumber = policyNumber;
   }
   
   /**
    * @param providerName The provider name to set.
    */
   public void setProviderName(String providerName) {
       this.providerName = providerName;
   }
   
       /**
     * Calculate the price of the policy.
     * @return The calculated price.
     */
    public double calculatePolicyPrice() {
        double baseFee = 600;
        double additionalFee = 0;

        if (this.age > 50)
            additionalFee += 75;

        if (this.smokingStatus.equals("smoker"))
            additionalFee += 100;

        double bmi = this.calculateBMI();

        if (bmi > 35)
            additionalFee += (bmi - 35) * 20;

        return baseFee + additionalFee;
    }
}
   
   public static void main(String[] args) {
      ArrayList<InsurancePolicy> policies = new ArrayList<>();
      
      
      
      try {
         File file = new File("PolicyInformation.txt");
   
         Scanner scanner = new Scanner(file);
         
         System.out.println("Reading data from file...");
         
         //While the file has lines to read
         
         while(scanner.hasNext()) {
   
           int policyNumber = scanner.nextInt();
           if (policyNumber < 0) {
               throw new IllegalArgumentException("Policy number must be greater than 0");
           }
           scanner.nextLine(); // Consume newline left-over
           
           String providerName = scanner.nextLine();
   
           String firstName = scanner.nextLine();
   
           String lastName = scanner.nextLine();
   
           int age = scanner.nextInt();
   
           scanner.nextLine(); // Consume newline left-over
   
           String smokingStatus = scanner.nextLine();
   
           double height = scanner.nextDouble();
   
           double weight = scanner.nextDouble();
   
           // Create Policy object
           InsurancePolicy policy = new InsurancePolicy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
           policies.add(policy);
           
           if (scanner.hasNext()) {
               scanner.nextLine();
           }
        }
           
           int policyCounter = 0;
           int smokerCounter = 0;
   
           // Output policy details
           for (InsurancePolicy policy : policies) {
              policyCounter++;
           
              System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
              System.out.println("Provider Name: " + policy.getProviderName());
              System.out.println("Policyholder’s First Name: " + policy.getFirstName());
              System.out.println("Policyholder’s Last Name: " + policy.getLastName());
              System.out.println("Policyholder’s Age: " + policy.getAge());
              System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
              if(policy.getSmokingStatus().equalsIgnoreCase("smoker")){
               smokerCounter++;
              }
              System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
              System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");
              System.out.println("Policyholder’s BMI: " + String.format("%.2f", policy.calculateBMI()));
              System.out.println("Policy Price: $" + String.format("%.2f", policy.calculatePolicyPrice()));
              System.out.println(" ");
              
              
        }
        
        scanner.close();
        
        System.out.println("The number of policies with a smoker is: " + smokerCounter);
        System.out.println("The number of policies with a non-smoker is: " + (policyCounter - smokerCounter));
   
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      } catch (IllegalArgumentException e) {
        System.out.println("Input file is not in the correct format: " + e.getMessage());
      }
   }
}