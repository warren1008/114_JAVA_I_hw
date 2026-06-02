import java.util.Scanner;

class Student {
    
    private double height; // 身高 (公尺)
    private double weight; // 體重 (公斤)
    

    public void setHeight(double h) {
        
        if (h > 3.0) {
            this.height = h / 100.0;
        } else {
            this.height = h;
        }
    }

    
    public void setWeight(double w) {
        this.weight = w;
    }

   
    public double calBMI() {
        return this.weight / (this.height * this.height);
    }
}

public class A1123307_p82 { 
    public static void main(String[] arg) {
        double BMI1, BMI2;
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();

      
        System.out.println("Please enter the height of student#1 (cm or m):");
        s1.setHeight(sc.nextDouble());
        System.out.println("Please enter the weight of student#1 (kg):");
        s1.setWeight(sc.nextDouble());

      
        System.out.println("Please enter the height of student#2 (cm or m):");
        s2.setHeight(sc.nextDouble());
        System.out.println("Please enter the weight of student#2 (kg):");
        s2.setWeight(sc.nextDouble());

  
        BMI1 = s1.calBMI();
        System.out.printf("BMI for student#1: %.2f, ", BMI1);
        if (BMI1 < 18.5) {
            System.out.println("Underweight");
        } else if (BMI1 < 24) {
            System.out.println("Normal");
        } else if (BMI1 < 27) {
            System.out.println("Overweight");
        } else if (BMI1 < 30) {
            System.out.println("Mild Obesity");
        } else if (BMI1 < 35) {
            System.out.println("Moderate Obesity");
        } else {
            System.out.println("Severe Obesity");
        }

        BMI2 = s2.calBMI();
        System.out.printf("BMI for student#2: %.2f, ", BMI2);
        if (BMI2 < 18.5) {
            System.out.println("Underweight");
        } else if (BMI2 < 24) {
            System.out.println("Normal");
        } else if (BMI2 < 27) {
            System.out.println("Overweight");
        } else if (BMI2 < 30) {
            System.out.println("Mild Obesity");
        } else if (BMI2 < 35) {
            System.out.println("Moderate Obesity");
        } else {
            System.out.println("Severe Obesity");
        }
        
        sc.close();
    }
}