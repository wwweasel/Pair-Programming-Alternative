import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlowerShop {
	
	// variables
	private String shop_name;
	HashMap<String,ArrayList> product_list;
	
	// Constructor
	public FlowerShop(String shop_name) {
		this.shop_name = shop_name;
		product_list = new HashMap<String,ArrayList>();
	}
	
	// general methods
	public void addProduct(Product product) {
		
		// Get className of product to be added
		String productClassName = product.getClass().getName();
		
		// Check if ArrayList of ProductType already exists in Hashmap, if not
		// create it
		if( !product_list.containsKey(productClassName) ) {
			// Create a key named productClassName holding an ArrayList of type Product
			product_list.put(productClassName, new ArrayList<Product>() );
			// Also insert the product appropriatly
			product_list.get(productClassName).add(product);
		}else {
			product_list.get(productClassName).add(product);
		}		
	}
	
	public void print_stock(){
		for(Map.Entry<String,ArrayList> entry : product_list.entrySet()) {
			String key = entry.getKey();
			ArrayList list = entry.getValue();
			
			System.out.println(key);
			for (Object obj : list) {
				System.out.println("\t" + obj);
			}
		}
	}
}
