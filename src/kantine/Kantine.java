package kantine;

/**
* Een klasse die aan de hand van andere klassen
* een nabootsing maakt van een kantine.
* 
* @author Ronald Scholten
* @version 28-11-2014
*/

public class Kantine {
    private Kassa kassa;
    private Kassarij kassarij;
    
  /**
   * Constructor
   */
  public Kantine() {
    kassarij = new Kassarij();
    kassa = new Kassa(kassarij);
  }
  
  public Kassa getKassa() {
	  return kassa;
  }

  /**
   * In deze methode wordt een Persoon en Dienblad
   * gemaakt en aan elkaar
   * gekoppeld. Maak twee Artikelen aan en plaats 
   * deze op het dienblad.   
   * Tenslotte sluit de Persoon zich aan bij de rij 
   * voor de kassa.
   */
  public void loopPakSluitAan() {
    Persoon persoon = new Persoon();
    Dienblad dienblad = new Dienblad();
    
    Artikel artikel1 = new Artikel("Unox Worst", 2.00);
    Artikel artikel2 = new Artikel("Goedkoop Broodje", 0.50);
    
    persoon.pakDienblad(dienblad);
    
    dienblad.voegToe(artikel1);
    dienblad.voegToe(artikel2);
            
    kassarij.sluitAchteraan(persoon);
  }

  /**
   * Deze methode handelt de rij voor de kassa af.
   */
  public void verwerkRijVoorKassa() 
  {
    while(kassarij.erIsEenRij()) {
        kassa.rekenAf(kassarij.eerstePersoonInRij());
    }
  }
}
