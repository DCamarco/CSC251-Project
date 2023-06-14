import java.util.Scanner;

public class Project_Dominic_Camarco {
   Scanner keyboard = new Scanner(System.in);
   
   
   
   
   
   
   public static class InsurancePolicy {
    // Attributes
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * No-arg constructor.
     */
    public InsurancePolicy() {
        this.policyNumber = 0;
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0.0;
        this.weight = 0.0;
    }

    /**
     * Constructor.
     * @param policyNumber The policy number.
     * @param providerName The name of the insurance provider.
     * @param firstName The first name of the policy holder.
     * @param lastName The last name of the policy holder.
     * @param age The age of the policy holder.
     * @param smokingStatus The smoking status of the policy holder.
     * @param height The height of the policy holder.
     * @param weight The weight of the policy holder.
     */
    public InsurancePolicy(int policyNumber, String providerName, String firstName, String lastName, int age,
                  String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
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
   
   /**
    * @return The first name of the policy holder.
    */
   public String getFirstName() {
       return firstName;
   }
   
   /**
    * @return The last name of the policy holder.
    */
   public String getLastName() {
       return lastName;
   }
   
   /**
    * @return The age of the policy holder.
    */
   public int getAge() {
       return age;
   }
   
   /**
    * @return The smoking status of the policy holder.
    */
   public String getSmokingStatus() {
       return smokingStatus;
   }
   
   /**
    * @return The height of the policy holder.
    */
   public double getHeight() {
       return height;
   }
   
   /**
    * @return The weight of the policy holder.
    */
   public double getWeight() {
       return weight;
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
    * @param firstName The first name of the policy holder to set.
    */
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }
   
   /**
    * @param lastName The last name of the policy holder to set.
    */
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }
   
   /**
    * @param age The age of the policy holder to set.
    */
   public void setAge(int age) {
       this.age = age;
   }
   
   /**
    * @param smokingStatus The smoking status of the policy holder to set.
    */
   public void setSmokingStatus(String smokingStatus) {
       this.smokingStatus = smokingStatus;
   }
   
   /**
    * @param height The height of the policy holder to set.
    */
   public void setHeight(double height) {
       this.height = height;
   }
   
   /**
    * @param weight The weight of the policy holder to set.
    */
   public void setWeight(double weight) {
       this.weight = weight;
   }

    /**
     * Calculate the BMI of the policy holder.
     * @return The calculated BMI.
     */
    public double calculateBMI() {
        return (this.weight * 703) / (this.height * this.height);
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
   
      Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Policy Number: ");
        int policyNumber = scanner.nextInt();

        scanner.nextLine(); // Consume newline left-over

        System.out.println("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.println("Please enter the Policyholder’s First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter the Policyholder’s Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Please enter the Policyholder’s Age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Consume newline left-over

        System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();

        System.out.println("Please enter the Policyholder’s Height (in inches): ");
        double height = scanner.nextDouble();

        System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = scanner.nextDouble();

        // Create Policy object
        InsurancePolicy policy = new InsurancePolicy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Output policy details
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getLastName());
        System.out.println("Policyholder’s Age: " + policy.getAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");
        System.out.println("Policyholder’s BMI: " + String.format("%.2f", policy.calculateBMI()));
        System.out.println("Policy Price: $" + String.format("%.2f", policy.calculatePolicyPrice()));

   }
}