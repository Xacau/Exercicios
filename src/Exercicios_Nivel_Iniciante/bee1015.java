package Exercicios_Nivel_Iniciante;

import java.util.Scanner;
public class bee1015 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        double x1,y1,x2,y2, distancia;
        x1 = s.nextDouble();
        y1 = s.nextDouble();
        x2 = s.nextDouble();
        y2 = s.nextDouble();
        distancia = Math.sqrt((Math.pow((x2-x1),2))+Math.pow((y2-y1),2));
        System.out.printf("%.4f\n", distancia);
    }
}
