/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sales.view;

import com.sales.controller.Controller;
import com.sales.model.Invoice;
import com.sales.model.TableMod;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 * @author khaled
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        invoiceTable.getSelectionModel().addListSelectionListener(controller);
        createInvoiceButton = new javax.swing.JButton();
        createInvoiceButton.addActionListener(controller);
        deleteInvoiceButton = new javax.swing.JButton();
        deleteInvoiceButton.addActionListener(controller);
        invoiceDate = new javax.swing.JLabel();
        invoiceNumber = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        invoiceTotal = new javax.swing.JLabel();
        invoiceDateLine = new javax.swing.JLabel();
        invoiceNumberLine = new javax.swing.JLabel();
        customerNameLine = new javax.swing.JLabel();
        invoiceTotalLine = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        createLineButton = new javax.swing.JButton();
        createLineButton.addActionListener(controller);
        deleteLineButton = new javax.swing.JButton();
        deleteLineButton.addActionListener(controller);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        loadFileMenuItem.addActionListener(controller);
        saveFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        jScrollPane1.setViewportView(invoiceTable);

        createInvoiceButton.setText("Create");
        createInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
       //         createInvoiceButtonActionPerformed(evt);
            }
        });

        deleteInvoiceButton.setText("Delete");
        deleteInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvoiceButtonActionPerformed(evt);
            }
        });

        invoiceDate.setText("Invoice Date");

        invoiceNumber.setText("Invoice Number");

        customerName.setText("Customer Name");

        invoiceTotal.setText("Invoice Total");

        lineTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        jScrollPane2.setViewportView(lineTable);

        createLineButton.setText("Create New");

        deleteLineButton.setText("Delete Item");

        jMenu1.setText("File");

        loadFileMenuItem.setText("Load");
        jMenu1.add(loadFileMenuItem);

        saveFileMenuItem.setText("Save");
        saveFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(createInvoiceButton)
                                                .addGap(161, 161, 161)
                                                .addComponent(deleteInvoiceButton)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(invoiceDate)
                                                        .addComponent(invoiceNumber)
                                                        .addComponent(customerName)
                                                        .addComponent(invoiceTotal))
                                                .addGap(42, 42, 42)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(invoiceTotalLine)
                                                        .addComponent(customerNameLine)
                                                        .addComponent(invoiceNumberLine)
                                                        .addComponent(invoiceDateLine))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addComponent(createLineButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deleteLineButton)
                                                .addGap(81, 81, 81))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(createInvoiceButton)
                                        .addComponent(deleteInvoiceButton)
                                        .addComponent(createLineButton)
                                        .addComponent(deleteLineButton))
                                .addGap(0, 145, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(invoiceNumber)
                                        .addComponent(invoiceNumberLine))

                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(invoiceDate)
                                        .addComponent(invoiceDateLine))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(customerName)
                                        .addComponent(customerNameLine))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(invoiceTotal)
                                        .addComponent(invoiceTotalLine))
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvoiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createInvoiceButtonActionPerformed

    private void deleteInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvoiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInvoiceButtonActionPerformed

    private void saveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveFileMenuItemActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createInvoiceButton;
    private javax.swing.JButton createLineButton;
    private javax.swing.JLabel customerName;
    private javax.swing.JLabel customerNameLine;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JButton deleteLineButton;
    private javax.swing.JLabel invoiceDate;
    private javax.swing.JLabel invoiceDateLine;
    private javax.swing.JLabel invoiceNumber;
    private javax.swing.JLabel invoiceNumberLine;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel invoiceTotal;
    private javax.swing.JLabel invoiceTotalLine;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lineTable;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Invoice> invoices;
    private TableMod tableMod;
    private Controller controller = new Controller(this);

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    public TableMod getTableMod() {
        return tableMod;
    }

    public void setTableMod(TableMod tableMod) {
        this.tableMod = tableMod;
    }

    public JTable getInvoiceTable() {
        return invoiceTable;
    }

    public JTable getLineTable() {
        return lineTable;
    }

    public JLabel getCustomerNameLine() {
        return customerNameLine;
    }

    public JLabel getInvoiceDateLine() {

        return invoiceDateLine;
    }

    public JLabel getInvoiceNumberLine() {
        return invoiceNumberLine;
    }

    public JLabel getInvoiceTotalLine() {
        return invoiceTotalLine;
    }

    public Controller getController() {
        return controller;
    }

    public int getNextInvoiceNumber() {
        int num = 0;
        for (Invoice invoice : invoices) {
            if (invoice.getNum() > num) {
                num = invoice.getNum();
            }

        }
        return ++num;
    }

}
