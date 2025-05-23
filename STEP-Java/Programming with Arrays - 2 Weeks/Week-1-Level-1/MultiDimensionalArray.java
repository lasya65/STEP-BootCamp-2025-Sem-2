/*Q9: Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element*/

import java.util.Scanner;

public class MultiDimensionalArray {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        // Creating a 2D array
        int[][] matrix = new int[rows][columns];
        
        // Taking user input for the 2D array elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Creating a 1D array to copy elements from 2D array
        int[] array = new int[rows * columns];
        int index = 0;
        
        // Printing the 2D array
        System.out.println("The elements in the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

    

        // Copying elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }
        
        // Printing the 1D array
        System.out.println("The elements in the 1D array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
