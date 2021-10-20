/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.AlumnoData;
import Modelo.Alumno;
import Modelo.Conexion;
import static Vistas.frmiModificarAlumno.validarFecha;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Romi
 */
public class frmiAgregarAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmiAlumno
     */
    public frmiAgregarAlumno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfLegajo = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbActivo = new javax.swing.JCheckBox();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtDia = new javax.swing.JFormattedTextField();
        jtMes = new javax.swing.JFormattedTextField();
        jtAño = new javax.swing.JFormattedTextField();

        jTextField1.setText("jTextField1");

        setTitle("Agregar Alumno");

        jLabel1.setText("Legajo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Fecha de Nacimiento:");

        tfLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLegajoActionPerformed(evt);
            }
        });
        tfLegajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLegajoKeyTyped(evt);
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

        jLabel5.setText("Activo");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("Año (YYYY)");

        jLabel7.setText("Mes (MM)");

        jLabel8.setText("Dia(DD)");

        jtDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("00"))));
        jtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDiaActionPerformed(evt);
            }
        });
        jtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDiaKeyTyped(evt);
            }
        });

        jtMes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("00"))));
        jtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMesKeyTyped(evt);
            }
        });

        jtAño.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0000"))));
        jtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtAñoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfLegajo, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(tfNombre)
                            .addComponent(tfApellido)
                            .addComponent(cbActivo))
                        .addGap(216, 216, 216))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCargar)
                                .addGap(18, 18, 18)
                                .addComponent(btnVolver)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)
                                .addGap(72, 72, 72))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(154, 154, 154))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnVolver)
                    .addComponent(btnLimpiar))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
  dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    tfNombre.setText("");
    tfApellido.setText("");
    tfLegajo.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tfLegajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLegajoKeyTyped
       char c=evt.getKeyChar();
     if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_tfLegajoKeyTyped
public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/mm/dd");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
     if(!tfLegajo.getText().isEmpty()&&!tfNombre.getText().isEmpty()&&!tfApellido.getText().isEmpty()&&!jtAño.getText().isEmpty()&&!jtMes.getText().isEmpty()&&!jtDia.getText().isEmpty())
     {if(validarFecha(jtAño.getText()+"/"+jtMes.getText()+"/"+jtDia.getText())){
         int legajo= Integer.parseInt(tfLegajo.getText());
     String nom= tfNombre.getText();
     String ape= tfApellido.getText();
     Boolean activo=cbActivo.isSelected();
     int dia = Integer.parseInt(jtDia.getText());
     int mes = Integer.parseInt(jtMes.getText());
     int año = Integer.parseInt(jtAño.getText());
    
     Alumno al=new Alumno(legajo,nom,ape,activo,LocalDate.of(año,mes,dia));
       Conexion con;
        try {
            con = new Conexion();
             AlumnoData a=new AlumnoData(con);
             System.out.println(al.toString());
             a.guardarAlumno(al);
              JOptionPane.showMessageDialog(null, "Alumno Cargado con exito.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos. "+ex);
        }}
     else 
         JOptionPane.showMessageDialog(null,"Ingrese una fecha correcta");}
     else
            JOptionPane.showMessageDialog(null,"Falta completar un campo");
     
      
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseClicked
        
    }//GEN-LAST:event_btnCargarMouseClicked

    private void tfLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLegajoActionPerformed

    private void jtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDiaActionPerformed

    private void jtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDiaKeyTyped
         char c=evt.getKeyChar();
     if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_jtDiaKeyTyped

    private void jtMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMesKeyTyped
           char c=evt.getKeyChar();
     if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_jtMesKeyTyped

    private void jtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAñoKeyTyped
          char c=evt.getKeyChar();
     if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_jtAñoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox cbActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFormattedTextField jtAño;
    private javax.swing.JFormattedTextField jtDia;
    private javax.swing.JFormattedTextField jtMes;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfLegajo;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
