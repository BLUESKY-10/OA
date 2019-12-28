package edu.abc.Mapper;

import edu.abc.po.Application;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationMapper {
    public List<Application> selectAllApplication();
}
