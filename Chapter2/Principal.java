public class Principal{
    public static void main(String[] args){ 
        Lista<Integer> l = new Lista<Integer>();
       // Lista2<Integer> l2 = new Lista2<Integer>();

        l.pushE(7);
        l.pushE(6);
        l.pushE(8);
        l.pushE(11);
        l.pushE(30);
        l.Print();
        System.out.println("\n");
        /*Exercise 1*/
        //l.RemoveDup2();
        //l.Print();
        
        /*Exercise 2*/
        l.KtoLast(3);


    }
}
