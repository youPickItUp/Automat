package automat;

abstract class Automat {
    protected int gums;

    Automat(int gums) {
        this.gums = gums;
    }

    public Automat returnCoin() {
        System.out.println("Illegall operation.");
        System.err.println("Illegall operation.");
        return this;
    }
    public Automat insertCoin() {
        System.out.println("Illegall operation.");
        System.err.println("Illegall operation.");
        return this;
    }
    public Automat acceptPurchase() {
        System.out.println("Illegall operation.");
        System.err.println("Illegall operation.");
        return this;
    }
    public Automat receiveGum() {
        System.out.println("Illegall operation.");
        System.err.println("Illegall operation.");
        return this;
    }
    public Automat fill() {
        System.out.println("Illegall operation.");
        System.err.println("Illegall operation.");
        return this;
    }

}
