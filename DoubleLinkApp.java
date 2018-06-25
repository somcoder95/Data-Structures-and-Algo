/**
 * 
 */

/**
 * @author Soham
 *Doubly Linked Link List implementation 
 */
class Link
{
	double data;
    Link previous;
    Link next;
	public Link(double d)
	{
		data=d;
	}
	public void display_link()
	{
		System.out.println(+data);
	}
}
class LinkList
{
	public Link first;
	public Link last;
	public LinkList()
	{
		first=null;
		last=null;
	}
	public void insert_first(double d)
	{
		Link newlink=new Link(d);
		newlink.next=first;
	    if (first!=null) first.previous=newlink;
		first=newlink;
		if(newlink.next==null) last=newlink;
		
		
		
	}
	public void insert_last(double d)
	{
		Link newlink=new Link(d);
		newlink.previous= last;
		if (last!=null) last.next=newlink;
		last=newlink;
		if(newlink.previous==null) first=newlink;
	}
	public void insert_afterkey(double k,double d)
	{
		Link current=find(k);
		if (current==null) System.out.println("Key not found");
		else
		{
			Link newlink=new Link(d);
			newlink.previous=current;
			newlink.next=current.next;
			current.next=newlink;
			newlink.next.previous=newlink;
			
		}
		
		
	}
	 public void delete_first()
	  {
		  Link temp=first;
		  first=temp.next;
		  first.previous=null;
		  System.out.println("The deleted link is:");
		  temp.display_link();
		  temp=null;
	  }
	public void delete_last()
	{   Link temp=last;
		last=temp.previous;
		last.next=null;
		System.out.println("The deleted link is:");
		temp.display_link();
		temp=null;
		
	}
	public Link find(double key)
	{
		if (!(first==null))
		  {
			  Link current=first;
			  while(!(current==null)&&(current.data!=key))
			  {
				  current=current.next;
			  }
			  if(current!=null)
			  {
				  
			  return current;
			  }
			  else return null;
			  
		  }	
		else return null;
	}
	
	 public void display_list()
	  {
		  if (!(first==null))
		  {
			  Link current=first;
			  System.out.println("List:");
			  while(!(current==null))
			  {
				  current.display_link();
				  current=current.next;
			  }
		  }
		  else System.out.println("The list is empty");
	  }
	 public void reverse_list()
	 {
		 if (!(first==null))
		  {
			  Link current=last;
			  while(!(current==null))
			  {
				  Link temp=current.previous;
				  current.previous=current.next;
				  current.next=temp;
				  current=current.next;
				
			  }
			  
			  Link temp=first;
			  first=last;
			  last=temp;
			  
		  }	
		 else System.out.println("The list is empty");
	 }
	
	
}

public class DoubleLinkApp {
	public static void main(String[] args)
	 {
		LinkList mylist=new LinkList();
		
		for (double data=5000;data<5006;data++)
		{
			mylist.insert_last(data);	
		}
		
		mylist.display_list();
	    mylist.delete_first();
	    mylist.insert_afterkey(5004,4000);
	    mylist.delete_last();
		//mylist.display_list();
		//mylist.reverse_list();
		//mylist.reverse_list();
		//mylist.display_list();
		//
		//mylist.display_list();
		mylist.reverse_list();
		
		mylist.display_list();
		
	 }

}
