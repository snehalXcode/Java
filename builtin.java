import java.util.Scanner;
public class builtin {
    public static void main(String[] args) {
        // print 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Math.sqrt(n));
        System.out.println(Math.pow(n,3));
        System.out.println(Math.max(10,20));    
        System.out.println(Math.min(10,20));    
        System.out.println(Math.abs(-10));
        System.out.println(Math.ceil(10.2));
        System.out.println(Math.floor(10.2));
        System.out.println(Math.cbrt(100)); 

    }
    
}
