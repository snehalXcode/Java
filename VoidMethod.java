public class VoidMethod { 
    // public static void Snehal(){ 
    //     System.out.println("Hello Snehal"); 
    // } 
    // public static void sum(int a,int b){ 
    //     System.out.println(a+b); 
    //     Snehal();
    // }
    
    public static void main(String[] args) { 
        System.out.println("welcome"); 
        // Snehal(); 
        // sum(10,20);

    // nPr and nCr
    // public static int fact(int n) { 
    //     int f = 1; 
    //     for (int i = 1; i <= n; i++) { 
    //         f = f * i; 
    //     } 
    //     return f;
    // } 
    // public static void main(String[] args) {
    //     int n = 5;
    //     int r = 2;

    //     // nPr Formula: n! / (n - r)!
    //     int npr = fact(n) / fact(n - r);

    //     // nCr Formula: n! / (r! * (n - r)!)
    //     int ncr = fact(n) / (fact(r) * fact(n - r));

    //     // Display results
    //     System.out.println(n + "P" + r + " (Permutations) = " + npr);
    //     System.out.println(n + "C" + r + " (Combinations) = " + ncr);

    // swap two numbers
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    
}

    


