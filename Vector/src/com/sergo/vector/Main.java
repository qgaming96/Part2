package com.sergo.vector;

public class Main
{
    public static void main(String[] args)
    {

        Vector vector1 = new Vector(4);
        double[] arr1 = { 1.12, 2.87, 3.49, 4.22, 5.0, 6.63, 7.66 };
        Vector vector2 = new Vector(arr1);
        double[] arr2 = { 4, 11, 0.54, 4.74, 5.31, 7.63, 10, 2.7, 22, 1.4 };
        Vector vector3 = new Vector(12, arr2);
        Vector vector4 = new Vector(vector3);
        double[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Vector vector5 = new Vector(11, arr3);

        System.out.println(vector1.getSize());
        System.out.println(vector2.getSize());
        System.out.println(vector3.getSize());
        System.out.println(vector4.getSize());

        System.out.println(vector1.toString());
        System.out.println(vector2.toString());
        System.out.println(vector3.toString());
        System.out.println(vector4.toString());

        System.out.println(vector3.getAddition(vector2).toString());

        System.out.println(vector2.getDifference(vector5).toString());

        System.out.println(vector5.turnVector());

        System.out.println(vector5.getLengthV());

        System.out.println(vector5.getComponentV(10));
        vector5.setComponentV(10, 5);
        System.out.println(vector5.getComponentV(10));

        System.out.println(Vector.getSumV(vector2, vector3));

        System.out.println(Vector.getSubtractionV(vector1, vector5));

        System.out.println(Vector.GetVectorMultipliedByAnotherVector(vector2, vector3));

    }

}


