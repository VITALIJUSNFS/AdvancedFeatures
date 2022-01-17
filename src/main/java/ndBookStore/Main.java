package ndBookStore;

import ndBookStore.model.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Employee> employees = new ArrayList<>();
    static ArrayList<OrderService> orderServices = new ArrayList<>();

    public static void main(String[] args) {

        initData(); //Calling get data from method below

        //total sold books and cost
        String booksInfo = String.format("Sold number of books %d for total price %f",
                getCountOfSoldBooks(), getAllPriceOfSoldBooks());

        //total sold books by emploees
        for (Employee emploee : employees) {
            System.out.println("Employee: " + emploee.getName() + " sold " + getProfitByEmployee(emploee.getId()));
        }
        //total sold books by categories
        ArrayList<BookAdditional> soldBooksCount = getCountOfSoldBooksByGenre();
        HashMap<BookGenre, Double> soldBooksPrice = getPriceOfSoldBooksByGender();
        String soldBookStr = "By gender %s:  sold %d books for price %f";
        for (BookAdditional additional : soldBooksCount) {
            double price = soldBooksPrice.get(additional.getGenre());
            System.out.println(String.format(soldBookStr, additional.getGenre().name(), additional.getCount(), price));
        }

        //what category people interested up to 30 years

        //what category people interested over 30

        System.out.println(booksInfo);
    }

    //get most popular gender for customer before #age
//    public static BookGenre getMostPopularGenderLessThanAge(int age) {
//        ArrayList<Long> customersId = new ArrayList<>();
//        for (Customer customer : customers) {
//            if (customer.getAge() < age){
//                customersId.add(customer.getId());
//            }
//        }
//        int countArt = 0 , countProgramming = 0, countDetectives =0;
//
//        for (OrderService orderService: orderServices){
//            if (customersId.contains(orderService.getCustomerId())){
//                countArt +=getPriceBySoldBooksByGender(orderService,BookGenre.Art);
//                countProgramming +=getPriceBySoldBooksByGender(orderService,BookGenre.Programming);
//                countDetectives +=getPriceBySoldBooksByGender(orderService,BookGenre.Detectives);
//            }
//        }
//
//        ArrayList<BookAdditional> result;
//    }

    public static ArrayList<BookAdditional> getCountOfSoldBooksByGenre() {
        ArrayList<BookAdditional> result = new ArrayList<>();
        int countArt = 0, countProgramming = 0, countDetective = 0;
        for (OrderService orderService : orderServices) {
            countArt += getCountBySoldBooksByGender(orderService, BookGenre.Art);
            countProgramming += getCountBySoldBooksByGender(orderService, BookGenre.Programming);
            countDetective += getCountBySoldBooksByGender(orderService, BookGenre.Detectives);
        }
        result.add(new BookAdditional(BookGenre.Art, countArt));
        result.add(new BookAdditional(BookGenre.Programming, countProgramming));
        result.add(new BookAdditional(BookGenre.Detectives, countDetective));

        return result;
    }

    // get number of books
    public static int getCountBySoldBooksByGender(OrderService orderService, BookGenre bookGenre) {
        int count = 0;
        for (long bookId : orderService.getBooks()) {
            Book book = getBookById(bookId);
            if (book != null && book.getGenre() == bookGenre) {
                count++;
            }
        }
        return count;
    }

    //get price of sold books by gender
    public static HashMap<BookGenre, Double> getPriceOfSoldBooksByGender() {
        HashMap<BookGenre, Double> result = new HashMap<>();
        double priceArt = 0, priceProgramming = 0, priceDetective = 0;

        for (OrderService orderService : orderServices) {
            priceArt += getPriceBySoldBooksByGender(orderService, BookGenre.Art);
            priceProgramming += getPriceBySoldBooksByGender(orderService, BookGenre.Programming);
            priceDetective += getPriceBySoldBooksByGender(orderService, BookGenre.Detectives);

        }
        result.put(BookGenre.Art, priceArt);
        result.put(BookGenre.Programming, priceProgramming);
        result.put(BookGenre.Detectives, priceDetective);

        return result;
    }

    public static double getPriceBySoldBooksByGender(OrderService orderService, BookGenre bookGenre) {
        double price = 0;

        for (long bookId : orderService.getBooks()) {
            Book book = getBookById(bookId);
            if (book != null && book.getGenre() == bookGenre) {
                price += book.getPrice();
            }
        }
        return price;
    }

    public static Profit getProfitByEmployee(long employeeId) {
        int count = 0;
        double price = 0;
        for (OrderService orderService : orderServices) {
            if (orderService.getEmployeeId() == employeeId) {
                price += getPriceOfSoldBooksInOrder(orderService);
                count += orderService.getBooks().length;
            }
        }
        return new Profit(count, price);
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
