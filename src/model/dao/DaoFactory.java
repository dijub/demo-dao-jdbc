package model.dao;

import model.dao.impl.SellerDaoJDBC;

/**
 * DaoFactory
 */
public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
