//import test.LinkedList.Node;
//import java.util.*;

class Abc {
    public static void main(String[] args) {
        //creating LinkedList with 5 elements including head
      LinkedList linkedList = new LinkedList();
      //System.out.println(linkedList.head());
      //linkedList.add( new LinkedList.Node("1"));
      //LinkedList.Node x;
      //System.out.println(x.data());
      LinkedList.Node head = linkedList.head();
      //linkedList.add( new LinkedList.Node("1"));
      linkedList.add( new LinkedList.Node("2"));
      linkedList.add( new LinkedList.Node("3"));
      linkedList.add( new LinkedList.Node("4"));
      linkedList.add( new LinkedList.Node("6"));    
      linkedList.addatbeg(new LinkedList.Node("1"));
      //finding middle element of LinkedList in single pass

      LinkedList.Node current = head;
      int length = 0;
      LinkedList.Node middle = head;
      System.out.println(head);
      System.out.println(head.next());
      System.out.println(head.next().next());

      System.out.println("Going inside while");
      
      while(current.next() != null){
          System.out.println(current);
          length++;
          if(length%2 ==0){
              middle = middle.next();
          }
          current = current.next();
      }
      //current.setData("10");
      //System.out.println(current);
      if(length%2 == 1){
          middle = middle.next();
      }

      System.out.println("length of LinkedList: " + length);
      System.out.println("middle element of LinkedList : " + middle);
      int start = 0;
      LinkedList.Node fast = head;
      LinkedList.Node slow = head;
      while(fast.next()!=null){
        start++;
        if(start>1)
          slow = slow.next();
        fast = fast.next();
      }
    System.out.println(slow+" newww");
    current = head;
    while(current != null){
          System.out.println(current);
          current = current.next();
      }

    


    } 
  
}

class LinkedList{
    private Node head;
    private Node tail;
  
    public LinkedList(){
        this.head = new Node("head123");
        tail = head;
    }
  
    public Node head(){
        return head;
    }
  
    public void add(Node node){
        tail.next = node;
        tail = node;
    }

    public void addatbeg(Node node){
      Node n =this.head;
      node.next = n;
      this.head = node;
    }
  
    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }
      
        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
      
        public String toString(){
          System.out.println("Im inside two string method of Inner class");
            return this.data;
        }
    }
}
