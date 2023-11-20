public class Ejer_9 {
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 3, 5, 6}, {4, 2, 0, 8}, {4, 2, 0, 8}, {1, 3, 5, 6}};
        boolean esSimetrica1 = esMatrizSimetrica(matriz1);
        System.out.println("¿La matriz 1 es simétrica en función del eje X? " + esSimetrica1);

        int[][] matriz2 = {{1, 4, 6}, {2, 1, 3}};
        boolean esSimetrica2 = esMatrizSimetrica(matriz2);
        System.out.println("¿La matriz 2 es simétrica en función del eje X? " + esSimetrica2);
    }

    public static boolean esMatrizSimetrica(int[][] matriz) { //método  esMatrizSimetrica  recibe una matriz como parámetro. Primero, se verifica si la matriz tiene el mismo número de filas y columnas, ya que una matriz simétrica debe ser cuadrada. Luego, se recorren las posiciones de la matriz y se compara el valor en la posición  (i, j)  con el valor en la posición  (filas - 1 - i, j) , donde  filas  es el número de filas de la matriz. Si en algún momento se encuentra un valor diferente, se devuelve  false . Si se recorren todas las posiciones sin encontrar diferencias, se devuelve  true , lo que indica que la matriz es simétrica en función del eje X.
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != matriz[filas - 1 - i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}//La salida esperada para la matriz 1 sería: "¿La matriz 1 es simétrica en función del eje X? true"
    //La salida esperada para la matriz 2 sería: "¿La matriz 2 es simétrica en función del eje X? false"