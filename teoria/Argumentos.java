  public class Argumentos {
    public static void main(String[] argumentos) {
	System.out.println("Argumento1: " + argumentos[0]);
	System.out.println("Argumento2: " + argumentos[1]);
	int numero1 = Integer.parseInt(argumentos[0]);
	int numero2 = Integer.parseInt(argumentos[1]);
	System.out.println("Argumento1 x Argumento2 = " + numero1 * numero2 );
    }
  }
