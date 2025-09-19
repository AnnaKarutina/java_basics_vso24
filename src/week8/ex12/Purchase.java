package week8.ex12;

public class Purchase {
    private String product;
    private int unitPrice;
    private int amount;

    public Purchase(String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return unitPrice * amount;
    }

    public void increaseAmount(){
        this.amount++;
    }

    public String toString(){
        return this.product + ": " + this.amount;
    }
}
