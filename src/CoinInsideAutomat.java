package automat;

class CoinInsideAutomat extends Automat {
    CoinInsideAutomat(int gums) {
        super(gums);
    }

    @Override
    public IdleAutomat returnCoin() {
        System.out.println("Returning coin.");
        System.err.println("CoinInsideAutomat -> IdleAutomat");
        return new IdleAutomat(gums);
    }
    @Override
    public GumReadyAutomat acceptPurchase() {
        System.out.println("Accepting purchase.");
        System.err.println("CoinInsideAutomat -> GumReadyAutomat");
        return new GumReadyAutomat(gums);
    }
}
