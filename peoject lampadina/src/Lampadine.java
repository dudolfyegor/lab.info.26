public class Lampadine {

    private boolean accesa;


    public Lampadine() {
        this.accesa = false;
    }

    public void accendi() {
        accesa = true;
    }

    public void spegni() {
        accesa = false;
    }

    public boolean accesa() {
        return accesa;
    }
}