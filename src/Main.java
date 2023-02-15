import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket(new String[]{"Хлеб", "Булочка", "Пряник"}, new int[]{25, 30, 12});
        File file = new File("basket.bin");
        if (file.exists()) {
            basket = Basket.loadFromBinFile(file);
            basket.addToCart(basket.getProductNum(), basket.getAmount());
            basket.saveBin(file);
            basket.printCart();

        } else {
            basket.addToCart(basket.getProductNum(), basket.getAmount());
            basket.printCart();
            basket.saveBin(file);
        }
    }
}