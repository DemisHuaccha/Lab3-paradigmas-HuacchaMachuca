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
    
    
    /**
    *
    *Funcion addChatbot2 tiene dominio como una lista de TDAchatbot y un chatbot
    *tiene como recorrido una lista de TDAchatbot
    * Funcion que revisa la unicidad de cada id de los chatbots
    *
    */
      

    public ArrayList<TDAchatbot> addChatbot2(ArrayList<TDAchatbot> system, TDAchatbot a){
        int aId=a.getChatbotid();
        TDAchatbot temp;
        int IdChatbot;
        for(int i=0;i<system.size();i++){
            temp=system.get(i);
            IdChatbot=temp.getChatbotid();
            if(IdChatbot==aId){
                JOptionPane.showMessageDialog(null, "Chatbot id ya existente");
                return null;
            }
        }
        system.add(a);
        return system;
    }
    
    /**
    *Funcion addchatbot que tiene como dominio un TDAsystem y un TDA chatbot
    *addOption tiene como reoorrido un TDAsystem
    */
    
    public TDAsystem addChatbot(TDAsystem system, TDAchatbot a){
        JOptionPane.showMessageDialog(null, "Agregar Flow");
        ArrayList<TDAchatbot> newchatbots=system.addChatbot2(system.getChatbots(),a);
        return new TDAsystem(system.getName(),system.getInitialchatbotcodelink(),newchatbots);
        
    }
    
    
    
    
    /**
    *
    *Metodo addUser2 tiene dominio como una lista de TDAuser y un user
    *tiene como recorrido una lista de TDAuser
    *Metodo que revisa la unicidad de cada name de los users
    *
    */
    
    
    public ArrayList<TDAuser> addUser2(ArrayList<TDAuser> system, TDAuser a){
        String aName=a.getUsername();
        TDAuser temp;
        String UserName;
        for(int i=0;i<system.size();i++){
            temp=system.get(i);
            UserName=temp.getUsername();
            if(UserName.equals(aName)){
                JOptionPane.showMessageDialog(null, "Username id ya existente");
                return system;
            }
        }
        system.add(a);
        return system;
    }
    
    /**
    *Metodoadduser que tiene como dominio un TDAsystem y un TDA user
    *addOption tiene como reoorrido un TDAsystem
    */
    
    public TDAsystem addUser(TDAsystem system, TDAuser a){
        ArrayList<TDAuser> newusers=system.addUser2(system.getUsers(),a);
        
        return new TDAsystem(system.getName(),system.getInitialchatbotcodelink(),system.getChatbots(),newusers,system.getUserlogin());    
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////
    
    /**
    *Metodo Mysearch que tiene como dominio una lista de TDAuser y un string
    *Mysearch tiene como reoorrido un int donde -1 representa que no existe el string en la lista y cualquie otro numero positivo real representa la posicion del nombre en la lista.
    */
    
    
    public int Mysearch(ArrayList<TDAuser> users, String name){
        String name2;
        TDAuser temp;
        for(int i=0;i<users.size();i++){
            temp=users.get(i);
            name2=temp.getUsername();
            if(name2.equals(name)){
                return i;
            }
        }
        return -1;
    }
    
    /**
    Metodo login que tiene como dominio un TDAsystem y un string
    *addOption tiene como reoorrido un TDAsystem con el string logeado
    */
    
    
    public TDAsystem login(TDAsystem system, String username){
        if(system.getUserlogin()== null) {
            ArrayList<TDAuser> users = system.getUsers();
            int t=Mysearch(users, username);
            if(t!=-1){
                return new TDAsystem(system.getName(), system.getInitialchatbotcodelink(), system.getChatbots(), users, users.get(t));
            }
            
        }
        JOptionPane.showMessageDialog(null, "User name no existente");
        return null;
    } 
    
    /**
    *metodo logout que tiene como dominio un TDAsystem
    *addOption tiene como reoorrido un TDAsystem con el suser logeado = null
    */
    
    public TDAsystem Logout(TDAsystem system){
        if(system.getUserlogin()!=null){
            return new TDAsystem(system.getName(),system.getInitialchatbotcodelink(), system.getChatbots(), system.getUsers(), null);
        }
        JOptionPane.showMessageDialog(null, "No hay user logeado");
        return system;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    /*////////////////////////////////////Funciones get/////////////////////////////////////*/

    
    /**
    *
    *   metodos get de system
    *
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
    
    
    /**
    * Metodo imprimir_Systems con dominio como lista de TDAsystems
    * y con el recorrido como void
    *
    *Metodo que imprime el nombre de cada system en la lista de systems
    */
    
    static void imprimir_Names(TDAsystem system){
        JOptionPane.showMessageDialog(null, "Names: ");
        ArrayList<TDAuser> users=system.getUsers();
        for(int i=0;i<users.size();i++){
                JOptionPane.showMessageDialog(null, i+") "+users.get(i).getUsername());
        }
    }
    
    static void imprimir_Systems(ArrayList<TDAsystem> systems){
        JOptionPane.showMessageDialog(null, "Systems: ");
        for(int i=0;i<systems.size();i++){
                JOptionPane.showMessageDialog(null, i+") "+systems.get(i).getName());
            }
    }
    
    
}
