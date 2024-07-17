public class Matriz {
    
    public static void  rotate(int size, int [][] m){
        for(int i=0; i<size/2; i++){
            for(int j=i; j<size-i-1; j++){
                int temp=m[i][j];
                m[i][j]=m[size - 1 - j][i];
                m[size-1-j][i]=m[size -1 -i] [size -1-i];
                m[size - 1 - i][size - 1 - j] = m[j][size - 1 - i];
                m[j][size-1-i]=temp;


            }

        }
        

    }

    public static void printMatrix(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz original:");
        printMatrix(matrix);

        rotate(matrix.length, matrix);

        System.out.println("Matriz rotada 90 grados en sentido horario:");
        printMatrix(matrix);
    }
}
