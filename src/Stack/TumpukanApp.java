/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author User
 */
public class TumpukanApp {
    public static void main(String args[]){
        Tumpukan tumpukan = new Tumpukan (10);
        tumpukan.push(1);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println("Nilai teratas = " + tumpukan.peek());
        System.out.println("Nama Saya Adalah Christina Monica Nauly");
        System.out.println("Nilai yang dihapus = " + tumpukan.pop());
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
    }
}
