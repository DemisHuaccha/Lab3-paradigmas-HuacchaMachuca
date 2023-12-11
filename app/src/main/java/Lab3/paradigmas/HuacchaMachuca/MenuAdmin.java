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
public class MenuAdmin {
    
    static TDAoption makeOption(){
        
        int code=Integer.parseInt(JOptionPane.showInputDialog("Ingresar code"));
        String message=JOptionPane.showInputDialog("Ingresar message");
        int chatbotcodelink=Integer.parseInt(JOptionPane.showInputDialog("Ingresar chatbotcodelink"));
        int initialflowcodelink=Integer.parseInt(JOptionPane.showInputDialog("Ingresar initialflowcodelink"));
        ArrayList<String> keys =new ArrayList();
        char respuesta=JOptionPane.showInputDialog("Ingresar keys: S/N").charAt(0);
        if(respuesta=='s'||respuesta=='S'){
            do{
                keys.add(JOptionPane.showInputDialog("Ingresar key"));
                respuesta=JOptionPane.showInputDialog("Ingresar mas keys: S/N").charAt(0);
            }while(respuesta=='s' || respuesta =='S');
        }
        
        
        return new TDAoption(code,message,chatbotcodelink,initialflowcodelink,keys);
    
    }
    
    static TDAflow makeFlow(ArrayList<TDAoption> options){
        
        int id=Integer.parseInt(JOptionPane.showInputDialog("Ingresar id"));
        String name=JOptionPane.showInputDialog("Ingresar namemsg");
        
        return new TDAflow(id,name,options);
    }
    
    static TDAchatbot makeChatbot(ArrayList<TDAflow> flows){
       
        int chatbotid=Integer.parseInt(JOptionPane.showInputDialog("Ingresar chatbotid"));
        String name=JOptionPane.showInputDialog("Ingresar name");
        String welcomemessage=JOptionPane.showInputDialog("Ingresar welcomemessage");
        int staridflow=Integer.parseInt(JOptionPane.showInputDialog("Ingresar staridflow"));
        return new TDAchatbot(chatbotid,name,welcomemessage,staridflow,flows);
    }
    
    static TDAsystem makeSystem(ArrayList<TDAchatbot> chatbots){
        String name=JOptionPane.showInputDialog("Ingresar name");
        int initialchatbotcodelink=Integer.parseInt(JOptionPane.showInputDialog("Ingresar initialchatbotcodelink"));
        
        return new TDAsystem(name, initialchatbotcodelink,chatbots);
    }
    
    static TDAuser makeUser(){
        String username=JOptionPane.showInputDialog("Ingresar username");
        int tipo=Integer.parseInt(JOptionPane.showInputDialog("Ingresar tipo de user (0=admin)"));
        return new TDAuser(username,tipo);
    }
    
    static ArrayList<TDAoption> LimpiarOpt2(ArrayList<TDAoption> Options, TDAoption Opt ){
        int codeOpt=Opt.getCode();
        TDAoption temp;
        int codeOptions;
        for(int i=0;i<Options.size();i++){
            temp=Options.get(i);
            codeOptions=temp.getCode();
            if(codeOptions==codeOpt){
                return null;
            }
        }
        Options.add(Opt);
        return Options;
    } 
    
    static ArrayList<TDAoption> LimpiarOpt(ArrayList<TDAoption> options){
        ArrayList<TDAoption> options2=new ArrayList();
        for(int i=0;i<options.size();i++){
            options2=LimpiarOpt2(options2,options.get(i));
        }
        return options2;
    }
    
    static ArrayList<TDAflow> LimpiarFlow2(ArrayList<TDAflow> Flows, TDAflow Flow ){
        int flowId=Flow.getId();
        TDAflow temp;
        int IdFlows;
        for(int i=0;i<Flows.size();i++){
            temp=Flows.get(i);
            IdFlows=temp.getId();
            if(IdFlows==flowId){
                return null;
            }
        }
        Flows.add(Flow);
        return Flows;
    }
    
    static ArrayList<TDAflow> LimpiarFlow(ArrayList<TDAflow> flows){
        ArrayList<TDAflow> flows2=new ArrayList();
        for(int i=0;i<flows.size();i++){
            flows2=LimpiarFlow2(flows2,flows.get(i));
        }
        return flows2;
    }
    
   static ArrayList<TDAchatbot> LimpiarChatbot2(ArrayList<TDAchatbot> system, TDAchatbot a){
        int aId=a.getChatbotid();
        TDAchatbot temp;
        int IdChatbot;
        for(int i=0;i<system.size();i++){
            temp=system.get(i);
            IdChatbot=temp.getChatbotid();
            if(IdChatbot==aId){
                return null;
            }
        }
        system.add(a);
        return system;
    }
    
    static ArrayList<TDAchatbot> LimpiarChatbot(ArrayList<TDAchatbot> chatbots){
        ArrayList<TDAchatbot> chatbots2=new ArrayList();
        for(int i=0;i<chatbots.size();i++){
            chatbots2=LimpiarChatbot2(chatbots2,chatbots.get(i));
        }
        return chatbots2;
    }
    
    
}
