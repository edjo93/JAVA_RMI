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
public interface ChatIC extends Remote {
    public void imprimirMensaje(String mensaje) throws RemoteException;    
}
