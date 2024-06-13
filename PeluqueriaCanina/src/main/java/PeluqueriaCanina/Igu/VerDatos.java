package PeluqueriaCanina.Igu;
//Esta clase nos permite ver en una tabla todas las mascotas que existen en nuestra base de datos.
import PeluqueriaCanina.Logica.Controladora;
import PeluqueriaCanina.Logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {
    
    //Se inicia la controladora de la logica.
        Controladora control=null;

    public VerDatos() {
        initComponents();
        control=new Controladora();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMasco = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Inventario de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaMasco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMasco);

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\adria\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\resources\\images\\editar.png")); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\adria\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\resources\\images\\eliminar.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Datos de mascotas:");

        btnAtras.setIcon(new javax.swing.ImageIcon("C:\\Users\\adria\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\resources\\images\\Atras.png")); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(179, 179, 179))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Controlo que la tabla no este vacia
        if(tablaMasco.getRowCount()>0){
            //Controlo que se haya seleccionado a una mascota
            if(tablaMasco.getSelectedRow()!=-1){
                int num_cliente= Integer.parseInt(String.valueOf(tablaMasco.getValueAt(tablaMasco.getSelectedRow(), 0)));
                //Llamo al metodo borrar mascota con el numero de cliente seleccionado en la tabla
                control.borrarMascota (num_cliente);
                
                //para no repetir codigo se crea un metodo para los mensajes. 
                mostrarMensaje("Mascota eliminada correctamente","info","Borrado Mascota");

            }else{
                mostrarMensaje("No se selecciono ninguna mascota","error","Error al eliminar");        
            }
        }else{
                mostrarMensaje("No hay mascotas","error","Error al eliminar");        
            }
        cargarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed
   
    //Este metodo permite configurar el mensaje a mostrar por pantalla.
    public void mostrarMensaje(String mensaje,String tipo, String titulo){
                        JOptionPane optionPane= new JOptionPane(mensaje);
                        if (tipo.equals("info")){
                            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                        }else if(tipo.equals("error")){
                            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
                        }
                        JDialog dialog= optionPane.createDialog(titulo);
                        dialog.setAlwaysOnTop(true);
                        dialog.setVisible(true);
    }
    //ATENTION
    //IMPORTANTE EXPLICACION
    //------------Este evento ha sido creado desde esta clase en el apartado de diseño haciendo click derecho sobre JFrame de navigator, events, windows...- - - - - - -
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened
    //Boton editar
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
                //Controlo que la tabla no este vacia
        if(tablaMasco.getRowCount()>0){
            //Controlo que se haya seleccionado a una mascota
            if(tablaMasco.getSelectedRow()!=-1){
                int num_cliente= Integer.parseInt(String.valueOf(tablaMasco.getValueAt(tablaMasco.getSelectedRow(), 0)));
                //llamamos a la pantalla modificar datos
                ModificarDatos modif = new ModificarDatos(num_cliente);
                modif.setVisible(true);
                modif.setLocationRelativeTo(null);
                this.dispose();
            }else{
                mostrarMensaje("No se selecciono ninguna mascota","error","Error al editar");        
            }
        }else{
                mostrarMensaje("No hay mascotas","error","Error al editar");        
            }
        cargarTabla();
    }//GEN-LAST:event_btnEditarActionPerformed
//boton para ir hacia atras sin conservar cambios
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Principal pantalla=new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMasco;
    // End of variables declaration//GEN-END:variables
    
    //Este metodo es para cargar la tabla.
    private void cargarTabla() {
        //definir modelo de la tabla
        DefaultTableModel modeloTabla= new DefaultTableModel(){
            //que fila y columnas no sean editables
            
            @Override
            public boolean isCellEditable (int row,int column){
                return false;
            }
        };
        //nombres de las columnas
        String titulos[] ={"Num","Nombre" , "Color", "Raza", "Alergico", "At.Esp ", "Dueño", "telefono", "observaciones" };
        modeloTabla.setColumnIdentifiers(titulos);
        //Carga de los datos desde la base de datos
        List<Mascota> listaMascotas= control.traerMascotas();
        //si la lista no esta vacia hacemos un for:each.
        if (listaMascotas!=null){
            for(Mascota masco:listaMascotas){
                //Creamos un array de tipo object puesto que hay enteros, string... 
                Object[] objeto ={masco.getNumCliente(),masco.getNombre(),masco.getColor(),masco.getRaza(),masco.getAlegico(),masco.getAtencion_especial(),masco.getUnDuenio().getNombre(), masco.getUnDuenio().getMovilDuenio(),masco.getObservaciones()};
                //Este objeto creado lo añadimos a una fila de la tabla.
                modeloTabla.addRow(objeto);
            }   
        }
        //mostramos la tabla con los resultados obtenidos.
        tablaMasco.setModel(modeloTabla);
    }   

}
