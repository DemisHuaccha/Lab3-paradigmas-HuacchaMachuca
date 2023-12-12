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
public class TDAlistas {
    ArrayList<TDAoption> options;
    ArrayList<TDAflow> flows;
    ArrayList<TDAchatbot> chatbots;
    ArrayList<TDAuser> users;
    ArrayList<TDAsystem> systems;

    public TDAlistas(ArrayList<TDAoption> options, ArrayList<TDAflow> flows, ArrayList<TDAchatbot> chatbots, ArrayList<TDAuser> users) {
        this.options = options;
        this.flows = flows;
        this.chatbots = chatbots;
        this.users = users;
    }
    
    public TDAlistas(ArrayList<TDAoption> options, ArrayList<TDAflow> flows, ArrayList<TDAchatbot> chatbots, ArrayList<TDAuser> users, ArrayList<TDAsystem> systems) {
        this.options = options;
        this.flows = flows;
        this.chatbots = chatbots;
        this.users = users;
        this.systems=systems;
    }

    public ArrayList<TDAoption> getOptions() {
        return options;
    }

    public ArrayList<TDAflow> getFlows() {
        return flows;
    }

    public ArrayList<TDAchatbot> getChatbots() {
        return chatbots;
    }

    public ArrayList<TDAuser> getUsers() {
        return users;
    }

    public ArrayList<TDAsystem> getSystems() {
        return systems;
    }
    
    
    
}
