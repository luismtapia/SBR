package pruebasbr;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ventana_Inicio extends javax.swing.JFrame {
    String nombre_del_paciente,lectura="";
    Archivos archivo=new Archivos();
    Metodos met=new Metodos();
    String Meta;
    
    public Ventana_Inicio() throws IOException {
        initComponents();
        archivo.insertar_regla_cero();
        nombre_del_paciente=JOptionPane.showInputDialog("INGRESE SU NOMBRE: ");
        jLabel1.setText("HECHOS DEL PACIENTE: "+nombre_del_paciente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        meta = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        btn_agregar_mis_hechos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        salida_hechos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btn_ver_hechos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mensajes = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);

        jButton1.setText("DEFINE META");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("ORDENAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("crear reglas ejemplo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("REGLAS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("FORMULARIO SINTOMAS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btn_agregar_mis_hechos.setText("INGRESAR MIS HECHOS");
        btn_agregar_mis_hechos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_mis_hechosActionPerformed(evt);
            }
        });

        salida_hechos.setColumns(20);
        salida_hechos.setRows(5);
        jScrollPane2.setViewportView(salida_hechos);

        jLabel1.setText("HECHOS DEL PACIENTE ");

        btn_ver_hechos.setText("VER HECHOS");
        btn_ver_hechos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_hechosActionPerformed(evt);
            }
        });

        jLabel2.setText("INGRESE LA META: ");

        mensajes.setText("mensajes");

        jButton7.setText("CAUSAS PRIMARIAS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("CAUSAS SECUNDARIAS");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("CONTRAINDICACIONES");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_ver_hechos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_agregar_mis_hechos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(meta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(60, 60, 60)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(meta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btn_agregar_mis_hechos)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton9))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ver_hechos)
                    .addComponent(jButton2))
                .addGap(55, 55, 55)
                .addComponent(mensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            Meta=meta.getText();
            met.inicio(nombre_del_paciente,Meta);
            mensajes.setText(met.archivo.mensajes);
        } catch (IOException ex) {
            Logger.getLogger(Ventana_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            
            archivo.burbuja(nombre_del_paciente);
            lectura = archivo.mostrarHECHOS(nombre_del_paciente);
            salida_hechos.setText(lectura);
        } catch (IOException ex) {
            Logger.getLogger(Ventana_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            archivo.crear_ejemplo_reglas();
        } catch (IOException ex) {
            Logger.getLogger(Ventana_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Ventana_Reglas ven=new Ventana_Reglas();
        ven.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         Formulario form=new Formulario();
         form.FormularioCausasP();
    
       
            if(form.s1.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.s1.getText();
                
            salida_hechos.setText(s);
            }
            if(form.s2.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.s2.getText();
            salida_hechos.setText(s);
            }
            if(form.s3.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.s3.getText();
            salida_hechos.setText(s);
            }
            if(form.s4.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.s4.getText();
            salida_hechos.setText(s);
            }
            if(form.s5.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.s5.getText();
            salida_hechos.setText(s);
            }
            if(form.s6.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.s6.getText();
            salida_hechos.setText(s);
            }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_agregar_mis_hechosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_mis_hechosActionPerformed
        //Formulario form=new Formulario();
        try {
            String hecho=JOptionPane.showInputDialog("Ingrese el hecho: ");
            archivo.insertarHECHO(hecho, nombre_del_paciente);
            lectura = archivo.mostrarHECHOS(nombre_del_paciente);
            salida_hechos.setText(lectura);
            //form.mis_hechos(nombre_del_paciente);
            //form.
        } catch (IOException ex) {
            Logger.getLogger(Ventana_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_agregar_mis_hechosActionPerformed

    private void btn_ver_hechosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_hechosActionPerformed
        try {
            lectura = archivo.mostrarHECHOS(nombre_del_paciente);
            salida_hechos.setText(lectura);
        } catch (IOException ex) {
            Logger.getLogger(Ventana_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_ver_hechosActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    Formulario form=new Formulario();
    form.FormularioCausasP();
        
                if(form.cp1.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cp1.getText();
                
            salida_hechos.setText(s);
            }
            if(form.cp2.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cp2.getText();
            salida_hechos.setText(s);
            }
            if(form.cp3.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cp3.getText();
            salida_hechos.setText(s);
            }
            if(form.cp4.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cp4.getText();
            salida_hechos.setText(s);
            }
            if(form.cp5.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cp5.getText();
            salida_hechos.setText(s);
            }
            if(form.cp6.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cp6.getText();
            salida_hechos.setText(s);
            }
            if(form.cp7.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cp7.getText();
            salida_hechos.setText(s);
            }
            if(form.cp8.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cp8.getText();
            salida_hechos.setText(s);
            }
    
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    Formulario form=new Formulario();
    form.FormularioCausasS();
        
                if(form.cs1.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cs1.getText();
                
            salida_hechos.setText(s);
            }
            if(form.cs2.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cs2.getText();
            salida_hechos.setText(s);
            }
            if(form.cs3.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cs3.getText();
            salida_hechos.setText(s);
            }
            if(form.cs4.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cs4.getText();
            salida_hechos.setText(s);
            }
            if(form.cs5.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cs5.getText();
            salida_hechos.setText(s);
            }
            if(form.cs6.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cs6.getText();
            salida_hechos.setText(s);
            }
            if(form.cs7.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cs7.getText();
            salida_hechos.setText(s);
            }
            if(form.cs8.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.cs8.getText();
            salida_hechos.setText(s);
            }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    Formulario form=new Formulario();
    form.contraIndicaciones();
        
                if(form.ci1.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.ci1.getText();
                
            salida_hechos.setText(s);
            }
            if(form.ci2.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.ci2.getText();
            salida_hechos.setText(s);
            }
            if(form.ci3.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.ci3.getText();
            salida_hechos.setText(s);
            }
            if(form.ci4.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.ci4.getText();
            salida_hechos.setText(s);
            }
            if(form.ci5.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.ci5.getText();
            salida_hechos.setText(s);
            }
            if(form.ci6.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.ci6.getText();
            salida_hechos.setText(s);
            }
            if(form.ci7.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.ci7.getText();
            salida_hechos.setText(s);
            }
            if(form.ci8.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.ci8.getText();
            salida_hechos.setText(s);
            }
            if(form.ci9.isSelected()){
                String s = salida_hechos.getText()+'\n'+form.ci9.getText();
            salida_hechos.setText(s);
            }     
    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Ventana_Inicio().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Ventana_Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_mis_hechos;
    private javax.swing.JButton btn_ver_hechos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mensajes;
    private javax.swing.JTextField meta;
    private javax.swing.JTextArea salida_hechos;
    // End of variables declaration//GEN-END:variables
}
