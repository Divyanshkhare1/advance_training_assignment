package assignment_13;


class Main {
    Node head; 
 
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
      void printNthFromLast(int n)
    {
        int len = 0;
        Node temp = head;
 
        while (temp != null) {
            temp = temp.next;
            len++;
        }
 
          if (len < n)
            return;
 
        temp = head;
 
         for (int i = 1; i < len - n + 1; i++)
            temp = temp.next;
 
        System.out.println(temp.data);
    }
 
    public void push(int new_data)
    {
         Node new_node = new Node(new_data);
 
          new_node.next = head;
 
         head = new_node;
    }
 
    public static void main(String[] args)
    {
        Main llist = new Main();
        llist.push(9);
        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5); 
        llist.push(4);
	    llist.push(3); 
	    llist.push(2);   
	    llist.push(1);

        llist.printNthFromLast(2);
    }
}