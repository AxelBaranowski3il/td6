package Ex11;

public class Main{
  public static void main(String[] args){
    Triplet <String> first = new Triplet<>("Jo", "Ugo", "Beber");
    System.out.println(first.toString());

    Triplet <Integer> second = new Triplet<>(1, 2, 3);
    System.out.println(second.toString());
  }
}