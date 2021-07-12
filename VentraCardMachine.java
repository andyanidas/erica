import java.util.ArrayList;
public class VentraCardMachine {
    private String location;
    public ArrayList<VentraCard> getAllCards() {
        return allCards;
    }
    private ArrayList<VentraCard> allCards;
    public VentraCardMachine(String location) {
        this.location = location;
        this.allCards = new ArrayList<VentraCard>();
    }
    public boolean addCard(VentraCard card) {
        /*
         This method is taking the parameter as a VentraCard.
         if this VentraCard is not registered before this method will add the VentraCard to the allCards(ArrayList).
         Using VentraCard cardNumber you can verify that the card is in allCards or not
         */
        if(allCards.contains(card)){
            return false;
        }else{
            allCards.add(card);
            return true;
        }
    }
    //  you have an arrayList that stories all the ventra card
    // from this arrayList
    public void printCardNumbers(ArrayList<VentraCard> cards) {
        /*
         This method is taking one parameter as a list of cards and it will print all the card number
         which is available in this list
         */

        for (VentraCard card : cards) {
            System.out.println(card.getCardNUmber());
        }
    }
    public boolean updateCardNumber(long oldCardNumber, long newCardNumber) {
        for (VentraCard card : allCards) {
            if (card.getCardNUmber() == oldCardNumber) {
                card.setCardNUmber(newCardNumber);
                return true;
            }
        }
        return false;
    }

        /*
        (do we have to write all those methods inside this updateCard method?)
        1-Create the method will take parameter as a list of cards and it will print all the card holders name
        2- Create the method will take three parameter as a cardNumber, oldEmail and newEmail.
        This method will replace old email address with
        new email address matching with cardNumber
        (if we find card with cardnumber why we need oldEmail? what is it for?)
        3- Create the method will take one parameter as a card number and it will remove the card from the
        list if card number if matching.
        If the card removed it will return true else will return false.
        4- Create the method will take the parameter as a phone number and it will print all card
        information connected with this phone number.
        5- Create the method will take two parameter as an oldCardNumber and newCardNumber.
        This method will update the old card number with new card number
     */

    public void printCardNames (){
        for (VentraCard card : allCards) {
            System.out.println(card.getFullName());
        }
    }
    public boolean replaceCardEmail(long cardNumber,String oldEmail,String newEmail){
        for (VentraCard card : allCards) {
            if (card.equals(cardNumber)) {
                card.setEmail(newEmail);
                return true;
            }
        }
        return false;
    }
    public boolean removeCard(long cardNumber){
        for (VentraCard card : allCards) {
            if (card.equals(cardNumber)) {
                allCards.remove(card);
                return true;
            }
        }
        return false;
    }

    public boolean printCardHolderNumber (String phoneNumb){
        for (VentraCard card : allCards) {
            if(card.getPhoneNumber().equals(phoneNumb)){
                System.out.println(card.getFullName());
                System.out.println(card.getCardNUmber());
                System.out.println(card.getEmail());
                System.out.println(card.getPhoneNumber());
                return true;
            }
        }
        System.out.println("Not found!");
        return false;
    }
}