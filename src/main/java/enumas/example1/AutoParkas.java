package enumas.example1;

public enum AutoParkas {
    P001("Volvo", "PVC231", 1500),
    P002("Toyota", "DKS456", 2000),
    P003("BMW", "TDC753", 2300);

    final String brand;
    final String regNo;
    final int cost;

    AutoParkas(String brand, String regNo, int cost) {
        this.brand = brand;
        this.regNo = regNo;
        this.cost = cost;
    }
}






