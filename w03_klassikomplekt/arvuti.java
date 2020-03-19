  public class arvuti{
    Info computer;
    int finalAmount;

    public arvuti(Info ucomputer){
        computer = ucomputer;
    }

    public int addAmount(int newAmount){
        finalAmount = (computer.getAmount()+newAmount);
        return finalAmount;
    }

    public String specs(){
        return "(" + computer.model + ", " + computer.ram + "gb ram, " + computer.hdd + "gb, "+ computer.processor + ", " + computer.graphics + ","  + computer.price + "eur)";
    }
}