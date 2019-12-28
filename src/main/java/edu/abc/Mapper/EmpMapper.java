package edu.abc.Mapper;

import edu.abc.po.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpMapper {

    public List<Emp> selectAll();

    public Emp selectOne(String empId);
}
