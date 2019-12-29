package edu.abc.Mapper;

import edu.abc.po.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpMapper {

    public List<Emp> selectAllEmp();

    public List<Emp> selectByPolicy(Emp emp);

    public void deleteEmp(String empId);

    public int insertOneEmp(Emp emp);
}
