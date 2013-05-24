/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Client;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author xavix
 */
public class DAOClient {

    private DAOFactory factory;

    public DAOClient(DAOFactory factory) {
        this.factory=factory;
    }
    public Client addClient(Client client) {
        Client user = new Client();
        try {
            Connection connection = factory.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Client(nom_client, adresse_client,"
                    + "telephone_client, nom_contact ) VALUES ("+client.getNom_client()+","
                    + client.getAdresse_client()+","+client.getTelephone_client()+","
                    + client.getNom_contact()+";");
            /* Fermeture des ressources */
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new dao.DAOException(e.getSQLState());
        }
        return user;
    }
    
}
