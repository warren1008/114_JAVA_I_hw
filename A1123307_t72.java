public class A1123307_t72 {
    public static void main(String[] args){
        int sales[][] = {
            {33, 32, 56, 45, 33},
            {77, 33, 68, 45, 23},
            {43, 55, 43, 67, 65}
        };
        char product[] = {'A', 'B', 'C', 'D', 'E'};
        for(int i =0; i < product.length; i++){
            System.out.printf("The average sales for product[%c] = %.2f\n", product[i], average(sales[][i]));
        } 

    }
    public static float average(int arr[][]){
        for(int c = 0; c < arr[0].length; c++){
            int sum = 0;
            
            for(int r = 0; r < arr.length; r++){
                sum += arr[r][c];
            }
            return sum;
        }
    }
}