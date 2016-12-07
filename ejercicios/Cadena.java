  //ejercicio 1 sobre API String
  public class Cadena {
    public static void main(String[] arg){
      String cadenaEjemplo = " Hola mundo, hello world, lo que sea... ";
      //ejemplo de uso del método contains
      String cadenaABuscar1 = "Hola";
      String cadenaABuscar2 = "hola";
      //System.out.println(cadenaEjemplo.contains(cadenaABuscar1));
      //System.out.println(cadenaEjemplo.contains(cadenaABuscar2));
      System.out.printf("%s ¿contiene %s? %b\n", cadenaEjemplo, cadenaABuscar1, cadenaEjemplo.contains(cadenaABuscar1)); 
      System.out.printf("%s ¿contiene %s? %b\n", cadenaEjemplo, cadenaABuscar2, cadenaEjemplo.contains(cadenaABuscar2)); 
      //ejemplo de uso de endsWith()
      System.out.printf("%s ¿acaba en? %s %b%n", cadenaEjemplo, "...", cadenaEjemplo.endsWith("..."));
      System.out.printf("%s ¿acaba en? %s %b%n", cadenaEjemplo, "... ", cadenaEjemplo.endsWith("... "));
      //ejemplo de uso de equalsIgnoreCase equals 
      System.out.printf("%s ¿es igual a %s usando equalsIgnoreCase? %b%n", cadenaABuscar1, cadenaABuscar2, cadenaABuscar1.equalsIgnoreCase(cadenaABuscar2));
      System.out.printf("%s ¿es igual a %s usando equals? %b%n", cadenaABuscar1, cadenaABuscar2, cadenaABuscar1.equals(cadenaABuscar2));
      //ejemplo de uso del método isEmpty()
      System.out.println("Ejemplo de uso de isEmpty con la cadena hola "+ "hola".isEmpty());
      System.out.println("Ejemplo de uso de isEmpty con la cadena vacía "+ "".isEmpty());
      //ejemplo de uso del método startsWith
      System.out.printf("%s ¿empieza por Hola? %b\n", cadenaEjemplo, cadenaEjemplo.startsWith("Hola"));
      System.out.printf("%s ¿empieza por  Hola? %b\n", cadenaEjemplo, cadenaEjemplo.startsWith(" Hola"));
      //ejemplo de uso del método length
      System.out.printf("La longitud de la cadena %s es %d%n", cadenaEjemplo, cadenaEjemplo.length());
      //ejemplo de uso del método charAt
      System.out.println(cadenaEjemplo);
      for (int i = 0; i < cadenaEjemplo.length() ; i ++)
        System.out.printf("El caracter de posición %2d de la cadena es %c%n", i,  cadenaEjemplo.charAt(i));
      //Ejemplo de uso del método replace
      System.out.printf("Modificando en la cadena %s %c por %c%n%s%n", cadenaEjemplo, 'o', 'O', cadenaEjemplo.replace('o', 'O'));
      System.out.println(cadenaEjemplo);
      //ejemplo de toUpperCase y toLowerCase
      System.out.println(cadenaEjemplo.toUpperCase());
      System.out.println(cadenaEjemplo);
      System.out.println(cadenaEjemplo.toLowerCase());
      System.out.println(cadenaEjemplo);
      //ejemplo del método substring
      System.out.printf("Una subcadena de %s puede ser\n%s\n", cadenaEjemplo, cadenaEjemplo.substring(10));
      System.out.printf("Una subcadena de %s puede ser\n%s\n", cadenaEjemplo, cadenaEjemplo.substring(10,20));
      //ejemplo de uso del método trim
      System.out.printf("%s de longitud %d\n", cadenaEjemplo, cadenaEjemplo.length());
      System.out.printf("%s de longitud %d\n", cadenaEjemplo.trim(), cadenaEjemplo.trim().length());
    }
  }
