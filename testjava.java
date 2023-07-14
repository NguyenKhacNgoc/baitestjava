import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class testjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();
        int count = countVietnameseLetters(input);
        System.out.println("Output: " + count);
    }

    public static int countVietnameseLetters(String input) {
        Pattern pattern = Pattern.compile("aw|aa|dd|ee|oo|ow|w");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
