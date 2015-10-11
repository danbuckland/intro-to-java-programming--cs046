/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{
    public int largestPowerOf2(int n)
    {
        int x = 1;
        while (x * 2 < n) {
            x *= 2;
        }
        return x;
        //TODO: implement this method.
    }
}

