/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoedad;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.io.*;
import java.util.Formatter;

/**
 *
 * @author Joselito
 */
public class edad extends javax.swing.JFrame {

    /**
     * Creates new form edad
     */
    public edad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        an = new javax.swing.JTextField();
        mess = new javax.swing.JTextField();
        diaa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        an.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anActionPerformed(evt);
            }
        });

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("INGRESE NOMBRE");

        jLabel3.setText("INGRESE AÑO DE NACIMIENTO");

        jLabel4.setText("INGRESE MES  DE NACIMIENTO");

        jLabel5.setText("INGRESE DIA DE NACIMIENTO");

        resultado.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(diaa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(mess, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(an, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(an, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>                        

    private void anActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
        try{
      String nom;
      String ann,mesac,diac;       
Formatter outArchivo = new Formatter("edad.txt");

 
Calendar cal=new GregorianCalendar();
Scanner dato=new Scanner(System.in);
int diactual=cal.get(Calendar.DAY_OF_MONTH);
int mesactual=cal.get(Calendar.MONTH);
int yeractual=cal.get(Calendar.YEAR);
int dia,mes,anyo = 0;
   //variables para los resultados
  
int diar,mesr,anyor;
int enteroanio,enteromes,enterodia;
//int enteroanio = Integer.parseInt(enteroString);

nom=nombre.getText();
ann=an.getText();
enteroanio = Integer.parseInt(ann);
mesac=mess.getText();
enteromes = Integer.parseInt(mesac);
diac=diaa.getText();
enterodia = Integer.parseInt(diac);

mesr=Math.abs(enteromes-mesactual);
anyor=Math.abs(enteroanio-yeractual);
diar=enterodia;


 outArchivo.format("%s \n","LA EDAD DE ");
 outArchivo.format("%s \n",nom);
outArchivo.format("%s %d %s\n","Tienes: .",anyor," Años");
outArchivo.format("%s  %d %s\n"," Con ",mesr," meses");
outArchivo.format("%s %d %s \n"," y ",diar," dias");



resultado.setText("La edad actual de: "+nom+"es:"+anyor+"años con."+mesr+".meses y"+diar+".dias");
outArchivo.close();
}catch (Exception ex) 
{  
//Captura un posible error le imprime en pantalla   
System.out.println(ex.getMessage());  
}
    }                                        

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
            java.util.logging.Logger.getLogger(edad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField an;
    private javax.swing.JTextField diaa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField mess;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel resultado;
    // End of variables declaration                   
}
