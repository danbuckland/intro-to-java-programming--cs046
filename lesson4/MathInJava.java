// BlueJ project: lesson4/turningMathToJava
// Video: Arithmetic Operations 2

// TODO: The amdahlSpeedup, crossRatio and average methods
// aren't working yet. Use the fact sheet and your new 
// knowledge of math expressions in java to fix these methods. 

public class MathInJava
{
    /*
       Computes the fraction

           1
      -----------
           1 - s
       s + -----
             n

      See http://en.wikipedia.org/wiki/Amdahl%27s_law
    */
    public double amdahlSpeedup(double s, double n)
    {
        return 1.0 / (s + (1.0 - s) / n);
    }

    /*
      Computes the fraction

      (a - c)(b - d)
      --------------
      (b - c)(a - d)

      See http://en.wikipedia.org/wiki/Cross-ratio
    */
    public double crossRatio(double a, double b, double c, double d)
    {
        return ((a - c) * (b - d)) / ((b - c) * (a - d));
    }

    /**
      Computes the average of four values.
      @param a the first value
      @param b the second value
      @param c the third value
      @param d the fourth value
      @return the average of the four values
    */
    public double average(int a, int b, int c, int d)
    {
        return (double) (a + b + c + d ) / 4.0;
    }
}

