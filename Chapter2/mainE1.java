public class mainE1 {
    public static void main(String[] args){ 
        Lista<Integer> l = new Lista<Integer>();
       // Lista2<Integer> l2 = new Lista2<Integer>();

        l.pushB(9);
        l.pushB(8);
        l.pushB(8);
        l.pushB(9);
        l.pushB(10);
        l.Print();
        System.out.println("\n");
        l.Print();
        System.out.println("\n");
        l.RemoveDup1();
        l.Print();
        
        //l2.RemoveDup1();


    }
}
