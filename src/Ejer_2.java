public class Ejer_2 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int suma = sumarMatriz(matriz);
        System.out.println("La suma de todas las posiciones de la matriz es: " + suma);
    }

    public static int sumarMatriz(int[][] matriz) { //el método  sumarMatriz  recibe una matriz como parámetro y utiliza dos bucles  for  anidados para recorrer cada posición de la matriz. En cada posición, se suma el valor al acumulador  suma . Al finalizar el recorrido de la matriz, se devuelve el valor de  suma .
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}