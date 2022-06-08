package Form;

import static Form.Beranda.lbFirstName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class FormLogin extends javax.swing.JFrame {
    Connection con = null;
    Statement st = null;
    public static boolean showpw;
    
    public FormLogin() {
        initComponents();
        tfPassword.setEchoChar('*');
        showpw = false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dblogin", "root", "");
            st = con.createStatement();
            // JOptionPane.showMessageDialog(null, "Connection Succed");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Connection Failed Because" + ex);
        }
        
    }
    
    private void Login(){
            try{
                if(tfUsername.getText().equals("") || tfPassword.getPassword().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Harap Isi Bagian yang kosong", "Pesan", JOptionPane.ERROR_MESSAGE);
                    tfUsername.requestFocus();
                    hapusTF();
                } else {
                    st = con.createStatement();
                    String sql = ("SELECT * FROM tblogin WHERE username = '"+tfUsername.getText()+"' AND password = '"+String.valueOf(tfPassword.getPassword())+"'");
                    ResultSet rs = st.executeQuery(sql);
                    if(rs.next()){
                        this.dispose();
                        new Beranda().setVisible(true);
                        lbFirstName.setText(rs.getString(3));
                    }else{
                        JOptionPane.showMessageDialog(this, "Username dan Password Salah\n atau Akun Belum Terdaftar","Pesan",JOptionPane.ERROR_MESSAGE);
                        hapusTF();
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }
    }
    
    
    private void hapusTF(){
        tfUsername.setText("");
        tfPassword.setText("");
        tfUsername.setEnabled(true);
        tfPassword.setEnabled(true);
    }
    
    private void showPass(){
        if(!showpw){
            tfPassword.setEchoChar((char)0);
            showpw = true;
        }else{
            tfPassword.setEchoChar('*');
            showpw = false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        iconUsername = new javax.swing.JLabel();
        iconPass = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnShowPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocation(new java.awt.Point(700, 300));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        lbLogin.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(102, 51, 255));
        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogin.setText("Login");

        tfUsername.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        tfUsername.setToolTipText("Username");
        tfUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        tfUsername.setPreferredSize(new java.awt.Dimension(64, 30));

        tfPassword.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        tfPassword.setToolTipText("Password");
        tfPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        tfPassword.setPreferredSize(new java.awt.Dimension(64, 30));
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });

        iconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user (1).png"))); // NOI18N

        iconPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/secured-lock (1).png"))); // NOI18N

        btnRegister.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/eyes (1).png"))); // NOI18N
        btnShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnShowPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnShowPassMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconPass, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnShowPass))
                                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lbLogin)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(iconUsername)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowPass))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        this.setVisible(false);
        new FormSignUp().setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnShowPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPassMousePressed
        showPass();
        btnShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/hidden (1).png")));
    }//GEN-LAST:event_btnShowPassMousePressed
    
    
    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        Login();
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void btnShowPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPassMouseReleased
        showPass();
        btnShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/eyes (1).png")));
    }//GEN-LAST:event_btnShowPassMouseReleased

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel btnShowPass;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel iconUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
