import java.util.Scanner;
public class A1123307_p71{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Please enter the length of the Fibonacci sequence : ");
        int length = scn.nextInt();
        
        for(int i = 1; i <= length; i++){
            System.out.print(Fibonacci(i) + " ");    
        }
        
        System.out.println();

        scn.close();
    }

    public static int Fibonacci(int i){
        if(i ==1 || i ==2)
            return 1;
        
        return Fibonacci(i-2) + Fibonacci(i-1);
    }
}