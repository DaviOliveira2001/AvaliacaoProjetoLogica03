/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoprojetologica03;

import java.util.Scanner;

/**
 *
 * @author odavi
 */
public class AvaliacaoProjetoLogica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        String nome;
        int anoNasc, anoEntrada, idade, tempoTrabalho;
        
        System.out.println("Informe o nome do funcionário:");
        nome = teclado.nextLine();
        System.out.println("Informe o seu ano de nascimento:");
        anoNasc = teclado.nextInt();
        System.out.println("Informe o ano de seu ingresso na empresa:");
        anoEntrada = teclado.nextInt();
        
        idade = 2021 - anoNasc;
        tempoTrabalho = 2021 - anoEntrada;
        
        if(idade >= 65){
            System.out.println("Requer aposentadoria.");
        }
        else if(tempoTrabalho >= 30){
            System.out.println("Requer aposentadoria.");
        }
        else if(idade >= 60 && tempoTrabalho >= 25){
            System.out.println("Requer aposentadoria.");
        }else{
            System.out.println("Não requer aposentadoria.");
        }
    }
    
}
