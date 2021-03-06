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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Romi
 */
public class frmiListarPorMateria extends javax.swing.JInternalFrame {
  private DefaultTableModel model;
//    private ArrayList<Inscripcion> listaInscripcion;
    private ArrayList<Materia> listaMateria;
//    private InscripcionData inscripcionData;
    private MateriaData materiaData;
    private AlumnoData alumnoData;
    private ArrayList<Alumno> listaAlumno;
    private Conexion conexion;
    /**
     * Creates new form frmiListarPorMateria
     */
    public frmiListarPorMateria() {
        initComponents();
          model =new DefaultTableModel();
        initComponents();
        cargarCboMateria();
        armarCabeceraTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumnos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setTitle("Listar Alumnos Por Materia");

        cboMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboMateriasMouseClicked(evt);
            }
        });
        cboMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMateriasActionPerformed(evt);
            }
        });

        tAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tAlumnos);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cboMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cboMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboMateriasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMateriasMouseClicked

    private void cboMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMateriasActionPerformed
        // cargarDatos();        // TODO add your handling code here:
    }//GEN-LAST:event_cboMateriasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cargarDatos(); // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed
    public void cargarDatos(){
        try {
            ArrayList<Inscripcion> listaInscripcion=null;
            borrarFilas();
            Conexion con =new Conexion();
            InscripcionData inscripcionData= new InscripcionData(con);
            Materia a= (Materia)cboMaterias.getSelectedItem();
            listaInscripcion= (ArrayList) inscripcionData.obtenerInscripcionesMateria(a.getIdMateria());
            for(Inscripcion i:listaInscripcion ){
                //if(a.getIdAlumno()==i.getAlumno().getIdAlumno())
                model.addRow(new Object[]{i.getAlumno().getIdAlumno(),i.getAlumno().getLegajo(),i.getAlumno().getNombre(),i.getAlumno().getApellido(),i.getAlumno().getFechaNac(),i.getAlumno().isActivo(),i.getNota()});
            }   } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiListarPorAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public void cargarCboMateria(){
        try {
            Conexion con=new Conexion();
            MateriaData m=new MateriaData(con);
            List<Materia> materias= m.buscarTodasMaterias();
           for (int i = 0; i < materias.size(); i++) {
                cboMaterias.addItem(materias.get(i));
            }
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiModificarAlumno.class.getName()).log(Level.SEVERE, null, ex);
}       
        cboMaterias.setSelectedIndex(0);
    }
public void borrarFilas(){
        int a=model.getRowCount()-1;
        for (int i = a; i >=0; i--) {
            {
            model.removeRow(i);
            }
    }



}

public void armarCabeceraTabla(){
ArrayList<Object> column= new ArrayList<Object>();
column.add("Id");
column.add("Legajo");
column.add("Nombre");
column.add("Apellido");
column.add("FecNa");
column.add("Activo");
column.add("Nota");
for(Object it:column){
    model.addColumn(it);
}
tAlumnos.setModel(model);


}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<Object> cboMaterias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tAlumnos;
    // End of variables declaration//GEN-END:variables
}
