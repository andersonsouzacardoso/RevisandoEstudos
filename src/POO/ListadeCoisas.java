package POO;

import javax.swing.*;
import java.util.Scanner;

public class ListadeCoisas {
    public static int opcao1 = 1;
    public static int opcao2 = 2;
    public static int opcao3 = 3;
    public static int escolha = Integer.parseInt((JOptionPane.showInputDialog("Digite o Numero da Opção")));



    public static  void main(String[] args) {

        if(escolha == opcao1){
            Eletronicos();
        } else if (escolha == opcao2) {
            Games();
        } else if (escolha == opcao3) {
            Objetivos();
        }
    }
    public static void Eletronicos(){
        System.out.println("Desktop");
        System.out.println("NotBook");
        System.out.println("Smartphone");
    }
    public static void Games(){
        System.out.println("Elden Ring");
        System.out.println("Blood Born");
        System.out.println("Sekiro");
    }
    public static void Objetivos(){
        System.out.println("Estudar Java");
        System.out.println("Estudar Designer Grafico");
        System.out.println("Ganhar Dinheiro");
    }
}
