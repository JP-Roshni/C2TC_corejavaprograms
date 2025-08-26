package voting;

import java.util.Scanner;

public class VoterEligibility {
    
    // Method to check eligibility
    public void checkEligibility(int age) throws UnderAgeException {
        if(age < 18) {
            throw new UnderAgeException("❌ Not Eligible. Age must be 18 or above.");
        } else {
            System.out.println("✅ Eligible for Voter List.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        VoterEligibility voter = new VoterEligibility();
        
        try {
            voter.checkEligibility(age);
        } catch(UnderAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        
        sc.close();
    }
}
