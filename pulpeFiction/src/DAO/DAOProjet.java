/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Client;
import beans.Projet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
}
