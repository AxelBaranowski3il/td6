package Ex11;

public class Triplet<T> {
  private T element1;
  private T element2;
  private T element3;

  public Triplet(T element1, T element2, T element3){
    this.element1 = element1;
    this.element2 = element2;
    this.element3 = element3;
  }
  public T getPremier(){return element1;}
  public T getSecond(){return element2;}
  public T getTroisieme(){return element3;}

  public String toString(){
    return getPremier() + " - " + getSecond() + " - " + getTroisieme();
  }
}