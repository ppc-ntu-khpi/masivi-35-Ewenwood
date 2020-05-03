public class Main {
    /**
     * Метод, который суммирует входные массивы и выводит конечный массив
     * @param firstArray Первое слагаемое
     * @param secondArray Второе слагаемое
     * @param matrixSize Размер матрицы (необходим для установки размера третьей матрицы, как конечный массив)
     */
     static void sumOfArrays( int[][]firstArray, int[][]secondArray, int[]matrixSize) {
         /**
          * Конечная матрица суммы
          */
         int[][]sum = new int[matrixSize[0]][matrixSize[1]];
         /**
          * Вложеный цикл. Проходит по матрице и слаживает каждый элемент первой матрцы с соответствующим элементом второй матрицы и выводит конечный результат
          */
         for (int i = 0; i < sum.length; i++) {

            for (int j = 0; j < sum[i].length; j++) {

                sum[i][j] = firstArray[i][j] + secondArray[i][j];
                System.out.print(sum[i][j] + " ");

            }

            System.out.println();

        }

    }

    /**
     * Метод, который инициализирует входной массив случайными числами в диапазоне от 0-50
     * @param array Входной массив для инициализации
     * @return Конечный инициализированый массив
     */
    static int[][] setupArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random()*50);
            }
        }

        return array;
    }


}