// Check the deferentce between two numbers and add the before printed start
// *-->     1 times
// **-->    1+1
// ****-->  2+2 previous count +i
class Q101{
  public static void main(String[] args) {
    int add=1;
    for(int i=1;i<=5;i++){
      for(int j=1;j<=add;j++){
        System.out.print("*");
      }
      add+=i;
      System.out.println();
    }
  }
}