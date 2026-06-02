import java.util.Scanner;

class MyArray{
	
	// 實作陣列物件 ...

}

public class Ch8_p1_example{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		MyArray ma = new MyArray();
		
		// 輸入資料
		for(int i = 0; i < 5; i++){
			System.out.printf("Enter the #%02d number: ", i + 1);
			ma.set(i, sc.nextInt());
		}
		System.out.println("");

		/************************************* 
		*       使用氣泡排序進行資料排序
		*************************************/ 

		// 輸入排序結果
		System.out.print("Sorted numbers: ");
		for(int i = 0; i < 5; i++){
			System.out.printf("%d ", ma.get(i));
		}
		System.out.println("");
	}
}

