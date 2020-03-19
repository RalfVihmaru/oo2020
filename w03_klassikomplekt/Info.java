  
public class Info{
    String model;
    String processor;
	String graphics;
	int ram;
    int hdd;
    double price;
    int amount;

    public Info(String umodel, String uprocessor, String ugraphics, int uram, int uhdd, double uprice, int uamount){
        model = umodel;
        processor = uprocessor;
		graphics = ugraphics;
		ram = uram;
        hdd = uhdd;
        price = uprice;
        amount = uamount;
    }

    public int getAmount(){
        return amount;
    }
    
}