package Censista;

public class testCensita {
    public static void main(String[] args) {
        Censista pepe, ana, pablo, laura;
        pepe = new Censista(123, 321, 12, 20, 17, "Neuquen", "Neuquen");
        ana = new Censista(233, 454, 13, 20, 10, "Neuquen", "Neuquen");
        pablo = new Censista(789, 654, 14, 20, 14, "Neuquen", "Neuquen");
        laura = new Censista(456, 564, 15, 20, 18, "Neuquen", "Neuquen");
        Censista[] personas = { pepe, ana, pablo, laura };

        // Estructura improvisada para testear el modulo Ejercicio 2a.
        for (int i = 0; i < 4; i++) {
            if (censoMasSetenta(personas)[i] != null) {
                System.out.println(censoMasSetenta(personas)[i].toString());
                System.out.println("-----------------------------");
            } else {
                System.out.println("null");
                System.out.println("-----------------------------");
            }
        }
    }

    public static Censista[] censoMasSetenta(Censista[] arreglo) {
        // Ejercicio 2a)
        // Utilice un método para que dado un arreglo de Censistas genere un nuevo
        // arreglo con aquellos censistas que censaron más del
        // 70% del total de viviendas. Considere que el arreglo está completo.
        Censista[] arregloPersonas = new Censista[arreglo.length];
        int i, j = 0;
        double porcentaje;
        for (i = 0; i < arreglo.length; i++) {
            porcentaje = (arreglo[i].getTotalViviendas() * 70) / 100;
            if (arreglo[i].getCantCensadas() > porcentaje) {
                arregloPersonas[j] = arreglo[i];
                j++;
            }
        }
        return arregloPersonas;
    }

}
