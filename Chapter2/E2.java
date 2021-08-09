class Lista2<T> extends Lista<T>{   
    public void KtoLast(int n){
        int len = 0, i;
        Node aux = head;

        while( aux != null){
            aux = aux.next;
            len++;
        }

        if(len < aux){
            System.out.println("The list lenght is smaller than the n introduced");
            return;
        }

        aux = head;

        for(i = 0; i < lenght - n - 1; i++)
            aux = aux.next;
        
        System.out.println(temp.data); 
    }
    
}
