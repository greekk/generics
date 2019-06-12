package SimpleLinkedList;

public class MainLInkedLists {

    public static void main(String[] args){

        System.out.println("--------------Simple Linked List----------------------");


        SimpleLinkedList<String> SLList = new SimpleLinkedList<String>();
        SimpleLinkedList<String> SLList1 = new SimpleLinkedList<String>();


        for(int i = 0; i < 10; i++){
            SLList.insert("test string " + Math.round(Math.random()*100));
        }

        for(int i = 0; i < 5; i++){
            SLList1.insert("yet another test stirng " + Math.round(Math.random()*100));
        }
        long result;

        SLList.display();
        System.out.println("-------------deleting-----------------------");
       for(int i = 0; i < 3; i++)
           SLList.delete();

        System.out.println(SLList.equals(SLList1));

        System.out.println(SLList.hashCode());

        System.out.println(SLList.isEmpty());
    }
}
