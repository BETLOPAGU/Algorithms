public class E2<T> extends Lista<T> {
    private Node<T> node_response = null;
    private int count = 0;

    public void KtoLast(int n) {
        int len = 0, i;
        Node<T> aux = head;

        while (aux != null) {
            aux = aux.next;
            len++;
        }

        if (len < n) {
            System.out.println("The list lenght is smaller than the n introduced");
            return;
        }

        aux = head;

        for (i = 0; i < len - n; i++)
            aux = aux.next;

        System.out.println(aux.data);
    }

    public Node<T> KtoLastRecursive(Node<T> n, int k) {
        if (n == null)
            n = head;

        if (n.next != null) {
            KtoLastRecursive(n.next, k);
        }
        count = count + 1;
        //System.out.println(k);
        if (count == k) {
            //System.out.println(n.data+"hola");
            node_response = n;
        }
        
        return node_response;
    }
}
