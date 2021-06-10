package com.sergo.shapes;

import java.util.Comparator;

public abstract class Shapes implements Comparable<Shapes> {

    public abstract double getWidth();

    public abstract double getHeight();

    public abstract double getArea();

    public abstract double getPerimeter();

    public int compareTo(Shapes o)
    {
        return (int)(this.getArea() - o.getArea());
    }

    public static Comparator<Shapes> AreaComparator = new Comparator<Shapes>() {
        @Override
        public int compare(Shapes o1, Shapes o2)
        {
            return (int)(o1.getArea() - o2.getArea());
        }
    };
    public static Comparator<Shapes> PerimeterComparator = new Comparator<Shapes>() {
        @Override
        public int compare(Shapes o1, Shapes o2)
        {
            return (int)(o1.getPerimeter() - o2.getPerimeter());
        }
    };
}
