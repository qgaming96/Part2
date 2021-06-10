package sergo.shapes;

public class Square extends Shapes
{
    private final double sideLength;

    public Square(double sideLength)
    {
        this.sideLength = sideLength;
    }

    @Override
    public double getWidth()
    {
        return sideLength;
    }


    @Override
    public double getHeight()
    {
        return sideLength;
    }


    @Override
    public double getArea()
    {
        return Math.pow(sideLength, 2);
    }


    @Override
    public double getPerimeter()
    {
        return 4 * sideLength;
    }

    public String toString()
    {
        return "Square [side =" + sideLength + ", area =" + getArea() + ", perimeter = " + getPerimeter() + "]";
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
        Square s = (Square)o;
        return sideLength == s.sideLength;
    }

    public int hashCode()
    {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(sideLength);
        return hash;
    }


}