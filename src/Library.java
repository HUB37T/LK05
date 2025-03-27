import java.util.*;
public class Library {
    private Inventory<Book> inventory;
    private Map<Book, Integer> stock;
    public Library() {
        this.inventory = new Inventory<>();
        this.stock = new HashMap<>();
    }
    public void addBook(Book book, int quantity) {
        this.inventory.addItem(book);
        this.stock.put(book, quantity);
    }
    public void removeBook(Book book) {
        this.inventory.removeItem(book);
        this.stock.remove(book);
    }
    public List<Book> searchBooks(String keyword) {
        return this.inventory.searchItems(keyword);
    }
    public void updateStock(Book book,int quantity) {
        this.stock.put(book, quantity);
    }
    public void getStock() {
        System.out.println("Stok Buku di Perpustakaan:");
        System.out.println("Judul"+"\t"+"Penulis"+"\t"+"Tahun Terbit"+"\t"+"Stok");
        for(Map.Entry<Book, Integer> entry : stock.entrySet()) {
            System.out.println("\t"+entry.getKey() + "\t\t" +"\t"+ entry.getValue());
        }
    }
}
