/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetAntoine.ihm;

import java.util.GregorianCalendar;
import projetAntoine.entites.CEtudiant;
import projetAntoine.entites.CListeSessionFormation;
import projetAntoine.entites.CSessionFormation;

/**
 *
 * @author Antoine Liégard, liegard.antoine35@gmail.com
 */
public class JPanelInsertEtudiant extends javax.swing.JPanel {

    /**
     * Creates new form JPanelInsertEtudiant
     */
    protected CListeSessionFormation listeSessionFormation;

    public JPanelInsertEtudiant(CListeSessionFormation listeSessionFormation) {
        this.listeSessionFormation = listeSessionFormation;
        initComponents();

        CSessionFormation[] tabSession = new CSessionFormation[listeSessionFormation.listeSessionFormation.size()];

        for (int i = 0; i < tabSession.length; i++) {
            tabSession[i] = listeSessionFormation.listeSessionFormation.get(i);
        }
        this.ComboSessionFormation.setModel(new javax.swing.DefaultComboBoxModel(tabSession));
        this.ComboSessionFormation.setRenderer(new CComboBoxRenderer());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();
        LabelNom = new javax.swing.JLabel();
        TextFieldNom = new javax.swing.JTextField();
        ButtonInsert = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        TextFieldPrenom = new javax.swing.JTextField();
        LabelPrenom = new javax.swing.JLabel();
        LabeDate = new javax.swing.JLabel();
        TextFieldDate = new javax.swing.JTextField();
        TextFieldCodePostal = new javax.swing.JTextField();
        TextFieldCommune = new javax.swing.JTextField();
        TextFieldNumVoie = new javax.swing.JTextField();
        TextFieldTypeVoie = new javax.swing.JTextField();
        LabelCommune = new javax.swing.JLabel();
        LabelCodePostal = new javax.swing.JLabel();
        LabelNumVoie = new javax.swing.JLabel();
        LabelTypeVoie = new javax.swing.JLabel();
        LabelNomVoie = new javax.swing.JLabel();
        TextFieldNomVoie = new javax.swing.JTextField();
        LabelMail = new javax.swing.JLabel();
        TextFieldNumSS = new javax.swing.JTextField();
        TextFieldMail = new javax.swing.JTextField();
        LabelNumSS = new javax.swing.JLabel();
        TextFieldTel2 = new javax.swing.JTextField();
        LabelTel2 = new javax.swing.JLabel();
        LabelTel1 = new javax.swing.JLabel();
        TextFieldTel1 = new javax.swing.JTextField();
        TabelInfoComp = new javax.swing.JLabel();
        TextFieldInfoComp = new javax.swing.JTextField();
        ComboSessionFormation = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));

        mainLabel.setText("Nouveau étudiant");

        LabelNom.setText("Nom étudiant *");

        TextFieldNom.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldNom.setName(""); // NOI18N
        TextFieldNom.setPreferredSize(new java.awt.Dimension(50, 30));

        ButtonInsert.setText("Insérrer");
        ButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInsertActionPerformed(evt);
            }
        });

        ButtonCancel.setText("Annuler");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        TextFieldPrenom.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldPrenom.setName(""); // NOI18N
        TextFieldPrenom.setPreferredSize(new java.awt.Dimension(50, 30));

        LabelPrenom.setText("Prénom étudiant *");

        LabeDate.setText("Date naissance *");

        TextFieldDate.setText("JJ/MM/AAAA");
        TextFieldDate.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldDate.setPreferredSize(new java.awt.Dimension(50, 30));

        TextFieldCodePostal.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldCodePostal.setPreferredSize(new java.awt.Dimension(50, 30));

        TextFieldCommune.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldCommune.setPreferredSize(new java.awt.Dimension(50, 30));

        TextFieldNumVoie.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldNumVoie.setPreferredSize(new java.awt.Dimension(50, 30));

        TextFieldTypeVoie.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldTypeVoie.setPreferredSize(new java.awt.Dimension(50, 30));

        LabelCommune.setText("Commune *");

        LabelCodePostal.setText("Code postal *");

        LabelNumVoie.setText("Numéro voie");

        LabelTypeVoie.setText("Type voie *");

        LabelNomVoie.setText("Nom voie *");

        TextFieldNomVoie.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldNomVoie.setPreferredSize(new java.awt.Dimension(50, 30));

        LabelMail.setText("Mail *");

        TextFieldNumSS.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldNumSS.setPreferredSize(new java.awt.Dimension(50, 30));

        TextFieldMail.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldMail.setPreferredSize(new java.awt.Dimension(50, 30));

        LabelNumSS.setText("Numéro Sécurité Sociale *");

        TextFieldTel2.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldTel2.setPreferredSize(new java.awt.Dimension(50, 30));

        LabelTel2.setText("Téléphone 2");

        LabelTel1.setText("Téléphone *");

        TextFieldTel1.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldTel1.setPreferredSize(new java.awt.Dimension(50, 30));

        TabelInfoComp.setText("Information complémentaire");

        TextFieldInfoComp.setMinimumSize(new java.awt.Dimension(50, 30));
        TextFieldInfoComp.setPreferredSize(new java.awt.Dimension(50, 30));

        ComboSessionFormation.setMaximumSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNumSS)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextFieldNumSS, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboSessionFormation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TabelInfoComp)
                            .addComponent(TextFieldInfoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextFieldNumVoie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabelNumVoie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextFieldTypeVoie, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelTypeVoie))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelNomVoie)
                                        .addComponent(TextFieldNomVoie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mainLabel)
                                        .addComponent(LabelNom)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ButtonInsert)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonCancel))
                                        .addComponent(TextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(15, 15, 15)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelPrenom)
                                        .addComponent(TextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LabeDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TextFieldDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelCodePostal)
                                        .addComponent(TextFieldCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelCommune)
                                        .addComponent(TextFieldCommune, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(LabelMail)
                            .addComponent(TextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelTel1)
                                        .addGap(111, 111, 111))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(TextFieldTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelTel2)
                                    .addComponent(TextFieldTel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNom)
                            .addComponent(LabelPrenom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabeDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNumVoie)
                    .addComponent(LabelTypeVoie)
                    .addComponent(LabelNomVoie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldNumVoie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldTypeVoie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldNomVoie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelCodePostal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelCommune)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelMail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTel2)
                    .addComponent(LabelTel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelNumSS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldNumSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboSessionFormation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabelInfoComp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldInfoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonInsert)
                    .addComponent(ButtonCancel))
                .addContainerGap())
        );

        //for (int i = 0; i < listeSessionFormation.listeSessionFormation.size(); i++) {
            //    ComboSessionFormation.addItem(listeSessionFormation.listeSessionFormation.get(i).toString());
            //}
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInsertActionPerformed
        String nom = TextFieldNom.getText();
        String prenom = TextFieldPrenom.getText();
        String date = TextFieldDate.getText();
        int year = Integer.parseInt(date.substring(6, 10));
        int month = Integer.parseInt(date.substring(3, 5));
        int day = Integer.parseInt(date.substring(0, 2));
        GregorianCalendar dateNaissance = new GregorianCalendar(year, month, day);
        String numeroSS = TextFieldNumSS.getText();
        String commune = TextFieldCommune.getText();
        String codePostal = TextFieldCodePostal.getText();
        String numeroVoie = TextFieldNumVoie.getText();
        String typeVoie = TextFieldTypeVoie.getText();
        String nomVoie = TextFieldNomVoie.getText();
        String mail = TextFieldMail.getText();
        String telephone1 = TextFieldTel1.getText();
        String telephone2 = TextFieldTel2.getText();
        String infoComplementaire = TextFieldInfoComp.getText();
        CSessionFormation formation = (CSessionFormation) ComboSessionFormation.getSelectedItem();
        CEtudiant etudiant = new CEtudiant(0, formation, nom, prenom, dateNaissance, numeroSS, commune, codePostal, numeroVoie, typeVoie, nomVoie, mail, telephone1, telephone2, infoComplementaire);
        
        //finir methode d'insertion
    }//GEN-LAST:event_ButtonInsertActionPerformed

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        this.setVisible(false);

//        //pas obligatoire, pour recharger le layout
//        this.validate();
    }//GEN-LAST:event_ButtonCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonInsert;
    private javax.swing.JComboBox<String> ComboSessionFormation;
    private javax.swing.JLabel LabeDate;
    private javax.swing.JLabel LabelCodePostal;
    private javax.swing.JLabel LabelCommune;
    private javax.swing.JLabel LabelMail;
    private javax.swing.JLabel LabelNom;
    private javax.swing.JLabel LabelNomVoie;
    private javax.swing.JLabel LabelNumSS;
    private javax.swing.JLabel LabelNumVoie;
    private javax.swing.JLabel LabelPrenom;
    private javax.swing.JLabel LabelTel1;
    private javax.swing.JLabel LabelTel2;
    private javax.swing.JLabel LabelTypeVoie;
    private javax.swing.JLabel TabelInfoComp;
    private javax.swing.JTextField TextFieldCodePostal;
    private javax.swing.JTextField TextFieldCommune;
    private javax.swing.JTextField TextFieldDate;
    private javax.swing.JTextField TextFieldInfoComp;
    private javax.swing.JTextField TextFieldMail;
    private javax.swing.JTextField TextFieldNom;
    private javax.swing.JTextField TextFieldNomVoie;
    private javax.swing.JTextField TextFieldNumSS;
    private javax.swing.JTextField TextFieldNumVoie;
    private javax.swing.JTextField TextFieldPrenom;
    private javax.swing.JTextField TextFieldTel1;
    private javax.swing.JTextField TextFieldTel2;
    private javax.swing.JTextField TextFieldTypeVoie;
    private javax.swing.JLabel mainLabel;
    // End of variables declaration//GEN-END:variables

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */
}
