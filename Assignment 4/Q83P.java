/* 
A
A B      
A   C
A     D
A B C D E
*/
class Q83P
{
    public static void main(String[] args) {
      int n=5;
        for (int i = 5; i >=1; i--) { 
            for (int j=5; j>=i;j--){ 
              if(j==1||j==i||i==n){
                System.out.print(i);
              }
              else{
                System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}
