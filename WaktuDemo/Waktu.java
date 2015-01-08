
/**
 * Write a description of class Waktu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Waktu
{
    // instance variables - replace the example below with your own
   public static final int MAX_JAM = 23;
   public static final int MAX_MENIT_DETIK = 59;
    
   private int jam;
   private int menit;
   private int detik;
    /**
     * Constructor for objects of class Waktu
     */
    public Waktu()
    {
       jam=0;
       menit=0;
       detik=0;
    }
    
    public Waktu(int jam, int menit, int detik){
        this.jam=jam;
        this.menit=menit;
        this.detik=detik;
    }
    
    public void jamUp(){
        if (jam<23){
        jam++;
        }else if(jam>=23){
        jam=0;
        }
    }
    
     public void jamDown(){
        jam--;
    }
    
    public void menitUp(){
        if (menit<59){
        menit++;
        }else if(menit>=59){
        menit=0;
        jam++;
        }
    }
    
     public void menitDown(){
        if (menit>0){
        menit--;
        }else if(menit<=0){
        menit=59;
        jam--;
        }
    }
    
    public void detikUp(){
        if (detik<59){
        detik++;
        }else if(detik>=59){
        detik=0;
        menit++;
        }
    }
    
    public void detikDown(){
        if (detik>0){
        detik--;
        }else if(detik<=0){
        menit=59;
        detik=59;
        jam--;
        }
    }
}

