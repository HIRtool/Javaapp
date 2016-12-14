package hirgroep11;

public class OnderwijsAssistent extends Assistent{
    
    private final int aantalSurveillanties = 6;

    public OnderwijsAssistent(int aNr, String assVoornaam, String assAchternaam, Prof leidingGevendeProf) {
        super(aNr, assVoornaam, assAchternaam, leidingGevendeProf);
    }

    @Override
    public int maxSurveillanties() {
        return aantalSurveillanties;
    }

        
    
}
