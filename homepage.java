/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storemenu;

/**
 *
 * @author Reggie Watson
 */
public class homepage extends javax.swing.JFrame {

    private StoreModel myModel;
    

    /**
     * Creates new form homepage
     */
    public homepage() {
        initComponents();
    }
    
    homepage(StoreMenu myModel, StoreModel homepage){
        this.myModel = homepage;
        initComponents();
    }

    homepage(homepage myModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    homepage(StoreModel myModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kicksLabel = new javax.swing.JLabel();
        selectitemLabel = new javax.swing.JLabel();
        itemLabel = new javax.swing.JLabel();
        clothingButton = new javax.swing.JButton();
        hatsButton = new javax.swing.JButton();
        accessoriesButton = new javax.swing.JButton();
        shoesButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kicksLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        kicksLabel.setText("Welcome to Kicks4Cheap");

        selectitemLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        selectitemLabel.setText("Please Select an Item");

        itemLabel.setText("Categories:");

        clothingButton.setText("Clothing");
        clothingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clothingButtonActionPerformed(evt);
            }
        });

        hatsButton.setText("Hats");
        hatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hatsButtonActionPerformed(evt);
            }
        });

        accessoriesButton.setText("Accessories");
        accessoriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessoriesButtonActionPerformed(evt);
            }
        });

        shoesButton.setText("Shoes");
        shoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoesButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("This program is for informational\npurposes only. Use this program to\nlearn the market price for certain \nitems to compare stores before you\npay.\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(selectitemLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(shoesButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(itemLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clothingButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hatsButton)
                                    .addComponent(accessoriesButton))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kicksLabel)
                        .addGap(52, 52, 52))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kicksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectitemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemLabel)
                    .addComponent(clothingButton)
                    .addComponent(hatsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shoesButton)
                    .addComponent(accessoriesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clothingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothingButtonActionPerformed
        homepage myhomepage = null;
        // TODO add your handling code here:
      clothing myclothing = new clothing(myhomepage);
      myclothing.setVisible(true);
        
        this.dispose();
   
        
    }//GEN-LAST:event_clothingButtonActionPerformed

    private void hatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hatsButtonActionPerformed
        // TODO add your handling code here:
        homepage myhomepage = null;
        hats myhats = new hats(myhomepage);
        myhats.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_hatsButtonActionPerformed

    private void shoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoesButtonActionPerformed
        // TODO add your handling code here:
        homepage myhomepage = null;
        shoes myshoes = new shoes(myhomepage);
        myshoes.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_shoesButtonActionPerformed

    private void accessoriesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessoriesButtonActionPerformed
        // TODO add your handling code here:
        homepage myhomepage = null;
        accessories myaccessories = new accessories(myhomepage);
        myaccessories.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_accessoriesButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accessoriesButton;
    private javax.swing.JButton clothingButton;
    private javax.swing.JButton hatsButton;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel kicksLabel;
    private javax.swing.JLabel selectitemLabel;
    private javax.swing.JButton shoesButton;
    // End of variables declaration//GEN-END:variables

   
    
}
