import java.util.Scanner; 

public class A1123307_p41 { 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        
        System.out.println("Please enter an integer between -128~127:");
        
        // 讀取使用者輸入的 byte 數字
        byte num = scn.nextByte();
        
        System.out.print("The 2's complement: ");
        
        
        System.out.print((num >> 7) & 1); // 印出第 7 號位元
        System.out.print((num >> 6) & 1); // 印出第 6 號位元
        System.out.print((num >> 5) & 1); // 印出第 5 號位元
        System.out.print((num >> 4) & 1); // 印出第 4 號位元
        System.out.print((num >> 3) & 1); // 印出第 3 號位元
        System.out.print((num >> 2) & 1); // 印出第 2 號位元
        System.out.print((num >> 1) & 1); // 印出第 1 號位元
        System.out.print((num >> 0) & 1); // 印出第 0 號位元
        
        System.out.println();
        
        scn.close(); 
    }
}