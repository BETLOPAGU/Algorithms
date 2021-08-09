class Node<T>{
        
    T data; 
    Node<T> next;

    public void Node(T d){   
        data = d;
        next = null;
    }
}

 class Lista<T>{
    protected Node<T> head = null;

    public Node<T> pushB(T data){
        
        Node ND = new Node();
        ND.data = data;
        if(head == null){
            head = ND;
        }else{
            ND.next = head;
            head = ND;
        }
         return head;
    }

    public Node<T> pushE(T data){
        
        Node ND = new Node();
        ND.data = data;
        if(head == null){
            head = ND;
        }else{
            Node aux = head;            
            while(aux.next != null){
                aux = aux.next;
            }

            aux.next = ND;
        }
         return head;
    }

    public void Delete(Node n){
        Node aux;

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
        Node aux = head;
        while(aux != null){
            System.out.print(" " + aux.data);
            aux = aux.next;
        }
    }

    public void KtoLast(int n){
        int len = 0, i;
        Node aux = head;

        while( aux != null){
            aux = aux.next;
            len++;
        }

        if(len < n){
            System.out.println("The list lenght is smaller than the n introduced");
            return;
        }

        aux = head;

        for(i = 0; i < len - n - 1; i++)
            aux = aux.next;
        
        System.out.println(aux.data); 
    }
}
