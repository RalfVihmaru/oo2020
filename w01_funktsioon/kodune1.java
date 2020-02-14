import java.util.Scanner;

public class kodune1 {
    public static void main(String[] args){
       int arv1, arv2; 
       float protsent;
       Scanner inputNumScanner = new Scanner(System.in);
       
       System.out.println("Lisa esimene arv:");       
      arv1 = inputNumScanner.nextInt();
       
       System.out.println("Lisa teine arv:");
       arv2 = inputNumScanner.nextInt();
       
       protsent = (arv1 * 100/ arv2);
       
       System.out.println("Protsent on: " + protsent + " %");
    }
}

/*sisesta esimene arv:
10
Sisesta teine arv:
100
Saadud protsent: 10.0 %
*/