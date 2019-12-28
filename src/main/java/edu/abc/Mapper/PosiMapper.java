package edu.abc.Mapper;

import edu.abc.po.Posi;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PosiMapper {

    public List<Posi> selectAllPosi();

}
