import java.util.Scanner;
import java.util.regex.Pattern;S

public class PasswordTester {

    static String[] passwords = { "abc", "123456", "Pass@123", "Admi n " };

    public static boolean validatePassword(String pwd) {

        if (pwd.length() < 8) {
            return false;

        }

        boolean hasNumber = Pattern.compile(".*\\d.*").matcher(pwd).matches();
        boolean hasSpecial = Pattern.compile(".*[!@#$%^&*(),.?\":{}|<>].*").matcher(pwd).matches();

        return hasNumber && hasSpecial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========= PASSWORD TEST REPORT =========");

        for (String pwd : passwords) {
            if (validatePassword(pwd)) {
                System.out.println("Password: " + pwd + "  --> ✅ PASS");
            } else {
                System.out.println("Password: " + pwd + "  --> ❌ FAIL");
            }
        }

        System.out.println("\n========= USER PASSWORD TEST =========");
        System.out.print("Enter your password: ");
        String userPassword = sc.nextLine();

        if (validatePassword(userPassword)) {
            System.out.println("Your password is STRONG");
        } else {
            System.out.println(" Your password is WEAK");
            System.out.println("Rules:");
            System.out.println("- Minimum 8 characters");
            System.out.println("- At least 1 number");
            System.out.println("- At least 1 special character");
        }

        sc.close();
    }
}
