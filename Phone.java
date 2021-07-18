
import java.util.ArrayList;

public class Phone {

    /*
       1- Create instance variables
       phoneBrand, phoneModel, SerialNumber, passCode and ArrayList<Contact> allContact
       2- Create constructor to initialize this variables
       3- Create the method to add new contact this method take one parameter as Contact
       In this contact list only two things are unique Phone number and email address.
       You can not store same phone number and email address two times
       because of that before adding the new contact you need to make sure this phone
       number is not exist in your Contact arraylist.

       4- Create the method to print all Contacts' first and last name with phone number
       5- Create the method to update person's phone number. This method takes two
       parameter old phone number and new phone number
       6- Create the method to search with phone number and print all other information
       for person
       7- create the method to search with name of person and print phone number
       of that person
       8- Create the method to update city of person with new city, you need two
       parameter one is phone number of person another is new email address.
       9- Create the method to update email address for person with new email address,
       you need two parameter oldEmail and newEmail

     */
    //1---------------------------------------------------------------
    String phoneBrand;
    String phoneModel;
    long serialNumber;
    int passcode;
    public ArrayList<Contact> allContact = new ArrayList<Contact>();;
    //2--------------------------------------------------------------
    public Phone(String phoneBrand, String phoneModel, long serialNumber, int passcode, ArrayList<Phone> allContact) {
        this.phoneBrand = phoneBrand;
        this.phoneModel = phoneModel;
        this.serialNumber = serialNumber;
        this.passcode = passcode;

    }
    //3------------------------------------------------------------
    public boolean addContact(Contact newContact){
        boolean canBeAdded = true;
        if(allContact==null){
            return allContact.add(newContact);
        }
        for(Contact user: allContact){
            if(user.getEmails().equals(newContact.getEmails())
                    || user.getPhoneNumber().equals(newContact.getPhoneNumber())){
                canBeAdded = false;
            }
        }
        if(canBeAdded){
            return allContact.add(newContact);
        }else{
            System.out.println("New contact cannot be added!");
            return false;
        }
    }

    //4------------------------------------------------------------
    public void printAllContacts(){
        if(allContact==null){
            System.out.println("No contact information found!");
            return;
        }
        for(Contact user: allContact){
            System.out.print("First Name: ");
            System.out.println(user.getFirstName());
            System.out.print("Last Name: ");
            System.out.println(user.getLastName());
            System.out.print("Phone Number: ");
            System.out.println(user.getPhoneNumber());
        }
        /*
        * for(int i=0; i<allContact.size(); i++){
        *   System.out.print("First Name: ");
            System.out.println(allContact[i].getFirstName());
            System.out.print("Last Name: ");
            System.out.println(allContact[i].getLastName());
            System.out.print("Phone Number: ");
            System.out.println(allContact[i].getPhoneNumber());
        * }
        *
        * */

    }
    //5----------------------------------------------------------------------
    public boolean updatePhoneNumber(String oldPhoneNumber,String newPhoneNumber){
        //checking if newPhoneNumber is already in my contact list or not
        if(allContact==null){
            System.out.println("No contact found!");
            return false;
        }
        for(Contact user: allContact){
            if(user.getPhoneNumber().equals(newPhoneNumber)){
                System.out.println("You cannot update with same number that already in contacts");
                return false;
            }
        }

        for(Contact user: allContact){
            if(user.getPhoneNumber().equals(oldPhoneNumber)){
                user.setPhoneNumber(newPhoneNumber);
                return true;
            }
        }
        System.out.println("No contact information found!");
        return false;
    }
    //6----------------------------------------------------------------------
    public boolean searchByPhone(String numToSearch){
        if(allContact==null){
            System.out.println("No contact found!");
            return false;
        }
        for(Contact user: allContact){
            if(user.getPhoneNumber().equals(numToSearch)){
                System.out.println("First Name: " + user.getFirstName());
                System.out.println("Last Name: " + user.getLastName());
                System.out.println("Company: " + user.getCompany());
                System.out.println("Phone Number: " + user.getPhoneNumber());
                System.out.println("Email: " + user.getEmails());
                System.out.println("City: " + user.getCity());
                return true;
            }
        }
        System.out.println("No contact information found!");
        return false;
    }
    //7----------------------------------------------------------------------
    public boolean searchByName(String name){
        if(allContact==null){
            System.out.println("No contact found!");
            return false;
        }
        for(Contact user: allContact){
            if(user.getFirstName().equals(name) ||user.getLastName().equals(name)){
                System.out.println("Phone Number: " + user.getPhoneNumber());
                return true;
            }
        }
        System.out.println("No contact information found!");
        return false;
    }
    //8---------------------------------------------
    public boolean updateCity(String numToSearch, String newCity){
        if(allContact==null){
            System.out.println("No contact found!");
            return false;
        }
        for(Contact user: allContact){
            if(user.getPhoneNumber().equals(numToSearch)){
                user.setCity(newCity);
                return true;
            }
        }
        System.out.println("No contact information found!");
        return false;
    }




/*
//    public static void main(String[] args) {
//        Phone TsetsgesPhone=new Phone;
//        TsetsgesPhone.phoneBrand = "iphone11".
//        TsetsgesPhone.phoneModel = "USA";
//        TsetsgesPhone.serialNumber = 1236549849843;
//        TsetsgesPhone.passcode = 123456
//
//        Contact eej = new Contact();
//        eej.setFirstName("philip");
//        eej.setLastName("josh");
//        eej.setPhoneNumber("+198979616");
//        TsetsgesPhone.addContact(eej)
//
//        TsetsgesPhone.updatePhoneNumber(+198979616, +8888888888888)

//
//
//

//        ArrayList<Contact> allContact;
//        ph.setFirstName("philip");
//        ph.setLastName("josh");
//        ph.setPhoneNumber("+198979616");
//        ph.updatePhoneNumber("+198979616", "+188888888");
//
//    }
//

*/






//
//    public static void main(String[] args) {
//        ArrayList<Contact> cont = new ArrayList<>();
//        cont.add();
//    }
//










}


