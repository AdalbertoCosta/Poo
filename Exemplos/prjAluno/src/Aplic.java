import fatec.poo.model.Aluno;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adalb
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
        int RA;
        double ntPrv1;
        double ntPrv2;
        double ntTrab1;
        double ntTrab2;
        
        int opcao;
        
        
        System.out.println("Digite RA do Aluno");
        RA = entrada.nextInt();
        //passagem de mensagens
        objAluno.setRA(RA);
        
        System.out.println("Digite a nota da primeira prova");
        ntPrv1 = entrada.nextDouble(); //Scanf("lf", &medAlt);
        //passagem de mensagens
        objAluno.setNtPrv1(ntPrv1);

        System.out.println("Digite a nota da segunda prova");
        ntPrv2 = entrada.nextDouble(); //Scanf("lf", &medAlt);
        //passagem de mensagens
        objAluno.setNtPrv2(ntPrv2);
        
        System.out.println("Digite a nota do primeiro trabalho");
        ntTrab1 = entrada.nextDouble(); //Scanf("lf", &medAlt);
        //passagem de mensagens
        objAluno.setNtTrab1(ntTrab1); 
        
        System.out.println("Digite a nota do Segundo trabalho");
        ntTrab2 = entrada.nextDouble(); //Scanf("lf", &medAlt);
        //passagem de mensagens
        objAluno.setNtTrab2(ntTrab2); 
        
        
        
        //Corrigir Lógica depois//
        /*----------------------*/
        do{
            System.out.println("\n1 - Exibir Notas das Provas/Trabalhos");
            System.out.println("\n2 - Exibir Médias dos Trabalhos/Provas");
            System.out.println("\n3 - Exibir a Média Final");
            System.out.println("\n4 - Sair");
            System.out.println("\n\n\nDigite uma Opção: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1 : System.out.println("Notas das Provas e Trabalhos: RA Aluno "+objAluno.getRA()+"\n\n"+ 
                                            "Prova1: "+objAluno.getNtPrv1()+
                                            "\nProva2: "+objAluno.getNtPrv2()+
                                            "\nTrabalho1: "+objAluno.getNtTrab1()+
                                            "\nTrabalho2: "+objAluno.getNtTrab2());
                        break;
                case 2 : System.out.println("Medias dos Trabalhos e Provas: RA Aluno "+objAluno.getRA()+"\n\n"+ 
                                            "\nMedias das Provas: "+ objAluno.calcMediaProva()+
                                            "\nMedias dos Trabalhos: "+ objAluno.calcMediaTrab());
                        break;
                case 3 : System.out.println("RA Aluno "+objAluno.getRA()+"\nMedia Final: "+objAluno.calcMediaFinal());
                       break;        
            }
        }while(opcao < 4);
    }
    
}
