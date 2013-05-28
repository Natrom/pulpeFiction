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
import java.util.Vector;


/**
 *
 * @author xavix
 */
public class DAOClient {

    private DAOFactory factory;

    public DAOClient(DAOFactory factory) {
        this.factory = factory;
    }

    public void addClient(Client client) {

        try {
            Connection connection = factory.getConnection();
            Statement statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO `Client` (`nomClient`, `adresseClient`, `telClient`, `contactClient`) VALUES\n"
                    + "('" + client.getNom_client() + "', '" + client.getAdresse_client() + "', " + client.getTelephone_client() + ", '" + client.getNom_contact() + "');");
            /* Fermeture des ressources */

            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new dao.DAOException(e.getSQLState());
        }
    }

    @SuppressWarnings("empty-statement")
    public Vector getClientRecherche(String recepNumCli, String recepNom) {
        Vector myVector2D = new Vector();
        try {
            int recepNUCLI;
            Connection connection = factory.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = null;
            System.out.println(recepNom);
            System.out.println("1");
            System.out.println(recepNumCli);
            System.out.println("1");
            if (!recepNom.isEmpty() && !recepNumCli.isEmpty()) {
                recepNUCLI = Integer.parseInt(recepNumCli);
                resultSet = statement.executeQuery("SELECT * FROM Client WHERE `idClient`=" + recepNUCLI + " AND `nomClient`like '%" + recepNom + "%';");
            } else if (recepNom.isEmpty() && !recepNumCli.isEmpty()) {
                recepNUCLI = Integer.parseInt(recepNumCli);
                resultSet = statement.executeQuery("SELECT * FROM Client WHERE `idClient`=" + recepNUCLI + ";");
            } else if (!recepNom.isEmpty() && recepNumCli.isEmpty()) {
                resultSet = statement.executeQuery("SELECT * FROM Client WHERE `nomClient`like '%" + recepNom + "%';");
            }
            int i = 0;

            while (resultSet.next()) {
                    Vector line = new Vector();

                    line.add(resultSet.getString("idClient"));
                    line.add(resultSet.getString("nomClient"));
                    line.add(resultSet.getString("adresseClient"));
                    line.add(resultSet.getString("telClient"));
                    line.add(resultSet.getString("contactClient"));

                    myVector2D.add(line);
                
            }
        } catch (SQLException e) {
            throw new dao.DAOException(e.getSQLState());
        }

        return myVector2D;
    }
    
    public Client getUnClient(int idCli){
        Client client=new Client();
        try {
            Connection connection = factory.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result=statement.executeQuery("SELECT * FROM Client Where idClient="+idCli+";");
            while(result.next()){
                client.setAdresse_client(result.getString("adresseClient"));
                client.setId_client(result.getInt("idClient"));
                client.setNom_client(result.getString("nomClient"));
                client.setNom_contact(result.getString("contactClient"));
                client.setTelephone_client(result.getInt("telClient"));   
            }
        } catch (SQLException e) {
            throw new dao.DAOException(e.getSQLState());
        }
        return client;
    }
}
