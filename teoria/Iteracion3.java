//programa que dado un número n
//nos muestre los número pares desde 1 hasta n
//Ejemplo: numero = 10 y mostraría 2-4-6-8-10
//al final hacemos un salto de línea
public class Iteracion3{
    public static void main(String[] args){
	int numero = 12;
        for (int contador = 2; contador <= numero; contador+=2){
            		System.out.print(contador+" ");
        }
	System.out.println();
    }
}
