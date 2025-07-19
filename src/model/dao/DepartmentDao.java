package model.dao;

import model.entities.Department;
import java.util.List;

public interface DepartmentDao {

//    operação responsável por inserir no banco de dados o obj enviado como
//    parâmetro de entrada
     void insert(Department obj);
     void update(Department obj);
     void deleteById(Integer id);
//     operação para consulta por id
     Department findById(Integer id);
     List<Department> findAll();
}
