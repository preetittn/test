package springdata.jpqlandnativesql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import springdata.jpqlandnativesql.entities.Student;
import springdata.jpqlandnativesql.repository.Studentrepos;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class JpqlandnativesqlApplicationTests {

	@Autowired
	Studentrepos studentrepos;

	@Test
	void contextLoads() {
	}
	@Test
	public void testStudentCreate()
	{
		Student student = new Student();
		student.setFirstName("dhvani");
		student.setLastName("upadhyay");
		student.setScore(99);

		studentrepos.save(student);

		Student student2 = new Student();
		student2.setFirstName("sarthak");
		student2.setLastName("sharma");
		student2.setScore(78);

		studentrepos.save(student2);

		Student student3 = new Student();
		student3.setFirstName("chotu");
		student3.setLastName("singh");
		student3.setScore(47);

		studentrepos.save(student3);

	}

	@Test
	public void testFindAllStudents()
	{
		System.out.println(studentrepos.findAllStudents());
	}

	@Test
	public void testFindAllStudentsPartialData()
	{
		List<Object[]> partialData=studentrepos.findAllStudentsPartialData();
		for (Object[] objects:partialData)
		{
			System.out.println(objects[0]);			//firstname
			System.out.println(objects[1]);			//lastname
		}
	}

	@Test
	public void testFindAllStudentsByFirstName()
	{
		System.out.println(studentrepos.findAllStudentsByFirstName("sarthak"));
	}

	@Test
	public void testFindAllStudentsForGivenScores()
	{
		System.out.println(studentrepos.findAllStudentsForGivenScores(50,100));
	}

	@Test
	@Transactional
	@Rollback(false)
	public void testDeleteStudentsByFirstName()
	{
		studentrepos.deleteStudentsByFirstName("chotu");//rolledback-only in junit test

		studentrepos.deleteStudentsByFirstName("chotu");
	}

	//paging using jpql
	@Test
	public void findAllStudentsJPQLPaging()
	{
		System.out.println(studentrepos.findAllStudentsJPQLPaging(PageRequest.of(1,5)));
	}

	@Test
	public void findAllStudentsJPQLSorting()
	{
		System.out.println(studentrepos.findAllStudentsJPQLSorting(PageRequest.of(2,5,
				Sort.Direction.ASC,"id")));
	}
}
