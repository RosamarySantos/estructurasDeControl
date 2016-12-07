  //programa que determina el plural de un
  //adjetivo o sustantivo en función del
  //último caracter de la palabra
  import java.util.Scanner;
  public class Plurales{
    public static void main(String[] arg){
      //leemos la palabra mediante Scanner
      System.out.println("Introduce una palabra:");
      Scanner in = new Scanner(System.in);
      String palabra =  in.next().toLowerCase();
      in.close();
      //determinamos la última letra de la palabra
      char ultimaLetra = palabra.charAt(palabra.length()-1);
      String palabraPlural = "";
      boolean penultimaVocal = false;
      if (palabra.length() > 1 && ultimaLetra == 'y'){
        char penultimaLetra = palabra.charAt(palabra.length()-2);
        if (penultimaLetra == 'a' || penultimaLetra == 'e' || penultimaLetra == 'i'
            || penultimaLetra == 'o' || penultimaLetra == 'u')
		penultimaVocal = true;
      }
      switch(ultimaLetra) {
        case 'a' :  palabraPlural = palabra+"s";
                    break;
        case 'e' :  palabraPlural = palabra+"s";
                    break;
        case 'i' :  palabraPlural = palabra+"s";
                    break;
        case 'o' :  palabraPlural = palabra+"s";
                    break;
        case 'u' :  palabraPlural = palabra+"s";
                    break;
        case 'é' :  palabraPlural = palabra+"s";
                    break;
        case 'á' :  palabraPlural = palabra+"s";
                    break;
        case 'ó' :  palabraPlural = palabra+"s";
                    break;
        case 'í' :  palabraPlural = palabra+"es";
                    break;
        case 'ú' :  palabraPlural = palabra+"es";
                    break;
        case 's' :  palabraPlural = palabra;
                    break;
        case 'x' :  palabraPlural = palabra; 
                    break;
        case 'l' :  palabraPlural = palabra+"es";
                    break;
        case 'r' :  palabraPlural = palabra+"es";
                    break;
        case 'n' :  palabraPlural = palabra+"es";
                    break;
        case 'd' :  palabraPlural = palabra+"es";
                    break;
        case 'z' :  palabraPlural = palabra.substring(0,palabra.length()-1)+"ces";
                    break;
        case 'j' :  palabraPlural = palabra+"es";
                    break;
	case 'y' :  if (penultimaVocal) 
                      palabraPlural = palabra+"es";
                    else
                      palabraPlural = palabra;
                    break;
        default  :
                    System.out.println("La palabra no admite plural");
                    break;
      }
        if (palabraPlural.length() != 0)
          System.out.printf("El plural de %s es %s%n", palabra, palabraPlural);
     }
  }

