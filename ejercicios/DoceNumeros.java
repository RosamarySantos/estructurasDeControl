  //ejercicio que lee doce números de tipo 
  //double. Posteriormente muestra los datos
  //con formato
  import java.util.Scanner;
  public class DoceNumeros {
    public static void main(String[] arg){
      System.out.println("Introduce doce números decimales:");
      Scanner sc = new Scanner(System.in);
      int contador = 0;
      while (sc.hasNextDouble()){ //el scanner está funcionando hasta que haya doubles
        double valorLeido = sc.nextDouble(); //leemos double
        contador++; //contador para poder imprimir en cuatro líneas
        System.out.printf("%9.2f",valorLeido); //formateo de la salida, tabulación(9 caracteres) y número de decimales(2)
        if (contador % 4 == 0) //en el caso que se hayan leído cuatro números, hacemos salto de línea
          System.out.println(); //salto de línea
      }
      //cerramos el Scanner
      sc.close();
      //salto de línea final, para no quedar pegado al prompt
      System.out.println();
    }
  }
