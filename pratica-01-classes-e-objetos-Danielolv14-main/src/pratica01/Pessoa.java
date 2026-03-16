package pratica01;
import pratica01.Data;
import java.util.Calendar;


public class Pessoa {
    private String name;
   private String Sobrenome;
   private int idade;
   private double altura;
   private double peso;
   private double IMC;
   private Data datanasc;
   
   Pessoa(String Name, String Sobrenome, int idade, double altura, double peso, Data nasc){
       this.name = Name;
       this.Sobrenome = Sobrenome;
       this.idade = idade;
       this.altura = altura;
       this.peso = peso;
       this.IMC = 0.0;
       this.datanasc = nasc;
   }
   
   String getName(){
       return name;
   }
   String getSobrenome(){
           return Sobrenome;
    }
   int getIdade(){
       return idade;
   }
   double getAltura(){
       return altura;
   }
   double getPeso(){
       return peso;
   }
   double getIMC(){
       return IMC;
   }

    public void setName(String Name){
       this.name = Name;
   }
    public void setSobrenome(String Sobrenome){
       this.Sobrenome = Sobrenome;
   }
    public void setIdade(int idade){
       this.idade = idade;
   }
    public void setAltura(double Altura){
       this.altura = Altura;
   }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setIMC(double IMC){
        this.IMC = IMC;
    }
    
    public void CalculaIMC(double peso,double altura){
        this.IMC = (peso/Math.pow(altura,2));
     }
    
    public int calculaIdade(){
        Calendar c = Calendar.getInstance();
        int idade = c.get(Calendar.YEAR) - datanasc.getAno();
        return idade;
    }
    
    public void InformaObesidade(){
        if(IMC < 18.5){
            System.out.println("Abaixo do peso");
        } else if(IMC <= 24.9){
              System.out.println("Peso Normal");
        } else if (IMC <= 29.9) {
            System.out.println("Sobre Peso");
        } else if(IMC <= 34.9){
            System.out.println("Obesidade Grau 1");
    } else if(IMC <= 39.9){
            System.out.println("Obesidade Grau 2");
    } else if(IMC >= 40){
            System.out.println("Obesidade Grau 3");
    }

   }
}

    
    
   
