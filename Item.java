/*@author Ferdinand K. Yeke
 * 
 */
public class Item<T> 
{
	//Item e is a generic type
	private T e;
	
	//Setters and Getters for e
	
	//Setter for e starts here
	public void setItem(T e)
	{
		this.e = e;
	}//Setter for e ends here
	
	//Getter for e starts here
	public T getItem()
	{
		return e;
	}//Getter for e ends here
}
