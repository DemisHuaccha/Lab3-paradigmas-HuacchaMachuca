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
    int id;
    String namemsg;
    ArrayList <TDAoption> options;

    public TDAflow(int id, String namemsg, ArrayList<TDAoption> options) {
        this.id = id;
        this.namemsg = namemsg;
        this.options = options;
    }

    public int getId() {
        return id;
    }

    public String getNamemsg() {
        return namemsg;
    }

    public ArrayList<TDAoption> getOptions() {
        return options;
    }
    
    public ArrayList<TDAoption> addOptions2(ArrayList<TDAoption> Options, TDAoption Opt ){
        int codeOpt=Opt.getCode();
        TDAoption temp;
        int codeOptions;
        for(int i=0;i<Options.size();i++){
            temp=Options.get(i);
            codeOptions=temp.getCode();
            if(codeOptions==codeOpt){
                JOptionPane.showMessageDialog(null,"Option code ya existente");
                return null;
            }
        }
        Options.add(Opt);
        return Options;
    }
    
    public TDAflow addOptions(TDAflow flow, TDAoption a){
        JOptionPane.showMessageDialog(null,"Agregar Option");
        ArrayList<TDAoption> newoption = flow.addOptions2(flow.getOptions(),a);
        return new TDAflow(flow.getId(),flow.getNamemsg(),newoption);
    }
    
    
    public void imprimir_flow(TDAflow flow){
        System.out.println("Id: "+flow.getId());
        System.out.println("Name Msg: "+flow.getNamemsg());
        ArrayList<TDAoption> opts=flow.getOptions();
        TDAoption a;
        for(int i=0;i<opts.size();i++){
            a=opts.get(i);
            a.imprimir_option(a);
        }
    }
    
}
