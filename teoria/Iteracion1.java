  public class Iteracion1 {
    public static void main(String[] arg) {
	int numero   = 5_000;
	long suma     = 0;
	int contador = 1;
	while(contador <= numero){
	  //código que se repite
          System.out.println("Al principio del bucle contador vale: "+contador+" y suma vale: "+suma);
	  suma = suma + contador; //suma += contador;
	  contador ++;
         System.out.println("Al final del bucle contador vale: "+contador+" y suma vale: "+suma);
	}
	System.out.println("============\n\n\n");
	System.out.println("La suma de los "+numero+ " primeros numeros vale: "+suma);
    }
  }

