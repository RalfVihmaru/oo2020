import java.io.*;
public class arvutus{
	    public static void main(String[] arg) throws Exception{
        BufferedReader br1=new BufferedReader(new FileReader("tehe.txt"));
		String rida=br1.readLine();
		String[] m1=rida.split(" ");
		int arv1=Integer.parseInt(m1[0]);
        //double tegur=Integer.parseInt(m1[1]);
		int arv2=Integer.parseInt(m1[2]);
		
		 if (rida.contains("+")) {
                int vastus = arv1 + arv2;
		 } else if (rida.contains("-")) {
				int vastus = arv1 - arv2;
		} else if (rida.contains("/")) {
				int vastus = arv1 / arv2;
		} else if (rida.contains("*")) {
				int vastus = arv1 * arv2;
		
		
		br1.close();
        PrintWriter pw1=new PrintWriter("vastus.txt");
		pw1.println(vastus);
        pw1.close();
		}
}
}