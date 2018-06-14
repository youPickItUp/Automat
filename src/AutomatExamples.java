package automat;

import automat.AutomatFactory;
import automat.Automat;

class AutomatExamples {
    public static void main(String [] args) {
        AutomatFactory factory = new AutomatFactory();

        //example 1
        Automat auto1 = factory.create(3);
        for(int i=0;i<3;++i) {
            auto1 = auto1.insertCoin();
            auto1 = auto1.acceptPurchase();
            auto1 = auto1.receiveGum();
        }
        auto1 = auto1.insertCoin(); //errors

        auto1 = auto1.fill();
        auto1 = auto1.insertCoin();
        auto1 = auto1.returnCoin();



        System.out.println("\n\n");
        System.out.println("####################");
        System.out.println("####################");
        System.out.println("####################");
        System.out.println("\n\n");
        System.err.println("\n\n");
        System.err.println("####################");
        System.err.println("####################");
        System.err.println("####################");
        System.err.println("\n\n");



        //example2
        Automat auto2 = factory.create(0);
        auto2 = auto2.insertCoin(); //errors

        auto2 = auto2.fill();
        auto2 = auto2.insertCoin();
        auto2 = auto2.returnCoin();

        auto2 = auto2.insertCoin();
        auto2 = auto2.acceptPurchase();
        auto2 = auto2.receiveGum();
    }
}
