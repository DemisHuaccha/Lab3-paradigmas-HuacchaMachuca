/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3.paradigmas.HuacchaMachuca;

import java.util.ArrayList;

/**
 *
 * @author Demis
 */
public class TDAuser {
    String username;
    String tipo;
    
    
    public TDAuser(String username, String tipo){
        this.username=username;
        this.tipo=tipo;
    }
    
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
    
    public TDAsystem login(TDAsystem system, String username){
        if(system.getUserlogin()== null) {
            ArrayList<TDAuser> users = system.getUsers();
            int t=Mysearch(users, username);
            if(t!=-1){
                return new TDAsystem(system.getName(), system.getInitialchatbotcodelink(), system.getChatbots(), users, users.get(t));
            }
            
        }
        return null;
    } 

    public String getUsername() {
        return username;
    }

    public String getTipo() {
        return tipo;
    }
    
    

}
