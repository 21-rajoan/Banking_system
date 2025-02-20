/* * Copyright (c) 2018 VR Fortaleza. All rights reserved. * */
package com.github.derickfelix.bankapplication.views.dialogs;

public class ExceptionDialog extends javax.swing.JDialog {

    private final Exception exception;

    /**
     * Creates new form ExceptionDialog
     *
     * @param parent the parent of this dialog
     * @param modal if true the parent frame cannot be accessed until this
     * dialog is closed
     * @param exception the exception which this dialog is describing
     */
    public ExceptionDialog(java.awt.Frame parent, boolean modal, Exception exception)
    {
        super(parent, modal);
        this.exception = exception;
        
        initComponents();
        customComponents();
    }
    
    private void customComponents()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(exception.getMessage()).append("\n\n");
        StackTraceElement[] stes = exception.getStackTrace();
        for (StackTraceElement ste : stes) {
            builder.append(ste).append("\n");
        }
        txtMessage.setText(builder.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        scrollPane = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalhes");

        txtMessage.setEditable(false);
        txtMessage.setBackground(new java.awt.Color(238, 238, 238));
        txtMessage.setColumns(20);
        txtMessage.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        txtMessage.setRows(5);
        scrollPane.setViewportView(txtMessage);

        btnClose.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        btnClose.setText("Sair");
        btnClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCloseActionPerformed
    {//GEN-HEADEREND:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}
