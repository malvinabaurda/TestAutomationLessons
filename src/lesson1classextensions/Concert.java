package lesson1classextensions;

public class Concert {

	public static void main(String[] args) {
		MusicalInstrument drumms = new MusicalInstrument("�������", "Yamaha", 2000);
		
        Musician strangeMusician = new Musician("����", "������");
        
        strangeMusician.setInstrument(drumms);
        
        System.out.println(strangeMusician.getInstrument().getPrice());
	}

}
