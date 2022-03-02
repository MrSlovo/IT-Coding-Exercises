
public class ActorUI {

  public static void main(String[] args) {
    ActorDetail actorDetail = new ActorDetail("Actors.txt");
    actorDetail.sort();
    System.out.println(actorDetail.toString());
  }
}

