package Homework_2;

public class List {
    private Node head;
    private Node tail;

  //Разворот списка
    public void revert(){
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.nextNode;
            Node previous = currentNode.previousNode;
            currentNode.nextNode = previous;
            currentNode.previousNode = next;
            if(previous == null){
                tail = currentNode;
            }
            if(next == null){
                head = currentNode;
            }
            currentNode = next;
        }

  }

   public class Node{
        int value;
        Node nextNode;
        Node previousNode;
    }
}
