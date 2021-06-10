/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Juan Leonardo
 */
public interface ChatI extends Remote {
    public void registrarChatCallback(ChatIC chat)throws RemoteException;
    public void enviarMensaje(String mensaje) throws RemoteException;    
}
