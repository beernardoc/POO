package EP105926;

public class Culture extends Activity{


    private int numParticipantes;

    public enum Option{
        ARCHITECTURAL_TOUR,RIVER_TOUR,DRINKS_AND_SNACKS, ART_MUSEUM, WINE_TASTING;




    }

    public Culture(Option opção, int numParticipantes) {
        super(numParticipantes);
    }
}
