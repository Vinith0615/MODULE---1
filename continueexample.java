public class continueexample {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++) {
            if(i==3){
                //System.out.println("skipping i = " +i);
                continue;

            }
            System.out.println("i = " +i);
        }
    }
}
