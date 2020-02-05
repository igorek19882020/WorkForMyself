package Minsk.Samost.R.First;

public class Task {
    public static void main(String[] args) {
       int mT[][] = new int[10][10];
               for (int i = 0;i<10;i++){
                   for(int j=  0;j<10;j++){
                       mT[i][j] = (i+1)*(j+1);
                       System.out.printf("%7d", mT[i][j]);
                   }
                   System.out.println();
               }
    }
}
