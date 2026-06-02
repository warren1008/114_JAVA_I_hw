public class A1123307_p61 {
    public static void main(String[] args) {
        
        //宣告儲存銷售資料的陣列
        int sales[][] = { 
            {33,32,56,45,33}, // 銷售員 1 的產品 A~E 銷售量
            {77,33,68,45,23}, // 銷售員 2 的產品 A~E 銷售量
            {43,55,43,67,65}  // 銷售員 3 的產品 A~E 銷售量
        };

        // 計算印出每個銷售員的總銷售量

        for(int r = 0; r < sales.length; r++){
            int sum = 0;
            
            for(int c = 0; c < sales[r].length; c++){
                sum += sales[r][c];        
            }

            System.out.println("Total sales from salesman " + (r + 1) + ": " + sum);
        }

        System.out.println();

        // 計算印出各別產品的總銷售量
        char product[] = {'A', 'B', 'C', 'D', 'E'};

        for(int c = 0; c < sales[0].length; c++){
            int sum = 0;

            for(int r = 0; r < sales.length; r++){
                sum += sales[r][c];        
            }
            System.out.println("Total sales for product " + product[c] + ": " + sum);
        }

    }
}