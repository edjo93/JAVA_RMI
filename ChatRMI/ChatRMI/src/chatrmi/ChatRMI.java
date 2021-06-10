/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmi;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Juan Leonardo
 */
public class ChatRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            ChatI miChat = new ChatImpl();
            Registry reg = LocateRegistry.createRegistry(19000);
//            ChatI stub = (ChatI) UnicastRemoteObject.exportObject(miChat, 0);
            reg.rebind("michat", miChat);//  _stub
            System.out.println("Servidor Iniciado");
        } catch (RemoteException ex) {
            System.out.println(ex.getMessage());          
        }         
    }    
}
