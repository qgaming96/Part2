package com.sergo.shapes;

public class Circle extends Shapes
{
    private final double radius;

    public Circle(double radius)
    {

        this.radius = radius;
    }

    @Override
    public double getWidth()
    {
        return radius * 2;
    }

    @Override
    public double getHeight()
    {
        return radius * 2;
    }

    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public String toString()
    {
        return "Rectangle [radius =" + radius + ", area =" + getArea() + ", perimeter = " + getPerimeter() + "]";
    }

    public boolean equals(Object o)
    {

        if (o == this)
        {
            return true;
        }
        if (o == null || o.getClass() != this.getClass())
        {
            return false;
        }
        Circle s = (Circle)o;

        return radius == s.radius;
    }


    public int hashCode()
    {

        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(radius);

        return hash;
    }

}
