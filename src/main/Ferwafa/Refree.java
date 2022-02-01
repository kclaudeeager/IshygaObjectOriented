package main.Ferwafa;
import java.util.Date;

import main.Citizen;
public class Refree extends Citizen {
   private int totalRedCards=0;
   private int totalYellowCards=0;
   private Cards cards=new Cards();
   public Refree(String nId, Date dateOfBirth, char sex, String names) {
    super(nId, dateOfBirth, sex, names);
}

public Refree() {
}

public Refree(String names) {
    super(names);
}

public Cards.card giveCard(String givencard){
    Cards.card card=cards.getCard(givencard);
    if(card.ordinal()==0){
        totalYellowCards+=1;
    }
    else
    totalRedCards+=1;
      return card;
   }

public int getTotalRedCards() {
    return totalRedCards;
}
public void setTotalRedCards(int totalRedCards) {
    this.totalRedCards = totalRedCards;
}
public int getTotalYellowCards() {
    return totalYellowCards;
}
public void setTotalYellowCards(int totalYellowCards) {
    this.totalYellowCards = totalYellowCards;
}
   

}