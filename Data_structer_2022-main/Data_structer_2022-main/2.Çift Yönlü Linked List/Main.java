public class Main {
    public static void main(String[] args) {
    
        DBList d=new DBList();
        d.ekle("Muş");   
        d.ekle("Van");
        d.ekle("izmir");
        d.ekle("Antep");
        d.ekle("Diyarbakır");
        d.listele();
        d.sil("Antalya");
        System.out.println();
        d.listele();
    }
}