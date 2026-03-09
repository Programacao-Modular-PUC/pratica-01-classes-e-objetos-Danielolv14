import java.util.Scanner;

/**
 *
 * @author 682897
 */
public class Pratica01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String Name = sc.nextLine();
       String Sobrenome = sc.nextLine();
       int idade = sc.nextInt();
       double altura = sc.nextDouble();
       double peso = sc.nextDouble();
       
       Pessoa p1 = new Pessoa(Name,Sobrenome,idade,altura,peso);
       CalculaIMC(p1.getPeso(), p1.getAltura());
       InformaObesidade(p1.getIMC());      
    }
    
}
