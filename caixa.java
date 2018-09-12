/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_1.java;

/**
 *
 * @author Rafael e Gabriel Martins Yana 
 */
import java.util.Scanner;
public class Ex_1Java {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Ex_1Java banco = new Ex_1Java();
        double saldo = 0;
        boolean sair= false;
        while(sair == false){
              banco.Menu();
              int opcao = tcl.nextInt();
             switch(opcao){
                case 1:
                    saldo = banco.MostrarSaldo(saldo);
                    break;
                case 2:
                    saldo = banco.Deposito(saldo);
                    break;
                case 3:
                    saldo =banco.sacar(saldo);
                    break;
                case 4:
                    banco.sair(sair);
                    break;
                     default:
                    System.out.println("Digite uma opção valida!");
                   
        }
    }
   
  
    }
      public void Menu(){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Escolha uma opção!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
            System.out.println("1-Ver saldo");
            System.out.println("2-Depositar");
            System.out.println("3-Sacar");
            System.out.println("4-Sair");
            System.out.println("");
}
    public double MostrarSaldo(double saldo){
            System.out.println("Seu saldo é R$" + saldo);
            return saldo;
}
    public double Deposito(double saldo){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o valor do deposito");
        double valor = tcl.nextInt();
        saldo = saldo+valor;
        return saldo;
    }
    public double sacar(double saldo){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o valor do saque");
        double valor = tcl.nextInt();
        saldo = saldo-valor;
        return saldo;
    }
    public boolean sair(boolean sair){
        System.out.println("Deseja realmente sair? S/N");
        Scanner tcl = new Scanner(System.in);
        String acao = tcl.next();
        if (acao.equals("S")){
                sair = true;
                
        }

        return sair;
    }

    
}
