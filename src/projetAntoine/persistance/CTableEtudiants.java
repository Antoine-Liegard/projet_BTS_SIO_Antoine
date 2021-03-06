package projetAntoine.persistance;

/**
 *
 * @author Antoine Liégard, liegard.antoine35@gmail.com
 */
import projetAntoine.entites.CEtudiant;
import projetAntoine.entites.CListeEtudiants;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import projetAntoine.entites.CListeSessionFormation;
import projetAntoine.entites.CSessionFormation;

public class CTableEtudiants {

    protected CListeSessionFormation listeSessionFormation;
    protected CBDD bdd;

    public CTableEtudiants(CBDD bdd) {
        this.bdd = bdd;
    }

    public CTableEtudiants() {

    }

    //nom de méthode explicite ne fonctionne pas à cause des contraintes
    int supprimerTable() {
        String req = "DROP TABLE tableetudiants";
        int res = -1;
        if (bdd.connecter() == true) {
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    CEtudiant convertirResultEtudiant(ResultSet result) {

        try {
            int idEtudiant = result.getInt("idEtudiant");
            int idSessionFormation = result.getInt("idSessionFormation");
            String nom = result.getString("nom");
            String prenom = result.getString("prenom");
            Date date = result.getDate("dateNaissance");
            String numeroSS = result.getString("numeroSS");
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(date);
            String commune = result.getString("commune");
            String codePostal = result.getString("codePostal");
            String numeroVoie = result.getString("numeroVoie");
            String nomVoie = result.getString("nomVoie");          
            String typeVoie = result.getString("typeVoie");
            String mail = result.getString("mail");
            String telephone1 = result.getString("telephone1");
            String telephone2 = result.getString("telephone2");
            String infoComplementaires = result.getString("infosComplementaires");
            CSessionFormation sessionFormation;
            if (idSessionFormation == 0) {
                sessionFormation = null;
            } else {
                sessionFormation = listeSessionFormation.selectionnerSession(idSessionFormation);
            }
            return new CEtudiant(idEtudiant, sessionFormation, nom, prenom, gc, numeroSS, commune, codePostal, numeroVoie, typeVoie, nomVoie, mail, telephone1, telephone2, infoComplementaires);
        } catch (SQLException ex) {
            Logger.getLogger(CTableEtudiants.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public CListeEtudiants lireEtudiants() {

        if (bdd.connecter() == true) {
            CListeEtudiants listeEtudiants = new CListeEtudiants();
            ResultSet result = bdd.executerRequeteQuery("select * from tableetudiants");
            try {
                while (result.next()) {
                    CEtudiant etudiant = convertirResultEtudiant(result);
                    listeEtudiants.ajouterEtudiant(etudiant);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
            return listeEtudiants;
        } else {
            System.out.println("Connexion KO");
        }
        return null;
    }

    public CEtudiant lireEtudiant(int idEtu) {
        CEtudiant etudiant = null;
        if (bdd.connecter() == true) {
            System.out.println("Connexion OK");
            ResultSet result = bdd.executerRequeteQuery("select * from tableetudiants  WHERE `tableetudiants`.`idEtudiant` = " + idEtu);
            try {
                if (result.next()) {
                    etudiant = convertirResultEtudiant(result);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return etudiant;
    }

    // inserer un nouvel étudiant dans la base, retourne 1 si éxecuté
    public int insererEtudiant(CEtudiant etudiant) {
        int res = 0;
        if (bdd.connecter() == true) {
            String dateNaissance = bdd.formaterDate(etudiant.getDateNaissance());
            String req = "INSERT INTO `tableetudiants` (`idSessionFormation`, "
                    + "`nom`, `prenom`, `dateNaissance`,`numeroSS`, `commune`, "
                    + "`codePostal`, `numeroVoie`, `typeVoie`, `nomVoie`, `mail`,"
                    + " `telephone1`, `telephone2`, `infosComplementaires`) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

            try {

                PreparedStatement pstmt = bdd.conn.prepareStatement(req);
                if (etudiant.getSessionFormation() == null) {
                    pstmt.setNull(1, java.sql.Types.INTEGER);
                } else {
                    pstmt.setInt(1, etudiant.getSessionFormation().getIdSessionFormation());
                }
                pstmt.setString(2, etudiant.getNom());
                pstmt.setString(3, etudiant.getPrenom());
                pstmt.setString(4, dateNaissance);
                pstmt.setString(5, etudiant.getNumeroSS());
                pstmt.setString(6, etudiant.getCommune());
                pstmt.setString(7, etudiant.getCodePostal());

                if ("".equals(etudiant.getNumeroVoie())) {
                    pstmt.setNull(8, java.sql.Types.VARCHAR);
                } else {
                    pstmt.setString(8, etudiant.getNumeroVoie());
                }
                pstmt.setString(9, etudiant.getTypeVoie());
                pstmt.setString(10, etudiant.getNomVoie());
                pstmt.setString(11, etudiant.getMail());
                pstmt.setString(12, etudiant.getTelephone1());

                if ("".equals(etudiant.getTelephone2())) {
                    pstmt.setNull(13, java.sql.Types.VARCHAR);
                } else {
                    pstmt.setString(13, etudiant.getTelephone2());
                }
                pstmt.setString(14, etudiant.getInfoComplementaires());
                pstmt.execute();
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
                res = 1;
            }

            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    // met a jour un étudiant dans la base avec un prepared statement, retourne 1 si éxecuté
    public int mettreAJourEtudiant(CEtudiant etudiant) {
        int res = 0;
        if (bdd.connecter() == true) {
            String dateNaissance = bdd.formaterDate(etudiant.getDateNaissance());

            String req = "UPDATE tableetudiants "
                    + "SET `IdSessionFormation` = ? , `nom` = ? , `prenom` = ? ,"
                    + " `dateNaissance` = ? , `numeroSS` = ? ,"
                    + " `commune` = ? , `codePostal` = ? , `numeroVoie` = ? ,"
                    + " `typeVoie` = ? , `nomVoie` = ? , `mail` = ? ,"
                    + " `telephone1` = ? , `telephone2` = ? ,"
                    + " `infosComplementaires` = ?  WHERE"
                    + " `tableetudiants`.`idEtudiant` =" + etudiant.getIdEtudiant() + ";";
            try {

                PreparedStatement pstmt = bdd.conn.prepareStatement(req);
                if (etudiant.getSessionFormation() == null ) {
                    pstmt.setNull(1, java.sql.Types.INTEGER);
                } else {
                    pstmt.setInt(1, etudiant.getSessionFormation().getIdSessionFormation());
                }
                pstmt.setString(2, etudiant.getNom());
                pstmt.setString(3, etudiant.getPrenom());
                pstmt.setString(4, dateNaissance);
                pstmt.setString(5, etudiant.getNumeroSS());
                pstmt.setString(6, etudiant.getCommune());
                pstmt.setString(7, etudiant.getCodePostal());

                if ("".equals(etudiant.getNumeroVoie())) {
                    pstmt.setNull(8, java.sql.Types.VARCHAR);
                } else {
                    pstmt.setString(8, etudiant.getNumeroVoie());
                }
                pstmt.setString(9, etudiant.getTypeVoie());
                pstmt.setString(10, etudiant.getNomVoie());
                pstmt.setString(11, etudiant.getMail());
                pstmt.setString(12, etudiant.getTelephone1());

                if ("".equals(etudiant.getTelephone2())) {
                    pstmt.setNull(13, java.sql.Types.VARCHAR);
                } else {
                    pstmt.setString(13, etudiant.getTelephone2());
                }
                pstmt.setString(14, etudiant.getInfoComplementaires());

                System.out.println(pstmt);
                pstmt.execute();
                res = 1;
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
                res = 0;
            }

            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    // nom de méthode explicite (ne devrais pas fonctionner à cause des contraintes),
    //a t-on vraiment besoin de garder cette méthode?
    int supprimerTousLesEtudiants() {
        int res = -1;
        if (bdd.connecter() == true) {
            String req = "DELETE * FROM tableetudiants ";
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    // supprime étudiant par rapport à son ID dans la classe
    public int supprimerEtudiant(CEtudiant etudiant) {
        int res = -1;
        if (bdd.connecter() == true) {

            String req = "DELETE FROM tableetudiants WHERE `tableetudiants`.`idEtudiant` = " + etudiant.getIdEtudiant();
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    // supprime étudiant par rapport à son ID dans la base de donnée
    int supprimerEtudiant(int id) {
        int res = -1;
        if (bdd.connecter() == true) {
            String req = "DELETE FROM tableetudiants WHERE `tableetudiants`.`id` = " + id;
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    public CListeSessionFormation getListeSessionFormation() {
        return listeSessionFormation;
    }

    public void setListeSessionFormation(CListeSessionFormation listeSessionFormation) {
        this.listeSessionFormation = listeSessionFormation;
    }

    public void setBdd(CBDD bdd) {
        this.bdd = bdd;
    }

    // methode test
    public static void main(String[] args) {
        CBDD bdd = new CBDD(new CParametresBDD("parametresBdd.properties"));
        CTableEtudiants tableEtudiants = new CTableEtudiants(bdd);

        CTableSessionFormation tableSession = new CTableSessionFormation(bdd);

        // Création de l'association simple entre TableEtudiants et CBDD
        tableEtudiants.listeSessionFormation = tableSession.lireSessionsFormations();
        CSessionFormation session = tableEtudiants.listeSessionFormation.selectionnerSession(1);

//        //test insertion etudiants
//        for (int i = 0; i < 5; i++) {
//            int rand = (int) (Math.random() * 100);
//            tableEtudiants.insererEtudiant(new CEtudiant(
//                    -1,
//                    session,
//                    "Nom" + rand,
//                    "Prénom" + rand,
//                    new GregorianCalendar(),
//                    "196114634948493",
//                    "Rennes",
//                    "35000",
//                    "1",
//                    "Rue",
//                    "Bô jeu",
//                    "test.test@gmail.com",
//                    "0102030405",
//                    "0203040506",
//                    ""));
//        }
//        // mise a jour étudiant
//        CEtudiant etudiant = listeEtudiants.selectionnerEtudiant(26);
//        etudiant.setSessionFormation(session);
//        
//        tableEtudiants.mettreAJourEtudiant(listeEtudiants.selectionnerEtudiant(26));
        CListeEtudiants listeEtudiants = tableEtudiants.lireEtudiants();

        listeEtudiants.toString();
////        test suppression de tous les étudiants
//        tableEtudiants.supprimerTousLesEtudiants();
    }
}
