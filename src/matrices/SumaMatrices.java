
package matrices;

public class SumaMatrices {
   
    public static void main(String[] args) {
        int m[][]=new int [3][3];
        int m2[][]=new int [3][3];
        int r[][]=new int [3][3];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j]=(int)(Math.random()*5);
            }
        }
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                m2[i][j]=(int)(Math.random()*5);
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                r[i][j]=m[i][j]+m2[i][j];
            }
        }
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print("[ "+m[i][j]+" ]"); 
            }
             if(i==1){
            System.out.print("  +  ");
            }else{
            System.out.print("     ");
            }
            for (int j = 0; j < m2.length; j++) {
            System.out.print("[ "+m2[i][j]+" ]");
            }
            if(i==1){
            System.out.print("  =  ");
            }else{
            System.out.print("     ");
            }
            for (int j = 0; j < r.length; j++) {
                System.out.print("[ "+r[i][j]+" ]");
            }
            System.out.println("");
        }
    }
}
