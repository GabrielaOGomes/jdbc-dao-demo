package Application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;
import db.DB;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

//INJEÇÃO DE DEPENDENCIAS SEM EXPLICITAR A IMPLEMENTAÇÃO
        SellerDao sellerDao = new DaoFactory().createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}
