/*
 * Fichier.java
 */

/**
 * Fichier (Leaf)
 */
public class Fichier implements IEntree {
  private String nom;
  
  public Fichier(String nom) {
    this.nom = nom;
  }

  public void print() {
    System.out.println("  " + this.nom);
  }
  
}
