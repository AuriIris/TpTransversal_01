/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.AlumnoData;
import Data.InscripcionData;
import Data.MateriaData;
import Modelo.Alumno;
import Modelo.Conexion;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Romi
 */
public class frmiCargarCalificacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmiCargarCalificacion
     */
    public frmiCargarCalificacion() {
        initComponents();
        cargarCbo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboMateria = new javax.swing.JComboBox<>();
        cboAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tfNota = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();

        setTitle("Cargar Calificacion");

        jLabel1.setText("Materia");

        jLabel2.setText("Alumno");

        cboMateria.setEnabled(false);

        cboAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nota");

        tfNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNotaKeyTyped(evt);
            }
        });

        btnCargar.setText("Cargar");
        btnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarMouseClicked(evt);
            }
        });
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSeleccionarMouseClicked(evt);
            }
        });
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(tfNota, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCargar)
                        .addGap(63, 63, 63)
                        .addComponent(btnVolver))
                    .addComponent(btnSeleccionar))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnSeleccionar)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void cargarCbo(){
        try {
            Conexion con=new Conexion();
            AlumnoData a=new AlumnoData(con);
            MateriaData m=new MateriaData(con);
            List<Alumno> alumnos= a.buscarTodosAlumnos();
            List<Materia> materias= m.buscarTodasMaterias();
            for (int i = 0; i < alumnos.size(); i++) {
                if(alumnos.get(i).isActivo()==true)
                cboAlumno.addItem(alumnos.get(i).toString());       
            }
            for (int i = 0; i < materias.size(); i++) {
                if(materias.get(i).isActivo()==true)
                cboMateria.addItem(materias.get(i).toString());
            }
             
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiModificarAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    private void cboAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAlumnoActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarActionPerformed

    private void tfNotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNotaKeyTyped
        char c=evt.getKeyChar();
     if(c<'0'||c>'9'||c==',')evt.consume();
    }//GEN-LAST:event_tfNotaKeyTyped

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
dispose();            // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseClicked
        Conexion con;
        try {
            con = new Conexion();
           Alumno al=new Alumno();
           Materia ma=new Materia();
           InscripcionData ins= new InscripcionData(con);
            AlumnoData a=new AlumnoData(con);
            MateriaData m=new MateriaData(con);
            List<Alumno> alumnos= a.buscarTodosAlumnos();
            List<Materia> materias= m.buscarTodasMaterias();
        for (int i = 0; i < materias.size(); i++) {
            if(cboMateria.getSelectedItem().toString().equals(materias.get(i).toString())){
                ma=materias.get(i);
        }}
        for (int i = 0; i < alumnos.size(); i++) {
            
            if(cboAlumno.getSelectedItem().toString().equals(alumnos.get(i).toString())){
            al=alumnos.get(i);
        }}
        List<Inscripcion> inscr= ins.obtenerInscripcionesAlumno(al.getIdAlumno());
        Inscripcion i=new Inscripcion();
        for (int j = 0; j < inscr.size(); j++) {
             System.out.println(inscr.get(j).getMateria().toString().equals(ma.toString()));
             if(inscr.get(j).getMateria().toString().equals(ma.toString())){
                    
                    i=inscr.get(j);
                    i.setNota(Double.parseDouble(tfNota.getText()));
                    System.out.println(i.getIdInscripcion());
                    ins.guardarNota(i.getIdInscripcion(),i.getNota());
         }}} 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiInscribirAlumnoMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCargarMouseClicked

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnSeleccionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeleccionarMouseClicked
        Conexion con;
        try {
            con = new Conexion();
           Alumno al=new Alumno();
           Materia ma=new Materia();
           InscripcionData ins= new InscripcionData(con);
            AlumnoData a=new AlumnoData(con);
            MateriaData m=new MateriaData(con);
            List<Alumno> alumnos= a.buscarTodosAlumnos();
            List<Materia> materias= m.buscarTodasMaterias();
        for (int i = 0; i < alumnos.size(); i++) {
            
            if(cboAlumno.getSelectedItem().toString().equals(alumnos.get(i).toString())){
            al=alumnos.get(i);
        }}
        List<Inscripcion> insc=ins.obtenerInscripcionesAlumno(al.getIdAlumno());
        cboMateria.removeAllItems();
          for (int i = 0; i < insc.size(); i++) {
              System.out.println(insc.get(i).getMateria().toString());
              
                cboMateria.addItem(insc.get(i).getMateria().toString());
            }
          cboMateria.setEnabled(true);
       
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiInscribirAlumnoMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSeleccionarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboAlumno;
    private javax.swing.JComboBox<String> cboMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfNota;
    // End of variables declaration//GEN-END:variables
}
