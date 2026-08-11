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
        Scanner sc = new Scanner(System.in);
        int cp =sc.nextInt();
        int sp =sc.nextInt();
        if(sp>cp){
            System.out.println("Profit is: " + (sp-cp));
        }
        else if(cp>sp){
            System.out.println("Loss is: " + (cp-sp));
        }
        else{
            System.out.println("No profit no loss");
        }

    }
    
}
