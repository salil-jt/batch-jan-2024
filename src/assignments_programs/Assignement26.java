package assignments_programs;

public class Assignement26 {
public static void main(String[] args) {
	 UserInputValidator validator = new UserInputValidator();
     
     // Test UserInputValidator class
     try {
         // Prompt user to enter age
         int age = 160; // Enter any age for testing purposes

         // Validate age
         validator.validateAge(age);
     } catch (InvalidAgeException e) {
         System.out.println("Error: " + e.errorMessage);
     }
}
}
class InvalidAgeException extends Exception {
	String errorMessage;
    public InvalidAgeException(String message) {
        this.errorMessage=message;
    }
}
class UserInputValidator {
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age! Age must be between 0 and 150.");
        } else {
            System.out.println("Valid age entered: " + age);
        }
    }
}