import java.util.Scanner;

public class A1123307_t61 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int array[] = new int[5]; //宣告能放入由鍵盤鍵入5個整數的一維陣列
        
        //首先先輸入5個整數
        for(int i = 0; i < array.length; i++){
            
            System.out.printf("Please enter the %d number:\n", i + 1);
            array[i] = scn.nextInt();        
        }

        //接下來進行陣列元素的氣泡排序
        
        for(int i = 0; i <= array.length - 1; i++){  //外層控制回合數
            for(int j = 0; j < array.length - 1;j++){ 
                if(array[j] < array[j+1]){
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }    
            }
        }

        System.out.println("The ordered numbers:");
        for(int i = 0; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        scn.close();

    }
}
