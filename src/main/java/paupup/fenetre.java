package paupup;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class fenetre {
  public static void main(String[] args){

    JFrame fenetre = new JFrame();
                
    //Définit un titre pour notre fenêtre
    fenetre.setTitle("Gestion BDD");
    //Définit sa taille : 400 pixels de large et 100 pixels de haut
    fenetre.setSize(400, 100);
    //Nous demandons maintenant à notre objet de se positionner au centre
    fenetre.setLocationRelativeTo(null);
    //Termine le processus lorsqu'on clique sur la croix rouge
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JMenuBar menuBar = new JMenuBar();
    fenetre.setJMenuBar(menuBar);
    
    JMenu mnFichier = new JMenu("fichier");
    menuBar.add(mnFichier);
    
    JMenuItem mntmQuitter = new JMenuItem("Quitter");
    mnFichier.add(mntmQuitter);
    
    JMenu mnDatabase = new JMenu("database");
    menuBar.add(mnDatabase);
    fenetre.getContentPane().setLayout(new BorderLayout(0, 0));
    //Et enfin, la rendre visible        
    fenetre.setVisible(true);
  }       
}
