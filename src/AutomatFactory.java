package automat;

public class AutomatFactory {
    public Automat create(int gums) {
        if(gums == 0) {
            System.out.println("#EmptyAutomat.");
            System.err.println("#EmptyAutomat.");
            return new EmptyAutomat(gums);
        } else {
            System.out.println("#IdleAutomat.");
            System.err.println("#IdleAutomat.");
            return new IdleAutomat(gums);
        }
    }
}
