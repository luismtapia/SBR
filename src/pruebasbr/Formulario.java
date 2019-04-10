/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasbr;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author luis
 */
public class Formulario{
    JCheckBox s1,s2,s3,s4,s5,s6,cp1,cp2;
    Archivos archivo=new Archivos();
    
    
    public void Formulario(){
        String[] sintomas=new String[6];
        
        s1 = new JCheckBox("Acúfenos");
        s2 = new JCheckBox("Fósfenos");
        s3 = new JCheckBox("Estado Nauseoso");
        s4 = new JCheckBox("Angina");
        s5 = new JCheckBox("Disnea");
        s6 = new JCheckBox("Cefalea pulsatil");
        
        s1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    sintomas[0]="Acúfenos";
                }else{
                    sintomas[0]="";
                }
            }
        });
        
        s2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    sintomas[1]="Fósfenos";
                }else{
                    sintomas[1]="";
                }
                System.out.println(e.getStateChange() == ItemEvent.SELECTED
                    ? "SELECTED" : "DESELECTED");
            }

        });
        
        s3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    sintomas[2]="Estado Nauseoso";
                }else{
                    sintomas[2]="";
                }
            }
        });
        
        s4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    sintomas[3]="Angina";
                }else{
                    sintomas[3]="";
                }
            }
        });
        
        s5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    sintomas[4]="Disnea";
                }else{
                    sintomas[4]="";
                }
            }
        });
        
                    s6.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    sintomas[5]="Cefalea pulsatil";
                    
                   //archivo.insertarHECHO(sintomas[5], "nombre");
                
                   
                }else{
                    sintomas[5]="";
                }
            }
        });
        
        String message = "mensaje";
        Object[] params = {message, s1,s2,s3,s4,s5,s6};
        int n = JOptionPane.showConfirmDialog(null, params, "Disconnect", JOptionPane.YES_NO_OPTION);
        //boolean dontShow = checkbox1.isSelected();
    }
    
  
    public void insertar_mis_hechos(String nombre) throws IOException{
        String hecho=JOptionPane.showInputDialog("Ingrese el hecho: ");
        archivo.insertarHECHO(hecho, nombre);
    }
    
    public void f(){
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JTextField field4 = new JTextField();
        JTextField field5 = new JTextField();
        Object[] message = {
            "Input value 1:", field1,
            "Input value 2:", field2,
            "Input value 3:", field3,
            "Input value 4:", field4,
            "Input value 5:", field5,
        };
        int option = JOptionPane.showConfirmDialog(null, message, "Enter all your values", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION)
        {
            String value1 = field1.getText();
            String value2 = field2.getText();
            String value3 = field3.getText();
            String value4 = field4.getText();
            String value5 = field5.getText();
        }
    }

    
}
