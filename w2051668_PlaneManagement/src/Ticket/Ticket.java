package Ticket;

import Person.Person;

public class Ticket{
    private Person person;
    private int row_number;
    private int seat_number;
    private double price;

    public Ticket(Person person, int row_number, int seat_number, double price) {
        this.row_number = row_number;
        this.seat_number = seat_number;
        this.price = price;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getRow_number() {
        return row_number;
    }

    public void setRow_number(int row_number) {
        this.row_number = row_number;
    }

    public int getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(int seat_number) {
        this.seat_number = seat_number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void print(Ticket ticket){
        System.out.println(ticket.getPerson().getName());
        System.out.println(ticket.getPerson().getSurname());
        System.out.println(ticket.getPerson().getEmail());
        System.out.println(ticket.getRow_number());
        System.out.println(ticket.getSeat_number());
        System.out.println(ticket.getPrice());

    }
}