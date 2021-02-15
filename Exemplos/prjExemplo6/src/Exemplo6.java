/**
 *
 * @author adalb
 */
public class Exemplo6 {
    public static void main(String[] args) {
        int[] tabNum;
        int cont;
        
        tabNum = new int[5];
        
        tabNum[0] = 34;
        tabNum[1] = 18;
        tabNum[2] = 27;
        tabNum[3] = 15;
        tabNum[4] = 22;
        
        for (cont=0; cont < 5; cont++){
            System.out.println("tabNum[" + cont + "] = " + tabNum[cont]);
        }
    }
}
