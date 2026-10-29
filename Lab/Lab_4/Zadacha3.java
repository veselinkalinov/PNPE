package Lab.Lab_4;

import java.util.Scanner;

class EventException extends Exception {
    public EventException(String message) {
        super(message);
    }
}

class EventLog {
    private String[] events;
    private int count;

    public EventLog() {
        events = new String[100];
        count = 0;
    }

    public EventLog(String[] initialEvents) throws EventException {
        this();
        for (int i = 0; i < initialEvents.length; i++) {
            AddEvent(initialEvents[i]);
        }
    }

    public int getCount() {
        return count;
    }

    public String getEvent(int number) throws EventException {
        if (number < 1 || number > count) {
            throw new EventException("Nqma subitie s tozi nomer!");
        }
        return events[number - 1];
    }

    public void setEvent(int number, String event) throws EventException {
        if (number < 1 || number > count) {
            throw new EventException("Nqma subitie s tozi nomer!");
        }
        events[number - 1] = event;
    }

    public void AddEvent(String event) throws EventException {
        if (count == 100) {
            throw new EventException("Spisukut e pulen!");
        }
        events[count] = event;
        count++;
    }

    public void Print() {
        if (count == 0) {
            System.out.println("Nqma subitiq.");
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + events[i]);
        }
    }

    public void EditEvent(int number, String newEvent) throws EventException {
        setEvent(number, newEvent);
    }

    public void RemoveEvent(int number) throws EventException {
        if (number < 1 || number > count) {
            throw new EventException("Nqma subitie s tozi nomer!");
        }
        for (int i = number - 1; i < count - 1; i++) {
            events[i] = events[i + 1];
        }
        count--;
        events[count] = null;
    }
}

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventLog log = new EventLog();
        int choice;

        do {
            System.out.println("\n1. Dobavi subitie");
            System.out.println("2. Pokaji subitiqta");
            System.out.println("3. Redaktirai subitie");
            System.out.println("4. Iztrii subitie");
            System.out.println("0. Izhod");
            System.out.print("Izbor: ");
            choice = Integer.parseInt(scanner.nextLine());

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Subitie: ");
                        log.AddEvent(scanner.nextLine());
                        break;
                    case 2:
                        log.Print();
                        break;
                    case 3:
                        System.out.print("Nomer: ");
                        int editNumber = Integer.parseInt(scanner.nextLine());
                        System.out.print("Novo subitie: ");
                        log.EditEvent(editNumber, scanner.nextLine());
                        break;
                    case 4:
                        System.out.print("Nomer: ");
                        int removeNumber = Integer.parseInt(scanner.nextLine());
                        log.RemoveEvent(removeNumber);
                        break;
                    case 0:
                        System.out.println("Krai.");
                        break;
                    default:
                        System.out.println("Nevaliden izbor!");
                }
            } catch (EventException e) {
                System.out.println(e.getMessage());
            }
        } while (choice != 0);

        scanner.close();
    }
}
