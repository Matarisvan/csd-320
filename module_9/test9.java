package module_9;

public class test9 {
    public static void main(String[] args) {
        
        System.out.println("");
        String[] bookie = {"big head", "malcriada", "tiny", "beautiful"};
        for (int i = 0; i < bookie.length; i++) {
            System.out.println(bookie[i]);
        
        }
        System.out.println("");

        for (String j : bookie) {
            System.out.println(j);
        }

        System.out.println("");

        int [][] bookNum = {{1,2,3,4}, {5,6,7}} ;
        for (int i = 0; i < bookNum.length; i++ ){
            for (int j = 0; j < bookNum[i].length; j++){
                System.out.println(bookNum[i][j]);
            }
        }
        
    }    
}
