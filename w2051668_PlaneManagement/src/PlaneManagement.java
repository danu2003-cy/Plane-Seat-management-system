import java.util.Scanner;

import Person.Person;
import Ticket.Ticket;
import Ticket.Ticket.*;
import Person.Person.*;

public class PlaneManagement {
    // Assuming 14 seats in row A and D, and 12 seats in row B and C
    private static final int ROWS = 4;
    private static final int[] SEATS_PER_ROW = {14, 12, 12, 14};
    private static final char[] ROW_LABELS = {'A', 'B', 'C', 'D'};
    private static final int[][] seats = new int[ROWS][];

    public static void main(String[] args) {
        System.out.println("Welcome to the Plane Management application");
        initializeSeats();
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            displayMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    buySeat(scanner);
                    break;
                case 2:
                    cancelSeat(scanner);
                    break;
                case 3:
                    findFirstAvailable();
                    break;
                case 4:
                    showSeatingPlan();
                    break;
                case 5:
                    // Method to print tickets information and total sales
                    Person s = new Person();
                    new Person();
                    break;
                case 6:
                    // Method to search ticket

                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);

        scanner.close();
    }

    private static void initializeSeats() {
        for (int i = 0; i < ROWS; i++) {
            seats[i] = new int[SEATS_PER_ROW[i]];
        }
    }

    private static void displayMenu() {
        System.out.println("*******************************");
        System.out.println("*             Menu            *");
        System.out.println("*******************************");
        System.out.println("1) Buy a seat");
        System.out.println("2) Cancel a seat");
        System.out.println("3) Find first available seat");
        System.out.println("4) Show seating plan");
        System.out.println("5) Print tickets information and total sales");
        System.out.println("6) Search ticket");
        System.out.println("0) Quit");
        System.out.println("Please select an option:");
    }

    private static void buySeat(Scanner scanner) {
        System.out.println("Enter row letter (A, B, C, D):");
        char row = scanner.next().charAt(0);
        System.out.println("Enter seat number:");
        int seatNumber = scanner.nextInt();

        int rowIndex = getRowIndex(row);
        if (rowIndex == -1 || seatNumber < 1 || seatNumber > seats[rowIndex].length) {
            System.out.println("Invalid row or seat number.");
            return;
        }

        if (seats[rowIndex][seatNumber - 1] == 1) {
            System.out.println("Seat already sold.");
        } else {
            seats[rowIndex][seatNumber - 1] = 1;
            System.out.println("Seat successfully sold.");
        }
    }

    private static void cancelSeat(Scanner scanner) {
        System.out.println("Enter row letter (A, B, C, D):");
        char row = scanner.next().charAt(0);
        System.out.println("Enter seat number:");
        int seatNumber = scanner.nextInt();

        int rowIndex = getRowIndex(row);
        if (rowIndex == -1 || seatNumber < 1 || seatNumber > seats[rowIndex].length) {
            System.out.println("Invalid row or seat number.");
            return;
        }

        if (seats[rowIndex][seatNumber - 1] == 0) {
            System.out.println("Seat is already available.");
        } else {
            seats[rowIndex][seatNumber - 1] = 0;
            System.out.println("Seat successfully cancelled.");
        }
    }

    private static void findFirstAvailable() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    System.out.println("First available seat: " + ROW_LABELS[i] + (j + 1));
                    return;
                }
            }
        }
        System.out.println("No available seats.");
    }

    private static void showSeatingPlan() {
        for (int i = 0; i < ROWS; i++) {
            System.out.print((ROW_LABELS[i] == 'B' || ROW_LABELS[i] == 'C') ? " " : "");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] == 0 ? "O" : "X");
            }
            System.out.println();
        }
    }

    private static int getRowIndex(char row) {
        for (int i = 0; i < ROW_LABELS.length; i++) {
            if (ROW_LABELS[i] == Character.toUpperCase(row)) {
                return i;
            }
        }
        return -1;
    }
}
