package Matematika;

public class Matematika {
    void pertambahan (int a, int b){
        pertambahan(a, b, 0);
    }

    void pertambahan (int a, int b, int c){
        int hasil= a + b + c;
        if (c == 0)
            System.out.printf("Hasil %d + %d: %d\n", a, b, hasil);
        else
            System.out.printf("Hasil %d + %d + %d: %d\n", a, b, c, hasil);
    }

    void pertambahan (double a, double b){
        pertambahan(a, b, 0.0);
    }

    void pertambahan (double a, double b, double c){
        double hasil= a + b + c;
        if (c == 0)
            System.out.printf("Hasil %.2f + %.2f: %.2f\n", a, b, hasil);
        else
            System.out.printf("Hasil %.2f + %.2f + %.2f: %.2f\n", a, b, c, hasil);
    }

    void pengurangan (int a, int b){
        pengurangan(a, b, 0);
    }

    void pengurangan (int a, int b, int c){
        int hasil= a - b - c;
        if (c == 0)
            System.out.printf("Hasil %d - %d: %d\n", a, b, hasil);
        else
            System.out.printf("Hasil %d - %d - %d: %d\n", a, b, c, hasil);
    }

    void pengurangan (double a, double b){
        pengurangan(a, b, 0.0);
    }

    void pengurangan (double a, double b, double c){
        double hasil= a - b - c;
        if (c == 0)
            System.out.printf("Hasil %.2f - %.2f: %.2f\n", a, b, hasil);
        else
            System.out.printf("Hasil %.2f - %.2f - %.2f: %.2f\n", a, b, c, hasil);
    }

    void perkalian (int a, int b){
        perkalian(a, b, 1);
    }

    void perkalian (int a, int b, int c){
        int hasil= a * b * c;
        if (c == 0)
            System.out.printf("Hasil %d * %d: %d\n", a, b, hasil);
        else
            System.out.printf("Hasil %d * %d * %d: %d\n", a, b, c, hasil);
    }

    void perkalian (double a, double b){
        perkalian(a, b, 1.0);
    }

    void perkalian (double a, double b, double c){
        double hasil= a * b * c;
        if (c == 0)
            System.out.printf("Hasil %.2f * %.2f: %.2f\n", a, b, hasil);
        else
            System.out.printf("Hasil %.2f * %.2f * %.2f: %.2f\n", a, b, c, hasil);
    }

    void pembagian (int a, int b){
        pembagian(a, b, 1);
    }

    void pembagian (int a, int b, int c){
        double hasil= a / b / c;
        if (c == 0)
            System.out.printf("Hasil %d / %d: %.2f\n", a, b, hasil);
        else
            System.out.printf("Hasil %d / %d / %d: %.2f\n", a, b, c, hasil);
    }

    void pembagian (double a, double b){
        pembagian(a, b, 1.0);
    }

    void pembagian (double a, double b, double c){
        double hasil= a / b / c;
        if (c == 0)
            System.out.printf("Hasil %.2f / %.2f: %.2f\n", a, b, hasil);
        else
            System.out.printf("Hasil %.2f / %.2f / %.2f: %.2f\n", a, b, c, hasil);
    }

    void modulus (int a, int b){
        modulus(a, b, 0);
    }

    void modulus (int a, int b, int c){
        if (c == 0) {
            int hasil= a % b;
            System.out.printf("Hasil %d mod %d: %d\n", a, b, hasil);
        }else {
            int hasil= a % b % c;
            System.out.printf("Hasil %d mod %d mod %d: %d\n", a, b, c, hasil);
        }
    }

    void modulus (double a, double b){
        modulus(a, b, 0.0);
    }

    void modulus (double a, double b, double c){
        if (c == 0.0) {
            double hasil= a % b;
            System.out.printf("Hasil %.2f mod %.2f: %.2f\n", a, b, hasil);
        }else {
            double hasil= a % b % c;
            System.out.printf("Hasil %.2f mod %.2f mod %.2f: %.2f\n", a, b, c, hasil);
        }
    }


}
