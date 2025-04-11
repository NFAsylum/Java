public class No {
    private int info;
    private No proximo;

    public No(int newInfo){
        setInfo(newInfo);
        setProximo(null);
    }

    public int getInfo(){
        return info;
    }

    public void setInfo(int newInfo){
        info = newInfo;
    }

    public No getProximo(){
        return proximo;
    }

    public void setProximo(No newProximo){
        proximo = newProximo;
    }

    @Override
    public String toString(){
        return info + "";
    }
}