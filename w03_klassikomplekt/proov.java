  
public class proov{
    public static void main(String[] arg){
        Info a1 = new Info("Alienware", "intel i7", "Nvidia gtx 1080", 16, 3500,  2000, 10);
        arvuti a2 = new arvuti(a1);
   
        System.out.println("Arvestab arvutite koguse: " + a1.getAmount());
        System.out.println("Lisab juurde sisestatud arvu  " + a2.addAmount(5));
        System.out.println("Lõplik arvutite kogus: " + a2.finalAmount);
        System.out.println("Arvuti mudel ja selle andmed: " + a2.specs());
    }
}