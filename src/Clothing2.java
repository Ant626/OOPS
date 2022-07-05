public class Clothing2 {

    public double price;
    public String type;
    public String size;


    public Clothing2(){

        price = 29.9;
        type = "T-Shirt";
        size = "Medium";

    }

    public Clothing2(double price, String type, String size){
        this.price = price;
        this.type = type;
        this.size = size;

    }

    public void increasePrice(){

        this.price += 5;

    }

    public void increasePrice(double x){

        this.price += x;
    }

    public void details(){

        System.out.println("Item: " + type);
        System.out.println("Size: " + size);
        System.out.println("Price: " + "$" + price);
        System.out.println();
    }

}
