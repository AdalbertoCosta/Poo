/**
 *
 * @author Adalberto
 */
 
public class Exemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int count, num;
        num = (int) (Math.random() * 100);
        for (count=1; count<=10;count++){
            System.out.println(num + " x " + count + " = " + count * num);
        }
    }
}