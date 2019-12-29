package edu.abc.Controller;

import edu.abc.Mapper.ApplicationMapper;
import edu.abc.po.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Controller
public class ApplicationController {

    @Autowired
    private ApplicationMapper applicationMapper;

    //查询全部申请
    @RequestMapping(value = "selectAllApplication")
    public String selectAllApplication(Model model)
    {
        List<Application> applications = applicationMapper.selectAllApplication();
        for (Application application:applications)
        {
            System.out.println(application);
        }
        model.addAttribute("applicationsList",applications);
        return "ApplicationList.html";
    }

    //添加申请
    @RequestMapping(value = "insertOneApplication")
    public String insertOneApplication() throws ParseException {
        String strStaDate = "2019-12-28 10:11:30";
        String strApprDate = "2019-12-28 17:11:30";
        String pat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pat);
        Date staTime = sdf.parse(strStaDate);
        Date apprTime = sdf.parse(strApprDate);
        Application application = new Application();
        application.setApplicant("张三");
        application.setTheme("请假");
        application.setContent("累了");
        application.setApprover("李华");
        application.setStaTime(staTime);
        application.setApprTime(apprTime);
        applicationMapper.insertOneApplication(application);
        return "Welcome.html";
    }
}
