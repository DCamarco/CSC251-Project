

public class PolicyHolder {
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   /**
     * No-arg constructor.
     */
    public PolicyHolder() {
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
    public PolicyHolder(String firstName, String lastName, int age,
                  String smokingStatus, double height, double weight) {
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

   //toString Method
   //@return String to output
   public String toString() {
      //Creating a string to describe the policyHolders information
      String str = "Policy Holder's First Name: " + firstName +
                   "\nPolicy Holder's Last Name: " + lastName +
                   "\nPolicy Holder's Age: " + age + 
                   "\nPolicy Holder's Smoking Status: " + smokingStatus +
                   "\nPolicy Holder's Height: " + height + 
                   "\nPolicy Holder's Weight: " + weight +
                   "\nPolicy Holder's BMI: " +  String.format("%.2f", calculateBMI());
                   
      //Return str
      return str;
   }






}