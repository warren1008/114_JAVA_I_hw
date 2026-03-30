import java.util.Scanner;

public class A1123307_t41 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("請輸入攝氏溫度:");
        double celsius = scn.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("攝氏溫度 = %.2f的華氏溫度為:%.1f\n", celsius, fahrenheit);
        
        scn.close();
    }
}
