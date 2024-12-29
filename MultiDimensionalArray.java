public class MultiDimensionalArray {
    public static void main(String[] args) {
        //Multidimentional arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        /* To access the elements of the myNumbers array, specify two indexes:
        one for the array, and one for the element inside that array.
        This example accesses the third element (2) in the second array (1) of myNumbers */
        System.out.println(myNumbers[1][2]); // Outputs 7

        int[][] myyNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
