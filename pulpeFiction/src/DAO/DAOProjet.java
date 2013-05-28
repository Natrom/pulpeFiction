/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Client;
import beans.Projet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author xavix
 */
public class DAOProjet {

    private DAOFactory factory;

    public DAOProjet(DAOFactory factory) {
        this.factory = factory;
    }

    public void addProjet(Projet projet, Client client) {
        try {
            Connection connection = factory.getConnection();
            Statement statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO `Projet` (`idClient`, `nomProjet`, `dureeProjet`, `dateFinProjet`,`prixJournee`) VALUES\n"
                    + "(" + client.getId_client() + ", '" + projet.getNom_projet() + "', " + projet.getDuree_projet() + ", '" + projet.getDate_fin_projet() + "'," + projet.getPrix_journee() + ");");
            /* Fermeture des ressources */
            System.out.println("echo");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new dao.DAOException(e.getSQLState());
        }
    }

    public void getProjet() {
        Vector listeProjet = new Vector<>();
        int idEtu;
        int idCli;
        DAOFactory daoFactory = new DAOFactory();
        DAOClient daoClient = daoFactory.getDAOClient();
        DAOEtudiant daoEtudiant = daoFactory.getDAOEtudiant();
        try {
            Connection connection = factory.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM Projet");
            while (result.next()) {
                Projet projet = new Projet();
                projet.setId_projet(result.getInt("idProjet"));
                projet.setDate_fin_projet(result.getString("dateFinProjet"));
                projet.setDuree_projet(result.getShort("dureeProjet"));
                projet.setId_convention(result.getInt("idConvention"));
                projet.setNom_projet(result.getString("nomProjet"));
                projet.setPrix_journee(result.getInt("prixJournee"));
                idCli = result.getInt("idClient");
                idEtu = result.getInt("responsable");

                projet.setClient(daoClient.getUnClient(idCli));
                projet.setResponsable(daoEtudiant.getUnEtudiant(idEtu));
                listeProjet.add(projet);
            }
        } catch (SQLException e) {
            throw new dao.DAOException(e.getSQLState());
        }
    }

    public Vector getRechercheProjet(String nomEntre) {
        Vector vector2D = new Vector<>();
        try {
            
            Connection connection = factory.getConnection();
            Statement statement = connection.createStatement();
            String requete="SELECT * FROM Projet where nomProjet like \"%"+nomEntre+"%\"";
            System.out.println(requete);
            ResultSet result = statement.executeQuery(requete);
            while (result.next()) {
                Vector vector1D=new Vector<>();
                vector1D.add(result.getInt("idProjet"));
                vector1D.add(result.getString("nomProjet"));
                vector1D.add(result.getString("dateFinProjet"));
                vector1D.add(result.getShort("dureeProjet"));
                vector1D.add(result.getInt("prixJournee"));
                vector2D.add(vector1D);
            }
        } catch (SQLException e) {
            throw new dao.DAOException(e.getSQLState());
        }
        return vector2D;
    }
}
