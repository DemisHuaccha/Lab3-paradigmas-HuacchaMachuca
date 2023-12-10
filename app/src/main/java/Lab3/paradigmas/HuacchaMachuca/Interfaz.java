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
public class Interfaz {
    
    int t;
    
    public void init(){
        t=0;
        ArrayList<TDAoption> options=new ArrayList();
        ArrayList<TDAflow> flows=new ArrayList();
        ArrayList<TDAchatbot> chatbots=new ArrayList();
        ArrayList<TDAsystem> system=new ArrayList();
        
        
        System.out.println("1 Login");
        System.out.println("2) Logout");
        System.out.println("3) Register");
        System.out.println("4) Talk");
    
    }
    
    
    
    
    public int getT() {
        return t;
    }
}
