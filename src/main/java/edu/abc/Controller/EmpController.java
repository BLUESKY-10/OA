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

    //查询全部员工
    @RequestMapping(value = "selectAllEmp")
    public String selectAllEmp(Model model)
    {
        List<Emp> emps = empMapper.selectAllEmp();
        for (Emp emp:emps)
        {
            System.out.println(emp);
        }
        model.addAttribute("empsList",emps);
        return "EmpList.html";
    }

    //删除指定员工
    @RequestMapping(value = "deleteEmp")
    public String deleteEmp()
    {
        empMapper.deleteEmp("E0005");
        return "Welcome.html";
    }
}
