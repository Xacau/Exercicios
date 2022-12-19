package Exercicios;

import java.util.Scanner;
public class bee1133 {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int X, Y;
        X = s.nextInt();
        Y = s.nextInt();
        if(X>Y){
            for(int i = Y; i < X; i++){
                if(i%5==2 || i%5==3){
                    System.out.println(i);
                }
            }
        } else if (X<Y) {
            for(int i = X+1; i < Y; i++){
                if(i%5==2 && i%5==3){
                    System.out.println(i);
                }
            }
        }
    }
}
