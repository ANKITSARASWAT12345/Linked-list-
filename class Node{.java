class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;

    }

}
class Test{
    static void display(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
        
        curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(12);
        Node t1=new Node(34);
        Node t2=new Node(56);
        head.next=t1;
        t1.next=t2;
        display(head);
    }
}