/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p1207333
 */
public class PagePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form PagePrincipale
     */
    public PagePrincipale() {
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

        nouveauClient = new javax.swing.JButton();
        nouveauProjet = new javax.swing.JButton();
        editionConvention = new javax.swing.JButton();
        choixEquipe = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        acompteEtudiant = new javax.swing.JButton();
        fraisEtu = new javax.swing.JButton();
        editionFact = new javax.swing.JButton();
        ConsultationProjet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Page Principale");

        nouveauClient.setText("Nouveau Client");
        nouveauClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clicNouveauClient(evt);
            }
        });

        nouveauProjet.setText("Nouveau Projet");
        nouveauProjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauProjet(evt);
            }
        });

        editionConvention.setText("Edition Convention");
        editionConvention.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editionConventionActionPerformed(evt);
            }
        });

        choixEquipe.setText("Choix Equipe");
        choixEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixEquipeActionPerformed(evt);
            }
        });

        jButton1.setText("Informations  Etudiant");
        jButton1.setActionCommand("Informations , Etudiant");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoEtu(evt);
            }
        });

        acompteEtudiant.setText("Indemnité Etudiant");
        acompteEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indemniteEtu(evt);
            }
        });

        fraisEtu.setText("Frais etudiant");
        fraisEtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fraisEtu(evt);
            }
        });

        editionFact.setText("Edition facture");
        editionFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etitFact(evt);
            }
        });

        ConsultationProjet.setText("Consultation Projet");
        ConsultationProjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultationProjetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nouveauClient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(choixEquipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editionConvention, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nouveauProjet, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ConsultationProjet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(fraisEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editionFact, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acompteEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nouveauClient, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nouveauProjet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choixEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultationProjet, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editionConvention, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editionFact, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acompteEtudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fraisEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editionConventionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editionConventionActionPerformed
        EditionConvention editconv = new EditionConvention();
        editconv.setVisible(true);
    }//GEN-LAST:event_editionConventionActionPerformed

    private void choixEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choixEquipeActionPerformed
        ChoixEquipe choixE = new ChoixEquipe();
        choixE.setVisible(true);
    }//GEN-LAST:event_choixEquipeActionPerformed

    private void ConsultationProjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultationProjetActionPerformed
        ConsultationProjet consultPro=new ConsultationProjet();
        consultPro.setVisible(true);
    }//GEN-LAST:event_ConsultationProjetActionPerformed

    private void clicNouveauClient(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clicNouveauClient
        
        NouveauClient Client = new NouveauClient();
        Client.setVisible(true);
    }//GEN-LAST:event_clicNouveauClient

    private void nouveauProjet(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauProjet
        NouveauProjet nouveauProjet= new NouveauProjet();
        nouveauProjet.setVisible(true);
    }//GEN-LAST:event_nouveauProjet

    private void infoEtu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoEtu
        InfoEtudiant infoEtudiant=new InfoEtudiant();
        infoEtudiant.setVisible(true);
    }//GEN-LAST:event_infoEtu

    private void indemniteEtu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indemniteEtu
        IndemniteEtudiant indEtu = new IndemniteEtudiant();
        indEtu.setVisible(true);
    }//GEN-LAST:event_indemniteEtu

    private void etitFact(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etitFact
        EditionFacture editFac=new EditionFacture();
        editFac.setVisible(true);
    }//GEN-LAST:event_etitFact

    private void fraisEtu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fraisEtu
        FraisEtudiant fraisEtu= new FraisEtudiant();
        fraisEtu.setVisible(true);
    }//GEN-LAST:event_fraisEtu

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
            java.util.logging.Logger.getLogger(PagePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagePrincipale().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultationProjet;
    private javax.swing.JButton acompteEtudiant;
    private javax.swing.JButton choixEquipe;
    private javax.swing.JButton editionConvention;
    private javax.swing.JButton editionFact;
    private javax.swing.JButton fraisEtu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton nouveauClient;
    private javax.swing.JButton nouveauProjet;
    // End of variables declaration//GEN-END:variables
}
