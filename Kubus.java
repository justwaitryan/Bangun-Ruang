/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author User
 */
public class Kubus extends BangunRuang{
    float s;

    @Override
    float volume() {
        float vol = s * s * s;
        System.out.println("Volume Kubus = " + vol);
        return vol;
    }

    float luasPermukaan() {
        float lp = 6 * s * s;
        System.out.println("Luas Permukaan Kubus = " + lp);
        return lp;
    }
}
