/**
 * Created by ricardo on 2/26/2015.
 */

import java.util.*;

public class Phonebook {

    ArrayList<Person> personen = new ArrayList<Person>();

    public void addPerson(Scanner scan) {
        System.out.println("Fill in your name");
        String addname = scan.nextLine();
        System.out.println("Fill in your adress");
        String addadress = scan.nextLine();
        System.out.println("Fill in your city");
        String addcity = scan.nextLine();
        System.out.println("Fill in your phonenumber");
        String addphonenumber = scan.nextLine();
        System.out.println("Your data has been saved!");
        Person addperson = new Person(addname, addadress, addphonenumber, addcity);
        personen.add(addperson);
    }

    public void removePerson(Scanner scan, String newLine) {
        listPersons(newLine);
        if (personen.isEmpty() == true) {
            addPerson(scan);
        } else {
            System.out.println("Insert the ID of the person to be removed");
            int ID = Integer.parseInt(scan.nextLine());
            try {
                personen.remove(ID);
                System.out.println("Person with the ID of " + ID + " has been removed");
            } catch (Exception ex) {
                System.out.println("There is no person with this ID, please select a different ID");
                removePerson(scan, newLine);
            }
        }
    }

    public void listPersons(String newLine) {
        int ID = 0;
        if (personen.isEmpty()) {
            System.out.println("There is no person added yet. add a person first");
        }
        for (int i = 0; i < personen.size(); i++) {
            System.out.println("ID:" + ID + newLine + " name: " + personen.get(i).name + newLine + " adress: " + personen.get(i).adress + newLine + " city: " + personen.get(i).city + newLine + " phonenumber: " + personen.get(i).phonenumber);
            ID++;

        }

    }
    public void editPerson(Scanner scan,String newLine){
        listPersons(newLine);
        System.out.println("fill in the ID of the person to be changed");
        int personToEdit = Integer.parseInt(scan.nextLine());
        System.out.println("fill in what to edit, name, adress, city or phonenumber. case sensitive");
        String whatToEdit = scan.nextLine();
        System.out.println("what would you like to change it to?");
        String changeTo = scan.nextLine();
        try {
            if (whatToEdit.equals("name")) {
                personen.get(personToEdit).setName(changeTo);
            } else if (whatToEdit.equals("adress")) {
                personen.get(personToEdit).setAdress(changeTo);
            } else if (whatToEdit.equals("city")) {
                personen.get(personToEdit).setCity(changeTo);
            } else if (whatToEdit.equals("phonenumber")) {
                personen.get(personToEdit).setPhonenumber(changeTo);
            }
        }catch(Exception ex){
            System.out.println("please try again");
            editPerson(scan, newLine);
        }
        finally {
            System.out.println("the requested change has been made. type /listpersons to check the change");
        }
    }

    //public void sortlist(){
     //  Collections.sort(personen);
    //}

}
