package Matematika;

public class MatematikaBeraksi {
    public static void main(String[] args){
        Matematika m = new Matematika();

        // NO 4
        System.out.println("Jawaban No 4");
        m.pertambahan(12.5, 28.7, 14.2);
        m.pengurangan(12.5, 28.7, 14.2);
        m.perkalian(12.5, 28.7, 14.2);
        m.pembagian(12.5, 28.7, 14.2);
        m.modulus(12.5, 28.7, 14.2);

        // No 5
        System.out.println("\nJawaban No 5");
        m.pertambahan(12.5, 28.7, 14.2);
        m.pertambahan(23, 34);
        m.pertambahan(12, 28, 14);
        m.pertambahan(3.4, 4.9);
    }
}
