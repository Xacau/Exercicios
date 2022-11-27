package Exercicios;

import java.util.Scanner;
public class bee1067 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int X = s.nextInt();
        for(int i = 0; i <= X; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
