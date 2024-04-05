/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individual4;
import com.mirea.kt.example.Message;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Z-V
 */
public class MessageDeserializer implements Runnable {
    private String path;

    public MessageDeserializer(String path) {
        this.path = path;
    }
    

    @Override
    public void run(){
        if(this.path != null){
            
            try{
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Message message = (Message) ois.readObject();
                System.out.println("ID: " + message.getId());
                System.out.println("Body: " + message.getBody());
                System.out.println("Type: " + message.getType());
                System.out.println("Has Attachments: " + message.isHasAttachments());
                System.out.println("Timestamp: " + message.getTimestamp());
                ois.close();
                fis.close();
            }catch(IOException e){
            e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MessageDeserializer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
