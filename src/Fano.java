//import java.util.Timer;

public class Fano {

	//num�ro du fano
	int m_dossard;
	//dur�e du tour
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
	
	//M�thode get pour r�cup�rer le num�ro 
	public int getnum()
	{
		return m_dossard;
	}
	
	//M�thode get pour r�cup�rer la dur�e
	public int getdur()
	{
		return m_duree;
	}
	
	//Pr�vient quand un tour est fini
	public void fini() {
		System.out.println("Tour fini");
		
    }
	
}
