public class kodune2{
	    double x, y, z, q;
		public kodune2(double ux, double uy, double uz, double uq){
        x=ux; y=uy; z=uz; q=uq;
		
		}
	public double kaheseProtsent(){
		 return (y/x)*100;
	}
	public double kolmeseProtsent(){
		 return (q/z)*100;
	}
	public double koguProtsent(){
		return	(y+q)/(x+z)*100;
}
}