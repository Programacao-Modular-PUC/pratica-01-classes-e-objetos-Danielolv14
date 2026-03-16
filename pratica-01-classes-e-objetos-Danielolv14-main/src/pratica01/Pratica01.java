package pratica01;

import pratica01.Pessoa;
import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author 682897
 */
public class Pratica01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       Pessoa[] vet = new Pessoa[10];
        for(int i = 0; i < vet.length;i++) {
            String Name = sc.nextLine();
            String Sobrenome = sc.nextLine();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            double peso = sc.nextDouble();
            Data datanasc = new Data(sc.nextInt(),sc.nextInt(),sc.nextInt());
            vet[i] = new Pessoa(Name, Sobrenome, idade, altura, peso, datanasc);
            sc.nextLine();
            if(i > 0 && vet[i].getName().equals(vet[i-1].getName()) && vet[i].getSobrenome().equals(vet[i-1].getSobrenome())){
                System.out.println("Cadastro Invalido!");
                vet[i] = null;
                break;
            }

        }
        for(int i = 0; i < vet.length;i++) {
            if (vet[i] == null) break;
            System.out.println("Cadastro " + (i+1) + ":");
            System.out.println("Nome Completo: " + vet[i].getName() + " " + vet[i].getSobrenome());
            System.out.println("Nome de referencia: " + vet[i].getSobrenome() + ", " + vet[i].getName().toUpperCase());
            System.out.println("Idade: " + vet[i].calculaIdade());
            System.out.println("Peso: " + vet[i].getPeso());
            System.out.println("Altura: " + vet[i].getAltura());
            vet[i].CalculaIMC(vet[i].getPeso(), vet[i].getAltura());
            System.out.println("IMC: " + vet[i].getIMC());
            System.out.println("Classificacao: ");
            vet[i].InformaObesidade();
            System.out.print("\n");

        }
}}
