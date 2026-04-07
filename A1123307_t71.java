import java.util.Scanner;

public class A1123307_t71{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Options:");
        System.out.println("(1) Least Common Multiple");
        System.out.println("(2) Greatest Common Factor");
        
        System.out.print("Your choice: ");
        int choice = scn.nextInt();

        switch (choice){
            case 1:
                
                System.out.println("Please enter the first integer:");
                int num1 = scn.nextInt();
                
                System.out.println("Please enter the second integer:");
                int num2 = scn.nextInt();
                
                System.out.print("The least common multiple of the two:" + lcm(num1, num2));
                break;
            case 2:
                System.out.println("Please enter the first integer:");
                int num3 = scn.nextInt();
                
                System.out.println("Please enter the second integer:");
                int num4 = scn.nextInt();
                
                System.out.print("The Greatest common divisor of the two:" + gcd(num3, num4));
                break;
        }
        scn.close();
    }
    
    //最大公因數函數
    public static int gcd(int a, int b){
    //先比較兩數字大小
        int min = a;
        if(b < a){
            min = b;
        }
    //找出最大公因數
        int temp = 1;
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i ==0){
                temp = i;
            }
        }
        return  temp; 
    }

    //最小公倍數函數
    public static int lcm(int a, int b){
        //先比較兩數字大小
        int max = a;
        if(b > a){
            max = b;
        }
        //利用無窮迴圈找出最小公倍數
        while(true){
            if(max % a == 0 && max % b == 0){
                return max;
                break;
            }
        }
    }

}