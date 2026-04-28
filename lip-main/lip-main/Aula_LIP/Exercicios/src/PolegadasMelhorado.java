public class PolegadasMelhorado {
    public static void main(String[] args) {
        
        
        for(double linhas = 0; linhas <= 10; linhas++) {
           
              for (int  polegadas = 0; polegadas <= 25; polegadas++) {
                     double resultado = polegadas * 25.4;
                     System.out.println("resultado: "+ resultado);
                    if(polegadas % 10 == 0) {
                        System.out.println(" ");
                    }
                    
              }

                    
        }
    }
    
}
