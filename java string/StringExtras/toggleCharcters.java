import java.util.*;
public class toggleCharcters {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
                
                // Get user input
                System.out.println("Enter a string:");
                String input = sc.nextLine();
                sc.close(); // Close scanner
        
                // Toggle case
                String toggledString = toggleCase(input);
                System.out.println("Toggled case string: " + toggledString);
            }
        
            public static String toggleCase(String str) {
                StringBuilder result = new StringBuilder();
        
                for (char ch : str.toCharArray()) {
                    if (Character.isUpperCase(ch)) {
                        result.append(Character.toLowerCase(ch));
                    } else if (Character.isLowerCase(ch)) {
                        result.append(Character.toUpperCase(ch));
                    } else {
                        result.append(ch); // Append non-alphabetic characters as they are
                    }
                }
                return result.toString();
            }
        }
        