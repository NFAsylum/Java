public class No {
    private Pessoa info;
    private No proximo;
    public No(Pessoa info) {
        this.info = info;
    }
    public Pessoa getInfo() {
        return info;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return "[" + info + "]";
    }

    
}