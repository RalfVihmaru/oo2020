interface TekstiUurija{
	int t2htedeArv(String s);
	int loenda(String s, char c); //Kuvab, mitu korda vastav täht asub tekstis
	void loeFailist(String failinimi);
	int sonadeArv(); //Sisseloetud teksti sõnade arv
	int loenda(char c);
}