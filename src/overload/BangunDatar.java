/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overload;

/**
 *
 * @author krisn
 */
public class BangunDatar {
    double luas;
    double a=0.5;
    
    void luas (double panjang , double lebar){
        luas = panjang*lebar;
        System.out.println("luas pertama = "+luas);
    }
    void keliling (int panjang, int lebar , int a){
        luas = panjang*lebar*a;
        System.out.println("luas kedua = "+luas);
    }
}
