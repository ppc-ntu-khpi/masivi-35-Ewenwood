import java.util.Arrays;

public class Test {

    public static void main(String[] args) {


        int randomN = (int) (Math.random()*10);
        int randomM = (int) (Math.random()*10);
        int[][] matrix0 = new int[randomN][randomM];
        int[][] matrix1 = new int[randomN][randomM];
        int[] matrixSize = new int[2];
        matrixSize[0] = randomN;
        matrixSize[1] = randomM;

        Main.setupArray(matrix0);
        Main.setupArray(matrix1);

        System.out.println("Перавая матрица: "+ Arrays.deepToString(matrix0));
        System.out.println("Вторая матрица: "+ Arrays.deepToString(matrix1));
        System.out.println("Сумма матриц: ");
        Main.sumOfArrays(matrix0,matrix1,matrixSize);




    }


}
