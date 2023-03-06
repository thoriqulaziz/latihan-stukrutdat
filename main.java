import java.util.ArrayList;

public class main {
    public static void  main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<makanan, minuman> breakfast = new Konsumsi<>();
        Konsumsi<makanan, minuman> lunch = new Konsumsi<>();

        makanan roti = new makanan();
        roti.setNamaHidangan("Roti Tawar");
        minuman susu = new minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfast);

        makanan nasi = new makanan();
        nasi.setNamaHidangan("Nasi Putih");
        minuman air = new minuman();
        air.setNamaHidangan("Air Putih");
        lunch.setKonsumsi(nasi, air);
        listKonsumsi.add(lunch);

        System.out.println("Menu Konsumsi");
        for (Konsumsi<makanan,minuman> konsumsi:listKonsumsi){
            makanan makanan = konsumsi.getM();
            minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());

        }

    }
}
