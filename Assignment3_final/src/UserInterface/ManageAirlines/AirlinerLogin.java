/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;
import Busniess.Airliner;
import Busniess.AirlinerDirectory;
import Busniess.Airplane;
import Busniess.AirplaneDirectory;
import Busniess.TravelAgencyClass;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author varad
 */
public class AirlinerLogin extends javax.swing.JPanel {
     JPanel CardSequenceJPanel;
     AirlinerDirectory airlinerDirectory;
     AirplaneDirectory airplaneDirectory;
     Airplane airplane;
     private TravelAgencyClass travelAgency;
    /**
     * Creates new form AirlinerLogin
     */
    public AirlinerLogin(JPanel cjp, AirlinerDirectory ad,TravelAgencyClass travelAgency) {
        initComponents();
        CardSequenceJPanel = cjp;
        airlinerDirectory = ad;
        this.travelAgency = travelAgency;
         airlinerComboBox1.removeAllItems();
       for(Airliner airliner : travelAgency.getAirlinerDirectory().getAirlinerDict()) {
           airlinerComboBox1.addItem(airliner);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        airlinerComboBox1 = new javax.swing.JComboBox();
        findButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Airliner Login");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Airliner Name");

        airlinerComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        airlinerComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerComboBox1ActionPerformed(evt);
            }
        });

        findButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        findButton1.setText("Go>>");
        findButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(findButton1)
                            .addComponent(airlinerComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airlinerComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(findButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void airlinerComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerComboBox1ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_airlinerComboBox1ActionPerformed

    private void findButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButton1ActionPerformed
        // TODO add your handling code here:
        Airliner airliner = (Airliner)airlinerComboBox1.getSelectedItem();
       ManageAirliners map = new ManageAirliners(CardSequenceJPanel, airliner,travelAgency);
       CardSequenceJPanel.add("AirlinerWorkAreaJPanel",map);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_findButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlinerComboBox1;
    private javax.swing.JButton findButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
