public class p10 {
    public static void main(String[] args) {
        int a = 5, b = 2, c; 
        b += a++;
        c = (a++)*(++a);

        System.out.printf("a= %d, b= %d, c= %d\n", a, b, c);
    }
}
