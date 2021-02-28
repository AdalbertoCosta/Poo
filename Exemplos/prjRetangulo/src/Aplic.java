
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author Adalberto
 */
public class Aplic {

    public static void main(String[] args) {
        //Instanciação de objetos da classe Scanner e 
        //da classe Retangulo
        
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        double medBase, medAlt;
        int opcao;
        
        System.out.println("Digite a altura");
        medAlt = entrada.nextDouble(); //Scanf("lf", &medAlt);
        
        System.out.println("Digite a base");
        medBase = entrada.nextDouble(); //Scanf("lf", &medBase);,
        
        //passagem de mensagens
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n1 - Consultar Area");
            System.out.println("\n2 - Consultar Perimetro");
            System.out.println("\n3 - Consultar Diagonal");
            System.out.println("\n4 - Sair");
            opcao = entrada.nextInt();
            
            System.out.println("\n\nMedida da altura " + objRet.getAltura());
            System.out.println("\n\nMedida da Base " + objRet.getBase());
            switch(opcao){
                case 1 : System.out.println("Area: "+ objRet.calcArea());
                        break;
                case 2 : System.out.println("Perimetro: "+ objRet.calcPerimetro());
                        break;
                case 3 : System.out.println("Diagonal: "+ objRet.calcDiagonal());
                       break;        
            }
        }while(opcao < 4);
     }
}