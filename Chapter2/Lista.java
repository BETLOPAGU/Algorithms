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
    protected Node<T> temp, prev;

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

    public void RemoveDup1(){
        //System.out.print("Si entre");
        temp = head;
        prev=head;
       while (temp != null) {
           if(temp.data!=prev.data)
           {
               prev.next=temp;
               prev=temp;
           }
           temp=temp.next;
       }
  
       if(prev!=temp){
           prev.next=null;
       }
   }
}
