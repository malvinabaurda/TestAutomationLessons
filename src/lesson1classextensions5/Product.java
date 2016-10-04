package lesson1classextensions5;

public class Product extends Fruit {
	private int price;
	private int producer;
	private Shop placeOfSale;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProducer() {
		return producer;
	}

	public void setProducer(int producer) {
		this.producer = producer;
	}

	public Shop getPlaceOfSale() {
		return placeOfSale;
	}

	public void setPlaceOfSale(Shop placeOfSale) {
		this.placeOfSale = placeOfSale;
	}

}
