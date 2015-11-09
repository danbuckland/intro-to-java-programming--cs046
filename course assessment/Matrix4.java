// This Matrix class has a contructor that has already
// been completed for you.
// It takes a int[][] as a parameter and saves it in
// the instance variable, matrix.
//
// Your task is to complete the sumOfEvenNumbers method
// to calculate and return the sum of all the even numbers in the array.
//
// Note that this is talking about the values themselves
// which are even and not about even indexes

public class Matrix
{
    private int[][] matrix;

    /**
     * Constructor for objects of class Matrix
     * @param array a 2-d array
     */
    public Matrix(int[][] array)
    {
        matrix = array;
    }


    /**
     * Gets the sum of all the even numbers in the matrix
     * @return the sum of all the even numbers
     */
    public int sumOfEvenNumbers()
    {
        // TODO: Return the sum of all the numbers which are even
        int sum = 0;
        for (int row = 0; row < matrix.length; ++row) {
            for (int col = 0; col < matrix[0].length; ++col) {
                if (matrix[row][col] % 2 == 0) sum += matrix[row][col];
            }
        }
        return sum;
    }

}

