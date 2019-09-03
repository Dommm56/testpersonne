package ca.csf.dfc.poo;

public class Personne {
	//donnees membres
	private String m_Nom;
	private int m_Age;
	
	private String NOM_PAR_DEFAULT = "BOB";
	private int AGE_PAR_DEFAULT = 18;
	
	//getters and setters
	public String getM_Nom() {
		return m_Nom;
	}
	public int getM_Age() {
		return m_Age;
	}
	public void setM_Nom(String m_Nom) {
		this.m_Nom = m_Nom;
	}
	public void setM_Age(int m_Age) {
		this.m_Age = m_Age;
	}
	//constructeurs
	public Personne(String p_Nom, int p_Age) {
		this.m_Nom=p_Nom;
		this.m_Age=p_Age;
	}
	public Personne(String p_Nom) {
		this.m_Nom=p_Nom;
		this.m_Age=AGE_PAR_DEFAULT;
	}
	public Personne(int p_Age) {
		this.m_Nom=NOM_PAR_DEFAULT;
		this.m_Age=p_Age;
	}
	public Personne() {
		this.m_Nom=NOM_PAR_DEFAULT;
		this.m_Age=AGE_PAR_DEFAULT;
	}
	
	//methode tostring
	@Override
	public String toString() {
		return "Personne [m_Nom=" + m_Nom + ", m_Age=" + m_Age + "]";
	}
}
