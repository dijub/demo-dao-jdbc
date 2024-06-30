package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Department obj = new Department(1, "books");
        Seller obj2 = new Seller(1, "Diego", "Diego@gmail.com", LocalDate.now(), 4444.44, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

    }
}
