import java.util.Scanner;

class Food {

    protected int cost;
    protected String cate;

    public Food(int cost, String cate) {
        this.cost = cost;
        this.cate = cate;
    }

    // 價格
    public int getCost() {
        return this.cost;
    }

    // 類別
    public String getCate() {
        return this.cate;
    }

    // 特價價格
    public double getCost(Food[] f) {
        return this.cost;
    }
}

// 子類別Bread
class Bread extends Food{
    public Bread() {
        super(100, "Bread"); // 透過 super 設定價格和類型
    }

    public double getCost(Food[] f) {
        for (Food item : f) {
    
            if (item != null && item.getCate().equals("Juice")) {
                return this.cost * 0.8;
            }
        }
        return this.cost;
    }
}
// 子類別 Burger
class Burger extends Food {
    public Burger() {
        super(150, "Burger");
    }
    public double getCost(Food[] f) {
        for (Food item : f) {
        
            if (item != null && item.getCate().equals("Milk")) {
                return this.cost * 0.8;
            }
        }
        return this.cost;
    }
}
// 子類別 Juice
class Juice extends Food {
    public Juice() {
        super(50, "Juice");
    }
    public double getCost(Food[] f) {
        for (Food item : f) {
    
            if (item != null && item.getCate().equals("Bread")) {
                return this.cost * 0.8;
            }
        }
        return this.cost;
    }
}

// 子類別 Milk
class Milk extends Food {
    public Milk() {
        super(40, "Milk");
    }
    public double getCost(Food[] f) {
        for (Food item : f) {
            if (item != null && item.getCate().equals("Burger")) {
                return this.cost * 0.8;
            }
        }
        return this.cost;
    }
}

// 主程式
public class A1123307_p101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many items do you want to buy? ");
        int num = scanner.nextInt();
        
        Food[] cart = new Food[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Please select the #" + (i + 1) + " item:");
            System.out.println("(a) Bread; (b) Burger; (c) Juice; (d) Milk");
            System.out.println("----------------------------------------");
            
            String choice = scanner.next();
            switch (choice) {
                case "a":
                    cart[i] = new Bread();
                    break;
                case "b":
                    cart[i] = new Burger();
                    break;
                case "c":
                    cart[i] = new Juice();
                    break;
                case "d":
                    cart[i] = new Milk();
                    break;
                default:
                    System.out.println("Invalid choice, defaulting to Bread.");
                    cart[i] = new Bread();
                    break;
            }
        }

        System.out.println("You buy " + num + " item(s), the details:");
        System.out.println("----------------------------------------");
        
        double totalDiscountedPrice = 0;
        
        for (int i = 0; i < num; i++) {

            double discountedCost = cart[i].getCost(cart);
            System.out.printf("Item[%d]: %7s, cost: %.2f\n", (i + 1), cart[i].getCate(), discountedCost);
            totalDiscountedPrice += discountedCost;
        }

        System.out.println("----------------------------------------");
        System.out.printf("Total discounted price : $%.2f\n", totalDiscountedPrice);

        scanner.close();
    }
}