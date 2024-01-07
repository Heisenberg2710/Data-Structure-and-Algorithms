
import java.util.HashMap;
import java.util.Map;

    public class Library {
        private int number_of_books;
        private String name;
        private Map<String, Integer> bookGenres;

        public Library(int number_of_books, String name) {
            this.number_of_books = number_of_books;
            this.name = name;
            this.bookGenres = new HashMap<>();
        }

        public int getNumber_of_books() {
            return number_of_books;
        }

        public void setNumber_of_books(int number_of_books) {
            this.number_of_books = number_of_books;
        }

        public String getName() {
            return name;
        }

//        if(ranks[i]>high)

        public void setName(String name) {
            this.name = name;
        }

        public Map<String, Integer> getBookGenres() {
            return bookGenres;
        }

        public void setBookGenres(Map<String, Integer> bookGenres) {
            this.bookGenres = bookGenres;
        }

        public static void main(String[] args) {
            Library library = new Library(20, "National Library");
            Map<String, Integer> genres = new HashMap<>();
            genres.put("Drama", 5);
            genres.put("Mystery", 15);
            library.setBookGenres(genres);

            System.out.println("Library Name: " + library.getName()+" is started");
            System.out.println("It contains " + library.getNumber_of_books()+" books");
            System.out.println("It contains books with following genres:");
            for (Map.Entry<String, Integer> entry : library.getBookGenres().entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }



