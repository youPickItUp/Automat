package automat;

class GumReadyAutomat extends Automat {
    GumReadyAutomat(int gums){
        super(gums);
    }

    @Override
    public Automat receiveGum() {
        System.out.println("Receiving gum.");

        if(gums > 1) {
            System.err.println("GumReadyAutomat -> IdleAutomat (Automat).");
            return new IdleAutomat(gums - 1);
        } else {
            System.err.println("GumReadyAutomat -> EmptyAutomat (Automat).");
            return new EmptyAutomat(0);
        }
    }
}
