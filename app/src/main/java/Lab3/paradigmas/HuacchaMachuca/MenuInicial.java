/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3.paradigmas.HuacchaMachuca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Demis
 */
public class MenuInicial {
    
        
    int t;
    
    public void init(){
        ArrayList<TDAoption> options=new ArrayList();
        ArrayList<TDAflow> flows=new ArrayList();
        ArrayList<TDAchatbot> chatbots=new ArrayList();
        ArrayList<TDAuser> users=new ArrayList();
        
        
        JOptionPane.showMessageDialog(null, "Inicio");
        JOptionPane.showMessageDialog(null, "Register Admin User");
        
        String username=JOptionPane.showInputDialog("Ingresar Admin username");
        int tipo=0;
       
        TDAuser user=new TDAuser(username,tipo);
        users.add(user);
        
    }
    
    
    
    
    public int getT() {
        return t;
    }
    
    
}
