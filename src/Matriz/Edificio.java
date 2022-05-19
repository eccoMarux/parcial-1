package Matriz;
public class Edificio {
    public static void main(String[] args) {
        int[][] edificio = {{2,1,3,4},{1,0,5,6},{0,4,4,4} };
        System.out.println("Cantidad de personas en cada departamento del Edificio: ");
        mostrarMatriz(edificio);
        System.out.println("Promedio de personas viviendo en planta baja: "+ promedioPersonasPorPiso(edificio, 0));
        System.out.println("Promedio de personas viviendo en el piso 1: "+ promedioPersonasPorPiso(edificio, 1));
        System.out.println("Promedio de personas viviendo en el piso 2: "+ promedioPersonasPorPiso(edificio, 2));
    }

    public static void mostrarMatriz(int[][] matriz) {
        //Muestra un arreglo bidimensional por pantalla
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static float promedioPersonasPorPiso(int[][] matriz, int piso){
        //3a) El promedio de personas del piso 1.
        int suma=0;
        float promedio=0;
        for (int i = 0; i < matriz[piso].length; i++) {
            suma = suma + matriz[piso][i];
        }
        promedio = (float)suma / matriz[piso].length;
        return promedio;
    }
}
