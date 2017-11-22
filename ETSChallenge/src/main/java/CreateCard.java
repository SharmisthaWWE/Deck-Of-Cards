/**
 *
 * @author Sharmistha Bardhan
 */

public class CreateCard {
    
    public enum suits{
        hearts, spades, clubs, diamonds;
    }
    
    public enum faceValues{
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King;
    }
    
    // These variables are kept private to protect them from outside interference
    public suits cardSuite;
    public faceValues cardFaceValue;
    
    CreateCard(suits suiteValue, faceValues faceValue)
    {
        this.cardSuite = suiteValue;
        this.cardFaceValue = faceValue;
    }
}
