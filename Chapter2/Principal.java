public class Principal{
    public static void main(String[] args){ 
        E2<Integer> l = new E2<Integer>();
         
        l.pushEnd(7);
        l.pushEnd(6);
        l.pushEnd(8);
        l.pushEnd(11);
        l.pushEnd(30);
        l.Print();
        System.out.println("\n");
        //     .: EXERCISE 1 :. 
        //l.RemoveDup2();
        //l.Print();
        
        //     .: EXERCISE 2 :. 
        l.KtoLast(4);
        Node<Integer> response = l.KtoLastRecursive(null, 4); 
        System.out.println(response.data);
    }
}
