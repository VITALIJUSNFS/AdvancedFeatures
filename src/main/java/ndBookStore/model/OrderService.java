package ndBookStore.model;

import lombok.Data;

@Data

public class OrderService {
    private long id;
    private long customerId;
    private long employeeId;

    public OrderService(long id, long customerId, long employeeId, long[] books) {
        this.id = id;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.books = books;
    }

    private long [] books;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long[] getBooks() {
        return books;
    }

    public void setBooks(long[] books) {
        this.books = books;
    }
}
