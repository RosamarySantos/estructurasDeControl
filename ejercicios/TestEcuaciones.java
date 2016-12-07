  //clase que comprueba el funcionamiento de la clase Sistema2Ecuaciones
  public class TestEcuaciones {
    public static void main(String[] args){

	    //creamos dos Sistema2Ecuaciones
      Sistema2Ecuaciones se1 = new Sistema2Ecuaciones(2,1,-1,2,7,-1);
      Sistema2Ecuaciones se2 = new Sistema2Ecuaciones(1,2,6,-9,4,-3);
      //operaciones sobre se1
      if ( se1.esResoluble() )
        mostrarResultados(se1.calcularX() ,se1.calcularY() );
      else
        System.out.println("se1 no se puede resolver ecuación");
      //operaciones sobre se2
      if ( se2.esResoluble())
        mostrarResultados(se2.calcularX() ,se2.calcularY() );
      else
        System.out.println("se2 no se puede resolver ecuación");

    }

    //método mostrarResultados
    public static void mostrarResultados(double x, double y){
      System.out.printf("Solución de la ecuación: x = %.2f, y = %.2f%n", x, y);
    }
  }
