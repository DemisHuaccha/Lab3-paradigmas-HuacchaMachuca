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
public class TDAoption {
    int code;
    String message;
    int chatbotcodelink;
    int initialflowcodelink;
    ArrayList <String> keys;
    
    public TDAoption(int code, String message, int chatbotcodelink, int initialflowcodelink, ArrayList<String> keys) {
        this.code = code;
        this.message = message;
        this.chatbotcodelink = chatbotcodelink;
        this.initialflowcodelink = initialflowcodelink;
        this.keys = keys;
    }
    
 
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public int getChatbotcodelink() {
        return chatbotcodelink;
    }

    public int getInitialflowcodelink() {
        return initialflowcodelink;
    }
    
    public ArrayList<String> getKeys() {
        return keys;
    }
    
    public void imprimir_keys(TDAoption opt){
        ArrayList<String> lista= opt.getKeys();
        System.out.println("Keys: ");
        for(int i=0;i<lista.size();i++){
                JOptionPane.showMessageDialog(null, lista.get(i));
            }
    }
    
    public void imprimir_option(TDAoption opt){
        JOptionPane.showMessageDialog(null, opt.getCode());
        JOptionPane.showMessageDialog(null, opt.getMessage());
        JOptionPane.showMessageDialog(null, opt.getChatbotcodelink());
        JOptionPane.showMessageDialog(null, opt.getInitialflowcodelink());
        opt.imprimir_keys(opt);
    } 
    
}
