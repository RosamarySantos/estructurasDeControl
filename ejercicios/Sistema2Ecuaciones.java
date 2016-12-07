  //clase que represanta un sistema de 2 ecuaciones con 2 incognitas
  // ax + by = e
  // cx + dy = f
  public class Sistema2Ecuaciones{
    //atributos a,b,c,d,e,f
    //representan al sistema de 2 ecuaciones con 2 incognitas
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    //constructor, es un método con el mismo nombre que la clase y no devuelve nada
    //su función es inicializar los valores de los atributos (a,b,c,d,e,f)
    public Sistema2Ecuaciones(int a, int b, int c, int d, int e, int f){
      this.a = a; this.b = b; this.c = c ; this.d = d; this.e = e; this.f = f;
    }
    //métodos de la clase
    //método que nos dice si el sistema de 2 ecuaciones con 2 incógnitas es resoluble
    public boolean esResoluble() {
      //a · d − b · c != 0
      return  a * d - b * c != 0;
    }

    //método que calcula el valor de x
    public double calcularX(){
      return  1.0 * (e * d - b * f) / (a * d - b * c) ; //forzamos a operarr con doubles
    }
    //método que calcula el valor de y 
    public double calcularY(){
      return  1.0 * (a * f - e * c) / (a * d - b * c) ;
    }
  }


