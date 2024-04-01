package model;

public class DrinkOrder implements Order{
    private String minumPesanan;
    private String sizeMinuman;
    private String toppingMinuman;

    public DrinkOrder(String minumPesanan, String sizeMinuman, String toppingMinuman) {
        this.minumPesanan = minumPesanan;
        this.sizeMinuman = sizeMinuman;
        this.toppingMinuman = toppingMinuman;
    }

    @Override
    public String orderdescription() {
        return "Minuman: " + minumPesanan + "\nSize: " + sizeMinuman + "\nTopping: " + toppingMinuman;
    }
}
