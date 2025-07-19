package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
//    a classe vai expor um método que retorna o tipo da interface
//     porém internamente ela vai instanciar uma implemetnação
//    macete para não expor a impementação.
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
