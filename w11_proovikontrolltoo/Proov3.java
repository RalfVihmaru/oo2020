public class Proov3{
    public static void main(String[] arg){
        Joogivaat v1=new Joogivaat(new Jook("limonaad", 0.2, 1.1), 50, 15);
        System.out.println(v1);
        Joogipudel p1=new Joogipudel(null, 1.5, 0.07, 0.1,1);
        System.out.println(p1);
        v1.taida(p1);
        System.out.println(v1);
        System.out.println(p1);
        Joogipudel[] pd=new Joogipudel[10];
        for(int i=0; i<pd.length; i++){
            pd[i]=new Joogipudel(null, 1.5, 0.07, 0.1, 1);
        }
        for(int i=0; i<pd.length; i++){
            v1.taida(pd[i]);
            System.out.println(pd[i]);
        }
        System.out.println(v1);
    }
}