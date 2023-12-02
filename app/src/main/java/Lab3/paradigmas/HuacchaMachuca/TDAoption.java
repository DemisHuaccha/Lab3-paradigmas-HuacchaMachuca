/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3.paradigmas.HuacchaMachuca;

import java.util.ArrayList;
import java.util.Scanner;
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
    
   
    private static ArrayList<String> listaDinamica(){
        ArrayList<String> lista=new ArrayList();
        char respuesta;
        do{
            lista.add(JOptionPane.showInputDialog("Ingresar key"));
            respuesta=JOptionPane.showInputDialog("Ingresar mas keys: S/N").charAt(0);
        }while(respuesta=='s' || respuesta =='S');
        return lista;
    }
    
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
                System.out.println(lista.get(i));
            }
    }
    
    public void imprimir_option(TDAoption opt){
        System.out.println("Code: "+opt.getCode());
        System.out.println("Message: "+opt.getMessage());
        System.out.println("ChatbotCodelink: "+opt.getChatbotcodelink());
        System.out.println("InitialflowCodelink: "+opt.getInitialflowcodelink());
        opt.imprimir_keys(opt);
    }
    
    
}
