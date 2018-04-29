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
public class Laptop {
    private String type;
    private String processor;
    private String warna;
    private double harga;
    
    void cetakInfo(){
        System.out.println("type \t : "+type+ "\n"+ 
        "processor \t : "+ processor+ "\n" +"warna \t : "+warna+ "\n"+
        "harga \t : "+harga);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    
    
}
