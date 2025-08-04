package ch05_package_inheritance.mysport;

public class SportMain {
    public static void main(String[] args) {
        FootBall footBall = new FootBall("축구", 11, 1, 5) ;
        footBall.display();

        System.out.println();

        BaseBall baseBall = new BaseBall("야구", 9, 9, 0.412) ;
        baseBall.display();
    }
}
