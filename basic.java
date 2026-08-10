public class basic {
    public static void main(String[] args) {
        // Area of circle
        int r = 6;
        System.out.println("Area of circle is: " + (3.14 * r * r));

        // Volume of sphere
        int a = 5;
        // Using 4.0/3 forces double precision math
        double volume = (4.0 / 3) * 3.14 * a * a * a; 
        System.out.println("Volume of sphere is: " + volume);

        // total surface area of cuboid
        int l = 5;
        int b = 4;
        int h = 3;

        int tsa = 2 * ((l * b) + (b * h) + (h * l));
        System.out.println("Total Surface Area of Cuboid is: " + tsa);

        int s=5;
        int w=s-2;
        System.out.println(s + "-2=" + s);

    }
}
