public class positivenegativezero {
    public static void main(String[] args) {
        int num=-5;
        String result=(num>0)?"positive":(num<0)?"negative":"zero";
        System.out.println("the number " +num+ " is " +result);
    }
}
