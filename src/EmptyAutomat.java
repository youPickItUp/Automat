package automat;

class EmptyAutomat extends Automat {
    EmptyAutomat(int gums){
        super(gums);
    }

    @Override
    public IdleAutomat fill() {
        System.out.println("Filling.");
        System.err.println("EmptyAutomat -> IdleAutomat");
        return new IdleAutomat(gums + 1);
    }
}
