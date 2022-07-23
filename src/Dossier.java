/*
 * Dossier.java
 */
import java.util.Vector;

/**
 * Dossier (Composite)
 */
public class Dossier implements IEntree {
  private String nom;
  private Vector<IEntree> children;
  
  public Dossier(String nom) {
    this.nom = nom;
    this.children = new Vector<IEntree>();
  }

  public void add(IEntree e) {
    this.children.add(e);
  }

  public void remove(IEntree e) {
    this.children.remove(e);
  }

  public IEntree get(int i) {
    return this.children.get(i);
  }

  public void print() {
    System.out.println("Dossier (" + this.nom + ")");
    for (IEntree e : this.children) {
      e.print();
    }
  }
  
}
