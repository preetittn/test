package springdata.jpqlandnativesql.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import springdata.jpqlandnativesql.entities.Student;

import java.util.List;

public interface Studentrepos extends CrudRepository<Student,Integer> {
    @Query("from Student")                  //read all data
    List<Student> findAllStudents();        //select * from student;

    @Query("select st.firstName,st.lastName from Student st")      //partial data read with alias st
    List<Object[]> findAllStudentsPartialData();

    //retrieve all the students for a given first name
    @Query("from Student where firstName=:firstName")
    List<Student> findAllStudentsByFirstName(@Param("firstName") String firstName);

    @Query("from Student where score>:min and score<:max")
    List<Student> findAllStudentsForGivenScores(@Param("min")int min,@Param("max")int max);

    @Modifying
    @Query("delete from Student where firstName=:firstName")
    void deleteStudentsByFirstName(@Param("firstName")String firstName);

    //paging using jpql
    @Query("from Student")
    List<Student> findAllStudentsJPQLPaging(Pageable pageable);

    //sorting using jqpl
    @Query("from Student")
    List<Student> findAllStudentsJPQLSorting(Pageable pageable);
}
