public class A1123307_t72 {
    public static void main(String[] args){
        int sales[][] = {
            {33, 32, 56, 45, 33},
            {77, 33, 68, 45, 23},
            {43, 55, 43, 67, 65}
        };
        
        char product[] = {'A', 'B', 'C', 'D', 'E'};
        double[] averageResult = average(sales);

        for(int i =0; i < product.length; i++){
            System.out.printf("The average sales for product%c = %.2f\n", product[i], averageResult[i]);
        } 

    }
    public static double[] average(int arr[][]){
        double[] averageResult = new double[arr[0].length];
        
        for(int c = 0; c < arr[0].length; c++){
            double sum = 0;
    
            for(int r = 0; r < arr.length; r++){
                sum += arr[r][c];
            }
            averageResult[c] = sum / arr.length;
        }
        return averageResult;

    }
}