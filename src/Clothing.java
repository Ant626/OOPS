public class Clothing {

    public double price;
    public String type;
    public String size;

    public Clothing(){

        price = 29.9;
        type = "T-Shirt";
        size = "Medium";
    }


    public double increasePrice()
    {
        double add = price + 5;
        return add;
    }

//    public double increasePrice()
//    {
//
//
//    }

    public void displayClothingInfo(){
        System.out.println("Item: " + type);
        System.out.println("Size: " + size);
        System.out.println("Price: " + "$" + price);
        System.out.println();
    }


}

