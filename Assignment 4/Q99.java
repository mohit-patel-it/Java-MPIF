class Q99{
  public static void main(String []args){
    int n=5;
    for(int i=n;i>=1;i--){
      for(int j=i;j>=1;j--){
        if(i==5||j==1||i==j)
          System.out.print(i);
        else 
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}