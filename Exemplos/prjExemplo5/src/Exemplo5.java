/**
 *
 * @author Adalberto Costa
 */
public class Exemplo5 {
    public static void main(String[] args) {
        int cont = 1, num;
        
        num = (int) (Math.random() * 100);
        
        while (cont<=10){
            System.out.println(num + " x " + cont + " = " + cont * num);
            cont++;
        }          
    }
}
