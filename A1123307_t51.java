import java.util.Scanner;

public class A1123307_t51 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter gender (0 for female, 1 for male): ");
        int gender = scn.nextInt();
        
        System.out.print("Enter height (cm): ");
        int heightCm = scn.nextInt(); 
        
        System.out.print("Enter weight (kg): ");
        int weight = scn.nextInt();
        
        if (heightCm < 0 || weight < 0) {
            System.out.println("Invalid input");
        } else {
            
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM); 
            
            System.out.printf("BMI: %.2f\n", bmi);
            
    
            if (gender == 1) { 
                // 男生
                if (bmi < 20.0) {
                    System.out.println("Underweight");
                } else if (bmi > 24.0) {
                    System.out.println("Overweight");
                } else {
                    System.out.println("Normal");
                }
            } else if (gender == 0) { 
                // 女生
                if (bmi < 19.0) {
                    System.out.println("Underweight");
                } else if (bmi > 23.0) {
                    System.out.println("Overweight");
                } else {
                    System.out.println("Normal");
                }
            } else { // 性別輸入不是 0 或 1
                System.out.println("Invalid gender input");
            }
        }
        
        scn.close(); 
    }
}