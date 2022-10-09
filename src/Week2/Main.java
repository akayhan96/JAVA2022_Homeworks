package Week2;

public class Main {

	public static void main(String[] args) {
		inheritanceDemo();
	}
	
	public static int topla(int sayi1,int sayi2) {
		// Method, Parametreli Method
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) {
		// Variable arguments
		int toplam = 0;
		for (int i : sayilar) {
			toplam += i;
		}
		return toplam;
	}
	
	public static void reCapDemo_Classes() {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.topla(3, 4);
		System.out.println(sonuc);
	}
	
	public static void classesWithAttributes() {
		
		// Getter ve Setter dersiyle ortak örnek oldu.
		
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop"); 
		product.setPrice(5000);
		product.setStockAmount(3); 
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		System.out.println(product.getName());
		//System.out.println(product.getKod());
	}
	
	public static void constructorExample() {
		Product product = new Product(2,"Telefon","Samsung",3000,5,"Siyah");
		System.out.println(product.getName());
	}

	public static void inheritance() {
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		
		customer.firstName = "ahmet";
		employee.firstName = "mehmet";
		
		customerManager.Add();
		employeeManager.Add();
		
	}
	
	public static void inheritanceDemo() {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new TarimKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
	}
}
