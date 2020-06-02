import java.lang.Math;
public class Pendel {
    double pikkus;
    double vonkeperiood;
    Hammasratas ratas;
    public Pendel(double uuspikkus, Hammasratas uusratas){
        pikkus = uuspikkus;
        ratas = uusratas;
        vonkeperiood = 2 * Math.PI * Math.sqrt(pikkus/9.8) * 1000; 
    }

    public String toString(){
        return  "pendli pikkus on" + pikkus + " meetrit";
    }
}
