package edu.abc.Mapper;

import edu.abc.po.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptMapper {
    public List<Dept> selectAllDept();
}
