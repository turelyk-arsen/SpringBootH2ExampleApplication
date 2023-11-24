package point.repository;

import org.springframework.data.repository.CrudRepository;

import point.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
