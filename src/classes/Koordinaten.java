package classes;

public class Koordinaten<T> {
    private T t;
    private T u;

    public Paar(T t, T u) {
        this.t = t;
        this.u = u; 
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getU() {
        return u;
    }

    public void setU(T u) {
        this.u = u;
    }

    
}
