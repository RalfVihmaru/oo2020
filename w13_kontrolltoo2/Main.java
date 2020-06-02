import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main{
    public static void main(String[] args){
        
        Hammasratas ratas1 = new Hammasratas(8);
        Pendel pendel1 = new Pendel(6, ratas1); //Sisesta pendli pikkus meetrites
        Long a = Math.round(pendel1.vonkeperiood / 2);
        int intervall = a.intValue();
        System.out.println(pendel1 + " ja " + ratas1);
        System.out.println("Pendel tiksub intervalliga " + intervall + " ms");
        System.out.println(pendel1.toString());
        Timer timer = new Timer();
        TimerTask ulesanne = new TimerTask() {
            int loendur = 0;
            int ringArv = 0;
            int tiks = 0;
            public void run() {
                if(tiks == 0){
                    System.out.println("tiks");
                    tiks = 1;
                } else {
                    System.out.println("toks");
                    tiks = 0;
                }
                
                loendur++;
                if(loendur == ratas1.hammasArv){
                    loendur = 0;
                    ringArv++;
                    System.out.println("Hammasratas on teinud ringi");
                    System.out.println("Hammasratas on teinud kokku " + ringArv + " ringi");
                }
            }
        };

        timer.schedule(ulesanne, 2, intervall);
    }

}
