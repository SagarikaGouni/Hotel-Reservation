
import java.util.Scanner;

public class Simulation {
  
  /**
   * Multiple lines of Simulation code written
   * wrapped normally.....
   */
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Hotel hotel1 = new Hotel();
    System.out.println("Choose option:\n1)reserve room\n2)request specific room");
    System.out.println("3)Cancel reservation\n4)Print reservation");
    int option = in.nextInt();
    while (option != 0) {
      if (option == 1) {
        System.out.println("Enter person name: ");
        String name = in.next();
        System.out.println("room number of " + name + " is: " + hotel1.reserveRoom(name));
      } else if (option == 2) {
        System.out.println("Enter person name:");
        String person = in.next();
        System.out.println("Enter the roomnumber the person wants: ");
        int roomNum = in.nextInt();
        if (!(hotel1.reserveRoom(person, roomNum))) {
          System.out.println("booking not possible");
        } else {
          System.out.println("Booking possible");
          Reservation r1 = new Reservation();
          r1.personName = person;
          r1.roomNumber = roomNum;
          hotel1.hotel.add(r1);
        }
      } else if (option == 3) {
        System.out.println("Enter name which need to cancel: ");
        String name = in.next();
        hotel1.cancelReservations(name);
      } else if (option == 4) {
        hotel1.printReservations();
      }
      System.out.println("Choose option:\n1)reserve room\n2)request specific room");
      System.out.println("3)Cancel reservation\n4)Print reservation");
      option = in.nextInt();
    }
  }
}
