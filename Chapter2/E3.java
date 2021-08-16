public class E3<T> extends Lista<T>{
    public void RemoveMiddleNode(Node<T> NoDe){
        if(NoDe == null || NoDe.next == null)
            return;

        NoDe.data =  NoDe.next.data;
        NoDe.next = NoDe.next.next;
    }
}
