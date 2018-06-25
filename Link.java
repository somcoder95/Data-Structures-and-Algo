
 class myLink 
{
  double data;
  myLink next;
  public myLink(double d)
  {
	 data=d;
  }
  public void display()
  {
  System.out.println("Data:"+data);
  }


}
 class LinkList
{
  private myLink first;
  public LinkList()
  {
	  first=null;
  }
  public void insert_first(double d)
  {
	  myLink newlink=new myLink(d);
	  newlink.next=first;
	  first=newlink;
  }
  public void delete_first()
  {
	  myLink temp=first;
	  first=first.next;
	  System.out.println("The deleted link is:");
	  temp.display();
  }
 public void reverse_list()
  {
	  if (!(first==null))
	  {
		  myLink current=first;
		  myLink previous,next;
		  previous=null;
		  next=null;
		  
		  while(!(current==null))
		  {
			  
			  next=current.next;
			  current.next=previous;
			  previous=current;
			  current=next;
			  
			  
			  
		  }
		  first=previous;
	  }
	  else System.out.println("The list is empty");
  }
  public void display_list()
  {
	  if (!(first==null))
	  {
		  myLink current=first;
		  while(!(current==null))
		  {
			  current.display();
			  current=current.next;
		  }
	  }
	  else System.out.println("The list is empty");
  }
  
  
}
public class Link
{
public static void main(String[] args)
 {
	LinkList mylist=new LinkList();
	mylist.insert_first(2822044);
	for (double data=5000;data<5006;data++)
	{
		mylist.insert_first(data);	
	}
	mylist.delete_first();
	mylist.reverse_list();
	System.out.println("The list:");
	mylist.display_list();
	
 }
}
