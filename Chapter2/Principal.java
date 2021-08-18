public class Principal{
    public static void main(String[] args){ 
        E6<Integer> l = new E6<Integer>();
         
        l.pushBeginning(30);
        l.pushBeginning(11);
        l.pushBeginning(8);
        l.pushBeginning(11);
        l.pushBeginning(3);
        l.Print();
        Node<Integer> h = l.getHeadNode();
        //System.out.println(l.getHeadNode().data);
        System.out.println("\n");
        //     .: EXERCISE 1 :. 
        //l.RemoveDup2();
        //l.Print();
        
        //     .: EXERCISE 2 :. 
        //l.KtoLast(4);
        //Node<Integer> response = l.KtoLastRecursive(null, 4); 
        //System.out.println(response.data);

        //     .: EXERCISE 3 :.
        //l.RemoveMiddleNode(node);        
        //l.Print();

        //     .: EXERCISE 4 :.


        //     .: EXERCISE 6 :. 
        if(l.isPalindrome(h)) System.out.println("It's a palindrome");
        else System.out.println("It's not a palindrome");
        if(l.isPalindrome2(h)) System.out.println("It's a palindrome");
        else System.out.println("It's not a palindrome");
        
    }
}
