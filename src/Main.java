import model.entities.Department;
import model.entities.Seller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Department obj = new Department(1, "Books");

        System.out.println(obj);

        Seller seller = new Seller(123, "Don", "don@gmail.com", new Date(), 2000.00, obj);

        System.out.println(seller);
    }
}