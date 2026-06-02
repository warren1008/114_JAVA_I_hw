import java.util.Scanner;

public class A1123307_p122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the avg. of Gaussian distribution:");
        double mu = scanner.nextDouble();

        System.out.print("Please enter the std. of Gaussian distribution:");
        double sigma = scanner.nextDouble();

        System.out.print("Please enter the event:");
        double x = scanner.nextDouble();

        
        double exponent = -0.5 * Math.pow((x - mu) / sigma, 2);
        double pdf = (1.0 / (sigma * Math.sqrt(2 * Math.PI))) * Math.exp(exponent);

        System.out.println("\nPDF at event = " + x + " is " + pdf);

        scanner.close();
    }
}
