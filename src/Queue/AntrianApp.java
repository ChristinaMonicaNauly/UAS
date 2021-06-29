/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author User
 */
public class AntrianApp {
     public static void main(String args []){
        Antrian antrian = new Antrian (10);
        antrian.enqueue(1);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        System.out.println("Nama saya adalah Christina Monica Nauly");
        System.out.println(" ");
        antrian.enqueue(70);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
    }
}