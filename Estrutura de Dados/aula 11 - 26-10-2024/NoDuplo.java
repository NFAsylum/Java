public class NoDuplo {
    private int info;
    private NoDuplo anterior, proximo;

    public NoDuplo(int newInfo){
        info = newInfo;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo newAnterior) {
        anterior = newAnterior;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo newProximo) {
        proximo = newProximo;
    }

    @Override
    public String toString() {
        return "[" + info + "]";
    }
}
