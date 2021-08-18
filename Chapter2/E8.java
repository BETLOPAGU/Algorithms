
public class E8<T> extends Lista<T>{
    public Node<T> LoopDetection(Node<T> nodeHead){
        Node<T> normalspeed = nodeHead;
        Node<T> twicespeed = nodeHead;
        
        while(normalspeed != null && twicespeed != null){
            normalspeed = normalspeed.next;
            twicespeed = twicespeed.next.next;
            if(twicespeed != null) twicespeed =twicespeed.next;

            if(normalspeed == twicespeed) break;
        }

        if(twicespeed == null || twicespeed.next == null) return null;

        normalspeed = getHeadNode();
        while( normalspeed != twicespeed){
            normalspeed = normalspeed.next;
            twicespeed = twicespeed.next;

            if(normalspeed == twicespeed) return normalspeed;
        }
    } 
}
