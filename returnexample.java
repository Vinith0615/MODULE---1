class returnexample {
    public static void main(String[] args) {
        System.out.println("start of program");
        checkNumber(5);
        System.out.println("End of program");
    }

public static void checkNumber(int num) {
    if(num<0) {
        System.out.println("negative number");
        return ;
    }
    System.out.println("positive number or zero");
}
}