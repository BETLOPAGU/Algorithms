import java.util.ArrayList;

public class E6<T> extends Lista<T> {
    public boolean isPalindrome(Node<T> node){
        boolean ispalindrome = false;
        Node<T> aux = null, aux2 = node; //This will be the reversed palindrome

        while(node != null){ //create a new list 
            Node<T> newnode = new Node<T>(node.data);
            newnode.next = aux;
            aux = newnode;
            node = node.next;
        }

        while( aux != null && aux2 != null){
            if( aux.data != aux2.data) return false;
            aux = aux.next;
            aux2 = aux2.next;
        }
        return true;
    }

    public boolean isPalindrome2(Node<T> node){
        ArrayList<T> array = ListToArray(node);
/*         for(T dat : array){
            System.out.println(dat);
        } */
        for(int i = 0; i < ListLength(node); i++){
            if(array.get(i) != array.get(ListLength(node) - 1 - i)) return false;
        }
        return true;
    }
}
