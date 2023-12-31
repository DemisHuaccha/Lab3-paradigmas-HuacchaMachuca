/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Lab3.paradigmas.HuacchaMachuca;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    
    
    /*Maim = menu principal*/

    public static void main(String[] args) {
        int t=0;
        TDAlistas listas=init();
        
        /*
        JOptionPane.showMessageDialog(null, "Crea el primer system");
        listas =init2(listas.getUsers());
        */
        
        
        
        /**
        * Menu inicial (no implementado)
        * despues de logear en un systema el menu inicial redirigira al menu correspondiente del tipo de user es decir admin o comun (no implementado)
        *
        */
        while(t==0){
            int a=Integer.parseInt(JOptionPane.showInputDialog("Inicio: \n 1)login \n 2)logout \n 3)register user \n 4) exit"));
            ArrayList<TDAsystem> temp2;
            ArrayList<TDAuser> temp3;
            TDAsystem temp;
            if(a==1){
                int opt;
                int opt2;
                String username;
                TDAsystem.imprimir_Systems(listas.getSystems());
                opt=Integer.parseInt(JOptionPane.showInputDialog("Elegir systema"));
                temp2=listas.getSystems();
                temp=temp2.get(opt);
                TDAsystem.imprimir_Names(temp);
                opt2=Integer.parseInt(JOptionPane.showInputDialog("Elegir user"));
                temp3=temp.getUsers();
                username=temp3.get(opt2).getUsername();
                temp=temp.login(temp, username);
            }
            
            if(a==2){
            
            }
            
            if(a==3){
            
            }
            
            if(a==4){
                t=1;
            }
        }
        
    }
    
    static TDAlistas init2(ArrayList<TDAuser> users){
        
        ArrayList<TDAoption> options=new ArrayList();
        ArrayList<TDAflow> flows=new ArrayList();
        ArrayList<TDAchatbot> chatbots=new ArrayList();    
        
        char respuesta1=JOptionPane.showInputDialog("Crear option: S/N").charAt(0);
        
        if(respuesta1=='S' || respuesta1=='s'){
        TDAoption option;
        do{
            option=MenuAdmin.makeOption();
            options.add(option);
            respuesta1=JOptionPane.showInputDialog("Ingresar mas options: S/N \n Si se agrega una option con el mismo code se tomara solo el primer option como valido").charAt(0);
        }while(respuesta1=='s' || respuesta1 =='S');
        }
        options=MenuAdmin.LimpiarOpt(options);
        
        char respuesta2=JOptionPane.showInputDialog("Crear flow: S/N").charAt(0);
        
        if(respuesta2=='s'||respuesta2=='S'){
        TDAflow flow;
        do{
            flow=MenuAdmin.makeFlow(options);
            flows.add(flow);
            respuesta2=JOptionPane.showInputDialog("Ingresar mas flows: S/N \n Sigue la misma regla que options").charAt(0);
        }while(respuesta2=='s' || respuesta2 =='S');
        }
        
        flows=MenuAdmin.LimpiarFlow(flows);
        
        char respuesta3=JOptionPane.showInputDialog("Crear chatbot: S/N").charAt(0);
        
        if(respuesta3=='s'||respuesta3=='S'){
        TDAchatbot chatbot;
        do{
            chatbot=MenuAdmin.makeChatbot(flows);
            chatbots.add(chatbot);
            respuesta3=JOptionPane.showInputDialog("Ingresar mas chatbots: S/N \n Sigue la misma regla que options").charAt(0);
        }while(respuesta3=='s' || respuesta3 =='S');
        }
        
        chatbots=MenuAdmin.LimpiarChatbot(chatbots);
        
        TDAsystem system=MenuAdmin.makeSystem(chatbots);
        ArrayList<TDAsystem> systems=new ArrayList();
        systems.add(system);
        return new TDAlistas(options,flows,chatbots,users,systems);
    }
        
    static TDAlistas init(){
        ArrayList<TDAoption> options=new ArrayList();
        ArrayList<TDAflow> flows=new ArrayList();
        ArrayList<TDAchatbot> chatbots=new ArrayList();
        ArrayList<TDAuser> users=new ArrayList();
        ArrayList<TDAsystem> systems=new ArrayList();
        ArrayList<String> keys=new ArrayList();
        keys.add("Inicio");
        keys.add("exit");
        TDAoption opt=new TDAoption(0, "Hola", 0,0,keys);
        options.add(opt);
        TDAflow flow=new TDAflow(0,"Hola",options);
        flows.add(flow);
        TDAchatbot chatbot=new TDAchatbot(0,"Bot Inicial","Bienvenido",0,flows);
        chatbots.add(chatbot);
        
        /*
        JOptionPane.showMessageDialog(null, "Inicio");
        */
        JOptionPane.showMessageDialog(null, "Inicio: \n Cree Admin User: (se registrara en el primer system creado)");
        
        String username=JOptionPane.showInputDialog("Ingresar Admin username");
        int tipo=0;
        TDAuser user=new TDAuser(username,tipo);
        users.add(user);
        TDAsystem system=new TDAsystem("Systema inicial",0,chatbots,users,null);
        systems.add(system);
        return new TDAlistas(options,flows,chatbots,users,systems);
    }
    
    
    
    
    /*
    private static ArrayList<String> listaDinamica(){
        ArrayList<String> lista=new ArrayList();
        char respuesta;
        do{
            lista.add(JOptionPane.showInputDialog("Ingresar key"));
            respuesta=JOptionPane.showInputDialog("Ingresar mas keys: S/N").charAt(0);
        }while(respuesta=='s' || respuesta =='S');
        return lista;
    }
   */
}
