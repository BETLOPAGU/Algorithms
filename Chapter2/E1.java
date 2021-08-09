class Lista2<T> extends Lista<T>{   
     public void RemoveDup1(){
         System.out.print("Si entre");
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