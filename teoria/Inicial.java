  public class Inicial {
    //definimos la constate PI
    public static final double PI = 3.14;
    public static void main(String[] args) {
	//leer el radio 
	double radio = 0;
	if ( radio <= 0 ){
	   //no existen círculos de radio 0 o negativo
	   System.out.println("Valor de radio: " + radio + " no permitido");
	} else{	
	   //calcular área
	   double area = radio * radio * PI;
	   //mostrar el área
	   System.out.println("El valor del área es: "+area);
	}
    
    }

  }
