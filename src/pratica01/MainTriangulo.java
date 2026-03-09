package pratica01;
import java.util.Scanner;

public class MainTriangulo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int c1 = sc.nextInt();
    int c2 = sc.nextInt();

    TrianguloRetangulo t1 = new TrianguloRetangulo(c1,c2);
    t1.CalculaHipotenusa();
    t1.CalculaArea();

}}
