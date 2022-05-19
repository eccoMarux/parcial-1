package Strings;

public class Actividad {
  public static void main(String[] args) {
    String cadena = " horno hrehacer hongo tahha";
    System.out.println("Cantidad de palabras con h intermedia: " + palabrasHintermedia(cadena));
  }

  // Si desea puede trabajar con métodos propios de la clase String. Realice
  // pseudocódigo e implementación en java para que dada una frase separada por
  // blancos
  public static int palabrasHintermedia(String oracion) {
    // retorne la cantidad de palabras que contengan la “h” en cualquier posición
    // que no sea el principio y al final.
    int cantPalabras = 0, evaluacion;
    oracion = oracion.toLowerCase();
    String[] palabras = oracion.split(" ");
    for (int i = 0; i < palabras.length; i++) {
      evaluacion = palabras[i].indexOf('h', 1); // falto el 1 en el examen.
      if (evaluacion > 0 && evaluacion < (palabras[i].length() - 1)) {
        cantPalabras = cantPalabras + 1;
      }
    }
    return cantPalabras;
  }
}
