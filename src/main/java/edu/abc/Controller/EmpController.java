package edu.abc.Controller;

import edu.abc.Mapper.EmpMapper;
import edu.abc.po.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class EmpController {

    @Autowired
    private EmpMapper empMapper;

    //条件查询
    @RequestMapping(value = "selectByPolicy")
    public String selectByCond(HttpServletRequest request,Model model)
    {
        Emp emp = new Emp();
        emp.setEmpId(request.getParameter("empId"));
        emp.setEmpName(request.getParameter("empName"));
        List<Emp> emps = empMapper.selectByPolicy(emp);
        model.addAttribute("empsList",emps);
        return "EmpList.html";
    }

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

    //添加员工
    @RequestMapping(value = "addOneEmp")
    public String insertOne(HttpServletRequest request) {
        Emp emp=new Emp();
        emp.setEmpId(request.getParameter("empId"));
        emp.setEmpName(request.getParameter("empName"));
        emp.setDepartment(request.getParameter("department"));
        emp.setPosition(request.getParameter("position"));
        int i= empMapper.insertOneEmp(emp);
        System.out.println(i);
        return "Welcome.html";
    }
}
