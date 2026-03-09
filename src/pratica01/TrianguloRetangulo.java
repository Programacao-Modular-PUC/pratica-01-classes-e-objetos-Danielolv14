package pratica01;

public class TrianguloRetangulo {
    private int c1;
    private int c2;
    private double h;
    private int area;

    TrianguloRetangulo(int c1, int c2){
        this.c1 = c1;
        this.c2 = c2;
    }


    void CalculaHipotenusa(){
        this.h = (Math.sqrt(Math.pow(c2,2)+Math.pow(c1,2),));
        System.out.println(h);
    }
    void CalculaArea(){
        this.area = ((c1*c2)/2);
        System.out.println(area);
    }
}
