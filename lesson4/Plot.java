// BlueJ Project: lesson4/fields

public class Plot
{
    private int width;
    private int length;

    /**
        Constructs a plot of a given size.
        @param width the width of the plot
        @param length the length of the plot
    */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
    public int getNumberOfFields(int radius)
    {
        // TODO: Using the formulas that Sara developed, compute
        // the total number of rows, then
        // the number of even and odd rows,
        // the number of columns in each even and odd row,
        // and finally the total number of fields
	int diameter = 2 * radius;

	if (length < diameter) return 0;
	if (width < diameter) return 0;

	int reducedDiameter = (int) (Math.sqrt(3.0) * radius);

	int oddRows = 1;
	int evenRows = 0;
	int restLength = length - diameter;
	while (restLength >= reducedDiameter) {
		restLength -= reducedDiameter;
		if (evenRows < oddRows) ++evenRows;
		else ++oddRows;        	
	}
	
	int nrFieldsInOddRows = width / diameter;
	int nrFieldsInEvenRows = (width - radius) / diameter;
	int total = oddRows * nrFieldsInOddRows + evenRows * nrFieldsInEvenRows;
	
//	System.out.println("width: " + width);
//	System.out.println("length: " + length);
//	System.out.println("radius: " + radius);
//	System.out.println("diameter: " + diameter);
//	System.out.println("reducedDiameter: " + reducedDiameter);
//	System.out.println("oddRows: " + oddRows);
//	System.out.println("evenRows: " + evenRows);
//	System.out.println("nrFieldsInOddRows: " + nrFieldsInOddRows);
//	System.out.println("nrFieldsInEvenRows: " + nrFieldsInEvenRows);
//	System.out.println("total: " + total);

	return total;
        
    }
}
