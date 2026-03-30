import java.util.Scanner;
import java.util.Random; 

public class A1123307_p51 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        System.out.print("Please enter the name for Player#1:");//玩家1名字
        String player1 = scanner.next();
        System.out.print("Please enter the name for Player#2:");//玩家1名字
        String player2 = scanner.next();
        System.out.print("How many round do you want to play:");//要玩幾局
        int totalRounds = scanner.nextInt();

        

        int score1 = 0; // 記錄玩家 1 的分數
        int score2 = 0; // 記錄玩家 2 的分數

        
        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("\n[Round" + round + "] Let's start!");
            System.out.println("--------------------------------------------------");

            // 產生 0~99 之間的隨機密碼
            int password = random.nextInt(100); 
            int min = 0;   // 下限
            int max = 99;  // 上限
            boolean isPlayer1Turn = true; // 用來切換回合，true 代表玩家 1 的回合


            while (true) {

                String currentPlayer = isPlayer1Turn ? player1 : player2;

                
                System.out.printf("%s guess (%02d~%02d): ", currentPlayer, min, max);
                int guess = scanner.nextInt();

            
                if (guess == password) {
                    System.out.println("--------------------------------------------------");
                    System.out.println(currentPlayer + " gets the point!");
                    System.out.println("--------------------------------------------------");
                    

                    if (isPlayer1Turn) {
                        score1++;
                    } else {
                        score2++;
                    }
                    
                    // 印出該局結束後的分數
                    System.out.printf("[Round%d] %s got %d points, %s got %d points\n", 
                                      round, player1, score1, player2, score2);
                    
                    break; // 猜中了就跳離 while 迴圈進入下一局 
                } 
                else if (guess > password && guess < max) {
                    // 如果猜的數字比密碼大，而且在範圍內的話，更新上限數值
                    max = guess;
                } 
                else if (guess < password && guess > min) {
                    // 如果猜的數字比密碼小，而且在範圍內，更新下限
                    min = guess;
                }

                // 換另一個玩家猜
                isPlayer1Turn = !isPlayer1Turn; 
            }
        }

        // 所有局數結束，最終贏家是誰 
        System.out.println("\n----------------------------------");
        if (score1 > score2) {
            System.out.println(player1 + " wins the game!");
        } else if (score2 > score1) {
            System.out.println(player2 + " wins the game!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}