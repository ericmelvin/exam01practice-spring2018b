package exam01;
import java.util.Arrays;
public class ArrayUtil {
    //counts how many times the minimum of each array occurs, and returns these counts
    //in an array
    public static int[] countMins(int[]...arrays) {
		
		// Loop over each array in arrays and establish the minimum value
			
		
		// Hold minimums for each array
		int[] mins = new int[arrays.length];
		// Hold counts in array
		int[] counts = new int[arrays.length];
		
		for (int i=0; i<arrays.length; i++) {
			// If the value is usable
			//if (arrays[i] != null && arrays[i].length > 0) {
			// Set the minimum value to the first array position
			int minimum = arrays[i][0];
			// Loop over remaining array indexes
			if (arrays[i].length > 0) {
				for (int j=1; j<arrays[i].length; j++) {
					
					int nextIndex = arrays[i][j];
					if (nextIndex < minimum) {
						minimum = nextIndex;
					}
					
				}
			}
			mins[i] = minimum;
		}	
		// Loop over each array and count the number of times the minimum value occures
		for (int i=0; i<arrays.length; i++) {
			for (int j=0; j<arrays[i].length; j++) {
				int currentValue = arrays[i][j];
				if (currentValue == mins[i]) {
					counts[i] += 1;
				}
			}
		}
		
		
        return counts;
    }
}