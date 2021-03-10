//import java.util.Timer;

public class Fano {

	//numéro du fano
	int m_dossard;
	//durée du tour
	int m_duree;
	
	//constructeur du fano
	public Fano(int dossard, int duree)
	{
		m_dossard=dossard;
		m_duree=duree;
		//new Timer(2000,evt->fini()).start();
	}
	
	public Fano(int dossard)
	{
		m_dossard=dossard;
	}
	
	//Méthode get pour récupérer le numéro 
	public int getnum()
	{
		return m_dossard;
	}
	
	//Méthode get pour récupérer la durée
	public int getdur()
	{
		return m_duree;
	}
	
	//Prévient quand un tour est fini
	public void fini() {
		System.out.println("Tour fini");
		
    }
	
}
