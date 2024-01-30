/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author User
 */
public class Balok extends BangunRuang{
    float p,l,t;

    @Override
    float volume() {
        float vol = p * l * t;
        System.out.println("Volume Balok = " + vol);
        return vol;
    }

    float luasPermukaan() {
        float lp = 2 * ( p * l + l * t + p * t);
        System.out.println("Luas Permukaan Balok = " + lp);
        return lp;
    }
}
