import java.util.Scanner;

class Student{
	
	/***********************************************
	*
	*  兩個私有成員變數:	身高、 體重
	*
	*  三個公有成員函數:
	*  (1) setHeight:	設定身高並自動判斷單位
	*  (2) setWeight:	設定體重
	*  (3) calBMI:		計算並回傳BMI值
	*
	*
	***********************************************/

}

public class Ch8_p2_example{
	public static void main(String[] arg){
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

		/***********************************************
		*
		*        輸出 Student1 BMI 並計算其範圍
		*
		***********************************************/

		BMI1 = s1.calBMI();
		// ...

		/***********************************************
		*
		*        輸出 Student2 BMI 並計算其範圍
		*
		***********************************************/

		BMI2 = s2.calBMI();
		// ...
	}
}