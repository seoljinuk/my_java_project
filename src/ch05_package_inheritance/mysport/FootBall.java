package ch05_package_inheritance.mysport;

public class FootBall extends Sport{
    private int halves ;
    private int goals ;

    public FootBall(String name, int entry, int halves, int goals) {
        super(name, entry);
        this.halves = halves ;
        this.goals = goals ;
    }

    public void display() {
        super.showInfo();
        String message = halves + "개의 하프 타임으로 구성이 되며, " + this.goals + "골이 들어 갔습니다.";
        System.out.println(message);
    }
}
