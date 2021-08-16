class E1<T> extends Lista<T>{   
    //Bad solution, it only works with Nodes that are consecutive and their data are the same. 
    public void RemoveDup(Node n){
        Node<T> temp = head;
        Node<T> prev=head;
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
    //Good solution. 
    public void RemoveDup2(Node n){
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