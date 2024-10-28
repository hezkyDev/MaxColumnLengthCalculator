# Max Column Length Calculator

This project contains a Java program that calculates the maximum string length in each column of a list of string arrays.

## Problem Statement

Given a list of string arrays, each array representing a row of data, the task is to determine the maximum length of the strings in each column.

For example, given the following input:

abcdqw      aafdcw4ffs    ddheehed    ddwq43334
ab          acbdw         dddddddddd  fdfdfdfdffe333d
fdswddddd   ab            dddd        ddd3dffff3

The output will be an array containing the maximum string lengths for each column:

[9, 10, 10, 15]

## Solution Approach

### maxColLengths Method

The `maxColLengths` method takes a `List<String[]>` as input and calculates the maximum length for each column. It iterates through each row and updates an array that keeps track of the maximum lengths of each column.

#### Pseudocode:
1. If the input list is empty or null, return an empty array.
2. Determine the number of columns based on the length of the first row.
3. For each row:
   - If the row has a different number of columns than the first row, throw an exception.
   - For each string in the row, update the maximum length for the corresponding column if the string's length is larger than the current maximum.
4. Return an array of the maximum lengths for each column.

How It Works

	•	Input: A List<String[]>, where each String[] represents a row, and each string in the array represents a column value.
	•	Process:
	1.	The number of columns is determined based on the first row.
	2.	The function iterates over each row and checks the length of each string in that row.
	3.	The function then updates the maximum length for each column if a string is longer than the previous maximum for that column.
	•	Output: An int[] array where each element represents the maximum string length of the corresponding column.

Example:

Input:

List<String[]> rows = new ArrayList<>();
rows.add(new String[]{"abcdqw", "aafdcw4ffs", "ddheehed", "ddwq43334"});
rows.add(new String[]{"ab", "acbdw", "dddddddddd", "fdfdfdfdffe333d"});
rows.add(new String[]{"fdswddddd", "ab", "dddd", "ddd3dffff3"});

Output:

9 10 10 15

Requirements

	•	Java 1.8 or higher
	•	No third-party libraries are used.

How to Run the Program

Prerequisites

	•	Ensure that Java is installed on your machine.
	•	Any standard IDE (like Eclipse, IntelliJ IDEA) or a command-line interface (CLI) can be used to compile and run the code.

Steps to Run

	1.	Download or Clone the Project:
	•	You can clone the project from a repository or download the code and place it in a Java project directory.
	2.	Compile the Java File:
	•	If you’re using the command line, navigate to the directory where the .java file is located.
	•	Run the following command to compile the file:

javac MaxColumnLengths.java


	3.	Run the Program:
	•	Once the program is compiled, run it with:

java MaxColumnLengths


	4.	Modify the Input:
	•	You can modify the List<String[]> inside the main() method to test with different inputs.

Testing

To run different test cases, modify the list in the main() method and re-run the program. The expected output will print the maximum string length for each column.

Example Test Cases:

	1.	Test Case 1:

{"abc", "defgh", "i"}
{"jk", "lmnopq", "rstu"}

Expected Output:

3 6 4


	2.	Test Case 2 (Single Row):

{"abcd", "efghijk", "lmn"}

Expected Output:

4 7 3


	3.	Test Case 3 (Empty Input):

// No input rows

Expected Output:

// No output (empty)



Edge Cases

	•	Null or empty list: Returns an empty array.
	•	Inconsistent number of columns across rows: Throws an IllegalArgumentException to maintain data integrity.

License

NA