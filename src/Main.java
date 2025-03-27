import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("A","Hubert",2000);
        Book b2 = new Book("B","Orie",2005);
        Book b3 = new Book("C","adit",2006);
        Book b4 = new Book("D","Fahry",2008);
        Book b5 = new Book();
        Library library = new Library();
        library.addBook(b1,5);
        library.addBook(b2,3);
        library.addBook(b3,7);
        library.addBook(b4,4);

        library.getStock();
        while(true) {
            System.out.println("Menu : ");
            System.out.println("1. Menambah Buku");
            System.out.println("2. Menghapus Buku");
            System.out.println("3. Mencari Buku");
            System.out.println("4. Menambah Stock Buku");
            System.out.println("5. Melihat List Buku");
            System.out.println("6. Keluar");
            Scanner input = new Scanner(System.in);
            System.out.print("Pilihan : ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul Buku : ");
                    String judul = input.next();
                    System.out.print("Masukkan Penulis Buku : ");
                    String penulis = input.next();
                    System.out.print("Masukkan Tahun Terbit Buku : ");
                    int thn = input.nextInt();
                    System.out.print("Masukkan Jumlah Buku : ");
                    int jumlah = input.nextInt();
                    b5 = new Book(judul, penulis, thn);
                    library.addBook(b5, jumlah);
                    System.out.println("Buku Berhasil Ditambahkan!!!");
                    break;
                case 2:
                    System.out.print("Masukkan Judul Buku yang ingin dihapus : ");
                    String judul2 = input.next();
                    if (judul2.equals("A")) library.removeBook(b1);
                    else if (judul2.equals("B")) library.removeBook(b2);
                    else if (judul2.equals("C")) library.removeBook(b3);
                    else if (judul2.equals("D")) library.removeBook(b4);
                    else library.removeBook(b5);
                    System.out.println("Buku Berhasil Dihapus!!!");
                    break;
                case 3:
                    System.out.print("Masukkan Judul Buku yang ingin dicari : ");
                    String judul3 = input.next();
                    List<Book> hasilPencarian = library.searchBooks(judul3);
                    for (Book buku : hasilPencarian) {
                        System.out.println(buku);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Judul Buku yang ingin ditambah jumlahnya : ");
                    String judul4 = input.next();
                    System.out.print("Masukkan jumlahnya : ");
                    int jumlah2 = input.nextInt();
                    if (judul4.equals("A")) library.updateStock(b1, jumlah2);
                    else if (judul4.equals("B")) library.updateStock(b2, jumlah2);
                    else if (judul4.equals("C")) library.updateStock(b3, jumlah2);
                    else if (judul4.equals("D")) library.updateStock(b4, jumlah2);
                    else library.updateStock(b5, jumlah2);
                    break;
                case 5:
                    library.getStock();
                    break;
                default:
                    System.out.println("Terima Kasih!!!");
                    return;
            }
        }
    }
}