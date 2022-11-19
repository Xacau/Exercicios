package Exercicios_Nivel_Iniciante;
import java.util.Scanner;
public class bee1011 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        double pi = 3.14159;
        int R = s.nextInt();
        double volume = (4.0/3)*pi*Math.pow(R,3);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
