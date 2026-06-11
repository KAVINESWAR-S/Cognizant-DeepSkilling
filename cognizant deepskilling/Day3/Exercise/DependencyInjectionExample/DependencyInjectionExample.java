package Day3.Exercise.DependencyInjectionExample;

 interface CustomerRepository {

    String findCustomerById(int id);
}


class CustomerRepositoryImpl
        implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if(id == 101){
            return "Kavin";
        }

        if(id == 102){
            return "Eswar";
        }

        return "Customer Not Found";
    }
}


 class CustomerService {

    private CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository){
        this.repository = repository;
    }

    public void getCustomer(int id){

        String customer =
                repository.findCustomerById(id);

        System.out.println(customer);
    }
}
public class DependencyInjectionExample {

    public static void main(String[] args) {

        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        service.getCustomer(101);
        service.getCustomer(102);
        service.getCustomer(200);
    }
}