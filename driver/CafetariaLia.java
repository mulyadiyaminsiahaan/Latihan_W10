package driver;

import java.util.*;
import model.*;

public class CafetariaLia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FoodOrder foodorder = new FoodOrder("Tahu", "Nasi Goreng", "Mie");
        DrinkOrder minuman = new DrinkOrder("Pop ice manggo", "Medium", "Seres");

        System.out.println("Pilih apa yang ingin dipesan:\n 0: Food\n 1: Drink");
        int choice = scanner.nextInt();
        OrderType typePesanan = null;

        switch (choice) {
            case 0:
                typePesanan = OrderType.FOODORDER;
                break;
            case 1:
                typePesanan = OrderType.DRINKORDER;
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }

        if (typePesanan == OrderType.FOODORDER) {
            System.out.println("food order:\n" + orderdescription(foodorder));
        } else if (typePesanan == OrderType.DRINKORDER) {
            System.out.println("drink order:\n" + orderdescription(minuman));
        }
        
        scanner.close();
    }

    private static String orderdescription(Order pesanan) {
        return pesanan.orderdescription();
    }
}