// 1 2 2 4 8 32 256 
class Q1 {
  void series(int num){
    int num1 = 1;
    int num2 = 2;
    
    System.out.print(num1+" ");
      System.out.print(num2+ " ");
    
    for(int i=3;i<=num;i++){
      int res=num1*num2;
      System.out.print(res+" ");
      
      num1 = num2;
      num2 = res;
    }
  }  

  public static void main(String[] args) {
    Q1 obj = new Q1();
    obj.series(7);
  }
}
