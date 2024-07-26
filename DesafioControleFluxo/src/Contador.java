
import java.util.Locale;
import java.util.Scanner;

public class Contador {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("DIGITE O PRIMEIRO PARAMETRO :");
        int parametroUm = scanner.nextInt();
    
        System.out.println("DIGITE O PRIMEIRO PARAMETRO :");
        int parametroDois = scanner.nextInt();
        
        try{
        contar (parametroUm, parametroDois);

        } catch (ParametrosInvalidosExeption e){

            System.out.println("o segundo parâmetro precisa ser maior que o primeiro.  ");

        }
        
    }
    public static void contar (int parametroUm, int parametroDois ) throws ParametrosInvalidosExeption {

        if( parametroUm > parametroDois ){
           throw new ParametrosInvalidosExeption();
        }
      
        for( int i =1 ; i <= (parametroDois - parametroUm) ; i ++ ){
            System.out.println("IMPRIMINDO NUMERO " + i );
        }
    }
    
}
