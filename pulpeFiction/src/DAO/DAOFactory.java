package DAO;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DAOFactory {

    private static final String FILE_PROPERTIES = "connection.properties";
    private static final String PROPERTY_URL = "url";
    private static final String PROPERTY_USERNAME = "user";
    private static final String PROPERTY_PASSWORD = "pwd";
    private static final String PROPERTY_DRIVER = "driver";
    private String driver;
    private String url;
    private String username;
    private String password;
    private MysqlDataSource mds;

    public DAOFactory() {
        Properties properties = new Properties();
        try {
            properties.load(getClass().getResourceAsStream(FILE_PROPERTIES));
            driver = properties.getProperty(PROPERTY_DRIVER);
            url = properties.getProperty(PROPERTY_URL);
            username = properties.getProperty(PROPERTY_USERNAME);
            password = properties.getProperty(PROPERTY_PASSWORD);
        } catch (IOException e) {
            throw new DAOConfigException("Unable to load properties file " + FILE_PROPERTIES, e);
        }

        /* Chargement du driver JDBC pour MySQL */
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
        }
        try {
            mds = new MysqlDataSource();
            mds.setUrl(url);
            mds.setUser(username);
            mds.setPassword(password);
        } catch (Exception e) {
        }

    }

    public Connection getConnection() throws SQLException {
        return mds.getConnection();
    }

    public DAOClient getDAOClient() {
        return new DAOClient(this);
    }
    public DAOProjet getDAOProjet() {
      return new DAOProjet(this);
    }
    
    public DAOEtudiant getDAOEtudiant() {
      return new DAOEtudiant(this);
    }
}