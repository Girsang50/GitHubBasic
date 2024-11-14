//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
        public static void calc(double a, double b, String operator){
        if (operator.equals("+")) {
            System.out.println(a+b);
        }else if (operator.equals("-")) {
            System.out.println(a-b);
        }else if (operator.equals("x")) {
            System.out.println(a*b);
        }else if (operator.equals(":")) {
            System.out.println(a/b);
        }else if (operator.equals("%")) {
            System.out.println(a%b);
        }else if(operator.equals("*")) {
            System.out.println(a*b);
        }else  {
            System.out.print("Input tidak valid");
        }
    }

    class Biodata{
        String nama;
        String hobi;
        int umur;

        Biodata(String nama, String hobi, int umur){
            this.nama = nama;
            this.hobi = hobi;
            this.umur = umur;
        }

        public static int test(){
            return 100;
        }

        public static void coba(int a){
            if (a == 7){
                System.out.println("oke");
            }
        }

        void menyapa(){
            System.out.println("Halo saya " + nama);
        }

    }

    public static void main(String[] args) {

        Biodata dataSaya = new Biodata("Fitri", "nonton", 33);

        dataSaya.menyapa();
        System.out.println(dataSaya.hobi());
        System.out.println(dataSaya.test());

        /*
        * Buatkan kalkulator yang bisa menerima input
        * int a
        * int b
        * char operator tambah kurang
        * while
        * lanjut y = looping
        * kalau t = keluar
        * terima kasih
        * */
        Scanner kalkulator = new Scanner(System.in);
        boolean kondisi = true;

        while(kondisi) {
            System.out.print("Masukkan Angka1 :");
            double a = Integer.parseInt(kalkulator.nextLine());
            System.out.print("Masukkan Angka2 :");
            double b = Integer.parseInt(kalkulator.nextLine());
            System.out.print("Masukkan Operator :");
            String operator = kalkulator.nextLine();

            calc(a, b, operator);

            System.out.print("Apakah Anda mau lanjut? ");
            String tanya    = kalkulator.nextLine();

            if (tanya.equals("ya")){
                kondisi = true;
            }else {
                kondisi = false;
            }

        }
        kalkulator.close();






//        String nama = "Fitri Mahdalena Girsang";
//
//        System.out.println(nama);
//        System.out.println("Nama Saya : " + nama);
//
//        int a = 24;
//        int b = 16;
//
//        int kurang = a - b;
//        int kali = a*b;
//        int bagi = a/b;
//
//        System.out.println(a+b);
//        System.out.println(a%b);
//        System.out.println(kurang);
//        System.out.println(kali);
//        System.out.println(bagi);

        //Operator langka atau, dan, & bukan
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//        System.out.println(!false);
//        System.out.println(!true);
//        System.out.println(true && !(true || false));
//
//        int a = 31;
//        int b = 30;
//
//        System.out.println(a <= b);

//        int saldo = 2000;
//        int tarik = 1900;
//
//        if (tarik > 1000 && tarik <= saldo){
//            System.out.println("Saldo berhasil ditarik, tapi kena pajak 25%");
//        }else if(tarik <= saldo){
//            System.out.println("Saldo berhasil ditarik");
//        }else{
//            System.out.println("Saldo Anda kurang");
//        }

//        int cekPensil = 1;
//        while (cekPensil <= 10){
//            System.out.println("Keluarkan Pensil : " + cekPensil);
//
//            cekPensil = cekPensil + 1;
//        }
//
//        for (int i = 1; i <=5 ; i++){
//            System.out.println("Looping : " + i);
//
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Masukkan nama Anda: ");
//        String nama = scanner.nextLine();
//
//        System.out.println("Halo, " + nama + "!");
//        if (nama.equals("fitri")){
//            System.out.println("Anda mendapatkan doorprize!");
//        }else{
//            System.out.println("Silahkan coba lagi!");
//        }
//
//        scanner.close();

//        Scanner inputnama = new Scanner(System.in);
//        System.out.print("Masukkan Nama :");
//        String nama = inputnama.nextLine();
//
//        System.out.println("Hi " + nama + "!");
//        if (nama.equals("mike")){
//            System.out.print("Selamat ulang tahun!");
//        }else{
//            System.out.print("Tunggu tahun depan!");
//        }
//
//        inputnama.close();








    }
}