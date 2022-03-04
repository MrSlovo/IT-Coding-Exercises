public class Wedding {
  private String bride;
  private String groom;
  private String weddingDate;
  private String venue;
  private int guests;

  public Wedding(String inBride, String inGroom, String inDate, String inVenue, int inGuests) {
    this.bride = inBride;
    this.groom = inGroom;
    this.weddingDate = inDate;
    this.venue = inVenue;
    this.guests = inGuests;
  }

  public String getWeddingDate() {
    return weddingDate;
  }

  public String getVenue() {
    return venue;
  }

  public int getGuests() {
    return guests;
  }

  public boolean equals(String weddingDate, String venue) {
    return venue.equals(this.venue) && weddingDate.equals(this.weddingDate);
  }

  public String toString() {
    return bride + " & " + groom + "\t\t" + guests + " " + "guests";
  }
}