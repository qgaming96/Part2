package sergo.vector;

import java.util.Arrays;

public class Vector
{

    private double[] vector;


    public Vector(int n)
    {

        if (n <= 0)
        {
            throw new IllegalArgumentException("n не может быть меньше либо равной 0");
        }
        else
        {
            vector = new double[n];

        }
    }


    public Vector(Vector o)
    {

        vector = o.vector;
    }


    public Vector(double[] arr)
    {
        int length = arr.length;
        vector = new double[length];
        System.arraycopy(arr, 0, vector, 0, length);
    }


    public Vector(int n, double[] arr)
    {

        if (n <= 0)
        {
            throw new IllegalArgumentException("n не может быть меньше либо равной 0");
        }
        else
        {

            int length = arr.length;
            vector = new double[n];
            System.arraycopy(arr, 0, vector, 0, length);
        }
    }

    public double[] getVector(){
        return vector;
    }

    public int getSize()
    {
        return vector.length;
    }


    public String toString()
    {
        return Arrays.toString(vector);
    }


    public Vector getAddition(Vector twice)
    {
        int firstCount = this.getSize();
        int twiceCount = twice.getSize();
        double[] sum;

        if (firstCount > twiceCount)
        {
            sum = new double[firstCount];
            for (int i = 0; i < firstCount; ++i)
            {
                if (i < twiceCount)
                {
                    sum[i] = this.vector[i] + twice.vector[i];
                }
                else
                {
                    sum[i] = this.vector[i];
                }

            }

        }
        else if (firstCount < twiceCount)
        {
            sum = new double[twiceCount];
            for (int i = 0; i < twiceCount; ++i)
            {
                if (i < firstCount)
                {
                    sum[i] = this.vector[i] + twice.vector[i];
                }
                else
                {
                    sum[i] = twice.vector[i];
                }
            }
        }
        else
        {
            sum = new double[twiceCount];
            for (int i = 0; i < twiceCount; ++i)
            {
                sum[i] = this.vector[i] + twice.vector[i];
            }

        }
        this.vector = sum;
        return this;

    }




    public Vector getDifference(Vector twice)
    {
        int firstCount = this.getSize();
        int twiceCount = twice.getSize();
        double[] sub;

        if (firstCount > twiceCount)
        {
            sub = new double[firstCount];
            for (int i = 0; i < firstCount; ++i)
            {
                if (i < twiceCount)
                {
                    sub[i] = this.vector[i] - twice.vector[i];
                }
                else
                {
                    sub[i] = this.vector[i];
                }

            }

        }
        else if (firstCount < twiceCount)
        {
            sub = new double[twiceCount];
            for (int i = 0; i < twiceCount; ++i)
            {
                if (i < firstCount)
                {
                    sub[i] = this.vector[i] - twice.vector[i];
                }
                else
                {
                    sub[i] = -twice.vector[i];
                }
            }
        }
        else
        {
            sub = new double[twiceCount];
            for (int i = 0; i < twiceCount; ++i)
            {
                sub[i] = this.vector[i] - twice.vector[i];
            }

        }
        this.vector = sub;

        return this;

    }

    public Vector multiplyByScalar(double scalar)
    {

        for (int i = 0; i < this.getSize(); i++)
        {
            vector[i] = vector[i] * scalar;
        }
        return this;
    }


    public Vector turnVector()
    {
        return multiplyByScalar(-1);
    }


    public double getLengthV()
    {
        int count = getSize();
        int sum = 0;
        for (int i = 0; i < count; ++i)
        {
            sum += Math.pow(vector[i], 2);
        }
        return Math.sqrt(sum);
    }


    public double getComponentV(int index)
    {
        try
        {
            return vector[index];
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Некорректный индекс");
            throw e;
        }
    }


    public void setComponentV(int index, double value)
    {
        try
        {
            vector[index] = value;
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Некорректный индекс");
            throw e;
        }
    }

    public boolean equals(Object o)
    {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass())
        {
            return false;
        }
        Vector v = (Vector)o;
        return vector == v.vector;
    }


    public int hashCode()
    {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Arrays.hashCode(vector);
        return Math.abs(hash);
    }


    public static Vector getSumV(Vector first, Vector twice)
    {
        Vector result = new Vector(first);
        return result.getAddition(twice);
    }


    public static Vector getSubtractionV(Vector first, Vector twice)
    {
        Vector result = new Vector(first);
        return result.getDifference(twice);
    }


    public static double GetVectorMultipliedByAnotherVector(Vector first, Vector twice)
    {
        double result = 0;
        int length = Math.min(first.getSize(), twice.getSize());

        for (int i = 0; i < length; i++)
        {
            result += first.vector[i] * twice.vector[i];
        }
        return result;

    }

}