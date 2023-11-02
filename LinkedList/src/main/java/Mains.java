public class Mains
{
      Node head = null;
   static class Node
    {
        int data;
        Node next = null;
        Node(int data)
        {
            this.data=data;
        }
    }
    void insert(int data)
    {
        if(head== null)
        {
            head = new Node(data);
        }
        else
        {
            Node temp = head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new Node(data);
        }
    }
    void display()
    {
        Node temp = head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        Mains obj = new Mains();
        obj.insert(1);
        obj.insert(2);
        Mains obj2 = new Mains();
        obj2.insert(3);
        obj2.insert(4);
        obj2.display();
        obj.display();

    }
}
