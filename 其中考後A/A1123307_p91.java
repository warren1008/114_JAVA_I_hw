import java.util.Scanner;

class Clerk {

    private int id;   
    private int cash;

    
    private static int totalClerks = 0; 
    private static int totalIncome = 0; 

    
    public Clerk() {
        totalClerks++;         
        this.id = totalClerks;  
        this.cash = 0;      
    }
    public int getId() {
        return this.id;
    }

    public int getCash() {
        return this.cash;
    }
    public void checkout(int amount) {
        System.out.println("以下為收銀員編號 [ " + this.id + "]的資訊：");
        System.out.println("----------------------------------------");
        System.out.printf("原有現金$ %5d\n", this.cash);
        System.out.printf("結帳金額$ %5d\n", amount);
        
        this.cash += amount;      
        totalIncome += amount;     
        
        System.out.printf("現有現金$ %5d\n", this.cash);
        System.out.println("----------------------------------------");
    }


    public static void totalIncome(Clerk[] clerks) {
        for (int i = 0; i < clerks.length; i++) {
            System.out.println("收銀員編號 [ " + clerks[i].getId() + "] 收銀金額： $" + clerks[i].getCash());
        }
        System.out.println("商店內總共 " + totalClerks + " 位收銀員, 總營業額： $" + totalIncome);
    }
}


public class A1123307_p91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("請問您的商店內欲指派幾名收銀員？");
        int numClerks = scanner.nextInt();

        System.out.println("請問每位收銀員預計接待幾位客人？");
        int numCustomers = scanner.nextInt();


        Clerk[] clerks = new Clerk[numClerks];
        for (int i = 0; i < numClerks; i++) {
            clerks[i] = new Clerk(); 
        }

        System.out.println(); 

        
        for (int i = 0; i < numClerks; i++) {
            for (int j = 0; j < numCustomers; j++) {
                System.out.println("請問收銀員編號 " + clerks[i].getId() + " 的第 " + (j + 1) + " 位客人結帳金額為：");
                int amount = scanner.nextInt();
                clerks[i].checkout(amount); 
                System.out.println(); 
            }
        }

        
        Clerk.totalIncome(clerks); 

        scanner.close();
    }
}