import HomeWork11Objects.Book;
import HomeWork11Objects.Author;


public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Прохоренок");
        Author author2 = new Author("Роберт", "Лафоре");

        Book book1 = new Book("Основы Java", author1, 2022);
        Book book2 = new Book("Структуры данных и алгоритмы  JAVA", author2, 2022);

        System.out.println("'" + book1.getTitle() + "', " + " Автор: " + book1.getAuthor().getFirstName() + " " +
                book1.getAuthor().getLastName() + ", " + book1.getYear() + " год");

        System.out.println("'" + book2.getTitle() + "', " + " Автор: " + book2.getAuthor().getFirstName() + " " +
                book2.getAuthor().getLastName() + ", " + book2.getYear() + " год");


        // Changing publication year of book1 using setter
        book1.setYear(2023);
        System.out.println("'" + book1.getTitle() + "'" + " был переиздан в " + book1.getYear() +"г");
    }
}
