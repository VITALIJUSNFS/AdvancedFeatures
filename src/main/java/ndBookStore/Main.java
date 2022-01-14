package ndBookStore;

import ndBookStore.model.*;

import java.util.ArrayList;

public class Main {
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Employee> employees = new ArrayList<>();
    static ArrayList<OrderService> orderServices = new ArrayList<>();

    public static void main(String[] args) {

        initData(); //Calling get data from method below

        String booksInfo = String.format("Sold number of books %d for total price %f",
                getCountOfSoldBooks(), getAllPriceOfSoldBooks());

        System.out.println(booksInfo);


    }

    //All order price count
    public static double getAllPriceOfSoldBooks() {
        double price = 0;
        for (OrderService orderService : orderServices) {
            price += getPriceOfSoldBooksInOrder(orderService);
        }
        return price;
    }

    // get sum price for single order
    public static double getPriceOfSoldBooksInOrder(OrderService orderService) {
        double price = 0;
        for (long bookId : orderService.getBooks()) {
            Book book = getBookById(bookId);

            price += book.getPrice();
        }
        return price;
    }

    public static int getCountOfSoldBooks() {
        int count = 0;
        for (OrderService orderService : orderServices) {
            count += orderService.getBooks().length;
        }
        return count;

    }

    public static Book getBookById(long id) {
        Book current = null;


        // searching book by bookId
        //@return found book
        for (Book book : books) {
            if (book.getId() == id) {
                current = book;
                break;
            }
        }
        return current;
    }


    public static void initData() {
        employees.add(new Employee(1, "Tim Kas", 30));
        employees.add(new Employee(2, "Tom Kur", 25));
        employees.add(new Employee(3, "Tas Kad", 25));

        customers.add(new Customer(1, "Sam Sam", 25));
        customers.add(new Customer(2, "Sim Sim", 25));
        customers.add(new Customer(3, "Son Son", 25));

        books.add(new Book(1, "Turkles", "Irus Tas", 15.25, BookGenre.Art));
        books.add(new Book(2, "Santos", "Andrys Kraas", 17.25, BookGenre.Detectives));
        books.add(new Book(3, "Truka", "Simson Tramas", 25.75, BookGenre.Programming));

        orderServices.add(new OrderService(1, 1, 1, new long[]{1, 2, 3}));
        orderServices.add(new OrderService(2, 2, 1, new long[]{1, 2, 3}));
        orderServices.add(new OrderService(3, 3, 3, new long[]{2, 3, 1}));
    }
}
