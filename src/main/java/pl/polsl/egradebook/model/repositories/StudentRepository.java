package pl.polsl.egradebook.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.polsl.egradebook.model.entities.Student;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
    Student findByUser_UserName(String userName);
    List<Student> findAllByParentParentID(int id);
}
