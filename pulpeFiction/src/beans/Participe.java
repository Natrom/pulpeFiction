/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Vector;

/**
 *
 * @author xavix
 */
public class Participe {
    private int idProjet;
    private Vector<Vector> listeEtudiant;

    public Participe() {
        listeEtudiant=new Vector<>();
    }

    public int getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }

    public Vector<Vector> getListeEtudiant() {
        return listeEtudiant;
    }

    public void setListeEtudiant(Vector<Vector> listeEtudiant) {
        this.listeEtudiant = listeEtudiant;
    }
    
}
