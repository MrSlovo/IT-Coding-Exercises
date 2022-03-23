
public class WeddingUI {

  public static void main(String[] args) {
    VenueManager vm = new VenueManager("weddings.txt");
    System.out.println(vm.listAllWeddings());
    System.out.println(vm.processBookings());
  }
}
