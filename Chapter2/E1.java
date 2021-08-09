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
}