//compruebe si en una matriz hay algún valor negativo, y devuelva un
//valor booleano.
public class Ejer_1 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {-4, 5, 6}, {7, 8, -9}};
        boolean hayNegativo = comprobarNegativos(matriz);
        //llamar a un método y asignar el resultado a una variable booleana llamada  hayNegativo .
       //verificar si hay algún número negativo en la matriz y almacenar el resultado en la variable  hayNegativo .
        // El método  comprobarNegativos  probablemente recibe la matriz como parámetro, realiza la verificación y devuelve un valor booleano que indica si se encontró algún número negativo en la matriz.
       ////este fragmento se utiliza para asignar el resultado de la verificación a la variable  hayNegativo .
                System.out.println("¿Hay algún valor negativo en la matriz? " + hayNegativo);
    }

    public static boolean comprobarNegativos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    return true;// Si encuentra un número negativo ( matriz[i][j] < 0 ), devuelve  true ,

                    //recibe una matriz de enteros como parámetro y devuelve un valor booleano.
                    //recorrer la matriz y verificar si hay algún número negativo.
                    // Utiliza un bucle  for  anidado para iterar sobre cada elemento de la matriz.

                    // indicando que se encontró al menos un número negativo en la matriz.
                    //Si no se encuentra ningún número negativo en la matriz,
                    // el bucle continuará hasta que se hayan recorrido todos los elementos.
                    // En ese caso, fuera del bucle, el método devolverá  false ,
                    // indicando que no se encontraron números negativos en la matriz.
                    //En resumen, este método verifica si hay algún número negativo en una matriz de enteros y devuelve  true
                    // si se encuentra al menos uno, o  false  si no se encuentra ninguno.
                }
            }
        }
        return false;
    }
}