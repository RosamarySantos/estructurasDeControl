  public class Iteracion5 {
    public static void main(String[] arg){
      int numero = 13;
      //queremos que muestre 12 11 10 .... 1
      for (int contador = numero ; contador > 0 ; contador-- ){
        if (contador % 2 != 0){
          continue;
        }
        System.out.println("  "+contador);
      }
    }
  }
