package ca.csf.dfc.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonneTest {
	//TESTS POUR LE CONSTRUCTEUR MULTIPLE
	@Test
	void test_NOM_Dominic() {
		String NOM = "Dominic";
		Personne dom = new Personne("Dominic",28);
		
		assertEquals(dom.getM_Nom(), NOM);
	}
	
	@Test
	void test_AGE_Dominic() {
		int AGE = 28;
		Personne dom = new Personne("Dominic",28);
		
		assertEquals(dom.getM_Age(), AGE);
	}
	//TESTS POUR LES AUTRES CONSTRUCTEURS
	@Test
	void test_AGE_Van() {
		int AGE = 25;
		Personne van = new Personne(25);
		
		assertEquals(van.getM_Age(), AGE);
	}
	//test du nom par defaut qui est BOB
	@Test
	void test_NOMDEFAUT_Van() {
		String NOM = "BOB";
		Personne van = new Personne(25);
		
		assertEquals(van.getM_Nom(), NOM);
	}
	
	//test age par defaut qui est 18 ans
		@Test
		void test_AGEDEFAUT_Van() {
			int AGE =18;
			Personne van = new Personne("Van");
			
			assertEquals(van.getM_Age(), AGE);
		}
		
		//test toutes valeurs par default
				@Test
				void test_TOUT_DEFAUT() {
					int AGE =18;
					String NOM = "BOB";
					Personne van = new Personne();
					
					assertEquals(van.getM_Age(), AGE);
					assertEquals(van.getM_Nom(), NOM);
				}
}
