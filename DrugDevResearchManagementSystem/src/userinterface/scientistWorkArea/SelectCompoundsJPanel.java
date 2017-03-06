/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userinterface.scientistWorkArea;

import business.Ecosystem;
import business.drug.Compound;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.SupplierOrganization;
import business.supplier.Supplier;
import business.userAcoount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harsh
 */
public class SelectCompoundsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    Ecosystem business;
    ArrayList<Compound> tempList = new ArrayList<>();
    UserAccount account;
    Organization org;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public SelectCompoundsJPanel(JPanel userProcessContainer, Enterprise enterprise, Ecosystem business, UserAccount account, Organization org) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.business = business;
        this.org = org;
        this.account = account;
        populateSupplierComboBox();

    }

    public void populateSupplierComboBox() {
        jComboBoxSupplier.removeAllItems();
        for (Network n : business.getNetworkList()) {
            
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                if (e.getEnterpriseType().getValue().equalsIgnoreCase("Market")) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof SupplierOrganization) {
                            for (Supplier s : o.getSupplierDirectory().getSuppliersList()) {
                                jComboBoxSupplier.addItem(s);
                            }
                        }

                    }
                }
            }
        }
    }

    public void populateCompoundListTable() {

        
        DefaultTableModel model = (DefaultTableModel) jTableCompoundList.getModel();
        model.setRowCount(0);
        Supplier s = (Supplier) jComboBoxSupplier.getSelectedItem();

        for (Compound c : s.getCompoundHistory().getCompoundList()) {
            Object row[] = new Object[4];
            row[0] = c;
            row[1] = c.getMolecularWeight();
            row[2] = c.getQuantity();
            row[3] = c.getCost();
            model.addRow(row);
        }
    }

    public void populateDrugTable() {
        DefaultTableModel model = (DefaultTableModel) jTableDrug.getModel();
        model.setRowCount(0);
        
        for (Compound c : tempList) {
            Object row[] = new Object[4];
            row[0] = c;
            row[1] = c.getMolecularWeight();
            row[2] = c.getQuantity();
            row[3] = c.getCost();
            model.addRow(row);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCompoundList = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDrug = new javax.swing.JTable();
        compoundListButon = new javax.swing.JButton();
        createDrugJButton = new javax.swing.JButton();
        jComboBoxSupplier = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Levenim MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("     Create Drug");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 370, 20));

        jTableCompoundList.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        jTableCompoundList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "MolecularWeight", "Quantity", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCompoundList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 450, 100));

        jTableDrug.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        jTableDrug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "MolecularWeight", "Quantity", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableDrug);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, 90));

        compoundListButon.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        compoundListButon.setText("Get Compound List");
        compoundListButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compoundListButonActionPerformed(evt);
            }
        });
        add(compoundListButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 160, -1));

        createDrugJButton.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        createDrugJButton.setText("Create Drug");
        createDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDrugJButtonActionPerformed(evt);
            }
        });
        add(createDrugJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jComboBoxSupplier.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxSupplier.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        jComboBoxSupplier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSupplierActionPerformed(evt);
            }
        });
        add(jComboBoxSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jButton3.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        jButton3.setText("Add Compound");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 40, 30));

        jLabel5.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, 30));

        jButton2.setFont(new java.awt.Font("Levenim MT", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSupplierActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxSupplierActionPerformed

    private void compoundListButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compoundListButonActionPerformed
        // TODO add your handling code here:
        populateCompoundListTable();


    }//GEN-LAST:event_compoundListButonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        int selectedRow = jTableCompoundList.getSelectedRow();
        int fetchQty = (Integer) quantitySpinner.getValue();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Compound selectedCompound = (Compound) jTableCompoundList.getValueAt(selectedRow, 0);
        if (fetchQty < 0) {
            JOptionPane.showMessageDialog(null, "Qauntity cant be less than equal to 0!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (fetchQty <= selectedCompound.getQuantity()) {
            int check = 1;

            Supplier s = (Supplier) jComboBoxSupplier.getSelectedItem();
            tempList.add(selectedCompound);
            if (check == 1) {
                for (Compound C1 : s.getCompoundHistory().getCompoundList()) {
                    if (C1.getName().equalsIgnoreCase(selectedCompound.getName())) {
                        C1.setQuantity(C1.getQuantity() - fetchQty);
                        C1.setQuantitySold(C1.getQuantitySold() + fetchQty);
                        break;
                    }
                }
            } else {
                for (Compound c : s.getCompoundHistory().getCompoundList()) {
                    for (Compound c2 : tempList) {
                        if (c.getName().equals(c2.getName())) {
                            c.setQuantity(c.getQuantity() - fetchQty);
                            c.setQuantitySold(c.getQuantitySold() + fetchQty);
                            break;
                        }
                    }
                }
            }
            populateCompoundListTable();
            populateDrugTable();
        }

 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void createDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDrugJButtonActionPerformed
        // TODO add your handling code here:
        CreateDrugJPanel cdjp = new CreateDrugJPanel(userProcessContainer, enterprise, business, tempList, account, org);
        userProcessContainer.add("CreateDrugJPanel", cdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createDrugJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        if (component instanceof ScientistWorkAreaJPanel) {
            ScientistWorkAreaJPanel s = (ScientistWorkAreaJPanel) component;
            s.populateDrugTable();
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compoundListButon;
    private javax.swing.JButton createDrugJButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBoxSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCompoundList;
    private javax.swing.JTable jTableDrug;
    private javax.swing.JSpinner quantitySpinner;
    // End of variables declaration//GEN-END:variables

}