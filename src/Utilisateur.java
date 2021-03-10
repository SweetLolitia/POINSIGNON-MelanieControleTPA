import java.util.ArrayList;

public class Utilisateur {
	
	//nom de l'utilisateur
	String m_name;
	//liste des fanos de l'utilisateur
	ArrayList<Fano> m_listefano;
	
	//constructeur de l'utilisateur
	public Utilisateur(String name)
	{
		m_name = name;
		m_listefano = new ArrayList<>();
	}
	
	//Ajout d'un fano dans la liste des fanos de l'utilisateur
	public void AjoutFANO(Fano f) {
		m_listefano.add(f);
    }
	
	//Prévient l'utilisateur d'un/des véhicule(s) à chaque tour avec le numéro et la durée
	public void fanotour(Fano f)
	{
		System.out.println("Tour fini"+f.getnum()+"à"+f.m_duree);
	}
}
