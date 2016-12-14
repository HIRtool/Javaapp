package hirgroep11;

public class OnderzoeksAssistent extends Assistent{
    
    private final int aantalSurveillanties = 3;

    public OnderzoeksAssistent(int aNr, String assVoornaam, String assAchternaam, Prof leidingGevendeProf) {
        super(aNr, assVoornaam, assAchternaam, leidingGevendeProf);
    }

    @Override
    public int maxSurveillanties() {
        return aantalSurveillanties;
    }

    
    
    
}
