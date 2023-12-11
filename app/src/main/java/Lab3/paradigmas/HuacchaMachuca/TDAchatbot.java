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
public class TDAchatbot {
    int chatbotid;
    String name;
    String welcomemessage;
    int staridflow;
    ArrayList<TDAflow> flows;

    public TDAchatbot(int chatbotid, String name, String welcomemessage, int staridflow, ArrayList<TDAflow> flows) {
        this.chatbotid = chatbotid;
        this.name = name;
        this.welcomemessage = welcomemessage;
        this.staridflow = staridflow;
        this.flows = flows;
    }

    public int getChatbotid() {
        return chatbotid;
    }

    public String getName() {
        return name;
    }

    public String getWelcomemessage() {
        return welcomemessage;
    }

    public int getStaridflow() {
        return staridflow;
    }

    public ArrayList<TDAflow> getFlows() {
        return flows;
    }
    public ArrayList<TDAflow> addFlow2(ArrayList<TDAflow> Flows, TDAflow Flow ){
        int flowId=Flow.getId();
        TDAflow temp;
        int IdFlows;
        for(int i=0;i<Flows.size();i++){
            temp=Flows.get(i);
            IdFlows=temp.getId();
            if(IdFlows==flowId){
                JOptionPane.showMessageDialog(null, "Flow id ya existente");
                return null;
            }
        }
        Flows.add(Flow);
        return Flows;
    }
    
    public TDAchatbot addFlow(TDAchatbot chatbot, TDAflow a){
        ArrayList<TDAflow> newflows=chatbot.addFlow2(chatbot.getFlows(),a);
        return new TDAchatbot(chatbot.getChatbotid(),chatbot.getName(),chatbot.getWelcomemessage(),chatbot.getStaridflow(),newflows);
    } 
    
    
}
