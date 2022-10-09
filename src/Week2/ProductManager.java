package Week2;

public class ProductManager {
	public void add(Product product) {
		System.out.println("Ürün eklendi : " + product.getName());
	}
	
	public void add2(int id, String name, String description, int stockAmount, double price) {
		// Sürdürülebilir yazılım için çok hatalı bir kullanım metodu.
		// Bir çok yerde bunu kullandığınızı varsayarsak yeni bir özellik geldiğinde _
		// kulllandığınız her satıra gidip o özelliği eklemeniz lazım olacak
	}
}
