/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmi;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
/**
 *
 * @author Juan Leonardo
 */
public class ChatCImpl extends UnicastRemoteObject implements ChatIC {
    public ChatCImpl() throws RemoteException {}
    
    public void imprimirMensaje(String mensaje) throws RemoteException {
        System.out.println("Mensaje: "+mensaje);
    }    
}
