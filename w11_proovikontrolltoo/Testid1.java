import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
    @Test
    public void nimetus(){
        Jook j=new Jook("limonaad", 0.2, 1.1);
        assertEquals("limonaad", j.kysiNimetus());
    }
    @Test
    public void mass2(){
        Jook j1=new Jook("piim", 0.28, 1.05);
        Joogipudel p1=new Joogipudel(j1, 0.5, 0.2, 0.1, 0);
        assertEquals(0.725, p1.kysiMass(), 0.01);
    }
    @Test
    public void hind1(){
        Jook j1=new Jook("piim", 0.28, 1.05);
        Joogipudel p1=new Joogipudel(j1, 0.5, 0.2, 0.1, 0);
        assertEquals(0.24, p1.kysiOmahind(), 0.01);
    }
    @Test 
    public void vaat1(){
        Joogivaat v1=new Joogivaat(new Jook("limonaad", 0.2, 1.1), 50, 15);
        Joogipudel[] pd=new Joogipudel[10];
        for(int i=0; i<pd.length; i++){
            pd[i]=new Joogipudel(null, 1.5, 0.07, 0.1, 1);
        }
        for(int i=0; i<pd.length; i++){
            v1.taida(pd[i]);
        }
        assertEquals(0, v1.kysiTaidetud(), 0.01);
    }
}