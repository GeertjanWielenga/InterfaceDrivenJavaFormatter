package org.netbeans.modules.idf;

import org.openide.util.NbBundle;

@NbBundle.Messages({
    "asDeclared=import java.awt.event.ActionEvent;\n" +
"import java.awt.event.ActionListener;\n" +
"\n" +
"public class AClass implements ActionListener, Runnable {\n" +
"\n" +
"    //After formatting, this member will be second,\n" +
"    //because its interface is declared second:\n" +
"    @Override\n" +
"    public void run() {\n" +
"    }\n" +
"    \n" +
"    //After formatting, this member will be first,\n" +
"    //because its interface is declared first:\n" +
"    @Override\n" +
"    public void actionPerformed(ActionEvent e) {\n" +
"    }\n" +
"    \n" +
"}"
})
public class PreviewPanel extends javax.swing.JPanel {

    public PreviewPanel() {
        initComponents();
        jEditorPane1.setText(Bundle.asDeclared());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        jScrollPane2.setEnabled(false);

        jEditorPane1.setContentType("text/x-java"); // NOI18N
        jScrollPane2.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
