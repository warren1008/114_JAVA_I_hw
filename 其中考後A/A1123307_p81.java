import java.util.Scanner;

class MyArray {
    private int v0, v1, v2, v3, v4;

    public void set(int idx, int val) {
        
        switch (idx) {
            case 0: 
                v0 = val; 
                break;
            
            case 1: 
                v1 = val; 
                break;
            
            case 2: 
                v2 = val; 
                break;
            
            case 3: 
                v3 = val; 
                break;
            
            case 4: 
                v4 = val; 
                break;
        }
    }

    public int get(int idx) {
        switch (idx) {
            case 0: 
                return v0;
            
            case 1: 
                return v1;
            
            case 2: 
                return v2;
        
            case 3: 
                return v3;
            
            case 4: 
                return v4;

            default: 
                return -1; 
        }
    }
}

public class A1123307_p81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyArray ma = new MyArray();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter the #%02d number: ", i + 1);
            ma.set(i, sc.nextInt()); 
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                
                if (ma.get(j) > ma.get(j + 1)) {
            
                    int temp = ma.get(j);
                    ma.set(j, ma.get(j + 1));
                    ma.set(j + 1, temp);
                }
            }
        }

        System.out.print("\nSorted numbers: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.print(ma.get(i) + " ");
        }
        System.out.println("");
        sc.close();
    }
}