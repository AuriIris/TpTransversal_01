/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Romi
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jdpMenu = new javax.swing.JDesktopPane();
        mbGeneral = new javax.swing.JMenuBar();
        mModificarAlumno = new javax.swing.JMenu();
        jmAgregarAlumno = new javax.swing.JMenu();
        jmModificarAlumno = new javax.swing.JMenu();
        mBajaAlumno = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmAgregarMateria = new javax.swing.JMenu();
        jmModificarMateria = new javax.swing.JMenu();
        jmBajaMateria = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jmInscribirAlumnoMateria = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jmListarAlumnosxMateria = new javax.swing.JMenu();
        jmListarMateriasxAlumno = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpMenuLayout = new javax.swing.GroupLayout(jdpMenu);
        jdpMenu.setLayout(jdpMenuLayout);
        jdpMenuLayout.setHorizontalGroup(
            jdpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jdpMenuLayout.setVerticalGroup(
            jdpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        mModificarAlumno.setText("Alumno");

        jmAgregarAlumno.setText("Agregar Alumno");
        jmAgregarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAgregarAlumnoMouseClicked(evt);
            }
        });
        jmAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarAlumnoActionPerformed(evt);
            }
        });
        mModificarAlumno.add(jmAgregarAlumno);

        jmModificarAlumno.setText("Modificar Alumno");
        jmModificarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmModificarAlumnoMouseClicked(evt);
            }
        });
        jmModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModificarAlumnoActionPerformed(evt);
            }
        });
        mModificarAlumno.add(jmModificarAlumno);

        mBajaAlumno.setText("Baja Alumno");
        mBajaAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mBajaAlumnoMouseClicked(evt);
            }
        });
        mBajaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBajaAlumnoActionPerformed(evt);
            }
        });
        mModificarAlumno.add(mBajaAlumno);

        mbGeneral.add(mModificarAlumno);

        jMenu3.setText("Materia");

        jmAgregarMateria.setText("Agregar Materia");
        jmAgregarMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAgregarMateriaMouseClicked(evt);
            }
        });
        jmAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarMateriaActionPerformed(evt);
            }
        });
        jMenu3.add(jmAgregarMateria);

        jmModificarMateria.setText("Modificar Materia");
        jmModificarMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmModificarMateriaMouseClicked(evt);
            }
        });
        jmModificarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModificarMateriaActionPerformed(evt);
            }
        });
        jMenu3.add(jmModificarMateria);

        jmBajaMateria.setText("Baja Materia");
        jmBajaMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmBajaMateriaMouseClicked(evt);
            }
        });
        jmBajaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBajaMateriaActionPerformed(evt);
            }
        });
        jMenu3.add(jmBajaMateria);

        mbGeneral.add(jMenu3);

        jMenu5.setText("Administracion");

        jmInscribirAlumnoMateria.setText("Inscribir Alumno a la materia");
        jmInscribirAlumnoMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmInscribirAlumnoMateriaMouseClicked(evt);
            }
        });
        jmInscribirAlumnoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInscribirAlumnoMateriaActionPerformed(evt);
            }
        });
        jMenu5.add(jmInscribirAlumnoMateria);

        jMenu2.setText("Dar de Baja Alumno a Materia");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu2);

        jMenu6.setText("Cargar Calificacion");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu6);

        jmListarAlumnosxMateria.setText("Listar Alumnos por Materia");
        jmListarAlumnosxMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmListarAlumnosxMateriaMouseClicked(evt);
            }
        });
        jmListarAlumnosxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarAlumnosxMateriaActionPerformed(evt);
            }
        });
        jMenu5.add(jmListarAlumnosxMateria);

        jmListarMateriasxAlumno.setText("Listar Materias Por Alumno");
        jmListarMateriasxAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmListarMateriasxAlumnoMouseClicked(evt);
            }
        });
        jmListarMateriasxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarMateriasxAlumnoActionPerformed(evt);
            }
        });
        jMenu5.add(jmListarMateriasxAlumno);

        mbGeneral.add(jMenu5);

        setJMenuBar(mbGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarAlumnoActionPerformed
      
    }//GEN-LAST:event_jmAgregarAlumnoActionPerformed

    private void jmModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModificarAlumnoActionPerformed
    
    }//GEN-LAST:event_jmModificarAlumnoActionPerformed

    private void mBajaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBajaAlumnoActionPerformed
     
    }//GEN-LAST:event_mBajaAlumnoActionPerformed

    private void jmAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarMateriaActionPerformed
     
    }//GEN-LAST:event_jmAgregarMateriaActionPerformed

    private void jmModificarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModificarMateriaActionPerformed
      
    }//GEN-LAST:event_jmModificarMateriaActionPerformed

    private void jmBajaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBajaMateriaActionPerformed
    
    }//GEN-LAST:event_jmBajaMateriaActionPerformed

    private void jmInscribirAlumnoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInscribirAlumnoMateriaActionPerformed
       
    }//GEN-LAST:event_jmInscribirAlumnoMateriaActionPerformed

    private void jmListarAlumnosxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarAlumnosxMateriaActionPerformed
       
    }//GEN-LAST:event_jmListarAlumnosxMateriaActionPerformed

    private void jmListarMateriasxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarMateriasxAlumnoActionPerformed
   
    }//GEN-LAST:event_jmListarMateriasxAlumnoActionPerformed

    private void jmAgregarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAgregarAlumnoMouseClicked
        jdpMenu.removeAll();
       jdpMenu.repaint();
       frmiAgregarAlumno aC=new frmiAgregarAlumno();
       aC.setVisible(true);
       jdpMenu.add(aC);
       jdpMenu.moveToFront(aC);
    }//GEN-LAST:event_jmAgregarAlumnoMouseClicked

    private void jmModificarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmModificarAlumnoMouseClicked
         jdpMenu.removeAll();
       jdpMenu.repaint();
       frmiModificarAlumno aC=new frmiModificarAlumno();
       aC.setVisible(true);
       jdpMenu.add(aC);
       jdpMenu.moveToFront(aC);
    }//GEN-LAST:event_jmModificarAlumnoMouseClicked

    private void mBajaAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mBajaAlumnoMouseClicked
   jdpMenu.removeAll();
       jdpMenu.repaint();
       frmiBajaAlumno aC=new frmiBajaAlumno();
       aC.setVisible(true);
       jdpMenu.add(aC);
       jdpMenu.moveToFront(aC);        // TODO add your handling code here:
    }//GEN-LAST:event_mBajaAlumnoMouseClicked

    private void jmAgregarMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAgregarMateriaMouseClicked
   jdpMenu.removeAll();
       jdpMenu.repaint();
       frmiAgregarMateria aC=new frmiAgregarMateria();
       aC.setVisible(true);
       jdpMenu.add(aC);
       jdpMenu.moveToFront(aC);        // TODO add your handling code here:
    }//GEN-LAST:event_jmAgregarMateriaMouseClicked

    private void jmModificarMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmModificarMateriaMouseClicked
       jdpMenu.removeAll();
       jdpMenu.repaint();
       frmiModificarMateria aC=new frmiModificarMateria();
       aC.setVisible(true);
       jdpMenu.add(aC);
       jdpMenu.moveToFront(aC);
    }//GEN-LAST:event_jmModificarMateriaMouseClicked

    private void jmBajaMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmBajaMateriaMouseClicked
        jdpMenu.removeAll();
       jdpMenu.repaint();
       frmiBajaMateria aC=new frmiBajaMateria();
       aC.setVisible(true);
       jdpMenu.add(aC);
       jdpMenu.moveToFront(aC);
    }//GEN-LAST:event_jmBajaMateriaMouseClicked

    private void jmInscribirAlumnoMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmInscribirAlumnoMateriaMouseClicked
        jdpMenu.removeAll();
       jdpMenu.repaint();
       frmiInscribirAlumnoMateria aC=new frmiInscribirAlumnoMateria();
       aC.setVisible(true);
       jdpMenu.add(aC);
       jdpMenu.moveToFront(aC);   
              // TODO add your handling code here:
    }//GEN-LAST:event_jmInscribirAlumnoMateriaMouseClicked

    private void jmListarAlumnosxMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmListarAlumnosxMateriaMouseClicked
         jdpMenu.removeAll();
       jdpMenu.repaint();
       frmiListarPorMateria aC=new frmiListarPorMateria();
       aC.setVisible(true);
       jdpMenu.add(aC);
       jdpMenu.moveToFront(aC);   // TODO add your handling code here:
    }//GEN-LAST:event_jmListarAlumnosxMateriaMouseClicked

    private void jmListarMateriasxAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmListarMateriasxAlumnoMouseClicked
          // TODO add your handling code here:
    }//GEN-LAST:event_jmListarMateriasxAlumnoMouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        jdpMenu.removeAll();
       jdpMenu.repaint();
       frmiBajaInscrAlumnoMateria aC=new frmiBajaInscrAlumnoMateria();
       aC.setVisible(true);
       jdpMenu.add(aC);
       jdpMenu.moveToFront(aC);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
      jdpMenu.removeAll();
       jdpMenu.repaint();
       frmiCargarCalificacion aC=new frmiCargarCalificacion();
       aC.setVisible(true);
       jdpMenu.add(aC);
       jdpMenu.moveToFront(aC);
    }//GEN-LAST:event_jMenu6MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JDesktopPane jdpMenu;
    private javax.swing.JMenu jmAgregarAlumno;
    private javax.swing.JMenu jmAgregarMateria;
    private javax.swing.JMenu jmBajaMateria;
    private javax.swing.JMenu jmInscribirAlumnoMateria;
    private javax.swing.JMenu jmListarAlumnosxMateria;
    private javax.swing.JMenu jmListarMateriasxAlumno;
    private javax.swing.JMenu jmModificarAlumno;
    private javax.swing.JMenu jmModificarMateria;
    private javax.swing.JMenu mBajaAlumno;
    private javax.swing.JMenu mModificarAlumno;
    private javax.swing.JMenuBar mbGeneral;
    // End of variables declaration//GEN-END:variables
}
