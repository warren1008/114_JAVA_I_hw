import java.util.Scanner; //接收鍵盤輸入的資料

public class A1123307_p31 { //宣告公開類別
    public static void main(String[] args){ //程式執行的起點
        Scanner scn = new Scanner(System.in); //建立 Scanner 物件，讀取鍵盤輸入
        
        System.out.println("請輸入你的年齡: "); //印出提示訊息，請使用者輸入年齡
        int age = scn.nextInt(); //宣告整數變數 age 並讀取輸入。 int 型態佔用 4 Bytes
        
        System.out.println("請輸入你的性別: "); //印出提示訊息，請使用者輸入性別
        char gender = scn.next().charAt(0); //宣告字元變數 gender 並讀取輸入的第一個字串字元。 char 型態佔用 2 Bytes
        
        System.out.println("請輸入你的身高: "); //印出提示訊息，請使用者輸入身高
        float height = scn.nextFloat(); // 宣告浮點數變數 height 並讀取輸入。float 型態佔用 4 Bytes
        
        System.out.printf("你的年齡為%2d，性別為%1c，身高為%6.2f\n", age, gender, height); //將數值格式化輸出，印出結果並換行
        //計算總位元組數：int(4) + char(2) + float(4) = 10 Bytes
        int totalBytes = 4 + 2 + 4; //宣告整數變數儲存總 Bytes 數。 int 型態佔用 4 Bytes
        System.out.println("上述資料總共占: " + totalBytes + " Bytes"); //印出變數所佔用的總 Bytes 數
        
        scn.close();
    } //程式執行結束點
} //類別結束
