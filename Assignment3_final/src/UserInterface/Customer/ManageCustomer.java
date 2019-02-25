/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Busniess.CustomerDirectory;
import javax.swing.JOptionPane;
import Busniess.Customer;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import javax.swing.table.TableModel;
import Busniess.AirlinerDirectory;
import UserInterface.ManageAirlines.SearchFlight;
import Busniess.Airliner;
import Busniess.Airplane;
import Busniess.TravelAgencyClass;
import UserInterface.ManageAirlines.AirlinerLogin;
/**
 *
 * @author varad
 */
public class ManageCustomer extends javax.swing.JPanel {
    private JPanel CardSequenceJPanel;
    private TravelAgencyClass travelAgency;
   
    
    /**
     * Creates new form ManageCustomer
     */
    public ManageCustomer( JPanel cjp,TravelAgencyClass travelAgency) {
        initComponents();
        this.CardSequenceJPanel = cjp;
        this.travelAgency = travelAgency;
        
        refreshTable();
    }
    
         public void refreshTable() {
        int rowCount = tblCustomers.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblCustomers.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            model.removeRow(i);
        }
        
        for(Customer c : travelAgency.getCustomerDirectory().getCustomerDict()) {
            Object row[] = new Object[5];
            row[0] = c;
            row[1] = c.getLastName();
            row[2] = c.getAge();
            row[3] = c.getId();
            row[4] = c.getAddress();
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        backjButton2 = new javax.swing.JButton();
        removeflight = new javax.swing.JButton();
        viewcustomer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Customer Directory");

        backjButton2.setText("<<Back");
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });

        removeflight.setText("Remove");
        removeflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeflightActionPerformed(evt);
            }
        });

        viewcustomer.setText("View Customer");
        viewcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcustomerActionPerformed(evt);
            }
        });

        jButton1.setText("Add Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Age", "Customer Id", "Address"
            }
        ));
        jScrollPane1.setViewportView(tblCustomers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backjButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeflight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewcustomer)
                        .addGap(111, 111, 111)
                        .addComponent(jButton1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton2)
                    .addComponent(removeflight)
                    .addComponent(viewcustomer)
                    .addComponent(jButton1))
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_backjButton2ActionPerformed

    private void removeflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeflightActionPerformed
        // TODO add your handling code here:
        int row = tblCustomers.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Customer c = (Customer)tblCustomers.getValueAt(row, 0);
        travelAgency.getCustomerDirectory().removeCustomer(c);
        refreshTable();
    }//GEN-LAST:event_removeflightActionPerformed

    private void viewcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcustomerActionPerformed
        // TODO add your handling code here:
        int row = tblCustomers.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Customer c = (Customer)tblCustomers.getValueAt(row, 0);
        ViewCustomer vc = new ViewCustomer(CardSequenceJPanel, c);
        CardSequenceJPanel.add("ViewAirliner", vc);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_viewcustomerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AddCustomer ac = new AddCustomer(CardSequenceJPanel, travelAgency);
        CardSequenceJPanel.add("CreateFlight",ac);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeflight;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JButton viewcustomer;
    // End of variables declaration//GEN-END:variables
}
