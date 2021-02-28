import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author Adalberto Costa
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Circulo objCirc = new Circulo();
        
        double medRaio;
        int opcao;
        
        System.out.println("Digite o Raio da circunferência");
        medRaio = entrada.nextDouble(); //Scanf("lf", &medAlt);
        
        //passagem de mensagens
        objCirc.setRaio(medRaio);
        
        do{
            System.out.println("\n1 - Consultar Area");
            System.out.println("\n2 - Consultar Perimetro");
            System.out.println("\n3 - Consultar Diametro");
            System.out.println("\n4 - Sair");
            opcao = entrada.nextInt();
            
            System.out.println("\n\nMedida do Raio" + objCirc.getRaio());
            switch(opcao){
                case 1 : System.out.println("Area: "+ objCirc.calcArea());
                        break;
                case 2 : System.out.println("Perimetro: "+ objCirc.calcPerimetro());
                        break;
                case 3 : System.out.println("Diametro: "+ objCirc.calcDiametro());
                       break;        
            }
        }while(opcao < 4);
    }
}
