/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.Vector;
/**
 *
 * @author Juan Leonardo
 */
public class ChatImpl extends UnicastRemoteObject implements ChatI {
    private Vector<ChatIC> clientes = null;
    public ChatImpl() throws RemoteException {
        clientes = new Vector();
    }
    
    public void registrarChatCallback(ChatIC chat)throws RemoteException {
        clientes.add(chat);
    }
    
    public void enviarMensaje(String mensaje) throws RemoteException {
        System.out.println("Mensaje: "+mensaje);
        Iterator<ChatIC> clientesIter = clientes.iterator();
        while (clientesIter.hasNext()) {
            clientesIter.next().imprimirMensaje(mensaje);
        }
    }
}
