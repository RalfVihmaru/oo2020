public class TekstiUurijaRalf implements TekstiUurija{
	public int t2htedeArv(String s){
		return s.length();
	}
	public int loenda(String s, char c){
		int loendur=0;
		for(char abi: s.toCharArray()){
			if(abi==c){loendur++;}
		}
		return loendur;
	}
}