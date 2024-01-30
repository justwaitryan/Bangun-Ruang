/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author User
 */
public class Bola extends BangunRuang {

    float r;

    @Override
    float volume() {
        float vol = (float) (Math.PI * r * r * r * 4 / 3);
        System.out.println("Volume Bola = " + vol);
        return vol;
    }

    float luasPermukaan() {
        float lp = (float) ( r * r * 4 * Math.PI);
        System.out.println("Luas Permukaan Bola = " + lp);
        return lp;
    }
}
