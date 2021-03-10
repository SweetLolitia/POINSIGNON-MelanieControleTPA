import java.util.ArrayList;

//import static java long Thread sleep;

public class Serveur {

	private static Serveur instance = null;

	//liste des fanos
	 ArrayList<Fano> listemfano;
	 
	//liste des utilisateur
	 ArrayList<Utilisateur> listeutilsateur;
	 
	 //Singleton
	 public static Serveur getInstance() {
	        if (instance == null) {
	            instance = new Serveur();
	        }
	        return instance;
	    }
	 
	 //constructeur du serveur
	 private Serveur() {
		 	listemfano = new ArrayList<>();
		 	listeutilsateur = new ArrayList<>();
	    }
	 
	 //Créé et ajoute un fano dans la liste des fanos
	 public void CreateF(Fano f) {
	    	if (f != null) {
	    		listemfano.add(f);
	        }
	    }
	 
	 //Créé et ajoute un utilisateur dans la liste des utilisateurs
	 public void CreateU(Utilisateur u) {
	    	if (u != null) {
	    		listeutilsateur.add(u);
	        }
	    }
	 
	 //Abonne un fano à un utilisateur
	 public void Abonne(Utilisateur u, Fano f) {
	                u.AjoutFANO(f);
	            }
	 
	 public static void main(String[] args) {
		 
		 Fano num1 = new Fano(46,1000);
		 Fano num2 = new Fano(10,2000);
		 
		 Utilisateur u1= new Utilisateur("premier");
		 Utilisateur u2= new Utilisateur("second");
		 
		 Serveur.getInstance().CreateF(num1);
		 Serveur.getInstance().CreateF(num2);
		 
		 Serveur.getInstance().CreateU(u1);
		 Serveur.getInstance().CreateU(u2);
		 
		 Serveur.getInstance().Abonne(u1,num2);
		 Serveur.getInstance().Abonne(u2,num1);
		 Serveur.getInstance().Abonne(u2,num2);
		 
		/* try {
			 sleep(10000);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }*/
	 }
	 
}
