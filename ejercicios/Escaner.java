  //clase para demostrar el uso de la clase Scanner
  //debemos importar antes la biblioteca de Scanner
  import java.util.Scanner;
  public class Escaner {
    public static void main(String[] arg){
      System.out.println("Introduce frase");
      Scanner sc = new Scanner(System.in);
      //leemos una línea
      String lineaLeida = sc.nextLine();
      //leemos una palabra del escaner
      System.out.println("Introduce palabra");
      String palabraLeida = sc.next();
      //leemos un número entero
      System.out.println("Introduce entero");
      int numeroEnteroLeido = sc.nextInt();
      //leemos un número en coma flotante
      System.out.println("Introduce decimal");
      double numeroDoubleLeido = sc.nextDouble();
      //cierro el escaner, no me hace falta mas
      sc.close();
      //muestro los datos leidos
      System.out.printf("La palabra leída ha sido: %s%n", palabraLeida);
      System.out.printf("La línea leída ha sido: %s%n", lineaLeida);
      System.out.printf("El número entero leído ha sido: %d%n", numeroEnteroLeido);
      System.out.printf("El número decimal leído ha sido: %.2f%n", numeroDoubleLeido);
    }
  }
