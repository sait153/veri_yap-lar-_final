public class TekYonluListeYapisi {// sınıfın  yapmaktadır.
	Nesne head=null;
	// head ve tail adlı iki değişken tanımlanmıştır ve başlangıçta null değerine atanmıştır.
	Nesne tail=null;
	void basaEkle(int x)// liste yapısına eleman eklemek için bir fonksiyon tanımlanmıştır ve bu fonksiyonun girdisi olarak bir integer değişkeni almaktadır.
	{
		Nesne eleman=new Nesne();// bir Nesne tipinde bir eleman değişkeni tanımlanmıştır.
		//Satır: "eleman.data=x; eleman değişke
		eleman.data=x;
		
		if(head==null)// liste ilk elemanı ekleniyor olup olmadığı kontrol edilir.
		{
			eleman.next=null;/*eleman;" Eğer liste yapısına ilk eleman ekleniyorsa, 
			elemanın "next" özelliği null değerine atanır, head ve tail değişkenleri eleman */
			head=eleman;
			tail=eleman;
			System.out.println("liste yapisi oluşturuldu,ilk eleman eklendi");
			/*"liste yapisi oluşturuldu,ilk eleman eklendi");" Bu satırda, kullanıcıya
			 liste yapısının oluşturulduğu ve ilk elemanın eklendiği bilgisi verilir.*/
		}
		else
		//Eğer liste yapısına ilk eleman eklenmiyorsa, bu kod bloğu çalışır.
		{
			
			eleman.next=head;/*eleman;" Bu satırda, elemanın "next" özelliği head değişkenine
			 atanır ve head değişkeni eleman değişkenine atanır.*/
			head=eleman;
			System.out.println("başa eleman eklendi");//başa eleman eklendi Bu satırda
			
		}
		
	}
	void sonaEkle(int x)
	/*'sonaEkle()'  Bu metod, bir int değerini alır ve bu değer için yeni bir Nesne oluşturur.

*/
	{
		Nesne eleman=new Nesne();
		eleman.data=x;
		
		if(head==null) // liste başı varmı yda yokmu
		{
			eleman.next=null;// eleman ekleme 
			head=eleman;
			tail=eleman;
			System.out.println("liste yapisi oluşturuldu ,ilk eleman eklendi"); // eleman eklendi
		}
		else
		{
			tail.next=eleman;
			tail=eleman;
			System.out.println("sona eleman eklendi");
		}
	}
	void arayaEkle(int indis ,int x)//Bu metod, bir int indis ve bir int x değerini alır. Aynı şekilde, yeni bir Nesne oluşturulur ve verilen x değeri atanır
	{// araya  ekelye index var
		Nesne eleman=new Nesne();
		eleman.data=x;
		
		if(head==null && indis ==0) //doüumun başını 0 aldım
		{
			eleman.next=null;
			head=eleman;
			tail=eleman;
			System.out.println("liste yapisi oluşturuldu,ilk eleman eklendi");
		}
		else if(head!= null && indis ==0)
		{
			eleman.next=head;
			head=eleman;
			System.out.println(indis + "indisinci siraya yeni eleman eklendi");
			
		}
		else
		{
			int n=0;
			Nesne temp=head;
			Nesne temp2=head;
			while(temp.next!=null)
			{
				n++;
				temp2=temp;
				temp=temp.next;
			}
			
			if(n==indis)
			{
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println("eleman eklendi");
			}
			else
			{
				temp=head;
				temp2=head;
				int i= 0;
				while(i!=indis)
				{
					temp2=temp;
					temp=temp.next;
					i++;
					
					
				}
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println(indis + ".siraya yeni eleman eklendi");

			}
		}
	}
	void yazdir()
	/*bağlı liste yapısının içeriğini yazdırmak için kullanılır. Eğer bağlı liste daha önce oluşturulduysa,
	 başlangıçta head değişkeni ile başlayarak, her bir elemanın data değerini yazdırır*/
	{
		
		if(head==null)
		{
			System.out.println("liste yapisi oluşturuldu,ilk eleman eklendi");
		}
		else
		{
		Nesne temp=head;
		System.out.print("baş->");
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("son.");
		}
	}
	
	}