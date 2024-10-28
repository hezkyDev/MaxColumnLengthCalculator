import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MaxColumnLengths {

    public static int[] maxColLengths(List<String[]> tableRows) {
        if (tableRows == null || tableRows.isEmpty()) {
            return new int[0];  // Return an empty array if the list is null or empty
        }

        // Determine the number of columns based on the first row
        int numCols = tableRows.get(0).length;
        int[] maxLengths = new int[numCols];

        // Iterate through each row and update the maxLengths array
        for (String[] currentRow : tableRows) {
            // Ensure all rows have the same number of columns
            if (currentRow.length != numCols) {
                throw new IllegalArgumentException("All rows must have the same number of columns.");
            }
            for (int i = 0; i < currentRow.length; i++) {
                if (currentRow[i].length() > maxLengths[i]) {
                    maxLengths[i] = currentRow[i].length();
                }
            }
        }

        return maxLengths;
    }

    public static void main(String[] args) {
        // Example usage
        List<String[]> tableRows = new ArrayList<>();
        tableRows.add(new String[]{"abcdqw", "aafdcw4ffs", "ddheehed", "ddwq43334"});
        tableRows.add(new String[]{"ab", "acbdw", "dddddddddd", "fdfdfdfdffe333d"});
        tableRows.add(new String[]{"fdswddddd", "ab", "dddd", "ddd3dffff3"});

        int[] result = maxColLengths(tableRows);

        // Print the result using streams for more concise output
        Arrays.stream(result).forEach(length -> System.out.print(length + " "));
    }
}