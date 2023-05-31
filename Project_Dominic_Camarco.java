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

    // No-arg constructor
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

    // Constructor
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
   public int getPolicyNumber() {
       return policyNumber;
   }
   
   public String getProviderName() {
       return providerName;
   }
   
   public String getFirstName() {
       return firstName;
   }
   
   public String getLastName() {
       return lastName;
   }
   
   public int getAge() {
       return age;
   }
   
   public String getSmokingStatus() {
       return smokingStatus;
   }
   
   public double getHeight() {
       return height;
   }
   
   public double getWeight() {
       return weight;
   }
   
   // Setters
   public void setPolicyNumber(int policyNumber) {
       this.policyNumber = policyNumber;
   }
   
   public void setProviderName(String providerName) {
       this.providerName = providerName;
   }
   
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }
   
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }
   
   public void setAge(int age) {
       this.age = age;
   }
   
   public void setSmokingStatus(String smokingStatus) {
       this.smokingStatus = smokingStatus;
   }
   
   public void setHeight(double height) {
       this.height = height;
   }
   
   public void setWeight(double weight) {
       this.weight = weight;
   }


    // BMI Calculation
    public double calculateBMI() {
        return (this.weight * 703) / (this.height * this.height);
    }

    // Policy Price Calculation
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