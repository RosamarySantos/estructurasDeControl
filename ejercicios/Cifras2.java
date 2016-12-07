    //ejercicio igual que Cifras1.java
    //pero en este caso leemos los datos
    //como String
    import java.util.Scanner;
    public class Cifras2 {
      public static void main(String[] args){
        System.out.println("Introduce un número de tres cifras...");
        Scanner sc = new Scanner(System.in);
        String numeroLeido = sc.next();
        //comprobamos si el número es negativo
	      if ( numeroLeido.startsWith("-") )
          numeroLeido = numeroLeido.substring(1); // -123 123
        sc.close();
        //comprobamos que tiene tres cifras
	      if (numeroLeido.length() == 3) {
          char centena = numeroLeido.charAt(0);
          char decena = numeroLeido.charAt(1);
          char unidad = numeroLeido.charAt(2);
          //comprobamos que las tres caracteres son cifras
          if (Character.isDigit(centena) && Character.isDigit(decena) && Character.isDigit(unidad))
            System.out.printf("Unidad %c, decena %c, unidad %c\n", unidad, decena, centena);
          else
            System.out.println("Uno o todos los caracteres no son dígitos");
	      } else
          System.out.println("El número no tiene tres cifras");
      }
    }
