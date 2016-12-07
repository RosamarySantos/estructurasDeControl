  public class Aritmetica{
    public static void main(String[] arg){
      repasarTablaMultiplicar(Integer.parseInt(arg[0]));
    }
    public static void repasarTablaMultiplicar(int numero){
      for (int i = 1 ; i <= numero ; i++){
        System.out.println("Tabla de multiplicar del " + i);
        for (int j = 1; j <= 10 ; j++) {
          //código de la tabla de multiplicar
          System.out.println( i + " x " + j + " = " + i * j );
        }
      }
    }

  }
