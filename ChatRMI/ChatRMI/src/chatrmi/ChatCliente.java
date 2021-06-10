/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmi;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.rmi.registry.*;
import java.util.Scanner;
/**
 *
 * @author Juan Leonardo
 */
public class ChatCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here            
            Registry reg = LocateRegistry.getRegistry(19000);
            ChatI miChat = (ChatI)reg.lookup("michat");
            Scanner scn = new Scanner(System.in);
            ChatCImpl cb = new ChatCImpl();
            miChat.registrarChatCallback(cb);
            String mensaje=null;
            while (true) {
                System.out.print("Mensaje: ");
                mensaje = scn.nextLine();
                miChat.enviarMensaje(mensaje);
            }
        } catch (RemoteException ex) {
            System.out.println("Error ");
        } catch (NotBoundException ex) {
            Logger.getLogger(ChatCliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }    
}
