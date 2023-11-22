package ra.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.academy.model.Student;

import java.util.Arrays;

@Controller
public class HomeController {
    @RequestMapping({"/",""})
    public String home(Model model){
        model.addAttribute("name","Nguyễn Văn A");
        model.addAttribute("age",18);
        model.addAttribute("gen",true);
        model.addAttribute("isLogin",false);
        model.addAttribute("list", Arrays.asList(new Student(1,"Nguyễn Văn A",22),new Student(2,"Nguyễn Văn B",23),new Student(1,"Nguyễn Văn C",25)));
        model.addAttribute("student",new Student(1,"Hỗ Xuân Hùng",24));
        model.addAttribute("html","<p style=\"color:red\">Đây là thẻ p</p>");
        return "home";
    }
    @RequestMapping("/nav")
    public String nav(){
        return "assets/navbar";
    }
    @RequestMapping("/local")
    public String local(){
        return "local";
    }
}
