/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tenantpaymenttrackingproject;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import tenantpaymenttrackingproject.User;


/**
 *
 * @author batuh
 */
public class TenantScreen extends javax.swing.JFrame {
    private List<Tenant> tenants = new ArrayList<>();
    private DefaultListModel<String> tenantListModel;
    private User currentUser;




    /**
     * Creates new form TenantScreen
     */
    public TenantScreen() {
        initComponents();
            setIconImage(new ImageIcon(getClass().getResource("/tenantpaymenttrackingproject/youricon.jpg")).getImage());

        List<Property> props = Property.getSampleProperties();

        propertycombobox.removeAllItems();

        for (Property p : props) {
            propertycombobox.addItem(p.getName());
        }
        tenantListModel = new DefaultListModel<>();
        tenantlist.setModel(tenantListModel);
        
    }
    public void setUserInfo(User user) {
        this.currentUser = user;  
        userinfolbl.setText("Username: " + user.getUsername() + " | Password: " + user.getPassword());
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
        tenanttxt = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tenantlist = new javax.swing.JList<>();
        tenantnametxt = new javax.swing.JLabel();
        tenantnametxtfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        propertycombobox = new javax.swing.JComboBox<>();
        addtenantbtn = new javax.swing.JButton();
        paymentbtn = new javax.swing.JButton();
        userinfolbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tenant Payment Tracking System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        tenanttxt.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tenanttxt.setText("Tenant Management");

        logoutbtn.setFont(tenanttxt.getFont());
        logoutbtn.setText("Log out");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tenanttxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tenanttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(logoutbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tenantlist.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 255), new java.awt.Color(204, 255, 255)));
        tenantlist.setFont(logoutbtn.getFont());
        tenantlist.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tenantlist);

        tenantnametxt.setText("Tenant name : ");

        tenantnametxtfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tenantnametxtfieldKeyReleased(evt);
            }
        });

        jLabel1.setText("Select porperty :");

        propertycombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertycomboboxActionPerformed(evt);
            }
        });

        addtenantbtn.setText("Add Tenant");
        addtenantbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtenantbtnActionPerformed(evt);
            }
        });

        paymentbtn.setText("Go To Payment Screen");
        paymentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentbtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Registered Tenants ---------------------------------------------------------------------------------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addtenantbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(tenantnametxt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tenantnametxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(propertycombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userinfolbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paymentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenantnametxt)
                            .addComponent(tenantnametxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(propertycombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(userinfolbl, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addtenantbtn)
                    .addComponent(paymentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginScreen lgn = new LoginScreen();
        lgn.setVisible(true);
                
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void paymentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentbtnActionPerformed
        List<Tenant> currentTenants = this.tenants;      
        PaymentScreen pay = new PaymentScreen();
        this.setVisible(false);
        pay.setVisible(true);
        pay.setTenants(currentTenants);
        pay.setUserInfo(currentUser);
        pay.loadTenantsFromMemory(); // DataStore üzerinden yükle

    }//GEN-LAST:event_paymentbtnActionPerformed

    private void propertycomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertycomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propertycomboboxActionPerformed

    private void addtenantbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtenantbtnActionPerformed
        // TODO add your handling code here:

    String name = tenantnametxtfield.getText().trim();
    String property = (String) propertycombobox.getSelectedItem();

    // 1. Giriş boş mu?
    if (name.isEmpty()) {
        JOptionPane.showMessageDialog(this,
            "Please enter the tenant name.",
            "Missing Information",
            JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 2. Aynı mülke kiracı atanmış mı?
    boolean alreadyAssigned = tenants.stream().anyMatch(t -> t.getPropertyName().equals(property));
    if (alreadyAssigned) {
        JOptionPane.showMessageDialog(this,
            "A tenant has already been assigned to the selected property!",
            "Rule Violation",
            JOptionPane.ERROR_MESSAGE);
        return;
    }

    // 3. Yeni tenant oluştur ve listeye ekle
    Tenant newTenant = new Tenant(name, property);
    tenants.add(newTenant);
            DataStore.tenantList.add(newTenant); // hafızaya da ekle

    tenantListModel.addElement(newTenant.toString());

    // 4. Giriş alanını temizle
    tenantnametxtfield.setText("");
    }//GEN-LAST:event_addtenantbtnActionPerformed

    private void tenantnametxtfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tenantnametxtfieldKeyReleased
        // TODO add your handling code here:
         int position = tenantnametxtfield.getCaretPosition();
        tenantnametxtfield.setText(tenantnametxtfield.getText().toUpperCase());
        tenantnametxtfield.setCaretPosition(position);
    }//GEN-LAST:event_tenantnametxtfieldKeyReleased

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
            java.util.logging.Logger.getLogger(TenantScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TenantScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TenantScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TenantScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TenantScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtenantbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton paymentbtn;
    private javax.swing.JComboBox<String> propertycombobox;
    private javax.swing.JList<String> tenantlist;
    private javax.swing.JLabel tenantnametxt;
    private javax.swing.JTextField tenantnametxtfield;
    private javax.swing.JLabel tenanttxt;
    private javax.swing.JLabel userinfolbl;
    // End of variables declaration//GEN-END:variables
}
