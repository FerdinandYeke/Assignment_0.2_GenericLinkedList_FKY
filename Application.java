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

		Item <String> itemA = new Item<String>();
		
		itemA.setItem("Ferdinand");
		
		Item <Integer> itemB = new Item<Integer>();
		itemB.setItem(20);
		
		SmallBag <Item> itemC = new SmallBag<Item>();
		itemC.setB(itemA);
		System.out.println(itemC.getB().getItem());
		itemC.setB(itemB);
		System.out.println(itemC.getB().getItem());
	}

}
