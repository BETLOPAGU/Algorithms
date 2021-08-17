import java.io.Serializable;
import java.util.Comparator;

public abstract class E4<T> extends Lista<T> implements Comparator<T>{
    public Node<T> Partition(Node<T> n, T partition){
        Node<T> last = n;
        Node<T> start = n;
    
        while (n != null){
            if( compare(n.data, partition) > 0){
                last.next = start;
                head = n;
            }else{
                last.next = n;
                last = n;
            }
            n = n.next;
        }
        last.next = null;
        return start;
    }
}
