package Task3;

import java.util.ArrayList;

public class Main {


    public static ArrayList<Customer> customers = new ArrayList<Customer>();

      public static void main(String[] args) {


          customers.add(new Customer("John", "Smith", "TheRealJohn"));
          customers.add(new Customer("Edvard", "Mkrtytchan", "Power"));
          customers.add(new Customer("Mark", "Hill", "IAmMark"));
          customers.add(new Customer("Johnny", "Depp", "JackSparrow"));
          customers.add(new Customer("Oliver", "Hansen", "JegErOliver"));
          customers.add(new Customer("Hans", "Petersen", "Kunne ikke finde på et navn"));
          printCustomers();
      }
      public static void printCustomers() {
          for (Customer customer : customers)
              System.out.println(customer);
      }


}
