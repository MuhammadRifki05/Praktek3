/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek3;

/**
 *
 * @author Rifki
 */
public class LaptopKu {
    public static void main(String[] args) {
        Laptop b = new Laptop();
        
        b.setType("Asus Zenfone 3 Deluxe");
        b.setProcessor("Intel Core i7");
        b.setWarna("Gold");
        b.setHarga(1500000);
        
        b.cetakInfo();
        
        System.out.print("Typenya \t: ");
        System.out.println(b.getType());
        System.out.print("Processornya \t: ");
        System.out.println(b.getProcessor());
        System.out.print("Warnanya \t: ");
        System.out.println(b.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(b.getHarga());
        
        Handphone h = new Handphone();
        h.setType("Asus Zenfone 2");
        h.setProcessor("Jellybean");
        h.setWarna("Silver");
        h.setHarga(450000);
        h.setTypeHp("Android");
        h.cetakInfo();
        
        System.out.println("Type HP : \t"+h.getTypeHp());
        h.throttle();
           
    }
}
