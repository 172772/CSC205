package linkedlist;


/**
 * Tests the implementation of the LinkedList
 * 
 * @author (T.M. Rao) 
 * @version (October 2011)
 */
public class DoublyLinkedListTester
{
    public static void main(String[] args)
    {
        System.out.println("Linked List Tester \n " +
            "On Each line where there are two lists shown, \n"+
            "if the two lists are the same then the program has worked" );
        
        DoublyLinkedList<String> myStringList = 
        	new DoublyLinkedList<String>();
        
        //Testing Length
        System.out.println("Length should be 0 "+
                myStringList.length());
                
        //Testing insertAtBeginning
        myStringList.insertAtBeginning(new DoublyLinkedNode<String>("abc"));
        myStringList.insertAtBeginning(new DoublyLinkedNode<String>("def"));
        myStringList.insertAtBeginning(new DoublyLinkedNode<String>("ghi"));
        myStringList.insertAtBeginning(new DoublyLinkedNode<String>("abc"));
        System.out.println("[ abc ghi def abc  ] "+myStringList);
        //Now we should have [abc ghi def abc]
        
        //Testing insertAt
        myStringList.insertAt(new DoublyLinkedNode<String>("abc"),0);
        System.out.println("[ abc abc ghi def abc  ] "+myStringList);
        myStringList.insertAt(new DoublyLinkedNode<String>("111"),1);
        System.out.println(myStringList);
        myStringList.insertAt(new DoublyLinkedNode<String>("222"),2);
        System.out.println(myStringList);
        myStringList.insertAt(new DoublyLinkedNode<String>("333"),3);
        System.out.println("[ abc 111 222 333 abc ghi def abc  ]"
                        +myStringList);
        
        //Testing illegal locations for insertAt
        myStringList.insertAt(new DoublyLinkedNode<String>("abc"),-1);
        myStringList.insertAt(new DoublyLinkedNode<String>("abc"),10);
        
        //Testing insert at the last position+1
        myStringList.insertAt(new DoublyLinkedNode<String>("abc"),8);
        System.out.println(myStringList);
        
        //Testing deleteFirst
        myStringList.deleteFirst();
        System.out.println("[ 111 222 333 abc ghi def abc abc  ]"+
                myStringList);
        
        //Testing deleteLast
        myStringList.deleteLast();
        System.out.println("[ 111 222 333 abc ghi def abc  ] "+
                myStringList);
        //String x = myStringList.elementAt(0).getInfo();
        //Testing deleteNth
        myStringList.deleteNth(5);
        System.out.println("[ 111 222 333 abc ghi abc  ] "+
                myStringList);
        
        //Testing deleteNth illegal values
        myStringList.deleteNth(-3);
        System.out.println("[ 111 222 333 abc ghi abc  ] "+
                myStringList);
        
        //Testing deleteNth illegal values
        myStringList.deleteNth(15);
        System.out.println("[ 111 222 333 abc ghi abc  ] "+
                myStringList);
        //Testing Length
        System.out.println("Length should be 6 "+
                myStringList.length());  
        //Testing deleteFirstOccurrence
        myStringList.deleteFirstOccurrence("abc");
        System.out.println("[ 111 222 333 ghi abc  ] "+
                myStringList);
                
        //Testing deleteAllOccurrences
        myStringList.insertAt(new DoublyLinkedNode<String>("abc"), 2);
        myStringList.insertAt(new DoublyLinkedNode<String>("abc"), 2);
        myStringList.deleteAllOccurrences("abc");
        System.out.println("[ 111 222 333 ghi  ] "+
                myStringList);
        myStringList.resetCurrentElement();
        while (myStringList.hasMoreElements())
        {
            String nextElement = (String)myStringList.nextElement();
            System.out.println("Next Element = "+nextElement);
        }
        
        myStringList.reverseInPlace();
        System.out.println("Reverse: ");
        myStringList.resetCurrentElement();
        while (myStringList.hasMoreElements())
        {
            String nextElement = (String)myStringList.nextElement();
            System.out.println("Next Element = "+nextElement);
        }
        
        DoublyLinkedList<Integer> integerList1 =  new DoublyLinkedList<Integer>();
        DoublyLinkedList<Integer> integerList2 =  new DoublyLinkedList<Integer>();
        
        integerList1.insertAtEnd(new Integer(1));
        integerList2.insertAtEnd(new Integer(2));
        integerList1.insertAtEnd(new Integer(3));
        integerList2.insertAtEnd(new Integer(4));
        integerList1.insertAtEnd(new Integer(5));
        integerList2.insertAtEnd(new Integer(6));
        
        System.out.println(DoublyLinkedList.merge(integerList1, integerList2));
        
    }
}