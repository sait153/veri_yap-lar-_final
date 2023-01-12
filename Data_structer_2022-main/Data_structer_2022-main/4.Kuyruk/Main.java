public class Main{
    
    public static void main(String[] args) {
        kuyruk k =new kuyruk(10);
        k.ekle(10);
        k.ekle(15);
        k.ekle(23);
        k.ekle(12);

        int sayac=1;

        while(!k.bosmu()){
            System.out.println(sayac+". eleman= "+k.cikart());
            sayac++;

        }
        while(k.bosmu()){
            System.out.println("Eleman kalmadı");
            break;
        }    
    }   
}
