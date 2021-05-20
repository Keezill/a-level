package ua.mamedov.hw7;

import java.util.Random;

public class Vector {
    protected int x;
    protected int y;
    protected int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLength(Vector vector) {
        return Math.abs(Math.sqrt(Math.pow(vector.x, 2)
                + Math.pow(vector.y, 2) + Math.pow(vector.z, 2)));
    }

    public Vector getVectorProduct(Vector vector) {
        int tmpX = y * vector.z - z * vector.y;
        int tmpY = z * vector.x - x * vector.z;
        int tmpZ = x * vector.y - y * vector.x;
        return new Vector(tmpX, tmpY, tmpZ);

    }

    @Override
    public String toString() {
        return "Vector {" + x + ", " + y + ", " + z + '}';
    }

    public double getCosOfAngle(Vector vector) {
        int scalarProduct = x * vector.x + y * vector.y + z * vector.z;
        double lengthOfVector1 = Math.abs(Math.sqrt(Math.pow(x, 2)
                + Math.pow(y, 2) + Math.pow(z, 2)));
        double lengthOfVector2 = Math.abs(Math.sqrt(Math.pow(vector.x, 2)
                + Math.pow(vector.y, 2) + Math.pow(vector.z, 2)));
        return scalarProduct / (lengthOfVector1 * lengthOfVector2);

    }

    public Vector getSumOfVectors(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector getDifOfVectors(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public static Vector[] arrayOfRandomVectors(int n){
        Random rand = new Random();
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
        }
        return vectors;
    }
}
