package DoubleLinkedLists;

import SimpleLinkedList.SimpleLinkedList;

public class MainLInkedLists {

    public static void main(String[] args){

        System.out.println("--------------Double Linked List----------------------");


        DoubleLinkedList<String> dLList = new DoubleLinkedList<String>();
        DoubleLinkedList<String> dLList1 = new DoubleLinkedList<String>();


        for(int i = 0; i < 20; i++){
            dLList.insertBegin("this is test string number: " + Math.round(Math.random()*100));
        }
        System.out.println("---------------forward---------------------");

        dLList.forward();

        System.out.println("-------------------backward-----------------");

        dLList.backward();

        System.out.println(dLList.equals(dLList1));

        System.out.println(dLList.hashCode());

        System.out.println(dLList.isEmpty());

        dLList.insertAfter(5, " another test string");
        dLList.insertAfter(5, "more test strings!!");
        dLList.insertAfter(5, "more, more test strings!!!!");
        System.out.println("---------------forward after insert---------------------");
        dLList.forward();
        //Work with iterator-----------------------------------------
        System.out.println("--------------------Work with iterator------------------------");
        ListIterator listIterator = dLList.getIterator();
        System.out.println("---------------forward---------------------");
        dLList.forward();
        listIterator.reset();
        System.out.println(listIterator.getCurrent().getData());
        listIterator.next();
        System.out.println(listIterator.getCurrent().getData());
        listIterator.next();
        System.out.println(listIterator.getCurrent().getData());
        listIterator.next();
        System.out.println(listIterator.getCurrent().getData());
        listIterator.back();
        System.out.println(listIterator.getCurrent().getData());
        listIterator.back();
        System.out.println(listIterator.getCurrent().getData());
        listIterator.insertAfter(5,"more, more test strings!!!!");
        listIterator.insertAfter(7,"more, more test strings!!!!");
        System.out.println("---------------forward---------------------");
        dLList.forward();
        listIterator.insertBefore(2,"more, more test strings!!!!");
        listIterator.insertBefore(8,"more, more test strings!!!!");
        dLList.forward();
        System.out.println(listIterator.deleteCurrent().getData());
        System.out.println(listIterator.deleteCurrent().getData());
        System.out.println(listIterator.deleteCurrent().getData());
        System.out.println(listIterator.deleteCurrent().getData());
        System.out.println("---------------forward---------------------");
        dLList.forward();






    }
}
