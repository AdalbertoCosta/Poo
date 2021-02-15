/**
 *
 * @author adalb
 */
public class Exemplo7 {
    public static void main(String[] args) {
        double[] tabNum = new double[15];
        int cont;
        double media=0;
        
        for(cont=0; cont < 15; cont++){
            tabNum[cont] = Math.random() * 100;
            media += tabNum[cont];
            System.out.println("tabNum[" + cont + "] = " +  tabNum[cont]);
        }
        System.out.println("media: " + media/15);
    }
    
}
