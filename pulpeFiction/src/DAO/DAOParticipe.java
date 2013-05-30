/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author xavix
 */
public class DAOParticipe {

    private DAOFactory factory;

    public DAOParticipe(DAOFactory factory) {
        this.factory = factory;
    }

    public void addParticipe(String idProjet, Vector listeEtudiant) {
        try {

            int idP = Integer.parseInt(idProjet);
            int idE = 0;
            Connection connection = factory.getConnection();
            Statement statement = connection.createStatement();
            Vector v = new Vector();
            Iterator it2;
            Iterator it1 = listeEtudiant.iterator();
            while (it1.hasNext()) {
                v = (Vector) it1.next();
                idE = (int) v.get(0);

            }
String requete="INSERT INTO `Participe` (`idProjet`, `idEtudiant`) VALUES (" + idP + ", " + idE + ");";
            statement.executeUpdate(requete);
            /* Fermeture des ressources */

            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new dao.DAOException(e.getSQLState());
        }
    }
}
