
package bangun.ruang;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        BangunRuang bangunRuang = new BangunRuang();
        
        Bola bola = new Bola();
        System.out.print("Masukkan jari-jari Bola : ");
        bola.r = input.nextFloat();
        
        Kubus kubus = new Kubus();
        System.out.print("Masukkan sisi kubus : ");
        kubus.s = input.nextFloat();
        
        Balok balok = new Balok();
        System.out.print("Masukkan panjang Balok : ");
        balok.p = input.nextFloat();
        System.out.print("Masukkan lebar Balok : ");
        balok.l = input.nextFloat();
        System.out.print("Masukkan tinggi Balok : ");
        balok.t = input.nextFloat();
        
        LimasSegitiga limasSegitiga = new LimasSegitiga();
        System.out.print("Masukkan alas Limas Segitiga : ");
        limasSegitiga.a = input.nextFloat();
        System.out.print("Masukkan tinggi alas Limas segitiga : ");
        limasSegitiga.tS = input.nextFloat();
        System.out.print("Masukkan tinggi Limas Segitiga : ");
        limasSegitiga.tL = input.nextFloat();
        System.out.print("Masukkan luas sisi tegak Limas Segitiga : ");
        limasSegitiga.lST = input.nextFloat();
         
        System.out.println("");
        
        bola.volume();
        bola.luasPermukaan();
        bangunRuang.volume();
        bangunRuang.luasPermukaan();        
        kubus.volume();
        kubus.luasPermukaan();
        balok.volume();
        balok.luasPermukaan();
        limasSegitiga.volume();
        limasSegitiga.luasPermukaan();
    }
    
}
