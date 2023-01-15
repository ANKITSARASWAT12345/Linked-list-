

public class Node {
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
}
class Test{

   
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.println(cur.data);
            cur = cur.next;
        }
      
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next= temp2;
        
        Print(head);
        
    }
}

//sum of all element of the linked list;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;

}
}

class Test {

    static void sum(Node head) {
        Node curr = head;
        int sum=0;
        
        while (curr != null) {
            sum+=curr.data;
            curr = curr.next;
        }
        System.out.println("sum will be: "+sum);
    
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        sum(head);
    }
}

//traversing the singly linked list (Recursive method)

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }

}
class Test{
    static void print(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.data+" ");
        print(head.next);
    }
    public static void main(String[] args) {
        Node head=new Node(70);
        Node t1=new Node(80);
        Node t2=new Node(90);
        head.next=t1;
        t1.next=t2;
        print(head);
    }
}

//searche in linked list

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;

    }
}

class Test {
     static int fun(Node head, int x) {
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == x) {
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }
        
        }
        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node t1 = new Node(22);
        Node t2 = new Node(45);
        Node t3 = new Node(54);
        Node t4 = new Node(23);
        head.next = t1;
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        int x = 45;
        System.out.println(fun(head, x));
    }
}

//Add element at the front of linked list
class Ankit{
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
    public Node head=null;
    void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void display(){
        Node curr=head;
        if(head==null){
            System.out.println("linked list is empty");

        }
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
        public static void main(String[] args) {

            //inserting node at beginning 
            //2,3,4,  //1
            //1,2,3,4,;
            Ankit obj=new Ankit();
            obj.addFirst(4);
            obj.addFirst(3);
            obj.addFirst(2);
            obj.addFirst(1); 
            obj.display();
        }

}

//insert element at given position in linked list

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Test{
    static Node insertPos(Node head,int data,int pos){
        Node temp=new Node(data);
        if(pos==1){
            temp.next=head;
            return head;
        }
        Node curr=head;
        for(int i=1;i<=pos-2 && curr!=null;i++){
           curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    static void Print(Node head) {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node t1=new Node(34);
        Node t2=new Node(23);
        Node t3=new Node(78);
        Node t4=new Node(89);
        Node t5=new Node(11);
        head.next=t1;
        t1.next=t2;
        t2.next=t3;
        t3.next=t4;
        t4.next=t5;
        insertPos(head, 100, 5);
        Print(head);
    }

}


