package main.Ferwafa;

public class Cards {
    public Cards() {
    }

    enum card{YELLOW,RED}
    card givencard;
public card getCard(String cardGive){
    
    switch (cardGive){
            case "YELLOW":
            givencard=card.YELLOW;
            break;
            case "RED":
            givencard=card.RED;
            break;
            default:
            System.out.println("The card is not supported!");
    }
    return givencard;

}

    @Override
    public String toString() {
        return "Cards []";
    }
    
}