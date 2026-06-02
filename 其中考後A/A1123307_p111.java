import java.util.Scanner;

interface Sequence {
    int[] getSequence();
    int[] subSequence(int p1);
    int[] subSequence(int p1, int p2);
}
class Factorial implements Sequence {
    
    private int len;
    private int[] seq;
    public Factorial() {
        this(1); 
    }

    public Factorial(int len) {
        this.len = len;
        this.seq = new int[len];
        generateSequence(); 
    }

    private void generateSequence() {
        int fact = 1;
        for (int i = 0; i < len; i++) {
            fact *= (i + 1);
            seq[i] = fact;
        }
    }
  
    public int[] getSequence() {
        return seq;
    }

    public int[] subSequence(int p1) {
        return subSequence(p1, len); 
    }

    public int[] subSequence(int p1, int p2) {
        int newLen = p2 - p1;
        int[] subSeq = new int[newLen];
        for (int i = 0; i < newLen; i++) {
            subSeq[i] = seq[p1 + i];
        }
        return subSeq;
    }
}

class Fibonacci implements Sequence {
    private int len;
    private int[] seq;

    public Fibonacci() {
        this(1);
    }

    public Fibonacci(int len) {
        this.len = len;
        this.seq = new int[len];
        generateSequence();
    }

    private void generateSequence() {
        if (len >= 1) seq[0] = 1;
        if (len >= 2) seq[1] = 1;
        for (int i = 2; i < len; i++) {
            seq[i] = seq[i - 1] + seq[i - 2];
        }
    }

    public int[] getSequence() {
        return seq;
    }

    public int[] subSequence(int p1) {
        return subSequence(p1, len);
    }

    public int[] subSequence(int p1, int p2) {
        int newLen = p2 - p1;
        int[] subSeq = new int[newLen];
        for (int i = 0; i < newLen; i++) {
            subSeq[i] = seq[p1 + i];
        }
        return subSeq;
    }
}

public class A1123307_p111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sequences: ");
        int numSeq = scanner.nextInt();

        Sequence[] sequences = new Sequence[numSeq];

        for (int i = 0; i < numSeq; i++) {
            System.out.println("\nSetup for sequence " + (i + 1));
            System.out.print("Enter sequence type (1: Fibonacci, 2: Factorial): ");
            int type = scanner.nextInt();
            System.out.print("Enter sequence length: ");
            int length = scanner.nextInt();

            if (type == 1) {
                sequences[i] = new Fibonacci(length);
            } else if (type == 2) {
                sequences[i] = new Factorial(length);
            }
        }

        System.out.println("\n--------------------------------");
        System.out.println("Select output type for all sequences:");
        System.out.println("1: Full sequence");
        System.out.println("2: Subsequence with a starting index");
        System.out.println("3: Subsequence with a starting and an ending index");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        int p1 = 0, p2 = 0;
        if (choice == 2) {
            System.out.print("Enter starting index: ");
            p1 = scanner.nextInt();
        } else if (choice == 3) {
            System.out.print("Enter starting index: ");
            p1 = scanner.nextInt();
            System.out.print("Enter ending index: ");
            p2 = scanner.nextInt();
        }
        System.out.println("--------------------------------");

        for (int i = 0; i < numSeq; i++) {
            int[] result = null;

            if (choice == 1) {
                result = sequences[i].getSequence();
            } else if (choice == 2) {
                result = sequences[i].subSequence(p1);
            } else if (choice == 3) {
                result = sequences[i].subSequence(p1, p2);
            }

            System.out.print("Output for sequence #" + (i + 1) + ": ");
            if (result != null) {
                for (int val : result) {
                    System.out.print(val + " ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}