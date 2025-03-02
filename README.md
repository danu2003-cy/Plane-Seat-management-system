# Plane Management System

## Overview
The **Plane Management System** is a Java-based console application that allows users to manage seat reservations on a plane. It provides functionalities such as buying, canceling, and searching for seats, as well as displaying the seating plan and ticket details.

## Features
- **Buy a seat**: Reserve a seat by selecting a row and seat number.
- **Cancel a seat**: Cancel an existing seat reservation.
- **Find the first available seat**: Identify the next available seat on the plane.
- **Show seating plan**: Display the seating arrangement with occupied and available seats.
- **Print ticket details**: Display ticket information including passenger details.
- **Search for a ticket**: Find ticket information by passenger details.

## Installation & Setup
### Prerequisites
- Java Development Kit (**JDK 8 or higher**) installed.
- An IDE like **IntelliJ IDEA**, **Eclipse**, or **VS Code** (optional but recommended).

### Steps to Run the Application
1. Clone this repository or download the project files:
   ```bash
   git clone <repository_url>
   cd PlaneManagementSystem
   ```
2. Compile the Java files:
   ```bash
   javac PlaneManagement.java
   ```
3. Run the application:
   ```bash
   java PlaneManagement
   ```

## Usage
Once the program starts, you will be presented with the main menu:
```
*******************************
*             Menu            *
*******************************
1) Buy a seat
2) Cancel a seat
3) Find first available seat
4) Show seating plan
5) Print tickets information and total sales
6) Search ticket
0) Quit
Please select an option:
```
- Select an option by entering the corresponding number.
- Follow the prompts to complete actions like seat booking or cancellation.
- Enter **0** to exit the program.

## Seat Arrangement
The seating arrangement consists of **4 rows (A, B, C, D)** with different seat counts:
- **Rows A & D**: 14 seats each
- **Rows B & C**: 12 seats each

Example of the seating plan display:
```
A: OOXOXOXOOXOXOO  (O = Available, X = Occupied)
B:  OXOXOXOXOXOX   
C:  OOXOXOXOOXOX   
D: OOXOXOXOXOXOXO  
```

## Classes & Code Structure
- **`Person`**: Represents a passenger with name, surname, and email.
- **`Ticket`**: Stores ticket details including seat number and price.
- **`PlaneManagement`**: Main class that handles seat management and user interactions.

## Future Improvements
- Implement a graphical user interface (GUI) for a better user experience.
- Store booking data in a file or database for persistence.
- Add an admin panel to manage bookings more effectively.

## Author
**Dhanushi Dewmindi Panamulla Arachchi**

## License
This project is licensed under the MIT License.
