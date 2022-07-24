package chapter6;

public class FunctionApp {
    public static void main(String[] args) {
//        sayHello();
//        blackboardPunishment(5);
        System.out.println("The price with 10% off is: " + getTenPercentOffDiscountPrice(20000));
        System.out.println("The price with 40% off is: " + getDiscountPrice(20000, 40));
        System.out.println("The price with 20% off is: " + getDiscountPrice(20000.0, 20));

    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void blackboardPunishment(int repeatNumber){
        for(int i=1; i <= repeatNumber; i++){
            System.out.println("Being right sucks!");
        }
    }

    static double getTenPercentOffDiscountPrice(int price){
        return price * 0.9;
    }

    static double getDiscountPrice(int price, int percent) {
        return price * percent / 100.0;
    }

    static double getDiscountPrice(double price, int percent){
        return price * percent / 100;
    }
}
