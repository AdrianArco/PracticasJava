package PeluqueriaCanina.Igu;

import PeluqueriaCanina.Logica.Controladora;
import PeluqueriaCanina.Logica.Mascota;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
Esta clase pertenece al paquete de Interfaz grafica de usuario, se abre cuando se pulsa el boton editar de la clase ver datos.
 */
public class ModificarDatos extends javax.swing.JFrame {
    
    //Se crea una controladora para conectar la interfaz grafica con la logica.
    Controladora control= null;
    //Creamos un objeto mascota para no tener que instanciarlo en varios metodos que es necesario su uso
    Mascota masco;
    int num_cliente;
    
    public ModificarDatos(int num_cliente) {
        //inicializamos la controladora
        control= new Controladora();
        //Esto se pone por defecto al crear el JFrame Form pero inicializa en si la pantalla
        initComponents();
        //Creamos un metodo que permita rellenar los textField y los textArea con los valores de la mascota seleccionada.
        cargarDatos(num_cliente);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtDueño = new javax.swing.JTextField();
        txtMovil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaObservaciones = new javax.swing.JTextArea();
        cmbAtencion = new javax.swing.JComboBox<>();
        cmbAlergico = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CARGA DE DATOS");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\adria\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\resources\\images\\klipartz.com (2).png")); // NOI18N

        jLabel3.setText("Nombre:");

        jLabel4.setText("Raza:");

        jLabel5.setText("Color:");

        jLabel6.setText("Alérgico:");

        jLabel7.setText("Atenciión Especial:");

        jLabel8.setText("Nombre Dueño:");

        jLabel9.setText("Movil Dueño:");

        jLabel10.setText("Observaciones:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        txtRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaActionPerformed(evt);
            }
        });

        txtDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDueñoActionPerformed(evt);
            }
        });

        txtMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMovilActionPerformed(evt);
            }
        });

        txtAreaObservaciones.setColumns(20);
        txtAreaObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtAreaObservaciones);

        cmbAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        cmbAtencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAtencionActionPerformed(evt);
            }
        });

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        cmbAlergico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlergicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtRaza))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(21, 21, 21)
                                .addComponent(txtColor))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtMovil)
                                    .addComponent(txtDueño, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                        .addGap(13, 13, 13))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\adria\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\resources\\images\\escoba (2).png")); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\adria\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\resources\\images\\guardar (2).png")); // NOI18N
        btnGuardar.setText("GUARDAR CAMBIOS");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(135, 135, 135))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnGuardar, btnLimpiar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnGuardar, btnLimpiar});

        btnAtras.setIcon(new javax.swing.ImageIcon("C:\\Users\\adria\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\resources\\images\\Atras.png")); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(259, 259, 259)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDueñoActionPerformed

    private void txtMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMovilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMovilActionPerformed

    private void cmbAtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAtencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAtencionActionPerformed

    private void cmbAlergicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlergicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAlergicoActionPerformed
//Este metodo es copiado de la clase cargar datos, puesto que realiza la misma funcion.
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtAreaObservaciones.setText("");
        txtColor.setText("");
        txtDueño.setText("");
        txtMovil.setText("");
        txtRaza.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtencion.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed
//En guardar si que se han producido cambios respecto a la clase Cargar Datos.
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombreMas= txtNombre.getText();
        String raza= txtRaza.getText();
        String color= txtColor.getText();
        String observaciones= txtAreaObservaciones.getText();
        String nombreDue= txtDueño.getText();
        String movil= txtMovil.getText();
        String alergico = (String) cmbAlergico.getSelectedItem();
        String atencion= (String) cmbAtencion.getSelectedItem();
        //Aqui es donde encontramos el cambio, puesto que a la hora de mandarle los datos a traves del metodo a la controladora le pasamos tambien masco
        // para asi contenga los datos de ID.
        control.modificarMasco( masco, nombreMas, raza, color, observaciones, nombreDue,movil, alergico, atencion);
        
        //mensaje de que el cambio se ha realizado. 
        JOptionPane optionPane= new JOptionPane("Se edito correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog= optionPane.createDialog("Editado exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        //Porcion de codigo para cerrar modificar y recargar la tabla de ver datos. 
        VerDatos pantalla=new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    //Boton para volver atras sin efectuar cambios. 
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VerDatos pantalla=new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaObservaciones;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDueño;
    private javax.swing.JTextField txtMovil;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
    //  Se crea el metodo cargar datos  en el que llama a la controladora para que esta nos proporcione los datos de la mascota. 
    private void cargarDatos(int num_cliente) {
        // le asignamos a la variable  masco los datos proporcionados desde la logica.
        
        masco= control.traerMascota(num_cliente);
        
        //Seteamos todos los campos con los valores obtenidos a traves del metodo anterior.
        txtNombre.setText(masco.getNombre());
        txtAreaObservaciones.setText(masco.getObservaciones());
        txtColor.setText(masco.getColor());
        txtDueño.setText(masco.getUnDuenio().getNombre());
        txtMovil.setText(masco.getUnDuenio().getMovilDuenio());
        txtRaza.setText(masco.getRaza());
        //Este condicional nos permite obtener la posicion de ComboBox
        if(masco.getAlegico().equals("SI")){
            cmbAlergico.setSelectedIndex(1);
        }else{
            if(masco.getAlegico().equals("NO")){
                cmbAlergico.setSelectedIndex(2);
            }
        }
        if(masco.getAlegico().equals("SI")){
            cmbAtencion.setSelectedIndex(1);
        }else{
            if(masco.getAlegico().equals("NO")){
                cmbAtencion.setSelectedIndex(2);
            }
        }
    }
}
