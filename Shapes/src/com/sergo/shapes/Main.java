package com.sergo.shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {

        Shapes first = new Square(7.566);
        Shapes twice = new Rectangle(3.87, 9.45);
        Shapes third = new Triangle(3.6, 2.33, -3.42, 1.29, 0.53, -4.16);
        Shapes fourth = new Circle(5.221);
        Shapes fifth = new Triangle(-5.39, -3.487, -1.12, -0.13, 2.59, -2.74);

        ArrayList<Shapes> shapes = new ArrayList<Shapes>();

        shapes.add(first);
        shapes.add(twice);
        shapes.add(third);
        shapes.add(fourth);
        shapes.add(fifth);

        int size = shapes.size();

        Collections.sort(shapes, Shapes.AreaComparator);
        System.out.println(shapes.get(size - 1).getArea());

        Collections.sort(shapes, Shapes.PerimeterComparator);
        System.out.println(shapes.get(size - 2).getPerimeter());

    }
}