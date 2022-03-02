
import java.io.File;
import java.util.Scanner;

public class ActorDetail {

  private Actor arrAct[] = new Actor[50];
  private int count = 0;

  private int MOVIE_ONE = 1;
  private int MOVIE_TWO = 5;
  private int MOVIE_THREE = 6;

  public ActorDetail(String textFile) {
    try {
      Scanner scFile = new Scanner(new File(textFile));
      while (scFile.hasNext()) {
        Scanner scLine = new Scanner(scFile.next()).useDelimiter("#");
        String actId = scLine.next();
        String firstName = scLine.next();
        String surname = scLine.next();
        Boolean isInternational = scLine.nextBoolean();
        int numOfMOvies = scLine.nextInt();
        int movieNum = scLine.nextInt();

        String movie = "";
        if (movieNum == MOVIE_ONE) {
          movie = "Trains";
        }
        if (movieNum == MOVIE_TWO) {
          movie = "Daddy's Road";
        }
        if (movieNum == MOVIE_THREE) {
          movie = "African Tart";
        }

        Actor actor = new Actor(actId, firstName, surname, isInternational, numOfMOvies, movie);
        arrAct[count] = actor;
        count++;
      }
    } catch (Exception e) {
      System.out.println("File does not exist");
    }
  }

  public void sort() {
    for (int i = 0; i < count - 1; i++) {
      for (int j = i + 1; j < count; j++) {
        if (arrAct[i].getFullName().compareTo(arrAct[j].getFullName()) > 0) {
          Actor temp = arrAct[i];
          arrAct[1] = arrAct[j];
          arrAct[j] = temp;
        }
      }
    }
  }

  private int getAverage() {
    int sum = 0;
    for (int i = 0; i < count; i++) {
      sum += arrAct[i].getNumMovies();
    }
    int avg = (int)Math.round(sum / count);
    return avg;
  }

  @Override
  public String toString() {
    String msg = "";
    for (Actor actor : arrAct) {
      if (actor == null) {
        break;
      }
      msg += actor + "\t" + actor.getMovie() + "\n";
    }
    return msg;
  }

}
