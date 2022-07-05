public class ClothingTest {

    public static void main(String[] args) {

        Clothing Item = new Clothing();

//            Item.price = 29.9;
//            Item.size = "Medium";
//            Item.type = "T-Shirt";
            Item.displayClothingInfo();

            Item.price = 34.9;
            Item.displayClothingInfo();

            Item.price = 41.9;
            Item.displayClothingInfo();

            Item.type = "Jeans";
            Item.size = "Small";
            Item.price = 31.2;
            Item.displayClothingInfo();

            Item.price = 41.2;
            Item.displayClothingInfo();

            Item.price = 45.2;
            Item.displayClothingInfo();



    }


}
