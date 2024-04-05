/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.individual4;
import java.util.Scanner;

/**
 *
 * @author Z-V
 */
public class Individual4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ремизова Майя. Рибо-02-22. Вариант 2.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите путь файла");
        String path =scan.nextLine();
        MessageDeserializer deserializer = new MessageDeserializer(path);
        Thread thread = new Thread(deserializer);
        thread.start();
    } 
}
