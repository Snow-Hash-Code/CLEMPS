/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package clases;

import conexiones.Conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author lgnra
 */
public class Prestamo extends javax.swing.JInternalFrame {

    /**
     * Creates new form Agregar
     */
    public Prestamo() {
        initComponents();
        nuevo.setEnabled(true);
        guardar.setEnabled(false);
        editar.setEnabled(false);
        desabilitar();
        vaciarTabla();
        verDatos();
    }
    
    public void desabilitar(){
        nombreHerramienta.setEnabled(false);
        nombreSolicitante.setEnabled(false);
        idHerramienta.setEnabled(false);
        horaSalida.setEnabled(false);
        cantidadHerramienta.setEnabled(false);
        horaEntrega.setEnabled(false);
    }
    
    public void habilitar(){
        nombreHerramienta.setEnabled(true);
        nombreSolicitante.setEnabled(true);
        horaSalida.setEnabled(true);
        idHerramienta.setEnabled(true);
        cantidadHerramienta.setEnabled(true);
        horaEntrega.setEnabled(true);
    }
    
    public void limpiar(){
        nombreHerramienta.setText("");
        nombreSolicitante.setText("");
        idHerramienta.setText("");
        horaSalida.setText("");
        cantidadHerramienta.setText("");
        horaEntrega.setText("");
    }
    
        
    public void vaciarTabla(){
        DefaultTableModel Modelo = (DefaultTableModel) jTable1.getModel();
        String titulos[] = {"ID HERRAMIENTA","NOMBRE SOLICITANTE","NOMBRE HERRAMIENTA","CANTIDAD", "HORA SALIDA", "HORA ENTREGA"};
        Modelo = new DefaultTableModel(null,titulos);
        jTable1.setModel(Modelo);
    }

    public void verDatos(){
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) jTable1.getModel();
            Conexion conect1 = new Conexion();
            con1 = conect1.getConnection();
            String dts[] = new String[7];
            String sql = "select * from Prestamo";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dts[0] = rs.getString("id_herramienta");
                dts[1] = rs.getString("nombre_solicitante");
                dts[2] = rs.getString("nombre_herramienta");
                dts[3] = rs.getString("cantidad");
                dts[4] = rs.getString("hora_salida");
                dts[5] = rs.getString("hora_entrega");
                
                miModelo.addRow(dts);
            }
            jTable1.setModel(miModelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        txtHoraSalida = new javax.swing.JLabel();
        horaSalida = new javax.swing.JTextField();
        cantidadHerramienta = new javax.swing.JTextField();
        txtCatnidadHerramienta = new javax.swing.JLabel();
        nombreHerramienta = new javax.swing.JTextField();
        txtNombreHerramienta = new javax.swing.JLabel();
        nombreSolicitante = new javax.swing.JTextField();
        txtSolicitante = new javax.swing.JLabel();
        idHerramienta = new javax.swing.JTextField();
        labelHerramienta = new javax.swing.JLabel();
        txtHoraEntrega = new javax.swing.JLabel();
        horaEntrega = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Prestamos");

        nuevo.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/archivo-nuevo.png"))); // NOI18N
        nuevo.setText("NUEVO");
        nuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/disquete.png"))); // NOI18N
        guardar.setText("GUARDAR");
        guardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        editar.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar (1).png"))); // NOI18N
        editar.setText("EDITAR");
        editar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/basura (1).png"))); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        txtHoraSalida.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        txtHoraSalida.setText("HORA SALIDA");

        horaSalida.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        horaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaSalidaActionPerformed(evt);
            }
        });
        horaSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                horaSalidaKeyTyped(evt);
            }
        });

        cantidadHerramienta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cantidadHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadHerramientaActionPerformed(evt);
            }
        });
        cantidadHerramienta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadHerramientaKeyTyped(evt);
            }
        });

        txtCatnidadHerramienta.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        txtCatnidadHerramienta.setText("CANTIDAD");

        nombreHerramienta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreHerramientaActionPerformed(evt);
            }
        });
        nombreHerramienta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreHerramientaKeyTyped(evt);
            }
        });

        txtNombreHerramienta.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        txtNombreHerramienta.setText("NOMBRE HERRAMIENTA");

        nombreSolicitante.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreSolicitanteActionPerformed(evt);
            }
        });
        nombreSolicitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreSolicitanteKeyTyped(evt);
            }
        });

        txtSolicitante.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        txtSolicitante.setText("NOMBRE SOLICITANTE");

        idHerramienta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idHerramientaActionPerformed(evt);
            }
        });
        idHerramienta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idHerramientaKeyTyped(evt);
            }
        });

        labelHerramienta.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        labelHerramienta.setText("ID-HERRAMIENTA");

        txtHoraEntrega.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        txtHoraEntrega.setText("HORA ENTREGA");

        horaEntrega.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        horaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaEntregaActionPerformed(evt);
            }
        });
        horaEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                horaEntregaKeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_HERRAMIENTA", "NOMBRE_SOLICITANTE", "NOMBRE_HERRAMIENTA", "CANTIDAD", "HORA_SALIDA", "HORA_ENTREGA"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/documento.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSolicitante)
                            .addComponent(labelHerramienta))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreHerramienta)
                            .addComponent(txtCatnidadHerramienta)
                            .addComponent(txtHoraSalida)
                            .addComponent(txtHoraEntrega))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(horaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nombreHerramienta, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                        .addComponent(cantidadHerramienta))
                                    .addComponent(horaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreSolicitante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idHerramienta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(374, 374, 374))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelHerramienta))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(idHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(horaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombreSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSolicitante))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombreHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreHerramienta))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCatnidadHerramienta)
                                    .addComponent(cantidadHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHoraSalida)
                                    .addComponent(horaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtHoraEntrega))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo)
                    .addComponent(guardar)
                    .addComponent(editar)
                    .addComponent(eliminar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addGap(254, 254, 254))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        limpiar();
        habilitar();
        nuevo.setEnabled(false);
        guardar.setEnabled(true);
        editar.setEnabled(false);
        eliminar.setEnabled(false);
        vaciarTabla();
        verDatos();
    }//GEN-LAST:event_nuevoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (nombreSolicitante.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL NOMBRE DEL SOLICITANTE", "Advertencia", JOptionPane.WARNING_MESSAGE);
            nombreSolicitante.requestFocus();
        }
        else if (nombreHerramienta.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL NOBMRE DE HERRAMIENTA ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            nombreHerramienta.requestFocus();
        }
        else if (cantidadHerramienta.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA CANTIDAD", "Advertencia", JOptionPane.WARNING_MESSAGE);
            cantidadHerramienta.requestFocus();
        }
        else if (horaSalida.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA HORA DE SALIDA", "Advertencia", JOptionPane.WARNING_MESSAGE);
            horaSalida.requestFocus();
        } 
        else if(horaEntrega.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA HORA DE ENTREGA", "Advertencia", JOptionPane.WARNING_MESSAGE);
            horaEntrega.requestFocus();
        }
        else if(idHerramienta.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL ID DE HERRAMIENTA", "Advertencia", JOptionPane.WARNING_MESSAGE);
            idHerramienta.requestFocus();
        }
        else
        {
            try
            {
                Connection con = null;
                Conexion conect = new Conexion();
                con = conect.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Prestamo (nombre_solicitante,nombre_herramienta,cantidad,hora_salida,hora_entrega, id_herramienta) values (?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, nombreSolicitante.getText());
                pst.setString(2, nombreHerramienta.getText());
                pst.setString(3, cantidadHerramienta.getText());
                pst.setString(4, horaSalida.getText());
                pst.setString(5, horaEntrega.getText());
                pst.setString(6, idHerramienta.getText());
                int n = pst.executeUpdate();
                if (n > 0)
                {
                    JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
                    limpiar();
                    vaciarTabla();
                    verDatos();
                    nuevo.setEnabled(true);
                    guardar.setEnabled(false);
                    editar.setEnabled(false);
                    eliminar.setEnabled(false);
                    desabilitar();
                }
            } catch (SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(this, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try
        {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();
            String sql = "update Prestamo set id_herramienta = ?, nombre_solicitante = ?, nombre_herramienta = ?, cantidad = ?, hora_salida = ?, hora_entrega = ? where id_herramienta = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, idHerramienta.getText());
            pst.setString(2, nombreSolicitante.getText());
            pst.setString(3, nombreHerramienta.getText());
            pst.setString(4, cantidadHerramienta.getText());
            pst.setString(5, horaSalida.getText());
            pst.setString(6, horaSalida.getText());
            pst.setInt(7, Integer.parseInt(idHerramienta.getText()));
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS CORRECTAMENTE");
                limpiar();
                vaciarTabla();
                verDatos();
                nuevo.setEnabled(true);
                guardar.setEnabled(false);
                editar.setEnabled(false);
                eliminar.setEnabled(false);
                desabilitar();
            }
        } catch (SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this, "LOS DATOS NO HAN SIDO ACTUALIZADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int fila = jTable1.getSelectedRow();
        if (fila == -1)
        {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN REGISTRO", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int opc = JOptionPane.showConfirmDialog(this, "¿ESTA SEGURO QUE DESEA ELIMINAR ESTE REGISTRO?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opc == JOptionPane.YES_OPTION)
            {
                try
                {
                    Connection con = null;
                    Conexion conect = new Conexion();
                    con = conect.getConnection();
                    Statement st = con.createStatement();
                    String sql = "delete from Prestamo where id_herramienta = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, Integer.parseInt(idHerramienta.getText()));
                    int n = pst.executeUpdate();
                    if (n > 0)
                    {
                        JOptionPane.showMessageDialog(this, "DATOS ELIMINADOS CORRECTAMENTE");
                        limpiar();
                        vaciarTabla();
                        verDatos();
                        nuevo.setEnabled(true);
                        guardar.setEnabled(false);
                        editar.setEnabled(false);
                        eliminar.setEnabled(false);
                        desabilitar();
                    }
                } catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(this, "DATOS NO ELIMINADOS CORRECTAMENTE" + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void horaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaSalidaActionPerformed
        horaSalida.transferFocus();
    }//GEN-LAST:event_horaSalidaActionPerformed

    private void horaSalidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horaSalidaKeyTyped

    }//GEN-LAST:event_horaSalidaKeyTyped

    private void cantidadHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadHerramientaActionPerformed
        cantidadHerramienta.transferFocus();
    }//GEN-LAST:event_cantidadHerramientaActionPerformed

    private void cantidadHerramientaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadHerramientaKeyTyped

    }//GEN-LAST:event_cantidadHerramientaKeyTyped

    private void nombreHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreHerramientaActionPerformed
        nombreHerramienta.transferFocus();
    }//GEN-LAST:event_nombreHerramientaActionPerformed

    private void nombreHerramientaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreHerramientaKeyTyped

    }//GEN-LAST:event_nombreHerramientaKeyTyped

    private void nombreSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreSolicitanteActionPerformed
        nombreSolicitante.transferFocus();
    }//GEN-LAST:event_nombreSolicitanteActionPerformed

    private void nombreSolicitanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreSolicitanteKeyTyped

    }//GEN-LAST:event_nombreSolicitanteKeyTyped

    private void idHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idHerramientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idHerramientaActionPerformed

    private void idHerramientaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idHerramientaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_idHerramientaKeyTyped

    private void horaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaEntregaActionPerformed

    private void horaEntregaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horaEntregaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_horaEntregaKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try
        {
            int fila = jTable1.getSelectedRow();
            idHerramienta.setText(jTable1.getValueAt(fila, 0).toString());
            nombreSolicitante.setText(jTable1.getValueAt(fila, 1).toString());
            nombreHerramienta.setText(jTable1.getValueAt(fila, 2).toString());
            cantidadHerramienta.setText(jTable1.getValueAt(fila, 3).toString());
            horaSalida.setText(jTable1.getValueAt(fila, 4).toString());
            horaEntrega.setText(jTable1.getValueAt(fila, 5).toString());
            nuevo.setEnabled(false);
            guardar.setEnabled(false);
            editar.setEnabled(true);
            eliminar.setEnabled(true);
            habilitar();
        } catch (Exception ex)
        {
            System.out.println("ERROR AL SELECCIONAR UN PRESTAMO : " + ex.getMessage());
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadHerramienta;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField horaEntrega;
    private javax.swing.JTextField horaSalida;
    private javax.swing.JTextField idHerramienta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelHerramienta;
    private javax.swing.JTextField nombreHerramienta;
    private javax.swing.JTextField nombreSolicitante;
    private javax.swing.JButton nuevo;
    private javax.swing.JLabel txtCatnidadHerramienta;
    private javax.swing.JLabel txtHoraEntrega;
    private javax.swing.JLabel txtHoraSalida;
    private javax.swing.JLabel txtNombreHerramienta;
    private javax.swing.JLabel txtSolicitante;
    // End of variables declaration//GEN-END:variables
}
