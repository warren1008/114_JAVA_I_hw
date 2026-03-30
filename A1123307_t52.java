import java.util.Scanner;

public class A1123307_t52 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter a month (1-12): ");
        int month =scn.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("The season is: Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("The season is: Summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("The season is: Autumn");
                break;

            case 12:
            case 1:
            case 2:
                System.out.println("The season is: Winter");
                break;    
               
            default:
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
        }

        scn.close();
    }
}
