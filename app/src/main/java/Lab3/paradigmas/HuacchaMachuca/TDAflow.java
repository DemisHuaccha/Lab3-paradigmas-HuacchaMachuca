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
public class TDAflow{
    /**
    *Atributos de TDA flow
    */
    int id;
    String namemsg;
    ArrayList <TDAoption> options;

    
    /**
    * Constructor de TDAflow
    */
    
    public TDAflow(int id, String namemsg, ArrayList<TDAoption> options) {     
        this.id = id;
        this.namemsg = namemsg;
        this.options = options;
    }
    
    
    /**
    *
    *Funciones get del TDAflow
    *
    */
    
    public int getId() {
        return id;
    }

    public String getNamemsg() {
        return namemsg;
    }

    public ArrayList<TDAoption> getOptions() {
        return options;
    }
    
    /**
    *
    *Funcion addOption2 tiene dominio como una lista de TDAoption y un option
    *tiene como recorrido una lista de TDAoption
    * Funcion que revisa la unicidad de cada code de las options
    *
    */
    
    public ArrayList<TDAoption> addOptions2(ArrayList<TDAoption> Options, TDAoption Opt ){
        int codeOpt=Opt.getCode();
        TDAoption temp;
        int codeOptions;
        for(int i=0;i<Options.size();i++){
            temp=Options.get(i);
            codeOptions=temp.getCode();
            if(codeOptions==codeOpt){
                JOptionPane.showMessageDialog(null, "Option code ya existente");
                return null;
            }
        }
        Options.add(Opt);
        return Options;
    }
    
    /**
    *Funcion addOption que tiene como dominio un TDAflow y un TDA option
    *addOption tiene como reoorrido TDAflow
    */
    
    public TDAflow addOptions(TDAflow flow, TDAoption a){
        ArrayList<TDAoption> newoption = flow.addOptions2(flow.getOptions(),a);
        return new TDAflow(flow.getId(),flow.getNamemsg(),newoption);
    }
    
    /*
    *
    *Funcion que tiene como dominio un TDA flow
    *y como recorrido void
    *
    *Funcion que imprime en la consola de swing todos los atributos del TDAflow
    */
    
    public void imprimir_flow(TDAflow flow){
        JOptionPane.showMessageDialog(null, flow.getId());
        JOptionPane.showMessageDialog(null, flow.getNamemsg());
        ArrayList<TDAoption> opts=flow.getOptions();
        TDAoption a;
        for(int i=0;i<opts.size();i++){
            a=opts.get(i);
            a.imprimir_option(a);
        }
    }
    
}
