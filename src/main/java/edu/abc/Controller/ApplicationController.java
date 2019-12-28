package edu.abc.Controller;

import edu.abc.Mapper.ApplicationMapper;
import edu.abc.po.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class ApplicationController {

    @Autowired
    private ApplicationMapper applicationMapper;
    //查询全部申请
    @RequestMapping(value = "selectAllApplication")
    public String selectAllEmp(Model model)
    {
        List<Application> applications = applicationMapper.selectAllApplication();
        for (Application application:applications)
        {
            System.out.println(application);
        }
        model.addAttribute("applicationsList",applications);
        return "ApplicationList.html";
    }
}
