
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class entradaViaTeclado {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
            System.out.println("Olá, digite sua altura: ");
            double altura = scanner.nextDouble();
            
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            
            System.out.println("Digite seu peso: ");
            double peso = scanner.nextDouble();
            
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("------------------------------------------------------------");
            System.out.println("Ola meu nome é  " + nome + " " + sobrenome);
            System.out.println("Eu tenho " + idade + " anos");
            System.out.println("Eu tenho " + altura + " metros de altura");
            System.out.println("Eu tenho " + peso + " kg de peso");
        }catch(InputMismatchException e){
            System.out.println("Os campos precisao ser numericos!");
        }
    
    }
    
}
    

