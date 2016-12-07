  public class CalcularArea1 {
   public static final double PI = 3.14;
   public static void main(String[] arg){
     //definir el valor del radio de un círculo
     double radio = -57.23;      	
     //comprobar que ese radio es positivo
     //llamar a un método que se encague de calcular el área
     if (radio < 0){
	radio *= -1; // radio = radio * -1;
     } 
     double area = calcularSuperficie(radio);
     System.out.println("Valor del área: " + area);
   }


   //definimos el método en este nivel
   //este método calcula el area de un círculo
   public static double calcularSuperficie(double radio){
	return radio * radio * PI;
   }

  }
