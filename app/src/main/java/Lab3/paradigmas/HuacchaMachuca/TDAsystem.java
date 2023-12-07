/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3.paradigmas.HuacchaMachuca;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Demis
 */
public class TDAsystem {
    String name;
    int initialchatbotcodelink;
    ArrayList<TDAchatbot> chatbots;
    ArrayList<TDAuser> users;
    TDAuser userlogin;

    public TDAsystem(String name, int initialchatbotcodelink, ArrayList<TDAchatbot> chatbots) {
        this.name = name;
        this.initialchatbotcodelink = initialchatbotcodelink;
        this.chatbots = chatbots;
        this.users=new ArrayList<>();
        this.userlogin=null;
    }
    
    public TDAsystem(String name, int initialchatbotcodelink, ArrayList<TDAchatbot> chatbots, ArrayList<TDAuser> users, TDAuser userlogin) {
        this.name = name;
        this.initialchatbotcodelink = initialchatbotcodelink;
        this.chatbots = chatbots;
        this.users= users;
        this.userlogin= userlogin;
    }
      

    public ArrayList<TDAchatbot> addChatbot2(ArrayList<TDAchatbot> system, TDAchatbot a){
        int aId=a.getChatbotid();
        TDAchatbot temp;
        int IdChatbot;
        for(int i=0;i<system.size();i++){
            temp=system.get(i);
            IdChatbot=temp.getChatbotid();
            if(IdChatbot==aId){
                JOptionPane.showMessageDialog(null,"Chatbot id ya existente");
                return null;
            }
        }
        system.add(a);
        return system;
    }
    
    public TDAsystem addChatbot(TDAsystem system, TDAchatbot a){
        JOptionPane.showMessageDialog(null,"Agregar Flow");
        ArrayList<TDAchatbot> newchatbots=system.addChatbot2(system.getChatbots(),a);
        return new TDAsystem(system.getName(),system.getInitialchatbotcodelink(),newchatbots);
        
    }
    
  
    /*
    public ArrayList<TDAuser> addUser2(ArrayList<TDAuser> system, TDAuser a){
        String aName=a.getUsername();
        TDAuser temp;
        String UserName;
        for(int i=0;i<system.size();i++){
            temp=system.get(i);
            UserName=temp.getUsername();
            if(UserName.equals(aName)){
                JOptionPane.showMessageDialog(null,"Username id ya existente");
                return null;
            }
        }
        system.add(a);
        return system;
    }
    
    
    
    public TDAsystem addUser(TDAsystem system, TDAuser a){
        JOptionPane.showMessageDialog(null,"Agregar Flow");
        ArrayList<TDAuser> newusers=system.addUser2(system.getUsers(),a);
        
        return system;
        
    }
    */
    
    

    public String getName() {
        return name;
    }

    public int getInitialchatbotcodelink() {
        return initialchatbotcodelink;
    }

    public ArrayList<TDAchatbot> getChatbots() {
        return chatbots;
    }
    
    public ArrayList<TDAuser> getUsers() {
        return users;
    }
    
    public TDAuser getUserlogin() {
        return userlogin;
    }
    
    
    
    
}
