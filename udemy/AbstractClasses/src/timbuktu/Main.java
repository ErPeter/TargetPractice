package timbuktu;

public class Main {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(null);
        myLinkedList.traverse(myLinkedList.getRoot());

        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s : data){
            myLinkedList.addItem(new Node(s));
        }
        myLinkedList.traverse(myLinkedList.getRoot());

        myLinkedList.removeItem(new Node("7"));
        myLinkedList.traverse(myLinkedList.getRoot());


        myLinkedList.removeItem(new Node("0"));
        myLinkedList.traverse(myLinkedList.getRoot());


        myLinkedList.removeItem(new Node("9"));
        myLinkedList.traverse(myLinkedList.getRoot());

        myLinkedList.removeItem((myLinkedList.getRoot()));
        myLinkedList.traverse(myLinkedList.getRoot());

    }



}
