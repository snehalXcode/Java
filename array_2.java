import java.util.Scanner;
public class array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Multiply odd indexed elements by 2 and add 10 to even indexed elements
        // for (int i = 0; i < arr.length; i++) {
        //     if (i % 2 == 0) {
        //         arr[i] += 10;
        //     } else {
        //         arr[i] *= 2;
        //     }
        // }
        
        // System.out.println("Modified array elements:");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // sc.close();

        // print product of elements of array
        // int product = 1;
        // for (int i = 0; i < arr.length; i++) {
        //     product *= arr[i];
        // }
        // System.out.println("Product of array elements: " + product);

        // search in array
        // int element=sc.nextInt();
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==element){
        //         System.out.println("Element found at index: "+i);
        //         return;
        //     }
        // }

        // Q1. Search + Count Given an array and a target x, find:x ka first index ,x kitni baar present hai
        // int target = sc.nextInt();
        // int firstIndex = -1;
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == target) {
        //         count++;
        //         if (firstIndex == -1) {
        //             firstIndex = i;
        //         }
        //     }
        // }
        // System.out.println("First index of " + target + ": " + firstIndex);
        // System.out.println("Count of " + target + ": " + count);

        // Q2. Find the second largest element in an array
        // int largest=arr[0];
        // int secondLargest=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>largest){
        //         secondLargest=largest;
        //         largest=arr[i];
        //     }
        //     else if(arr[i]>secondLargest && arr[i]!=largest){
        //         secondLargest=arr[i];
        //     }
        // }
        // System.out.println("Second largest element in the array: " + secondLargest);

        // copy array
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        System.out.println("Copied array elements:");
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
        
    }
    
}
