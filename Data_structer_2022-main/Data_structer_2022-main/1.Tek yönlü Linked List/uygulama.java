public class uygulama {

	public static void main(String[] args) {
		
			TekYonluListeYapisi TYList=new TekYonluListeYapisi();
			TYList.basaEkle(11);
			TYList.sonaEkle(22);
			TYList.basaEkle(5);
			TYList.sonaEkle(33);
			TYList.sonaEkle(44);
			TYList.sonaEkle(55);
			
			TYList.arayaEkle(3,25);
			TYList.arayaEkle(6,50);

			

			TYList.yazdir();
			
	
	}

}
