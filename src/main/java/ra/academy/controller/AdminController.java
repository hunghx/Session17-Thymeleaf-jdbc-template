package ra.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.academy.service.catalog.ICatalogService;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private ICatalogService catalogService;
    @RequestMapping
    public String index(Model model){
        model.addAttribute("view","dashboard");
        return "admin/index";
    }
    @RequestMapping("/catalog")
    public String catalog(Model model){
        model.addAttribute("catalogs",catalogService.findAll());
        model.addAttribute("view","catalog");
        return "admin/index";
    }
    @RequestMapping("/product")
    public String product(Model model){
        model.addAttribute("view","product");
        return "admin/index";
    }

    @RequestMapping("/user")
    public String user(Model model){
        model.addAttribute("view","user");
        return "admin/index";
    }
}
