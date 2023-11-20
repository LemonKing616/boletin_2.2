public class Ejer_11 {
    public static void main(String[] args) {
        int[][] matriz1 = {{5, 8, 9, 0}, {2, 3, 7, 1}};
        int[][] matriz2 = {{4, 7, 5, 2}, {2, 5, 7, 4}};
        boolean sonInversas = sonMatricesInversas(matriz1, matriz2);
        System.out.println("¿Las matrices son inversas? " + sonInversas);
    }

    public static boolean sonMatricesInversas(int[][] matriz1, int[][] matriz2) { //el método  sonMatricesInversas  recibe dos matrices como parámetros. Primero, se verifica si las matrices tienen el mismo número de filas y columnas. Luego, se recorren las posiciones de las matrices y se compara el valor en la posición  (i, j)  de la primera matriz con el valor en la posición  (filas - 1 - i, columnas - 1 - j)  de la segunda matriz, donde  filas  y  columnas  son el número de filas y columnas de las matrices, respectivamente. Si en algún momento se encuentra un valor diferente, se devuelve  false . Si se recorren todas las posiciones sin encontrar diferencias, se devuelve  true , lo que indica que las matrices son inversas.
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        if (filas != matriz2.length || columnas != matriz2[0].length) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz1[i][j] != matriz2[filas - 1 - i][columnas - 1 - j]) {
                    return false;
                }
            }
        }

        return true;//La salida esperada para las matrices dadas sería: "¿Las matrices son inversas? true"
    }
}