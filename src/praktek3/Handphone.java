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
public class Handphone extends Laptop {
    private String TypeHp;
    
    void throttle(){
        System.out.println("ASUS");
    }

    public String getTypeHp() {
        return TypeHp;
    }

    public void setTypeHp(String TypeHp) {
        this.TypeHp = TypeHp;
    }
    
}
