package edu.abc.Controller;

import edu.abc.Mapper.PosiMapper;
import edu.abc.po.Posi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PosiController {
    @Autowired
    private PosiMapper posiMapper;
    @RequestMapping(value = "selectAllPosi")
    public String selectAllPosi(Model model)
    {
        List<Posi> posis = posiMapper.selectAllPosi();
        for (Posi posi:posis)
        {
            System.out.println(posi);
        }
        model.addAttribute("posisList",posis);
        return "PosiList.html";
    }
}
