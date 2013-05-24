/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author xavix
 */
public class Client {

    private int id_client;
    private String nom_client;
    private String adresse_client;
    private int telephone_client;
    private String nom_contact;

    public int getId_projet() {
        return id_client;
    }

    public void setId_projet(int id_client) {
        this.id_client = id_client;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getAdresse_client() {
        return adresse_client;
    }

    public void setAdresse_client(String adresse_client) {
        this.adresse_client = adresse_client;
    }

    public int getTelephone_client() {
        return telephone_client;
    }

    public void setTelephone_client(int telephone_client) {
        this.telephone_client = telephone_client;
    }

    public String getNom_contact() {
        return nom_contact;
    }

    public void setNom_contact(String nom_contact) {
        this.nom_contact = nom_contact;
    }
}
