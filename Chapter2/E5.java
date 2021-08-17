import java.util.*; 

public class E5<T> extends Lista<T> {
    public Node<T> addTwoNumbers(Node<T> l1, Node<T> l2) {
        Node<T> res = null;
        Node<T> prev = null;
        Node<T> temp = null;
        int carry = 0, sum;
        while (l1 != null || l2 != null) {
            sum = carry + l1 != null ? l1.data : 0 + l2 != null ? l2.data : 0;
            
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            temp.data = sum;

            if (res == null) {
                res = temp;
            }else {
                prev.next = temp;
            }
            
            prev = temp;
            
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
 
        if (carry > 0) {
            Node<T> other = temp.next;
            other.data = carry;
        }
        return res;
    }
}
