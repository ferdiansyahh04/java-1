public class Kasir {
    public static void main(String[] args) {
        String nm_toko = "Toko Sumber Rezeki";
        String alamat1 = "Jl. Raya Kampung Tengah No 80";
        String alamat2 = "Kec. Pasar Rebo, Jakarta Timur 13760";
        String nm_brg1 = "Luwak White Coffe";
        int Qty1 = 10;
        int hrg1 = 9200;
        String nm_brg2 = "Pop mie baso";
        int Qty2 = 5;
        int hrg2 = 4000;

        int totalbeli = Qty1 * hrg1 + Qty2 * hrg2;
        double diskonrate = 0;

        if (totalbeli > 500000) {
            diskonrate = 0.15; // 15% diskon
        }
        else if (totalbeli > 300000) {
            diskonrate = 0.10; // 10% diskon
        }
        else if (totalbeli > 200000) {
            diskonrate = 0.05; // 5% diskon
        }
        else {
            diskonrate = 0.00;
        }

        double totaldiskon = totalbeli * diskonrate;
        double totalpembelianakhir = totalbeli - totaldiskon;
        double pajak = totalpembelianakhir * 0.10; // 10% pajak
        double totalbayar = totalpembelianakhir + pajak;

        System.out.println(nm_toko);
        System.out.println(alamat1);
        System.out.println(alamat2);
        System.out.println("============================");
        System.out.println(nm_brg1);
        System.out.println(Qty1);
        System.out.println(hrg1);
        System.out.println("============================");
        System.out.println(nm_brg2);
        System.out.println(Qty2);
        System.out.println(hrg2);
        System.out.println("============================");
        System.out.println("Total Pembelian: " + totalbeli);
        System.out.println("PPN (10%) : " + pajak);
        System.out.println("Diskon : " + (diskonrate * 100) + "%");
        System.out.println("Total Diskon: " + totaldiskon);
        System.out.println("Total Pembelian Akhir: " + totalpembelianakhir);
    }
}
