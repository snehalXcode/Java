import java.util.Scanner;

public class array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Shuruat mein dono ko Java ki sabse choti possible value de dete hain
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            // Case 1: Agar current number ab tak ke sabse bade number se bhi bada hai
            if (arr[i]>secondLargest && arr[i] != largest) {
                secondLargest = largest; // Pehle wale largest ko secondLargest bana do
                largest = arr[i]; // Ab current number ko largest bana do
            }
            // Case 2: Agar current number secondLargest se bada hai aur largest ke barabar nahi hai
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i]; // Current number ko secondLargest bana do
            }
        }
        System.out.println("Second largest element in the array: " + secondLargest);    
        sc.close(); // Scanner loop ke baahar close kiya
    }
}
