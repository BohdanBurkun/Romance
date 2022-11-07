import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Learning {

    public static void combineStrings1() {
        String name = "Billy";
        String action = "is moving";
        System.out.println(name + " " + action);
        System.out.println(name + " " + action);
    }

    public static void combineStrings2(String name, String action) {
        System.out.println(name + " " + action);
        System.out.println(name + " " + action);
    }

    public static String combineStrings3(String name, String action) {
        String sentence = name + " " + action;
        //System.out.println(name + " " +action);
        return sentence;
    }

    public static void calculate(int digit1, int digit2, String phrase) {
        int sum;
        sum = digit1 * digit2 / digit2 + digit1;
        System.out.println(phrase + " " + sum);
    }

    public static void completeCondition() {
        boolean requirement = true;
        System.out.println(requirement);
    }

    public static void typeChars() {
        char letter1 = 'g';
        char letter2 = 'f';
        System.out.println(letter1 + letter2);

    }

    public static void condition1(String req) {

        if (1 + 1 == 3 || req.contains("rize")) {
            System.out.println("!!!!!");
        } else {
            System.out.println("?????");
        }
    }




    public static void main(String[] args) {
        //       int digit1 = 535;
        //       int digit2 = 60000;
        //       String name = "Billy";
        //       String action = "is moving";
        //       String result = combineStrings3(name,action);
        //System.out.println(result);
        //calculate(digit1, digit2, result);
        //       String req = "I win prffffize";
        //       condition1(req);

    }


}
