  //leemos un número de tres cifras, 
  //lo leemos como un int
  import java.util.Scanner;
  public class Cifras1{
    public static void main(String[] args){
      System.out.println("Introduce un número de tres cifras....");
      Scanner sc = new Scanner(System.in);
      int numeroLeido = Math.abs(sc.nextInt());
      sc.close();
      //comprobamos que el número tiene tres cifras
      if(numeroLeido > 99 && numeroLeido < 1000) {
        System.out.println("Número de tres cifras");
       	int centena = numeroLeido / 100;
        int decena  = numeroLeido % 100 / 10; 
        int unidad  = numeroLeido % 100 % 10;
        System.out.printf("Unidad %d, decena %d, centena %d%n", unidad, decena, centena);
      } else {
        System.out.println("Número que no tiene tres cifras");
      }
    }
  }
