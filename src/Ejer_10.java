public class Ejer_10{
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 0, 3, 1}, {4, 2, 7, 2, 4}, {6, 1, 9, 1, 6}, {0, 8, 8, 8, 0}};
        boolean esSimetrica = esMatrizSimetrica(matriz);
        System.out.println("¿La matriz es simétrica en función del eje Y? " + esSimetrica);
    }

    public static boolean esMatrizSimetrica(int[][] matriz) { //el método  esMatrizSimetrica  recibe una matriz como parámetro. Se recorren las posiciones de la matriz y se compara el valor en la posición  (i, j)  con el valor en la posición  (i, columnas - 1 - j) , donde  columnas  es el número de columnas de la matriz. Si en algún momento se encuentra un valor diferente, se devuelve  false . Si se recorren todas las posiciones sin encontrar diferencias, se devuelve  true , lo que indica que la matriz es simétrica en función del eje Y.
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas / 2; j++) {
                if (matriz[i][j] != matriz[i][columnas - 1 - j]) {
                    return false;
                }
            }
        }

        return true;//La salida esperada para la matriz dada sería: "¿La matriz es simétrica en función del eje Y? true"
    }
}