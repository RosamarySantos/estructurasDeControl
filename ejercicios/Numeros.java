  public class Numeros {
    public static void main(String[] arg) {
      // secuencia 1  2  3 .... 10
      for (int i = 1; i <= 10; i++)
        System.out.printf("%3d", i);
      System.out.println();
      //secuencia 20 25 30 ...  80
      int contador = 20;
      while (contador <= 80) {
        System.out.printf("%3d", contador);
        contador += 5;  //contador = contador + 5
      }
      System.out.println();
      //secuencia 100 98 96 94 ... 50
      contador = 100; //reseteamos el contador anterior
      do {
        System.out.printf("%3d", contador);
        contador -= 2;  //contador = contador - 2
      } while (contador >= 50);
      System.out.println();
      //calculo de la suma del 1 al 100
      int suma = 0;
      for (int i = 1; i <= 100; i++)
        suma += i;
      System.out.printf("La suma de los 100 primero números vale %d%n", suma);
      //calculo de la suma de lo pares y de la suma de los impares
      //comprendidos entre 1 y 50
      int sumaPares   = 0;
      int sumaImpares = 0;
      contador = 1; //reseteo el contador anterior
      while (contador <= 50) {
        if (contador % 2 == 0)
          sumaPares   += contador;  //sumaPares = sumaPares + contador;
        else
          sumaImpares += contador;
        contador++;
      }
      System.out.printf("La suma de los pares comprendidos entre 0 y 50 es %d, y la de los impares es %d%n", sumaPares, sumaImpares);
      //Calcular la la suma de los cuadrados de los 15 primeros números naturales
      contador = 1; //reseteo el contador definido anteriormente
      int sumaCuadrados = 0;
      do {
        sumaCuadrados += contador * contador;
        contador++;
      } while (contador <= 15);
      System.out.printf("La suma de los cuadrados de los 15 primeros" + 
			" números vale %d%n", sumaCuadrados);







    }
  }
