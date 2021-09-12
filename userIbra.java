public class userIbra {

    static void acc(){
        System.out.println("=========================================");
    }

    public static void main(String[] args){
        Spidol spI = new Spidol("Super", "Blue", "Tidak Permanen");

        acc();
        spI.deskripsiSpidol();
        System.out.println("Isi tinta\t\t: "+ spI.getIsiTinta()+"%");
        acc();

        System.out.println("\t\t== BERKEGIATAN ==");
        spI.menulis("Halo saya Ibra, hari ini kita akan mempelajari matakuliah " +
                "praktikum pemrograman berorienrtasi objek mengenai methode dan atribute " +
                "dengan contoh spidol");
        System.out.println("Tersisa\t:"+ spI.getIsiTinta()+"%\n");

        spI.mewarnai();
        spI.refillTinta();
        System.out.println();

        spI.mewarnai();
        spI.mengarsir();
        System.out.println("Tersisa\t:"+ spI.getIsiTinta()+"%\n");

        spI.menulis("Sekian dari saya, jika masih ada pertanyaan " +
                "mungkin bisa ditanyakan di WAG kita, sekian dari saya terimakasih");
        System.out.println("Tersisa\t:"+ spI.getIsiTinta()+"%");
        spI.refillTinta();
        spI.mengarsir();
        System.out.println("Tersisa\t:"+ spI.getIsiTinta()+"%");
        acc();

        System.out.println("\t== Deskripsi Spidol dengan Get ==");
        System.out.println("Jenisnya\t: "+spI.getJenis());
        System.out.println("Mereknya\t: "+spI.getMerek());
        System.out.println("Warnanya\t: "+spI.getWarna());
        System.out.println("Isi Sekerang: "+spI.getIsiTinta());
        acc();
    }
}
