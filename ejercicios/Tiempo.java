  //ejercicio que lee por argumentos tres valores
  //hora, minutos y segundos
  //y nos dice si es correcto o no la hora
  public class Tiempo {
    public static void main(String[] args) {
      String hora = args[0];
      String minutos = args[1];
      String segundos = args[2];
      System.out.println(esHoraCorrecta(Integer.parseInt(hora),Integer.parseInt(minutos), Integer.parseInt(segundos)));
    }
    public static boolean esHoraCorrecta(int hora, int minutos, int segundos) {
      return hora > 0 && hora < 25 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60; 
    }
  }
