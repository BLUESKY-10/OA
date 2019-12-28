package edu.abc.Controller;

import edu.abc.Mapper.EmpMapper;
import edu.abc.po.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpMapper empMapper;
    @RequestMapping(value = "selectAll")
    public String selectAll(Model model)
    {
        List<Emp> emps = empMapper.selectAll();
        for (Emp emp:emps)
        {
            System.out.println(emp);
        }
        model.addAttribute("empsList",emps);
        return "EmpList.html";
    }
}
