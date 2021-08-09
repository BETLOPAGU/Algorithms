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

    public void RemoveDup1(){
        //System.out.print("Si entre");
        Node temp = head;
        Node prev=head;
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

   public void RemoveDup2(){
        Node aux = head;

        while( aux != null){
            Node aux2 = aux;
            while(aux2.next != null){
                if(aux2.next.data == aux.data){
                    aux2.next = aux2.next.next;
                }else{
                    aux2 = aux2.next;
                }
            }
            aux = aux.next;
        }

   }
}
