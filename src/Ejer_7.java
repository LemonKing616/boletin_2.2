public class Ejer_7 {
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}};

        boolean sonIguales = sonMatricesIguales(matriz1, matriz2);
        System.out.println("¿Las matrices son exactamente iguales? " + sonIguales);
    }

    public static boolean sonMatricesIguales(int[][] matriz1, int[][] matriz2) { //el método  sonMatricesIguales  recibe dos matrices como parámetros. Primero, se comprueba si las matrices tienen la misma cantidad de filas y columnas. Si no tienen la misma estructura, se devuelve  false . Luego, se recorren las matrices elemento por elemento y se comparan. Si se encuentra algún elemento diferente, se devuelve  false . Si se recorren todas las posiciones sin encontrar diferencias, se devuelve  true , lo que indica que las matrices son exactamente iguales.
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            return false;
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}