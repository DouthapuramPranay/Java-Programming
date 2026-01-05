import java.util.*;

public class Area_Perimeter_Volume_of_cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();

        double Area = 2 * (length * breadth + breadth * height + height * length);
        double Perimeter = 4 * (length + breadth + height);
        double Volume = length * breadth * height;
        System.out.println("Area of Cuboid is: " + Area);
        System.out.println("Perimeter of Cuboid is: " + Perimeter);
        System.out.println("Volume of Cuboid is: " + Volume);
    }

}