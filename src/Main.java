/*
 * Main.java
 */
public class Main {
  
  public static void main(String[] args) {
    Dossier d1 = new Dossier("Racine");
    d1.add(new Fichier("bonjour.txt"));
    d1.add(new Fichier("toto.txt"));
    d1.add(new Fichier("titi.txt"));
    
    Dossier d2 = new Dossier("Doc");
    d2.add(new Fichier("guide.doc"));
    
    d1.add(d2);
    
    // Verification du type d'entree
    IEntree e = d2.get(0);
    if (e instanceof Fichier) {
       System.out.print("L'entree 0 du dossier Doc est un fichier:"); 
       e.print();
       System.out.println("On ne peut pas utiliser les methodes specifiques aux composites");
    } else {
      System.out.println("L'entree 0 du dossier Doc est un dossier:");    
      e.print();
      System.out.println("On peut utiliser les methodes specifiques aux composites");
    }    
    
    System.out.println("------------------------------");
    d1.print();
  }
  
}
