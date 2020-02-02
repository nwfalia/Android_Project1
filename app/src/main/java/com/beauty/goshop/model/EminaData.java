package com.beauty.goshop.model;

import com.beauty.goshop.R;

import java.util.ArrayList;

public class EminaData {
    private static String[] eminaProducts = {
            "Emina Double Bubble Face Wash",
            "Emina Apricot Jam Face Scrub",
            "Emina Grape Seed Olive Face Mask",
            "Emina Double The Moist Face toner",
            "Emina Moist in A Bottle",
            "Emina Sugar Rush Lip Scrub",
            "Emina Sun Protection SPF 30",
            "Emina Ms. Pimple Acne Solution Moisturizing Gel",
            "Emina Creamy Milk Cleansing Lotion",
            "Emina Micellar Water Drop Cleanser"
    };

    private static String[] eminaDetails = {
            "Facial wajah yang membersihkan, melembabkan, dan menyegarkan kulit wajah.\n" +
                    "1. Kombinasi surfactant dan soap base untuk membersihkan kotoran larut air dan lemak dengan busa melimpah namun tidak kering.\n" +
                    "2. Kombinasi kandungan panthenol, sodium PCA & niacinamide melembabkan sekaligus mencerahkan.\n" +
                    "3. Hasil lebih bersih dan kulit tetap lembab.",
            "Mengangkat sel kulit mati (eksfoliasi) sehingga kulit terasa halus dan tidak kusam.\n" +
                    "1. Berbahan alami apricot seed yang memberikan eksfoliasi natural dan lembut sehingga wajah tidak kusam.\n" +
                    "2. Mengandung olive oil yang membantu menjaga kelembaban kulit.\n" +
                    "3. Mudah diratakan pada kulit.\n" +
                    "4. Mengandung vitamin E yang berfungsi untuk antioksidan, meningkatkan elastisitas & kehalusan kulit.\n" +
                    "5. Cocok untuk semua jenis kulit.",
            "Masker peel of untuk membuat kulit wajah sehat dan kencang.\n" +
                    "1. Masker peel off yang mudah diratakan, mudah dibersihkan, membuat kulit terasa kencang dan mudah dibersihkan.\n" +
                    "2. Mengandung grapeseed extract dan vitamin E yang berfungsi sebagai antioksidan untuk melindungi dan mencegah penuaan dini pada kulit.\n" +
                    "3. Mengandung olive oil yang melembabkan kulit untuk kulit lebih sehat.\n" +
                    "4. Cocok untuk semua jenis kulkit karena mengandung allantolin sebagai anti-iritan.",
            "Meringkas pori dan membuat kulit wajah terasa segar dengan efek melembabkan.\n" +
                    "1. Mengandung Vitamin E dan extract chamomile untuk melembabkan.\n" +
                    "2. Cocok untuk kulit normal cenderung kering.\n" +
                    "3. Formula non alkohol.",
            "Moisturizer untuk menjaga dan meningkatkan kelembaban kulit.\n" +
                    "1. Menjaga dan meningkatkan kelembaban kulit lebih dari 6 jam.\n" +
                    "2. Memiliki triple hydration system yaitu jojoba oil untuk melembabkan, squalene untuk menjaga kekenyalan kulit dan mencegah penguapan air, dan caprylic trygliceride untuk menjaga struktur kulit.\n" +
                    "3. Cocok untuk semua jenis kulit.",
            "Scrub bibir untuk merawat dan menjaga bibir tetap sehat.\n" +
                    "1. Scrub terbuat dari gula organik.\n" +
                    "2. Baik digunakan terutama untuk yang suka menggunakan lipstick matte.\n" +
                    "3. Mengandung gula, apricot seed, shea butter, olive oil dan jojoba oil untuk menjaga kesehatan & kelembaban bibir.\n" +
                    "4. Membuat bibir lebih halus dan smooth pada saat aplikasi lipstick.",
            "Melindungi kulit dari efek buruk sinar UVA & UVB.\n" +
                    "1. Mengandung SPF 30 dan PA+++ untuk perlindungan maksimal.\n" +
                    "2. Ringan, mudah meresap dan tidak lengket di kulit.\n" +
                    "3. Mengandung aloe vera dan panthenol untuk melembabkan kulit wajah.\n" +
                    "4. Cocok untuk semua jenis kulit.\n" +
                    "5. Harga lebih terjangkau dibandingkan produk sejenis.",
            "Emina Ms. Pimple Acne Solution Moisturizing Gel merupakan pelembab wajah sehari-hari untuk menjaga kulit berjerawat dan kulit acne prone agar tetap terhidrasi sehingga\n" +
                    "produksi sebum dapat terkontrol. Mengandung 4 moisturizing agent untuk menjaga kelembaban kulit serta Rosebay Willowherb Extract yang dapat mengurangi kemerahan pada kulit dan\n" +
                    "mencegah pertumbuhan bakteri penyebab jerawat. Dilengkapi dengan SPF 15 untuk melindungi kulit dari sinar UV.",
            "1. Membersihkan wajah dengan cream lembut yang ringan dan tidak meninggalkan rasa lengket setelah digunakan.\n" +
                    "2. Memiliki ph balance (sama dengan kulit) sehingga cocok untuk semua jenis kulit.\n" +
                    "3. Memiliki aktif pembersih, antioksidan dari grape seed extract, Vitamin B3 yang dapat membuat wajah tampak lebih.\n",
            "1. Mengandung Cleansing Agent yang membantu mengangkat dan membersihkan riasan wajah dalam satu kali usap.\n" +
                    "2. Anti Irritant yang berfungsi untuk mencegah terjadinya iritasi pada kulit sehingga aman digunakan oleh semua jenis kulit.\n" +
                    "3. Cucumber Extract sebagai Soothing Agent yang membuat kulit terasa segar.\n" +
                    "4. Tidak lengket di kulit."

    };

    private static int[] eminaImages = {
            R.drawable.face_wash,
            R.drawable.face_scrub,
            R.drawable.face_mask,
            R.drawable.face_toner,
            R.drawable.moisturizer,
            R.drawable.sugar_rush,
            R.drawable.sun_protection,
            R.drawable.pimple_acne,
            R.drawable.milk_cleansing,
            R.drawable.micellar_water

    };

    private static String[] eminaSpesifikHarga = {
            "15.500",
            "26.000",
            "39.500",
            "27.500",
            "29.000",
            "32.000",
            "23.000",
            "20.000",
            "23.000",
            "32.500"
    };

    private static String[] eminaSpesifikKategori = {
            "Pembersih Wajah",
            "Scrub & peel wajah",
            "Masker Wajah",
            "Toner",
            "Pelembab Wajah",
            "Masker & Pelembab Bibir",
            "Sunscreen & Aftersun",
            "Pelembab Wajah",
            "Pembersih Make Up",
            "Pembersih Make Up"
    };

    private static int[] eminaSpesifikStok = {
            10,
            5,
            8,
            15,
            18,
            5,
            30,
            11,
            18,
            8
    };

    public static ArrayList<Emina> getListData() {
        ArrayList<Emina> list = new ArrayList<>();
        for (int position = 0; position < eminaProducts.length; position++) {
            Emina emina = new Emina();
            emina.setProduct(eminaProducts[position]);
            emina.setDetail(eminaDetails[position]);
            emina.setImage(eminaImages[position]);
            emina.setSpesifikasiHarga(eminaSpesifikHarga[position]);
            emina.setSpesifikasiKategori(eminaSpesifikKategori[position]);
            emina.setSpesifikasiStok(eminaSpesifikStok[position]);
            list.add(emina);
        }
        return list;
    }
}
