package All.show.controller;

import All.show.dao.team;
import All.show.model.showteamModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class showcontroller {
    @RequestMapping(path="showController")
    public String showgrmp() {
        return "showgrmp";
    }

//    @RequestMapping(path="showteamController")
//    public List showteamController()
//    {
//        showteamModel showteamModel=new showteamModel();
//
//        return "showgrmp";
//    }
}

