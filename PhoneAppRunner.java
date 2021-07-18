import java.util.Scanner;

public class PhoneAppRunner {

    // in here instantiate the Phone object
    static Phone userPhone = new Phone("Samsung","s6",123456789,
            1234,null);
    public static void main(String[] args) {
        welcome();
        String option;
        Scanner scanner = new Scanner(System.in);
        /*
        Implement the logic for passcode.
        You need to first ask the user passcode of the phone
        if the user input is not same with phone.passCode then the user
        should not be able to open the phone and see the below options
         */
        System.out.println("Enter your phone Pass Code: ");
        int userInput = scanner.nextInt();
        while(userInput != userPhone.passcode){
            System.out.println("You have entered wrong passcode! Please try again");
            userInput = scanner.nextInt();
        }



        do {
            printOptions();
            option=scanner.next();
            makeAChoice(option);
        }while(!option.equals("0"));
        System.out.println("Thank you for working with us");
    }
    private static void makeAChoice(String choice) {
        Scanner input = new Scanner(System.in);
        switch (choice) {
            case "1":
                System.out.println("Enter First Name: ");
                String fName = input.next();
                System.out.println("Enter Last Name: ");
                String lName = input.next();
                System.out.println("Enter Company: ");
                String company = input.next();
                System.out.println("Enter Phone Number: ");
                String phoneNumber = input.next();
                System.out.println("Enter Email: ");
                String email = input.next();
                System.out.println("Enter City: ");
                String city = input.next();

                Contact newContact = Contact.getInstance(fName,lName,company,phoneNumber,email,city);
                userPhone.addContact(newContact);
                break;
            case "2":
                userPhone.printAllContacts();
                break;
            case "3":
                System.out.println("Enter phone number that you want to update:");
                String oldPhoneNumber = input.next();
                System.out.println("Enter a new phone number:");
                String newPhoneNumber = input.next();
                userPhone.updatePhoneNumber(oldPhoneNumber,newPhoneNumber);
                break;
            case "4":
                System.out.println("Enter phone number that you want to search:");
                String phoneNumToSearch = input.next();
                userPhone.searchByPhone(phoneNumToSearch);
                break;
            case "5":
                System.out.println("Enter the name that you want to search:");
                String nameToSearch = input.next();
                userPhone.searchByName(nameToSearch);
                break;
            case "6":
                System.out.println("Enter phone number that you want to update their city:");
                String phoneToUpdateCity = input.next();
                System.out.println("Enter new city name: ");
                String newCity = input.next();
                userPhone.updateCity(phoneToUpdateCity,newCity);
                break;
            case "7":
                System.out.println("Enter Email that you want to update:");
                String oldEmail = input.next();
                System.out.println("Enter new Email: ");
                String newEmail = input.next();
                //userPhone.updateEmail(oldEmail,newEmail);
                break;
            case "0":
                break;
            default:
                System.out.println("Wrong choice!");
        }



    }

    public static void welcome() {

        System.out.println("Welcome to the Phone Application");
    }

    public static void printOptions() {

        System.out.println("Hello. Please choose on of the following options");
        System.out.println("1 - For new Contact");
        System.out.println("2 - To print all Contacts' Full Name  and Phone Number");
        System.out.println("3 - Update Contact Phone number");
        System.out.println("4 - Find Person information with Phone Number");
        System.out.println("5 - Find Phone number with Contact Name");
        System.out.println("6 - Update City information for Contact");
        System.out.println("7 - Update Email address information for Contact");
        System.out.println("0 - To exit");
    }
}