package com.sergo.shapes;

public class Rectangle extends Shapes
{
    private final double width;
    private final double height;



    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getWidth()
    {
        return width;
    }

    @Override
    public double getHeight()
    {
        return height;
    }

    @Override
    public double getArea()
    {
        return width * height;
    }

    @Override
    public double getPerimeter()
    {
        return width * 2 + height * 2;
    }



    public String toString()
    {
        return "Rectangle [width =" + width + ", height =" + height + ", area =" + getArea() + ", perimeter = " + getPerimeter() + "]";
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
        Rectangle s = (Rectangle)o;
        return width == s.width && height == s.height;
    }

    public int hashCode()
    {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(width);
        hash = prime * hash + Double.hashCode(height);
        return hash;
    }

}