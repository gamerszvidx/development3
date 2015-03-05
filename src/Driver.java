/**
 * Created by ricardo on 2/26/2015.
 */

import java.util.*;

public class Driver {
    Phonebook telbook = new Phonebook();
    Scanner scan = new Scanner(System.in);
    String newLine = System.getProperty("line.separator");
    String[] Commands = {"/add - add a person to my beautiful program",
            "/list - for full list of persons",
            "/remove - to remove a made person",
            "/sortlist - sorts the phonebook (alphabetically)",
            "/exit - exits the phonebook program",
            "/edit - too edit an existing person"};
    private boolean running;
    private boolean startmessage = false;

    public static void main(String[] args) {

        Driver n = new Driver();
        n.run();

    }

    public void run() {
        running = true;
        startProgram();
    }

    public void startProgram() {
        while (running) {
            if (!startmessage) {
                System.out.println("Type /commands for all available commands.");
                startmessage = true;
            }
            String entered = scan.nextLine();
            if (entered.equals("/commands")) {
                for (int i = 0; i < Commands.length; i++)
                    System.out.println(Commands[i]);
            } else if (entered.equals("/add")) {
                telbook.addPerson(scan);
            } else if (entered.equals("/exit")) {
                exit();
            } else if (entered.equals("/edit")) {
                telbook.editPerson(scan,newLine);
            } else if (entered.equals("/list")) {
                telbook.listPersons(newLine);
            } else if (entered.equals("/remove")) {
                telbook.removePerson(scan,newLine);
            } else if (entered.equals("/sort")) {
                System.out.println("command not available yet");
            } else {
                System.out.println("Command not available. Type /commands for full list of commands");
            }
        }
    }
    public void exit(){
        System.out.println("thanks for using my phonebook!");
        running = false;
    }
}

