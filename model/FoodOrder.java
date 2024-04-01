package model;

public class FoodOrder implements Order{
    private String makanan_pembuka;
    private String makanan_utama;
    private String makanan_penutup;

    public FoodOrder(String makanan_pembuka, String makanan_utama, String makanan_penutup) {
        this.makanan_pembuka = makanan_pembuka;
        this.makanan_utama = makanan_utama;
        this.makanan_penutup = makanan_penutup;
    }

    @Override
    public String orderdescription() {
        return makanan_pembuka + "\n" + makanan_utama + "\n" + makanan_penutup;
    }
}
