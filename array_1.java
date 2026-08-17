import java.util.Scanner;
public class array_1 {
    // output array elements
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4, 5};
    //     System.out.println("Array elements:");
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }
    // }
    
    // input array elements
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of the array: ");
    //     int size = sc.nextInt();
    //     int[] arr = new int[size];
        
    //     System.out.println("Enter " + size + " elements:");
    //     for (int i = 0; i < size; i++) {
    //         arr[i] = sc.nextInt();
    //     }
        
    //     System.out.println("Array elements:");
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }
        
    //     sc.close();
    // }

    // print negative elements only
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of the array: ");
    //     int size = sc.nextInt();
    //     int[] arr = new int[size];
        
    //     System.out.println("Enter " + size + " elements:");
    //     for (int i = 0; i < size; i++) {
    //         arr[i] = sc.nextInt();
    //     }
        
    //     System.out.println("Negative elements in the array:");
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] < 0) {
    //             System.out.println(arr[i]);
    //         }
    //     }
        
    //     sc.close();
    // }

    // sum of elements
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of the array: ");
    //     int size = sc.nextInt();
    //     int[] arr = new int[size];
        
    //     System.out.println("Enter " + size + " elements:");
    //     for (int i = 0; i < size; i++) {
    //         arr[i] = sc.nextInt();
    //     }
        
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         sum += arr[i];
    //     }
        
    //     System.out.println("Sum of array elements: " + sum);
        
    //     sc.close();
    // }

    // product of elements
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of the array: ");
    //     int size = sc.nextInt();
    //     int[] arr = new int[size];
        
    //     System.out.println("Enter " + size + " elements:");
    //     for (int i = 0; i < size; i++) {
    //         arr[i] = sc.nextInt();
    //     }
        
    //     int product = 1;
    //     for (int i = 0; i < arr.length; i++) {
    //         product *= arr[i];
    //     }
        
    //     System.out.println("Product of array elements: " + product);
        
    //     sc.close();
    // }

    // max and min element in array
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of the array: ");
    //     int size = sc.nextInt();
    //     int[] arr = new int[size];
        
    //     System.out.println("Enter " + size + " elements:");
    //     for (int i = 0; i < size; i++) {
    //         arr[i] = sc.nextInt();
    //     }
        
    //     int max = arr[0];
    //     int min = arr[0];
    //     int maxindex = 0; // Variable to store the index of the maximum element
    //     int minindex = 0; // Variable to store the index of the minimum element
        
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] > max) {
    //             max = arr[i];
    //             maxindex = i; // Store the index of the maximum element
    //         }
    //         if (arr[i] < min) {
    //             min = arr[i];
    //             minindex = i; // Store the index of the minimum element
    //         }
    //     }
        
    //     System.out.println("Maximum element in the array: " + max);
    //     // index of max element
    //     System.out.println("max element index : " + i);
    //     System.out.println("Minimum element in the array: " + min);
    //     System.out.println(max-min);
        
    //     sc.close();
    // }

    // count how many element are greater than x
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of the array: ");
    //     int size = sc.nextInt();
    //     int[] arr = new int[size];
        
    //     System.out.println("Enter " + size + " elements:");
    //     for (int i = 0; i < size; i++) {
    //         arr[i] = sc.nextInt();
    //     }
        
    //     System.out.print("Enter the value of x: ");
    //     int x = sc.nextInt();
        
    //     int count = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > x) {
    //             count++;
    //         }
    //     }
        
    //     System.out.println("Number of elements greater than " + x + ": " + count);
        
    //     sc.close();
    // }

    // update negative elements to zero
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Update negative elements to zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        
        System.out.println("Array after updating negative elements to zero:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        sc.close();
    }
}
