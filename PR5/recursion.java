import java.util.Scanner;


public class recursion {
    static int zeros = 0;

    public static int recursion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        int n = scanner.nextInt();
        if(n == 0)
            zeros++;
        else
            zeros = 0;
        if(zeros == 2)
            return 0;
        else
            return  ((n == 1)? 1 : 0) + recursion();
    }
    
    public static void main(String[] args){
        System.out.println(recursion());
    }
}