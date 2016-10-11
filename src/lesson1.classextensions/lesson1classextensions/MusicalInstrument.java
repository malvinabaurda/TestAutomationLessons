package lesson1classextensions;

public class MusicalInstrument {
	private String type;
	private String producer;
	private int price;
	
	public MusicalInstrument(String type, String producer, int price) {
		this.type=type;
		this.producer=producer;
		this.price=price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


}
