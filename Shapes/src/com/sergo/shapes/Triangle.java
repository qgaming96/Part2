package com.sergo.shapes;

public class Triangle extends Shapes
{
    private final double EPSILON = 1.0e-10;

    private final double x1;
    private final double y1;

    private final double x2;
    private final double y2;

    private final double x3;
    private final double y3;


    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        this.x1 = x1;
        this.y1 = y1;

        this.x2 = x2;
        this.y2 = y2;

        this.x3 = x3;
        this.y3 = y3;

    }

    private double getMaxX(double x1, double x2, double x3)
    {

        double maxX = 0;

        if (x1 - x2 > EPSILON)
        {
            if (x1 - x3 > EPSILON)
            {
                maxX = x1;
            }
        }
        else
        {
            if (x2 - x3 > EPSILON)
            {
                maxX = x2;
            }
            else
            {
                maxX = x3;
            }
        }
        return maxX;
    }

    private double getMinX(double x1, double x2, double x3)
    {
        double minX = 0;
        if (x1 - x2 > EPSILON)
        {
            if (x3 - x2 > EPSILON)
            {
                minX = x2;
            }
        }
        else
        {
            if (x3 - x1 > EPSILON)
            {
                minX = x1;
            }
            else
            {
                minX = x3;
            }
        }
        return minX;
    }

    private double getMaxY(double y1, double y2, double y3)
    {
        double maxY = 0;

        if (y1 - y2 > EPSILON)
        {
            if (y1 - y3 > EPSILON)
            {
                maxY = y1;
            }
        }
        else
        {
            if (y2 - x3 > EPSILON)
            {
                maxY = y2;
            }
            else
            {
                maxY = y3;
            }
        }
        return maxY;

    }

    private double getMinY(double y1, double y2, double y3)
    {
        double minY = 0;

        if (y1 - y2 > EPSILON)
        {
            if (y3 - y2 > EPSILON)
            {
                minY = y2;
            }
        }
        else
        {
            if (y3 - y1 > EPSILON)
            {
                minY = y1;
            }
            else
            {
                minY = y3;
            }
        }
        return minY;
    }

    public double getLengthSide(double xA, double yA, double xB, double yB)
    {
        return Math.sqrt(Math.pow(xA - xB, 2) + Math.pow(yA - yB, 2));
    }

    @Override
    public double getWidth()
    {
        return getMaxX(x1, x2, x3) - getMinX(x1, x2, x3);
    }

    @Override
    public double getHeight()
    {
        return getMaxY(y1, y2, y3) - getMinY(y1, y2, y3);
    }

    @Override
    public double getArea()
    {
        double perimeter = getPerimeter();

        return Math.sqrt((perimeter * (perimeter - getLengthSide(x1, y1, x2, y2)) * (perimeter - getLengthSide(x2, y2, x3, y3)) * (perimeter - getLengthSide(x3, y3, x1, y1))));
    }

    @Override
    public double getPerimeter()
    {
        return getLengthSide(x1, y1, x2, y2) + getLengthSide(x2, y2, x3, y3) + getLengthSide(x3, y3, x1, y1);
    }


    public String toString()
    {
        return "Triangle [x1 =" + x1 + ", y1 =" + y1 + ", x2 =" + x2 + ", y2 =" + y2 + ", x3 =" + x3 + ", y3 = " + y3 + ", area =" + getArea() + ", perimeter = " + getPerimeter() + "]";
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
        Triangle s = (Triangle)o;
        return x1 == s.x1 && y1 == s.y1 && x2 == s.x2 && y2 == s.y2 && x3 == s.x3 && y3 == s.y3;
    }

    public int hashCode()
    {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(x1);
        hash = prime * hash + Double.hashCode(y1);
        hash = prime * hash + Double.hashCode(x2);
        hash = prime * hash + Double.hashCode(y2);
        hash = prime * hash + Double.hashCode(x3);
        hash = prime * hash + Double.hashCode(y3);
        return hash;
    }

}

