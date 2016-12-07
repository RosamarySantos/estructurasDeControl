//vamos a multiplicar los n primeros número
//multiplicar = 1 * 2 * 3 * 4 * ..... * n
public class Iteracion2 {
    public static void main(String[] arg){
        //variable numero es la n anterior
        int numero = 0;
        int multiplicacion = 1;
        int contador = 0;
        //usamos un bucle do-while
	if (numero == 0) {
        	System.out.println("La multiplicación de los " + numero + " primeros números vale : 0" );
	} else {
        	do{
            		contador++;
            		multiplicacion *= contador;
	    		System.out.print("Multiplicación: " + multiplicacion + ", contador: "+contador+"\n");
        	} while (contador < Math.abs(numero));
		if (numero % 2 != 0 && numero < 0) {
			multiplicacion *= -1;
		}
        	System.out.println("La multiplicación de los " + numero + " primeros números vale: " + multiplicacion);
	}
    }
}
