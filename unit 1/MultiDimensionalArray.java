public class MultiDimensionalArray {
    public static void main(String[] args) {

        // Declare and initialize a 2D array
        int[][] numbers = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Display the elements of the array
        System.out.println("Elements of the 2D Array:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
