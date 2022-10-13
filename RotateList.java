public class RotateList {
class Node{
int data;
Node previous;
Node next;
public Node(int data) {
this.data = data;
}
}
int size = 0;
Node head, tail = null;
public void addNode(int data) {
Node newNode = new Node(data);

if(head == null) {
head = tail = newNode;
//head&#39;s previous will point to null
head.previous = null;
tail.next = null;
}
else {
tail.next = newNode;
newNode.previous = tail;
tail = newNode;
tail.next = null;
}
size++;
}
public void rotateList(int n) {
Node current = head;
if(n == 0 || n &gt;= size)
return;
else {
for(int i = 1; i &lt; n; i++)
current = current.next;
tail.next = head;
head = current.next;
head.previous = null;
tail = current;
tail.next = null;
}
}

public void display() {
Node current = head;
if(head == null) {
System.out.println(&quot;List is empty&quot;);
return;
}
while(current != null) {
System.out.print(current.data + &quot; &quot;);
current = current.next;
}
System.out.println();
}
public static void main(String[] args) {

RotateList dList = new RotateList();
dList.addNode(1);
dList.addNode(2);
dList.addNode(3);
dList.addNode(4);
dList.addNode(5);
System.out.println(&quot;Original List: &quot;);
dList.display();
dList.rotateList(3);
System.out.println(&quot;Updated List: &quot;);
dList.display();
}
}
