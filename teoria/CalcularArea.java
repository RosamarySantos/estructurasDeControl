  public class CalcularArea {
   public static final double PI = 3.14;
   public static void main(String[] arg){
     //definir el valor del radio de un círculo
     double radio = -57.23;      	
     //comprobar que ese radio es positivo
     //llamar a un método que se encague de calcular el área
     if (radio > 0){
	double area = calcularSuperficie(radio);
        System.out.println("Valor del área: " + area);
     } 
     else {
        System.out.println("Valor del área no computable");
     }
   }


   //definimos el método en este nivel
   //este método calcula el area de un círculo
   public static double calcularSuperficie(double radio){
	return radio * radio * PI;
   }

  }
