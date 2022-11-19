package Exercicios_Nivel_Iniciante;

import java.util.Scanner;
public class bee1040 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        float N1,N2,N3,N4,media,exame,mediaFinal;
        N1 = s.nextFloat();
        N2 = s.nextFloat();
        N3 = s.nextFloat();
        N4 = s.nextFloat();
        media = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10;
        System.out.printf("Media: %.1f\n",media);
        if(media<=4.9){
            System.out.println("Aluno reprovado.");
        }else if(media>=7.0){
            System.out.println("Aluno aprovado.");
        }else if(media>=5.0 && media<=6.9){
            System.out.println("Aluno em exame.");
            exame = s.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",exame);
            mediaFinal = (media + exame)/2;
            if(mediaFinal >= 5.0){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }
        }
    }
}
