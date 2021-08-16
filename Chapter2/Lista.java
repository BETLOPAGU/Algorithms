class Lista<T>{

    protected Node<T> head = null;

    public Node<T> pushBeginning(T data){     
        Node<T> ND = new Node<T>(data);
        if(head == null){
            head = ND;
        }else{
            ND.next = head;
            head = ND;
        }
        return head;
    }

    public Node<T> pushEnd(T data){
        Node<T> ND = new Node<T>(data);
        if(head == null){
            head = ND;
        }else{
            Node<T> aux = head;            
            while(aux.next != null){
                aux = aux.next;
            }

            aux.next = ND;
        }
         return head;
    }

    public void DeleteNode(Node<T> n){
        Node<T> aux;

        if(n.next == null){
            n = null;
        }else{
            aux = head;
            while( aux.next != n){
                if(aux.next == n){
                    aux = n.next;
                }
            }
        }
    }

    public void Print(){
        Node<T> aux = head;
        while(aux != null){
            System.out.print(" " + aux.data);
            aux = aux.next;
        }
    }

    public Node<T> getHeadNode(){
        return head;
    }
}
