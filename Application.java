
/**
 * 
 */

/**
 * @author Ferdinand K. Yeke
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic_LinkedList myList=new Generic_LinkedList();
		
		//Instantiates a new Generic_Node object
		Generic_Node aNode=new Generic_Node();
		/*aNode setting a single node
		 *  to something like 1
		*/
		aNode.setData(1);
		myList.addNode(aNode);
		
		aNode = new Generic_Node();
		aNode.setData(2);
		myList.addNode(aNode);
		
		aNode = new Generic_Node();
		aNode.setData("Just String");
		myList.addNode(aNode);
		
		Generic_Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
	}

}
