import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();
        System.out.println("Enter your birth day (1-31): ");
        int birthDay = scanner.nextInt();
        System.out.println("Enter your birth year (e.g., 1990): ");
        int birthYear = scanner.nextInt();
        
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        
        int age = currentDate.getYear() - birthDate.getYear();
        
        // Check if the birthday has occurred this year
        if (currentDate.getMonthValue() < birthDate.getMonthValue() || 
           (currentDate.getMonthValue() == birthDate.getMonthValue() && currentDate.getDayOfMonth() < birthDate.getDayOfMonth())) {
            age--;
        }
        
        DayOfWeek dayOfWeek = birthDate.getDayOfWeek();
        
        System.out.println("You are " + age + " years old, and you were born on a "+ dayOfWeek + ".");
    }
}