  public class Formateo {
    public static void main(String[] arg) {
      int numeroEntero = 12;
      float numeroFloat = 12.4556666f;
      System.out.printf("El número entero es %d y el decimal es %.2f%n", numeroEntero, numeroFloat);
      boolean expresionBoolean = numeroEntero > numeroFloat;
      char variableChar = 'c';
      System.out.printf("La expresión numeroEntero > numeroFloat vale %b y el caracter vale %c%n", expresionBoolean , variableChar );
      System.out.printf("La expresión %d < %f vale %b y el caracter vale %c%n",numeroEntero ,numeroFloat , numeroEntero < numeroFloat , 'g' );
      for (int i = 0; i < 150 ; i++)
        System.out.printf("%8d/3%6s%8.3f%n", i, "es",i / 3.0);
    }
  }
