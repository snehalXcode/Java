// absolute value
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n =sc.nextInt();

        // if(n<0){
        //     System.out.println(n*(-1));
        // }
        // else{
        //     System.out.println(n);
        // }

        // profit loss
        // Scanner sc = new Scanner(System.in);
        // int cp =sc.nextInt();
        // int sp =sc.nextInt();
        // if(sp>cp){
        //     System.out.println("Profit is: " + (sp-cp));
        // }
        // else if(cp>sp){
        //     System.out.println("Loss is: " + (cp-sp));
        // }
        // else{
        //     System.out.println("No profit no loss");
        // }

        // 4digit number
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // if (n > 999 && n < 10000) {
        //     System.out.println("4 digit number");
        // } else {
        //     System.out.println("Not a 4 digit number");
        // }

        // divisible by 5 or 3
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // if (n % 5 == 0 || n % 3 == 0) {
        //     System.out.println("Divisible by 5 or 3");
        // } else {
        //     System.out.println("Not divisible by 5 or 3");
        // }

        // sides of triangle
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if (a + b > c && a + c > b && b + c > a) {
        //     System.out.println("Triangle is valid");
        // } else {
        //     System.out.println("Triangle is not valid");
        // }

        // quadrant
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant 4");
        } else if (x == 0 && y != 0) {
            System.out.println("On Y axis");
        } else if (y == 0 && x != 0) {
            System.out.println("On X axis");
        } else {
            System.out.println("Origin");
        }

    }
    
}
