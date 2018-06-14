package automat;

class IdleAutomat extends Automat {
    IdleAutomat(int gums){
        super(gums);
    }

    @Override
    public CoinInsideAutomat insertCoin() {
        System.out.println("Inserting coin.");
        System.err.println("IdleAutomat -> CoinInsideAutomat");
        return new CoinInsideAutomat(gums);
    }
    @Override
    public IdleAutomat fill() {
        System.out.println("Filling.");
        System.err.println("IdleAutomat -> IdleAutomat");
        return new IdleAutomat(gums);
    }
}
