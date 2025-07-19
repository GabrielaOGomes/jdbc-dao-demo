package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {

//    operação responsável por inserir no banco de dados o obj enviado como
//    parâmetro de entrada
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
//    operação para consulta por id
    Seller findById(Integer id);
    List<Seller> findAll();
}

