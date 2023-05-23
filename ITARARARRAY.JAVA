import java.util.ArrayList;
import java.util.List;
public class IterarArray{

      public static List<String> amigosEmComum(String[] amigosA, String[] amigosB){
      List<String> amigosComum = new ArrayList<>();
      for(String amigoA : amigosA){
         for(String amigoB : amigosB){
            if (amigoA.equals(amigoB)){
               amigosComum.add(amigoA);
            }
         }
      }
      return amigosComum;
    }
   
    public static void main (String[]args){
      String[] amigosDaNathalia = {"Kalline", "Amanda", "Lethicia", "Laura"};
      String[] amigosDoMurillo = {"Ryan", "Luana", "Amanda", "Clarice"};

      List<String> amigosComuns = amigosEmComum (amigosDaNathalia, amigosDoMurillo);
      System.out.println("Os amigos em comum são: " + amigosComuns);
   }
}
      
//criar lista de amigos e chamar amigoos em comum, com variáveis 
