public class Main {



    public static void main(String[] args) {
        Author author1 = new Author("Oleg", "Ivanov");
        Book book1 = new Book("GIT",author1, 1999);
        Author author2 = new Author("Aditya", "Bchargava");
        Book book2 = new Book("Okrushayka", author2, 2018);

        System.out.println("book1.name = " + book1.getName());
        System.out.println("book1.authorName = " + book1.getAuthorName());
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
        book1.setPublishingYear(2023);
        System.out.println("book1 = " + book1);
        System.out.println();
        System.out.println("book2.getName() = " + book2.getName());
        System.out.println("book2.getAuthorName() = " + book2.getAuthorName());
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());
        book2.setPublishingYear(2022);
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());
        System.out.println("book2 = " + book2);

        System.out.println(book1.equals(book2));
        System.out.println(author1==author2);






    }
}