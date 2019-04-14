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
    JCheckBox s1,s2,s3,s4,s5,s6,cp1,cp2,cp3,cp4,cp5,cp6,cp7,cp8,cs1,cs2,cs3,cs4,cs5,cs6,cs7,cs8,ci1,ci2,ci3,ci4,ci5,ci6,ci7,ci8,ci9;
    
    Archivos archivo=new Archivos();
    
    
    
    
    public void FormularioSintomas(){
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
    
        public void FormularioCausasP(){
        String[] causasP=new String[8];
        
        cp1 = new JCheckBox("Antecedentes_Hereditarios");
        cp2 = new JCheckBox("Sobrepeso");
        cp3 = new JCheckBox("Sedentarismo");
        cp4 = new JCheckBox("Estres_Mental");
        cp5 = new JCheckBox("Habitos_Alimenticios");
        cp6 = new JCheckBox("Uso de medicamentos");
        cp7 = new JCheckBox("Diabetes_Mellitus");
        cp8 = new JCheckBox("Sindrome_Cardimetabólico");
        
        
        cp1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasP[0]="Antecedentes_Hereditarios";
                }else{
                    causasP[0]="";
                }
            }
        });
        
        cp2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasP[1]="Sobrepeso";
                }else{
                    causasP[1]="";
                }
                System.out.println(e.getStateChange() == ItemEvent.SELECTED
                    ? "SELECTED" : "DESELECTED");
            }

        });
        
        cp3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasP[2]="Sedentarismo";
                }else{
                    causasP[2]="";
                }
            }
        });
        
        cp4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasP[3]="Estres_Mental";
                }else{
                    causasP[3]="";
                }
            }
        });
        
        cp5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasP[4]="Habitos_Alimenticios";
                }else{
                    causasP[4]="";
                }
            }
        });
        
                    cp6.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasP[5]="Uso de medicamentos";
                                    }else{
                    causasP[5]="";
                }
            }
        });
                    
                   
                    cp7.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasP[6]="Diabetes_Mellitus";
                   
                }else{
                    causasP[6]="";
                }
            }
        });
                    
                    
                    cp8.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasP[7]="Sindrome_Cardimetabólico";
                   
                }else{
                    causasP[7]="";
                }
            }
        });
                    
                    
                  
        
        String message = "mensaje";
        Object[] params = {message, cp1,cp2,cp3,cp4,cp5,cp6,cp7,cp8};
        int n = JOptionPane.showConfirmDialog(null, params, "Disconnect", JOptionPane.YES_NO_OPTION);
        //boolean dontShow = checkbox1.isSelected();
    }
    
        public void FormularioCausasS(){
        String[] causasS=new String[8];
        
        cs1 = new JCheckBox("Apnea del  sueño");
        cs2 = new JCheckBox("Insuficiencia Renal Crónica");
        cs3 = new JCheckBox("Aldosteronismo primario");
        cs4 = new JCheckBox("Enfermedad Renovascular");
        cs5 = new JCheckBox("Feocromocitoma");
        cs6 = new JCheckBox("Sindrome de Cushing");
        cs7 = new JCheckBox("Tiroides o Paratiroides");
        cs8 = new JCheckBox("Coartición de la aorta");
        
        
        cs1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[0]="Apnea del sueño";
                }else{
                    causasS[0]="";
                }
            }
        });
        
        cs2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[1]="Insuficiencia Renal Crónica";
                }else{
                    causasS[1]="";
                }
                System.out.println(e.getStateChange() == ItemEvent.SELECTED
                    ? "SELECTED" : "DESELECTED");
            }

        });
        
        cs3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[2]="Aldosteronismo primario";
                }else{
                    causasS[2]="";
                }
            }
        });
        
        cs4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[3]="Enfermedad Renovascular";
                }else{
                    causasS[3]="";
                }
            }
        });
        
        cs5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[4]="Feocromocitoma";
                }else{
                    causasS[4]="";
                }
            }
        });
        
        cs6.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[5]="Sindrome de Cushing";
                                    }else{
                    causasS[5]="";
                }
            }
        });
                    
                   
        cs7.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[6]="Tiroides o Paratiroides";
                   
                }else{
                    causasS[6]="";
                }
            }
        });
                    
                    
        cs8.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[7]="Coartición de la aorta";
                   
                }else{
                    causasS[7]="";
                }
            }
        });
                    
                    
                  
        
        String message = "mensaje";
        Object[] params = {message, cs1,cs2,cs3,cs4,cs5,cs6,cs7,cs8};
        int n = JOptionPane.showConfirmDialog(null, params, "Disconnect", JOptionPane.YES_NO_OPTION);
        //boolean dontShow = checkbox1.isSelected();
    }

    public void causasSecundarias()
    {
            String[] causasS=new String[8];
        
        cs1 = new JCheckBox("Apnea del  sueño");
        cs2 = new JCheckBox("Insuficiencia Renal Crónica");
        cs3 = new JCheckBox("Aldosteronismo primario");
        cs4 = new JCheckBox("Enfermedad Renovascular");
        cs5 = new JCheckBox("Feocromocitoma");
        cs6 = new JCheckBox("Sindrome de Cushing");
        cs7 = new JCheckBox("Tiroides o Paratiroides");
        cs8 = new JCheckBox("Coartición de la aorta");
        
        
        cs1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[0]="Apnea del sueño";
                }else{
                    causasS[0]="";
                }
            }
        });
        
        cs2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[1]="Insuficiencia Renal Crónica";
                }else{
                    causasS[1]="";
                }
                System.out.println(e.getStateChange() == ItemEvent.SELECTED
                    ? "SELECTED" : "DESELECTED");
            }

        });
        
        cs3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[2]="Aldosteronismo primario";
                }else{
                    causasS[2]="";
                }
            }
        });
        
        cs4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[3]="Enfermedad Renovascular";
                }else{
                    causasS[3]="";
                }
            }
        });
        
        cs5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[4]="Feocromocitoma";
                }else{
                    causasS[4]="";
                }
            }
        });
        
        cs6.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[5]="Sindrome de Cushing";
                                    }else{
                    causasS[5]="";
                }
            }
        });
                    
                   
        cs7.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[6]="Tiroides o Paratiroides";
                   
                }else{
                    causasS[6]="";
                }
            }
        });
                    
                    
        ci8.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[7]="Coartición de la aorta";
                   
                }else{
                    causasS[7]="";
                }
            }
        });
        
        ci9.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    causasS[7]="Coartición de la aorta";
                   
                }else{
                    causasS[7]="";
                }
            }
        });
                    
                    
                  
        
        String message = "mensaje";
        Object[] params = {message, cs1,cs2,cs3,cs4,cs5,cs6,cs7,cs8};
        int n = JOptionPane.showConfirmDialog(null, params, "Disconnect", JOptionPane.YES_NO_OPTION);
        //boolean dontShow = checkbox1.isSelected();
    
    }
    
    public void contraIndicaciones ()
    {
    
                String[] contraIndicacioens=new String[9];
        
        ci1 = new JCheckBox("Gota");
        ci2 = new JCheckBox("Asma");
        ci3 = new JCheckBox("Insuficiencia cardiaca");
        ci4 = new JCheckBox("Embarazo");
        ci5 = new JCheckBox("Edema angioneurotico");
        ci6 = new JCheckBox("Insuficiencia renal");
        ci7 = new JCheckBox("Hipercaliemia");
        ci8 = new JCheckBox("Estenosis de la arteria renal");
        ci9 = new JCheckBox("Estenosis bilaterial de la arteria renal");
        
        
        ci1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    contraIndicacioens[0]="Gota";
                }else{
                    contraIndicacioens[0]="";
                }
            }
        });
        
        ci2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    contraIndicacioens[1]="Asma";
                }else{
                    contraIndicacioens[1]="";
                }
                System.out.println(e.getStateChange() == ItemEvent.SELECTED
                    ? "SELECTED" : "DESELECTED");
            }

        });
        
        ci3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    contraIndicacioens[2]="Insuficiencia cardiaca";
                }else{
                    contraIndicacioens[2]="";
                }
            }
        });
        
        ci4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    contraIndicacioens[3]="Embarazo";
                }else{
                    contraIndicacioens[3]="";
                }
            }
        });
        
        ci5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    contraIndicacioens[4]="Edema angioneurotico";
                }else{
                    contraIndicacioens[4]="";
                }
            }
        });
        
        ci6.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    contraIndicacioens[5]="Insuficiencia renal";
                                    }else{
                    contraIndicacioens[5]="";
                }
            }
        });
                    
                   
        ci7.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    contraIndicacioens[6]="Hipercaliemia";
                   
                }else{
                    contraIndicacioens[6]="";
                }
            }
        });
                    
                    
        ci8.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    contraIndicacioens[7]="Estenosis de la arteria renal";
                   
                }else{
                    contraIndicacioens[7]="";
                }
            }
        });
                    
        
        ci9.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    contraIndicacioens[8]="Estenosis bilaterial de la arteria renal";
                   
                }else{
                    contraIndicacioens[8]="";
                }
            }
        });
                    
                  
        
        String message = "mensaje";
        Object[] params = {message, ci1,ci2,ci3,ci4,ci5,ci6,ci7,ci8,ci9};
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