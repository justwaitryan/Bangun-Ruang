/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author User
 */
public class LimasSegitiga extends BangunRuang{
    float a,tS,tL,lST;

    @Override
    float volume() {
        float vol = a * tS/2 * tL / 3;
        System.out.println("Volume Limas Segitiga = " + vol);
        return vol;
    }

    float luasPermukaan() {
        float lp = a * tS/2 + 3 * lST;
        System.out.println("Luas Permukaan Limas Segitiga = " + lp);
        return lp;
    }
}
