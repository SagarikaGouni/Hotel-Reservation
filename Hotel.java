import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
  Scanner input = new Scanner(System.in);
  List<Reservation> hotel = new ArrayList<Reservation>(50);
  String[] names = new String[50];
  int[] rooms = new int[50];
  /**
   *Hotel class 
   *wrapped normally.... 
   */
  public int reserveRoom(String personName) {
    Reservation reservation = new Reservation();
    int index = 0;
    reservation.personName = personName;
    names[index] = reservation.personName;
    System.out.println("Enter room number: ");
    reservation.roomNumber = input.nextInt();
    rooms[index] = reservation.roomNumber;
    hotel.add(reservation);
    if (index == 50) {
      return -1;
    } else {
      return reservation.roomNumber;
    }
  }
  
  /**
  *reserve room method
  *wrapped normally.....
  */
  public boolean reserveRoom(String person, int roomNum) {
    for (int index = 0; index < rooms.length; index++) {
      if (rooms[index] == roomNum) {
        return false;
      }
    }
    return true;
  }
  
  /**
  *Cancel reservation method
  *wrapped normally....
  */
  public void cancelReservations(String person) {
    for (Reservation r: hotel) {
      if (r.personName.equals(person)) {
        hotel.remove(r);
        System.out.println(hotel);
        break;
      }
    }
  }
  
  /**
  *print reservation method
  *wrapped normally.......
  */
  public void printReservations() {
    for (Reservation r: hotel) {
      System.out.println("Person Name: " +  r.personName + " , "  + "Room Number: " + r.roomNumber);
    }
    System.out.println("The Reserved rooms are: " + hotel.size());
    System.out.println("Empty rooms are : " + (10 - hotel.size()));
  }
}
