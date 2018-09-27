
public class Lista {

    private final Celula head;

    public Lista() {
        head = new Celula(0);
        head.next = null;
    }

    public boolean listavazia() {
        return head.next == null;
    }

    public void inserir(Celula z) {
        Celula x;
        Celula y;

        y = head;
        x = head.next;

        //ORDENANNDO LISTA
        while (x != null && z.key > y.key) {
            y = x;
            x = x.next;
        }
        z.next = x;
        y.next = z;
    }

    public Celula remover(int chave) {
        Celula x;
        Celula y;

        y = head;
        x = head.next;

        while (x != null && chave > x.key) {
            y = x;
            x = x.next;
        }

        if (x != null && chave == x.key) {
            //PQ RETURN X?
            return x;
        } else {
            return null;
        }
    }

}
