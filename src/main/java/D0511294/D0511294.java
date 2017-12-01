package D0511294;

public class D0511294 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for( int k=4; k>i+1; k--){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
