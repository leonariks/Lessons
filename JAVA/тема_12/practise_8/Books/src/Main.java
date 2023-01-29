public class Main {
    public static void main(String[] args) {
        Book myBook = new Book(" Гарри Поттер\n", "Роулинг\n", "1998\n", "Bloomsbury\n");
        myBook.printInfo();

        Article myArticle = new Article(" Командировки с 'Зелёным кантом'\n","Гиркин\n", "Искусство\n", 213 , "\n 2000\n");
        myArticle.printInfo();

        Ebook myEbook = new Ebook(" Документация по Java\n", "Oracle\n", "https://docs.oracle.com/javase/tutorial/java/\n", "Официальная документация Java\n");
        myEbook.printInfo();
    }
}

abstract class Edition {

    public abstract void printInfo();

    private String title;
    private String AuthorsLastName;

    public Edition(String title, String authorsLastName) {
        this.title = title;
        AuthorsLastName = authorsLastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorsLastName() {
        return AuthorsLastName;
    }

    public void setAuthorsLastName(String authorsLastName) {
        AuthorsLastName = authorsLastName;
    }
}

class Book extends Edition {

    private String  year;
    private String publisher;

    Book(String title, String AuthorsLastName, String  year, String publisher) {
        super(title, AuthorsLastName);
        this.year = year;
        this.publisher = publisher;
    }

    @Override
    public void printInfo() {

        System.out.printf(getTitle() + " " + getAuthorsLastName() + " " + year + " " + publisher);
    }
}

class Article extends Edition {

    private String JournalTitle;
    private int number;
    private String year;

    Article(String title, String AuthorsLastName,String JournalTitle, int number, String year) {
        super(title, AuthorsLastName);
        this.JournalTitle = JournalTitle;
        this.number = number;
        this.year = year;
    }

    @Override
    public void printInfo() {
        System.out.printf(getTitle() + " " + getAuthorsLastName() + " " + JournalTitle + " " + number + " " + year);
    }
}

class Ebook extends Edition {

    private String link;
    private String annotation;

    Ebook(String title, String AuthorsLastName,String link, String annotation) {
        super(title, AuthorsLastName);
        this.link = link;
        this.annotation = annotation;
    }

    @Override
    public void printInfo() {
        System.out.printf(getTitle() + " " + getAuthorsLastName() + " " + link + " " + annotation);
    }
}