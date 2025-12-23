public class PatternsNew {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


    System.out.println();
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j <= i; j++) {
            if (i==0) {
                System.out.print("A");
            }else if (i==1) {
                System.out.print("B");
            }else if(i==2){
                System.out.print("C");
            }else{
                System.out.print("D");
            }
        }System.out.println();
    }
    }
}
