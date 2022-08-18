package datastructures;
public class SingleLinkedList {
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static SingleLinkedList insert(SingleLinkedList list,int data)
	{
		Node new_node =new Node(data);
		new_node.next=null;
		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			Node last =list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	public static void printList(SingleLinkedList list)
	{
		Node currNode =list.head;
		System.out.println("LinkedList: ");
		while(currNode!=null)
		{
			System.out.println(currNode.data+"");
			currNode=currNode.next;
		}
		System.out.println();
	}
	public static SingleLinkedList deleteByKey(SingleLinkedList list,int key)
	{
		
		
	}
	

}
