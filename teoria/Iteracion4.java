  public class Iteracion4 {
    public static void main(String[] arg){
      int numero = 13;
      //queremos que muestre 12 11 10 .... 1
      for (int contador = numero ; contador >= 1 ; contador-- )
        System.out.println("  "+contador);
      //vamos a trabajar con un método que haga lo mismo
      mostrarHaciaAtras(numero);
      mostrarHaciaAtrasConPasos(numero, 4);
      System.out.println("FIN DE PROGRAMA, valor de numero: "+numero);
    }
    public static void mostrarHaciaAtras(int digito) {
      for (int contador = digito ; contador >= 1 ; contador-- )
              System.out.println("  "+contador);
    }
    public static void mostrarHaciaAtrasConPasos(int digito, int pasos) {
      if (pasos > 0) {
        for (; ; digito -= pasos ){ //no hay inicialización ni condición
    	    if (digito <= 0){         //al no haber condición el bucle es infinito
            break;                  //break rompe el bucle
          }
          System.out.println("  "+digito);
	      }  
      }
    }

  }
