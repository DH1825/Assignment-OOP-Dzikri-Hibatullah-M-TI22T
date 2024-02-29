public class Looping {

  public static void main(String[] args) {
    for (int i = 1; i <= 11; i += 2) {
      System.out.println("a: " + i);
    }

    for (int i = 25; i >= 5; i -= 5) {
      System.out.println("b: " + i);
    }

    for (int i = -4; i <= 8; i += 3) {
      System.out.println("c: " + i);
    }

    int num1 = 0, num2 = 1, nextNum;
    System.out.println("d: " + num1);
    System.out.println("d: " + num2);
    for (int i = 2; i <= 5; i++) {
      nextNum = num1 + num2;
      System.out.println("d: " + nextNum);
      num1 = num2;
      num2 = nextNum;
    }

    int num3 = 0, num4 = 1, nextno;
    System.out.println("e: " + num3);
    for (int i = 2; i <= 5; i++) {
      nextno = num3 + num4;
      System.out.println("e: " + nextno);
      num3 = num4;
      num4 = nextno;
      System.out.println("e: " + nextno);
    }
  }
}
