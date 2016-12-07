  //programa que lee el nombre desde la entrada estándar
  //usando la clase Scanner y muetra en pantalla el mensaje
  //¡Hola nombreLeido!
  import java.util.Scanner;
  public class Nombre {
    public static void main(String[] arg){
      System.out.println("Introduce tu nombre con los apellidos incluidos");
      //nos ayudamos de un Scanner
      Scanner sc = new Scanner(System.in);
      String nombre = sc.nextLine();
      //no nos hace falta ya el Scanner, lo cerramos
	    sc.close();
      System.out.printf("¡Hola %s!%n", nombre);
    }
  }
