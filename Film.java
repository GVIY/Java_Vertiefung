public class Film{
  public String titel;
  public double preis; // in EUR
  public int    laenge; // in min
  public String beschreibung;
  public String erscheinungsdatum; // ISO-8601 (JJJJ-MM-TT)

  public Film(String titel, double preis, int laenge, String beschreibung, String erscheinungsdatum){
    this.titel = titel;
    this.beschreibung = beschreibung;
    this.erscheinungsdatum = erscheinungsdatum;
    this.preis = preis;
    this.laenge = laenge;
  }


    public String toString(){
      return titel+" "+beschreibung+" "+erscheinungsdatum+" "+preis+" "+laenge;
    }

    public int compareTo(Film o){
      if(erscheinungsdatum.compareTo(o.erscheinungsdatum) < 0)
        return -1;
      if(erscheinungsdatum.compareTo(o.erscheinungsdatum) > 0)
        return 1;
      return 0;
    }
}
