
public class WeddingUI {

  public static void main(String[] args) {
    VenueManager vm = new VenueManager("D:/code/school/IT-Coding-Exercises/Gr 12/Classwork/IT Prac 2016/weddings.txt");
    System.out.println(vm.listAllWeddings());
    System.out.println(vm.processBookings());
  }
}
