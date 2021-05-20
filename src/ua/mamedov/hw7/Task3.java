package ua.mamedov.hw7;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(2,3,4);
        Vector vector2 = new Vector(4,2,1);


        System.out.println(vector1.getVectorProduct(vector2).toString());
        System.out.println("cos of angle between vectors = " + vector1.getCosOfAngle(vector2));
        System.out.println("Length of vector is: " + vector1.getLength(vector1));
        System.out.println("Sum: " + vector1.getSumOfVectors(vector2).toString());
        System.out.println("Difference: " + vector1.getDifOfVectors(vector2).toString());
        System.out.println(Arrays.toString(Vector.arrayOfRandomVectors(6)));
    }
}
