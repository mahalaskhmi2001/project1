import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class shopping2 extends javax.swing.JFrame {

    /**
     * Creates new form shopping2
     */
    public shopping2() {
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

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        product = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        q = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(null);

        jLabel1.setText("name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 60, 16);
        jPanel1.add(n);
        n.setBounds(200, 22, 120, 30);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 100, 50, 0);

        jLabel3.setText("phno");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 110, 28, 16);
        jPanel1.add(pn);
        pn.setBounds(200, 100, 120, 30);

        product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "apple", "orange", "grapes", "custerapple", " " }));
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });
        jPanel1.add(product);
        product.setBounds(210, 170, 95, 22);

        jLabel5.setText("product");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 180, 50, 16);

        jLabel6.setText("quantity");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 230, 50, 16);
        jPanel1.add(q);
        q.setBounds(210, 220, 100, 30);

        jLabel7.setText("price");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 290, 26, 16);
        jPanel1.add(p);
        p.setBounds(210, 280, 100, 30);

        jLabel8.setText("amount");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 350, 60, 16);
        jPanel1.add(a);
        a.setBounds(210, 340, 100, 30);

        jButton1.setText("order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 430, 58, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 440, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             String a=n.getText();
             String b=pn.getText();
             String c=product.getSelectedItem().toString();
             String d=q.getText();
            
            int qty=Integer.parseInt(q.getText());
            int price =Integer.parseInt(p.getText());
            int amount=qty*price;
                     String s=Integer.toString(amount);
                     q.setText(s);
                 PreparedStatement ps;
                 String query="INSERT INTO `shippingss`(`cname`,`cphn`,`product`,`qty`,`price`,`amount`)VALUES(?,?,?,?,?,?)";
  try{
         ps=MyConnection.getConnection().prepareStatement(query);
               ps.setString(1, a);
               ps.setString(2, b);
               ps.setString(3, c);
               ps.setInt(4,qty);
               ps.setInt(5,price);
               ps.setInt(6, amount);
        if(ps.executeUpdate()>0){
            JOptionPane.showMessageDialog(null, "order successfully");
      }
}
    catch(Exception ex){
        System.out.println(ex);
        }// TODO add your handling code h       


                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
           String c=product.getSelectedItem().toString();
                if(c.equals("apple")){
                     p.setText("100");
      }
                else if(c.equals("orange")){
                     p.setText("150");// TODO add your handling code here:
    }//GEN-LAST:event_productActionPerformed
                else if(c.equals("grapes")){
                     p.setText("120");// TODO add your handling code here:
    }  
                else if(c.equals("custer")){
                     p.setText("180");// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(shopping2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shopping2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shopping2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shopping2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shopping2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField n;
    private javax.swing.JTextField p;
    private javax.swing.JTextField pn;
    private javax.swing.JComboBox<String> product;
    private javax.swing.JTextField q;
    // End of variables declaration//GEN-END:variables
}