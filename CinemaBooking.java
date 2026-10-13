class CinemaBooking {

    String movieName;
    double ticketPrice;
    int numberOfTickets;
    String customerName;

        CinemaBooking() {
        movieName = "AVATAR";
        ticketPrice = 200.00;
        numberOfTickets = 0;
        customerName = "UNKNOWN";
    }

        CinemaBooking(String movieName, double ticketPrice,
                  int numberOfTickets, String customerName) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
        this.customerName = customerName;
    }

        CinemaBooking(String movieName, int numberOfTickets,
                  String customerName) {
        this.movieName = movieName;
        this.ticketPrice = 200.00;
        this.numberOfTickets = numberOfTickets;
        this.customerName = customerName;
    }

        void bookTickets(String movieName, double ticketPrice,
                     int numberOfTickets, String customerName) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
        this.customerName = customerName;
        displayBooking();
    }

        void bookTickets(String movieName, int numberOfTickets) {
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
        displayBooking();
    }

    
    void bookTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
        displayBooking();
    }

        double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

        double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

        void displayBooking() {

        System.out.println("\nCustomer Name   : "
                + customerName.toUpperCase());

        System.out.println("Movie Name      : "
                + movieName.toUpperCase());

        if (numberOfTickets <= 0) {
            System.out.println("Number of Tickets: "
                    + numberOfTickets);
            System.out.println("Booking Status  : Invalid ticket count");
            return;
        }

        System.out.printf("Ticket Price    : Rs. %.2f%n",
                ticketPrice);

        System.out.println("Number of Tickets: "
                + numberOfTickets);

        double total = calculateTotal();
        double discount = calculateDiscount();
        double finalAmount = total - discount;

        System.out.println("Booking Status  : Booking Successful");

        System.out.printf("Total Amount    : Rs. %.2f%n",
                total);

        System.out.printf("Discount        : Rs. %.2f%n",
                discount);

        System.out.printf("Final Amount    : Rs. %.2f%n",
                finalAmount);
    }

        static void compareCustomers(String name1, String name2) {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Both customer names are the same.");
        } else {
            System.out.println("Customer names are different.");
        }
    }

    public static void main(String[] args) {

        System.out.println("========== CINEMA TICKET BOOKING ==========");

                CinemaBooking booking1 = new CinemaBooking(
                "Avatar", 200.00, 5, "Sneha");

        booking1.displayBooking();

                CinemaBooking booking2 = new CinemaBooking(
                "Avatar", 2, "Arjun");

        booking2.displayBooking();

                System.out.println("\n--- Method Overloading Example ---");

        CinemaBooking booking3 = new CinemaBooking();

        booking3.bookTickets("Avengers", 250.00, 3, "Rahul");

        booking3.bookTickets("Avatar", 4);

                System.out.println("\n--- Customer Name Comparison ---");

        compareCustomers("Sneha", "SNEHA");
        compareCustomers("Sneha", "Arjun");
    }
}
