package edu.abc.Controller;

import edu.abc.Mapper.DeptMapper;
import edu.abc.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DeptController {

    @Autowired
    private DeptMapper deptMapper;
    //查询全部员工
    @RequestMapping(value = "selectAllDept")
    public String selectAllEmp(Model model)
    {
        List<Dept> depts = deptMapper.selectAllDept();
        for (Dept dept:depts)
        {
            System.out.println(dept);
        }
        model.addAttribute("deptsList",depts);
        return "DeptList.html";
    }
}