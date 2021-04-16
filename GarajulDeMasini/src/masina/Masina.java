package masina;

public class Masina {

	// atribute
	private String brand;
	private String model;
	private Integer price;
	private String year;
	private String color;

	// constructor
	public Masina() {
		super();
	}

	// shortcut: alt + shift + s
	public Masina(String brand, String model, Integer price, String year, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.year = year;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Masina cu brandul " + brand + ", model " + model + ", cu pretul " + price + "$ an de fabricatie:" + year
				+ ", de culoare " + color + "\n";
	}

}
