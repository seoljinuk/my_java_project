package ch05_package_inheritance.general;

public class Americano03 extends Beverage03  {
    private double waterAmount ; // 투입하는 물의 양

    public Americano03(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount ;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("투입된 물의 량 : " + this.waterAmount);
        System.out.println();
    }
}
