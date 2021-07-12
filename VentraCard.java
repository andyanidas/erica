import java.util.Random;

public class VentraCard {
    private String fullName;
    private String phoneNumber;
    private String email;
    private long cardNUmber;

    public long getCardNUmber() {
        return cardNUmber;
    }
    public void setCardNUmber(long cardNUmber) {
        this.cardNUmber = cardNUmber;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }
    private long cardNumber;


    /*
    1- Create private instance variables for passenger fullName, phoneNumber, email, cardNumber
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to create the unique 16 digit cardNumber. Return type must be long and it will return 16 digit unique number
     */

    public VentraCard(String fullName, String phoneNumber, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.cardNUmber = cardNUmber;
    }

    public VentraCard createCard(String fullName, String phoneNumber, String email){
        this.fullName=fullName;
        this.email =email;
        cardNumber=createCardNumber();

           /*
    this method needs to return VentraCard according to the parameter
     */
        return new VentraCard(fullName,phoneNumber,email);
    }

    public long createCardNumber(){
        /*
        this method needs to return the 16 digit unique card number
         */

        Random rand = new Random();
        String cardNumberStore ="";
        for(int i =0; i<16; i++){
            int randomNumber = rand.nextInt(10);
            cardNumberStore+=randomNumber;
        }

        long cardNumber = Long.parseLong(cardNumberStore);


        return cardNumber;
    }
}