public class proov3{
		public static void main(String[] arg){
		kodune2 a1 = new kodune2(10, 5, 4, 1);
		kodune2 a2 = new kodune2(12, 9, 6, 3);
		System.out.println("Esimese mängija kahespuinkti viske protsent on:" + a1.kaheseProtsent() + "%");
		System.out.println("Esimese mängija kolmepunkti protsenton;" + a1.kolmeseProtsent() + "%");
		System.out.println("Esimese mängija kogu viske protsent on:" + a1.koguProtsent() + "%");
		System.out.println("Teise mängija kahespuinkti viske protsent on:" + a2.kaheseProtsent() + "%");
		System.out.println("Teise mängija kolmepunkti protsenton;" + a2.kolmeseProtsent() + "%");
		System.out.println("teise mängija kogu viske protsent on:" + a2.koguProtsent() + "%");
		}
}
/*
Esimese mängija kahespuinkti viske protsent on:50.0%
Esimese mängija kolmepunkti protsenton;25.0%
Esimese mängija kogu viske protsent on:42.857142857142854%
Teise mängija kahespuinkti viske protsent on:75.0%
Teise mängija kolmepunkti protsenton;50.0%
teise mängija kogu viske protsent on:66.66666666666666%
*/
