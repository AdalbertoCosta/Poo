package fatec.poo.model;

/**
 *
 * @author Adalberto
 */
public class Aluno {
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;

    public void setRA(int ra){
        RA = ra;
    }
    public int getRA(){
        return (RA);
    }
    
    public void setNtPrv1(double ntPrv1){
        NtPrv1 = ntPrv1;
    }
    public double getNtPrv1(){
        return (NtPrv1);
    }
    
    public void setNtPrv2(double ntPrv2){
        NtPrv2 = ntPrv2;
    }
    public double getNtPrv2(){
        return (NtPrv2);
    }
    
    public void setNtTrab1(double ntTrab1){
        NtTrab1 = ntTrab1;
    }
    public double getNtTrab1(){
        return (NtTrab1);
    }
    
    public void setNtTrab2(double ntTrab2){
        NtTrab2 = ntTrab2;
    }
    public double getNtTrab2(){
        return (NtTrab2);
    }
    
    public double calcMediaProva(){
        return(0.75*(NtPrv1+2*NtPrv2)/3);
    }
    
    public double calcMediaTrab(){
        return(0.25*(NtTrab1+NtTrab2)/2);
    }
    
    public double calcMediaFinal(){
        return(calcMediaProva()+calcMediaTrab());
    }
    
    
    
    
    
}



/*public void setRA(double a){
       RA = ra;
   }

public double getAltura(){
       return(RA);
   }*/