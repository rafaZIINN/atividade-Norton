/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String operacao;
        int control = 0;
        

        System.out.println("Digite a operação que deseja efetuar:");
        operacao = teclado.nextLine();
        
       
        if (operacao.equals("+")) {
            CalculaSoma soma = new CalculaSoma();
            soma.adicao();
            control++;

        }
        
        if (operacao.equals("-")) {
            caculaSubtracao subtracao1 = new caculaSubtracao();
            subtracao1.subtracao();
            control++;

        }
        
         if (operacao.equals("*")) {
            caculaMultiplicacao multipli = new caculaMultiplicacao();
            multipli.multiplicacao();
            control++;

        }
         
          if (operacao.equals("/")) {
            caculaDivisao div = new caculaDivisao();
            div.divisao();
            control++;

        }
        if (control == 0) {
            System.out.println("Operação inválida, tente Novamente com seguites operadores: + , - , * , / !");
        }

    }

}
