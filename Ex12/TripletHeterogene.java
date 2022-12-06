package Ex12;

public class TripletHeterogene<T, U, V> {
  private T premier;
  private U second;
  private V troisieme;
  
  public TripletHeterogene(T premier, U second, V troisieme){
    this.premier = premier;
    this.second = second;
    this.troisieme = troisieme;
  }

  public T getPremier() {return premier;}
  public U getSecond() {return second;}
  public V getTroisieme() {return troisieme;}

  public String toString() {
    return getPremier() + " - " + getSecond() + " - " + getTroisieme();
  }
}