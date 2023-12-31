/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author waiho
 */
public class AddInfo extends javax.swing.JFrame {

    /**
     * Creates new form AddInfo
     */
    public AddInfo() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        AddInfo = new javax.swing.JPanel();
        NaviBar = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Wednesday = new javax.swing.JLabel();
        ManageInfo = new javax.swing.JLabel();
        ManageApplication = new javax.swing.JLabel();
        CheckRecord = new javax.swing.JLabel();
        Report = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        HostelInfo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Occupancy = new javax.swing.JTextField();
        Status = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Female = new javax.swing.JRadioButton();
        RoomNo = new javax.swing.JTextField();
        Male = new javax.swing.JRadioButton();
        Back2 = new javax.swing.JButton();
        RoomType2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddInfo.setBackground(new java.awt.Color(74, 31, 61));
        AddInfo.setPreferredSize(new java.awt.Dimension(852, 550));
        AddInfo.setLayout(null);

        NaviBar.setBackground(new java.awt.Color(74, 31, 61));
        NaviBar.setMinimumSize(new java.awt.Dimension(852, 80));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N

        Wednesday.setBackground(new java.awt.Color(255, 255, 255));
        Wednesday.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        Wednesday.setForeground(new java.awt.Color(255, 255, 255));
        Wednesday.setText("WEDNESDAY");

        ManageInfo.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        ManageInfo.setForeground(new java.awt.Color(255, 255, 255));
        ManageInfo.setText("Manage Info");
        ManageInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ManageInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageInfoMouseClicked(evt);
            }
        });

        ManageApplication.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        ManageApplication.setForeground(new java.awt.Color(255, 255, 255));
        ManageApplication.setText("Manage Application");
        ManageApplication.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ManageApplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageApplicationMouseClicked(evt);
            }
        });

        CheckRecord.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        CheckRecord.setForeground(new java.awt.Color(255, 255, 255));
        CheckRecord.setText("Check Record");
        CheckRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CheckRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckRecordMouseClicked(evt);
            }
        });

        Report.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        Report.setForeground(new java.awt.Color(255, 255, 255));
        Report.setText("Report");
        Report.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportMouseClicked(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logout.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NaviBarLayout = new javax.swing.GroupLayout(NaviBar);
        NaviBar.setLayout(NaviBarLayout);
        NaviBarLayout.setHorizontalGroup(
            NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NaviBarLayout.createSequentialGroup()
                .addGroup(NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NaviBarLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Wednesday))
                    .addGroup(NaviBarLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(ManageApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageInfo)
                .addGap(18, 18, 18)
                .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        NaviBarLayout.setVerticalGroup(
            NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NaviBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ManageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ManageApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Wednesday, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        AddInfo.add(NaviBar);
        NaviBar.setBounds(0, 0, 852, 100);
        AddInfo.add(jSeparator1);
        jSeparator1.setBounds(0, 180, 850, 20);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(852, 80));

        HostelInfo.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        HostelInfo.setForeground(new java.awt.Color(74, 31, 61));
        HostelInfo.setText("Add Hostel Info");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(HostelInfo)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(HostelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        AddInfo.add(jPanel2);
        jPanel2.setBounds(0, 100, 852, 80);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Occupancy : ");
        AddInfo.add(jLabel1);
        jLabel1.setBounds(440, 270, 90, 20);

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Room No. : ");
        AddInfo.add(jLabel2);
        jLabel2.setBounds(60, 220, 90, 20);

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Room Type : ");
        AddInfo.add(jLabel3);
        jLabel3.setBounds(60, 270, 90, 20);

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender : ");
        AddInfo.add(jLabel4);
        jLabel4.setBounds(60, 320, 90, 20);

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status : ");
        AddInfo.add(jLabel5);
        jLabel5.setBounds(440, 220, 90, 20);

        Occupancy.setText("0-2");
        AddInfo.add(Occupancy);
        Occupancy.setBounds(540, 270, 190, 30);

        Status.setText("Available/Unavailable");
        AddInfo.add(Status);
        Status.setBounds(510, 220, 190, 30);

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        AddInfo.add(Add);
        Add.setBounds(260, 460, 110, 30);

        buttonGroup1.add(Female);
        Female.setForeground(new java.awt.Color(255, 255, 255));
        Female.setText("Female");
        AddInfo.add(Female);
        Female.setBounds(200, 320, 70, 21);

        RoomNo.setText("SS1001/ST1001");
        AddInfo.add(RoomNo);
        RoomNo.setBounds(170, 220, 190, 30);

        buttonGroup1.add(Male);
        Male.setForeground(new java.awt.Color(255, 255, 255));
        Male.setText("Male");
        AddInfo.add(Male);
        Male.setBounds(140, 320, 70, 21);

        Back2.setText("Back");
        Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2ActionPerformed(evt);
            }
        });
        AddInfo.add(Back2);
        Back2.setBounds(430, 460, 120, 30);

        RoomType2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- select --", "Superior Single Room", "Twin Sharing Room" }));
        AddInfo.add(RoomType2);
        RoomType2.setBounds(170, 270, 190, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManageInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageInfoMouseClicked
        // TODO add your handling code here:
        AdminPage ap = new AdminPage();
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_ManageInfoMouseClicked

    private void ManageApplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageApplicationMouseClicked
        // TODO add your handling code here:
        ManageApplication ma = new ManageApplication();
        ma.setVisible(true);
        dispose();
    }//GEN-LAST:event_ManageApplicationMouseClicked

    private void CheckRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckRecordMouseClicked
        // TODO add your handling code here:
        CheckRecord cr = new CheckRecord();
        cr.setVisible(true);
        dispose();
    }//GEN-LAST:event_CheckRecordMouseClicked

    private void ReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportMouseClicked
        // TODO add your handling code here:
        Report r = new Report();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReportMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                WelcomePage wp = new WelcomePage();
                wp.setVisible(true);
                dispose();
            } else {
                JOptionPane.getRootFrame().dispose();
            }
    }//GEN-LAST:event_LogoutMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String rn = RoomNo.getText();
        String rt = RoomType2.getSelectedItem().toString();
        String status = Status.getText();
        String occupancy = Occupancy.getText();
        int done = 1;
        int add = 1;
        
                if(rn.equals("")){
                RoomNo.setBackground(Color.pink);
                done = 0;
                add = 0;
                }else if(rt.equals("-- select --")){
                done = 0;
                add = 0;
                }else if(!Male.isSelected()&&!Female.isSelected()){
                done = 0;
                add = 0;
                }else if(status.equals("")){
                Status.setBackground(Color.pink);
                done = 0;
                add = 0;
                }else if(occupancy.equals("")){
                Occupancy.setBackground(Color.pink);
                done = 0;
                add = 0;
                }else if(roomExists(rn)){
                JOptionPane.showMessageDialog(null,"Room already exists.");
                add=0;
                }
        
        if(0 == done){
                    JOptionPane.showMessageDialog(null, "Required field found empty.");
                }else if(add == 1){
                    String gender;
                    
                    if(Male.isSelected()){
                        gender = "Male";
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("AvailableRoom.txt", true))){
                    
                    writer.write(rn+">"+rt+">"+gender+">"+status+">"+occupancy);  
                    writer.newLine();
                    writer.close();
                    JOptionPane.showMessageDialog(this, "New room added.");
                } catch (IOException e) {
                    
                }
                        
                    }else if(Female.isSelected()){
                        gender = "Female";
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("AvailableRoom.txt", true))){
                    
                    writer.write(rn+">"+rt+">"+gender+">"+status+">"+occupancy);
                    writer.newLine();
                    writer.close();
                    JOptionPane.showMessageDialog(this, "New room added.");
                } catch (IOException e) {
                    
                }
                        
        }
        
        
                }    
    }//GEN-LAST:event_AddActionPerformed

    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
        // TODO add your handling code here:
        AdminPage ap = new AdminPage();
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_Back2ActionPerformed

    /**
     * @param room
     * @param args the command line arguments
     * @return 
    */
     
    /**
     *
     * @param args the command line arguments
     * @return
     */

    /**
     *
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
            java.util.logging.Logger.getLogger(AddInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddInfo().setVisible(true);
            }
        });
    }
    private boolean roomExists(String room) {
            try (BufferedReader reader = new BufferedReader(new FileReader("AvailableRoom.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(">");
                    String roomNo = parts[0];

                    if (room.equals(roomNo)) {
                        return true;
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
            return false;
        }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JPanel AddInfo;
    private javax.swing.JButton Back2;
    private javax.swing.JLabel CheckRecord;
    private javax.swing.JRadioButton Female;
    private javax.swing.JLabel HostelInfo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logout;
    private javax.swing.JRadioButton Male;
    private javax.swing.JLabel ManageApplication;
    private javax.swing.JLabel ManageInfo;
    private javax.swing.JPanel NaviBar;
    private javax.swing.JTextField Occupancy;
    private javax.swing.JLabel Report;
    private javax.swing.JTextField RoomNo;
    private javax.swing.JComboBox<String> RoomType2;
    private javax.swing.JTextField Status;
    private javax.swing.JLabel Wednesday;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
