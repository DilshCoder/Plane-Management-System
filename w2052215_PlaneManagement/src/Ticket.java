import java.io.FileWriter;
import java.io.IOException;
public class Ticket {
    private int row;
    private int seat;
    private double price;
    private person person;

    // Constructor
    public Ticket(int row, int seat, double price, person person) {
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.person = person;
    }

    // Getters and Setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public person getPerson() {
        return person;
    }

    public void setPerson(person person) {
        this.person = person;
    }

    // Constructor, getters, and setters

    public void save() {
        String filename = (char) ('A' + row) + String.valueOf(seat) + ".txt";

        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Ticket Information\n");
            writer.write("Row: " + (char) ('A' + row) + "\n");
            writer.write("Seat: " + seat + "\n");
            writer.write("Price: €" + price + "\n");
            writer.write("Passenger: " + person.getName() + " " + person.getSurname() + "\n");
            writer.write("Email: " + person.getEmail() + "\n");
            writer.close();
            System.out.println("Ticket information saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the ticket information to file.");
            e.printStackTrace();
        }
    }

    // Method to print information of a Ticket
//    public void printInfo() {
//        System.out.println("Ticket Information:");
//        System.out.println("Row: " + row);
//        System.out.println("Seat: " + seat);
//        System.out.println("Price: $" + price);
//        System.out.println("Person Information:");
//        person.printInfo(); // Call the printInfo method of Person object
//    }
}
