import java.util.Scanner;
public class kodune {
	
	public static double protsent(double arv1, double arv2){
	return arv1 * 100 / arv2;
	}
	
	public static void main(String[] arg){
		PercentageCalculator pc = new PercentageCalculator();
		Scanner in = new Scanner(System.in);
        System.out.println("sisesta esimene arv:");
        double arv1 = in.nextDouble();
        System.out.println("Sisesta teine arv:");
        double arv2 = in.nextDouble();
        System.out.println("Saadud protsent: " + pc.calculatePercentage(arv1, arv2)+"%");
    }
}
/*sisesta esimene arv:
10
Sisesta teine arv:
100
Saadud protsent: 10.0 %
*/