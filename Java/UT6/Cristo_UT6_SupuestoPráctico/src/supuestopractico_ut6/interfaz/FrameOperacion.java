/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supuestopractico_ut6.interfaz;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import supuestopractico_ut6.SupuestoPractico_UT6;
import supuestopractico_ut6.files_controller.*;


/**
 *
 * @author Cristo Pérez Suárez
 */
public class FrameOperacion extends javax.swing.JFrame {

    /**
     * Creates new form FrameOperacion
     */
    public FrameOperacion() {
        initComponents();
        img_jframe();
        //Ponemos el titulo a la ventana para que aparezca en la cabecera
        this.setTitle("BBVA del pueblo");
        //La ventana siempre aparecerá en el centro
        this.setLocationRelativeTo(null); 
        
        //Al cerra la ventana llamamos al Binwriter para escribir los datos del objeto cliente
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
               //Pasamos un mensaje al metodo que escribe en el log
               logWriter.writingInFile("Programa finalizado -> "+SupuestoPractico_UT6.obtFecha());
               //Llamamos a escrituaBinario para proceder a meter los datos dentro del fichero
                BinWriter.escrituraBinario();                
                System.exit(0);
            }
        });        
    }
    
    
    //Icono de la ventana
    private void img_jframe(){
        ImageIcon imgIcon = new ImageIcon("..\\supuestoPractico_UT6\\src\\supuestopractico_ut6\\interfaz\\img/bbva_icon.png");
        this.setIconImage(imgIcon.getImage());      
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_numeroCuenta = new javax.swing.JTextField();
        jTextField_dinero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button_cargar = new javax.swing.JButton();
        button_ingresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        button_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_numeroCuenta.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_numeroCuenta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextField_numeroCuenta.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_numeroCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_numeroCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jTextField_numeroCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_numeroCuentaActionPerformed(evt);
            }
        });

        jTextField_dinero.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_dinero.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextField_dinero.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_dinero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_dinero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jTextField_dinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dineroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Dinero");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Numero de Cuenta");

        button_cargar.setBackground(new java.awt.Color(20, 84, 156));
        button_cargar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_cargar.setForeground(new java.awt.Color(255, 255, 255));
        button_cargar.setText("Cargar");
        button_cargar.setToolTipText("");
        button_cargar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_cargar.setBorderPainted(false);
        button_cargar.setFocusPainted(false);
        button_cargar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cargarActionPerformed(evt);
            }
        });

        button_ingresar.setBackground(new java.awt.Color(20, 84, 156));
        button_ingresar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        button_ingresar.setText("Ingresar");
        button_ingresar.setToolTipText("");
        button_ingresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_ingresar.setBorderPainted(false);
        button_ingresar.setFocusPainted(false);
        button_ingresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ingresarActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Realizar Operacion");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setIconTextGap(5);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jorge lap\\Desktop\\PRO\\Tema 6\\supuestoPractico_UT6\\src\\supuestopractico_ut6\\interfaz\\img\\tlf-home.png")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(18, 18, 18));
        jLabel10.setText("Ahora la app de BBVA nos permitirá cobrarte hasta en un 20% más en tus operaciones bancarias");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 68, 129));
        jLabel8.setText("<html><body>Mejora tu salud financiera</body></html>");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jorge lap\\Desktop\\PRO\\Tema 6\\supuestoPractico_UT6\\src\\supuestopractico_ut6\\interfaz\\img\\formPago.png")); // NOI18N

        button_volver.setBackground(new java.awt.Color(57, 104, 158));
        button_volver.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        button_volver.setForeground(new java.awt.Color(255, 255, 255));
        button_volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_volver.setBorderPainted(false);
        button_volver.setFocusPainted(false);
        button_volver.setLabel("Volver");
        button_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField_numeroCuenta)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField_dinero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(button_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(86, 86, 86))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(button_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(115, 115, 115))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_numeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_dinero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(button_volver)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_numeroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_numeroCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_numeroCuentaActionPerformed

    private void jTextField_dineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dineroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dineroActionPerformed

    //Comprrobamos que el dinero contenga el formato adecuado
    private boolean checkDinero(){
        float f;
        //Si la string puede ser convertida a float devolvemos true
         try {
            f=Float.parseFloat(jTextField_dinero.getText());  
          }
          catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR, el dinero contiene caracteres no soportados.");
            return false;
        }
         
         if (f<0){
            JOptionPane.showMessageDialog(null, "ERROR, el dinero no puede ser negativo.");
            return false;
         }
         
         return true;
     }
    
    //Comprobamos que la cuenta que el usario introduce sea correcta
    private boolean checkCuenta(){
        //Nos recorremos la lista de clientes en busca de la cuenta
        for(int i=0; i<SupuestoPractico_UT6.cliente.size(); i++){
            if (i == SupuestoPractico_UT6.cliente.size() && jTextField_numeroCuenta.getText().equals(SupuestoPractico_UT6.cliente.get(i).getCuenta())){
                    JOptionPane.showMessageDialog(null, "ERROR, La cuenta introducida no existe.");
                  return false;
            }
        }       
        return true;
    }   
    
    //Accion que realiza el boton de "Cargar"
    private void button_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cargarActionPerformed
      
        //Si los valores son correctos se ejecuta el cargo
        if (checkDinero() == true && checkCuenta() == true){
         //Cogemos los datos de los textFiled y los pasamos a variables
        String numeroCuenta = jTextField_numeroCuenta.getText();        
        float dineroCargo = Float.parseFloat(jTextField_dinero.getText());
        
        //Nos recorremos la lista de clientes
          for (int i=0; i<SupuestoPractico_UT6.cliente.size(); i++){
              //Cogemos la cuenta que el usuario ha introducido
             if (jTextField_numeroCuenta.getText().equals(SupuestoPractico_UT6.cliente.get(i).getCuenta())){
                //Tomamos el saldo que haya en la cuenta y lo convertimos a float
                float dineroInCuenta = Float.parseFloat(SupuestoPractico_UT6.cliente.get(i).getSaldo());
                //Realizamos el calculo del cargo, que será resta de lo que hay en cuenta - el cargo
                float calIngreso = dineroInCuenta - dineroCargo;
                //Convertimos a string los datos
                String total = Float.toString(calIngreso);
                //Mandamos el calculo del ingreso a cuenta
                SupuestoPractico_UT6.cliente.get(i).setSaldo(total);

                  //Pasamos un mensaje a la clase que se encarga de escribir en el Log
                  logWriter.writingInFile("Se ha realizado un cargo a la cuenta -> "+numeroCuenta+" de "+total+"€ Fecha -> "+SupuestoPractico_UT6.obtFecha());
                
                  //Reseteamos los JTextField para poder seguir haciendo ingresos
                  resetTextField();
                
                  //Mostramos un mensaje de confirmacion del ingreso
                  JOptionPane.showMessageDialog(null, "Cargo realizado con exito, su total en cuenta es de: "+total+"€");
             }
          }  
        }  
    }//GEN-LAST:event_button_cargarActionPerformed
       
    
    //Accion que realiza el boton de "Ingresar"
    private void button_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ingresarActionPerformed

        //Si los valores son correctos se ejecuta el ingreso
        if (checkDinero() == true && checkCuenta() == true){
            //Cogemos los datos de los textFiled y los pasamos a variables
            String numeroCuenta = jTextField_numeroCuenta.getText();       
            float dineroIngreso = Float.parseFloat(jTextField_dinero.getText());  
        
            //Nos recorremos la lista de clientes
            for (int i=0; i<SupuestoPractico_UT6.cliente.size(); i++){
                //Cogemos la cuenta del usuario que buscamos.
                if (jTextField_numeroCuenta.getText().equals(SupuestoPractico_UT6.cliente.get(i).getCuenta())){
                 //Tomamos el saldo que haya en la cuenta y lo convertimos a float
                 float dineroInCuenta = Float.parseFloat(SupuestoPractico_UT6.cliente.get(i).getSaldo());
                 //Realizamos el calculo del ingreso, que será una suma del valor introducido + lo que hay en cuenta
                 float calIngreso = dineroInCuenta + dineroIngreso;
                 //Convertimos a string los datos
                 String total = Float.toString(calIngreso);
                 //Mandamos el calculo del ingreso a cuenta
                 SupuestoPractico_UT6.cliente.get(i).setSaldo(total);

                  //Pasamos un mensaje a la clase que se encarga de escribir en el Log
                  logWriter.writingInFile("Se ha realizado un ingreso a la cuenta -> "+numeroCuenta+" de "+total+"€ Fecha -> "+SupuestoPractico_UT6.obtFecha());

                 //Reseteamos los JTextField para poder seguir haciendo ingresos
                 resetTextField();

                //Mostramos un mensaje de confirmacion del ingreso
                JOptionPane.showMessageDialog(null, "Ingreso realizado con exito, su total en cuenta es de: "+total+"€");
              }
            }
        }
    }//GEN-LAST:event_button_ingresarActionPerformed

    //Resetear los textField, de esta manera podremos seguir realizando operaciones
    private void resetTextField(){
          jTextField_numeroCuenta.setText(null);
          jTextField_dinero.setText(null);       
    }
    
    //Metodo de accion que llama a la ventana Inicio
    private void button_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_volverActionPerformed
        //Creamos un objeto de la ventana a la que queremos acceder y lo llamamos c
        FrameInicio i = new FrameInicio();
        //La hacemos visible
        i.setVisible (true);
        //Dejamos de ver la ventana en la que estamos
        this.setVisible(false);
    }//GEN-LAST:event_button_volverActionPerformed


    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cargar;
    private javax.swing.JButton button_ingresar;
    private javax.swing.JButton button_volver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_dinero;
    private javax.swing.JTextField jTextField_numeroCuenta;
    // End of variables declaration//GEN-END:variables
}
