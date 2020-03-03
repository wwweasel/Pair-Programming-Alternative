import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		FlowerShop flowerShop = new FlowerShop("Awesome FlowerShop");
		
		Flower flower1 = new Flower();
		flower1.setPrice(3.99);
		flower1.setColor("Red");
		flowerShop.addProduct(flower1);
		
		Flower flower2 = new Flower();
		flower2.setPrice(2.99);
		flower2.setColor("Rosa");
		flowerShop.addProduct(flower2);
		
		Flower flower3 = new Flower();
		flower3.setPrice(2.99);
		flower3.setColor("White");
		flowerShop.addProduct(flower3);
		
		
		Decoration decoration1 = new Decoration();
		decoration1.setPrice(1.99);
		Material material = Material.PLASTIC;
		decoration1.setMaterial(material);
		flowerShop.addProduct(decoration1);
		
		Decoration decoration2 = new Decoration();
		decoration1.setPrice(1.99);
		Material material2 = Material.WOOD;
		decoration2.setMaterial(material2);
		flowerShop.addProduct(decoration2);
		
		Tree tree1 = new Tree();
		tree1.setPrice(13.99);
		tree1.setHeight(1.4);
		flowerShop.addProduct(tree1);
		
		flowerShop.print_stock();
		
		System.out.println("BluBluBlubbb...");
	}

}
