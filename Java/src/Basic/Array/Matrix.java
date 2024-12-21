package Basic.Array;

public class Matrix {

    private static void printTransposeOfMatrix(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=i; j<mat[i].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        printMatrix(mat);
    }

    private static void printLowerTriangularSum(int[][] mat){
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            for( int j=0; j<mat[i].length; j++){
                if (i >= j){
                    sum += mat[i][j];
                }
            }
        }
        System.out.println("Lower Triangular Matrix Sum : " + sum);
    }

    private static void printUpperTriangularSum(int[][] mat){
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            for( int j=0; j<mat[i].length; j++){
                if (i <= j){
                    sum += mat[i][j];
                }
            }
        }
        System.out.println("Upper Triangular Matrix Sum : " + sum);
    }

    private static void printColumnWiseSum(int[][] mat){
        for(int i=0; i<mat[0].length; i++){
            int sum = 0;
            for (int[] element : mat) {
                sum += element[i];
            }
            System.out.println("Column " + (i+1) + " Sum : " + sum);
        }
    }

    private static void printRowWiseSum(int[][] mat) {
        for (int i=0; i<mat.length; i++){
            int sum = 0;
            for (int element : mat[i]){
                sum += element;
            }
            System.out.println("Row " + (i+1) + " Sum : " + sum);
        }
    }

    private static void printMatrix(int[][] mat){
        for (int[] row : mat){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4}, {4,1,31,3}, {21,2,21,3}};

        printRowWiseSum(mat);
        printColumnWiseSum(mat);

        // Taking normal matrix, rather than taking perfect lower and upper matrix.
        int[][] squareMat = {{1,2,3,4}, {4,1,31,3}, {21,2,21,3}, {1,1,3,3}};

        printLowerTriangularSum(squareMat);
        printUpperTriangularSum(squareMat);

        System.out.println("Transpose of Matrix :");
        printTransposeOfMatrix(squareMat);
    }

}
