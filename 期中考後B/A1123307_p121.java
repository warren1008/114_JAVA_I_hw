import java.util.Scanner;

public class A1123307_p121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a short text with \"dog\", \"cat\", and \"fish\":\n");
        String input = scanner.nextLine();

        StringBuffer sb = new StringBuffer();
        int i = 0;

        while (i < input.length()) {
          
            if (i + 3 <= input.length() &&
                input.charAt(i)     == 'd' &&
                input.charAt(i + 1) == 'o' &&
                input.charAt(i + 2) == 'g') {
                sb.append("***");
                i += 3;
            }
          
            else if (i + 3 <= input.length() &&
                     input.charAt(i)     == 'c' &&
                     input.charAt(i + 1) == 'a' &&
                     input.charAt(i + 2) == 't') {
                sb.append("$$$");
                i += 3;
            }
          
            else if (i + 4 <= input.length() &&
                     input.charAt(i)     == 'f' &&
                     input.charAt(i + 1) == 'i' &&
                     input.charAt(i + 2) == 's' &&
                     input.charAt(i + 3) == 'h') {
                sb.append("@@@@");
                i += 4;
            }
          
            else {
                sb.append(input.charAt(i));
                i++;
            }
        }

        System.out.println("\nThe \"dog\", \"cat\", and \"fish\" are replaced with '*', '$', and '@', respectively:\n");
        System.out.println(sb.toString());

        scanner.close();
    }
}
