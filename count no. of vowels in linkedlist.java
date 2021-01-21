public class linkedlist
{
Node head=null;

class Node
{
String data;
Node next;
Node(String d)
{
    data=d;
    next=null;
}
}
void push(String data)
{
Node o=new Node(data);
o.next=head;
head=o;
}
void printlist()
{
    Node d=head;
    while(d!=null)
    {
    System.out.print(d.data+" ");
    d=d.next;
    }
}
void vowels()
{
    int count=0;
Node t=head;
while(t!=null)
{
if (t.data == "a" ||t.data == "e" ||t.data == "i" ||t.data == "o" ||t.data == "u")
{
    System.out.println();
System.out.print(t.data+" ");
count++;
}
t=t.next;
}
if (count==0)
{
 System.out.println("\n there is no vowel in the linkedlist");  
}
else
{
System.out.println("\n Total number of vowels in the linkedlist: "+count);
}
}
public static void main(String g[])
{
linkedlist obj=new linkedlist();
obj.push("y");
obj.push("i");
obj.push("r");
obj.push("e");
obj.push("a");
obj.printlist();
obj.vowels();
}
}