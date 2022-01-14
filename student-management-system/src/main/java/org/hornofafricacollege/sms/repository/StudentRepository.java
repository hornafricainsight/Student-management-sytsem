package org.hornofafricacollege.sms.repository;

import org.hornofafricacollege.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
