public class Zadanie3 {
    public static void main(String[] args) {
        for(int i=1;i<8;i+=2){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<8;i+=2){
            for(int j=i;j<6;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
