/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.AlumnoData;
import Modelo.Alumno;
import Modelo.Conexion;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Romi
 */
public class frmiBajaAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmiBajaAlumno
     */
    public frmiBajaAlumno() {
        initComponents();
        cargarCboAlumnos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbNombre = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setTitle("Baja Alumno");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnBaja.setText("Baja");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        jLabel9.setText("Alumno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnBaja)
                        .addGap(80, 80, 80)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(cbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaja)
                    .addComponent(btnVolver))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
  dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed
public void cargarCboAlumnos(){
        try {
            Conexion con=new Conexion();
            AlumnoData a=new AlumnoData(con);
            List<Alumno> alumnos= a.buscarTodosAlumnos();
            
            for (int i = 0; i < alumnos.size(); i++) {
                cbNombre.addItem(alumnos.get(i));
            }
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiModificarAlumno.class.getName()).log(Level.SEVERE, null, ex);
}       
    }
    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
         try {
            Conexion con=new Conexion();
            AlumnoData a=new AlumnoData(con);
            
            Alumno alum = (Alumno) cbNombre.getSelectedItem();
            a.desactivarAlumno(alum.getIdAlumno());
            JOptionPane.showMessageDialog(null, "El Alumno Fue dado de baja.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + ex);
        }
    }//GEN-LAST:event_btnBajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Alumno> cbNombre;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
