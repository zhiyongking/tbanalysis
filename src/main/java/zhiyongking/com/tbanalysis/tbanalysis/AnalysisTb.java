package zhiyongking.com.tbanalysis.tbanalysis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AnalysisTb{
    @GetMapping("/anaindex")
    String anaInde(Model model) {

        String[] x = {"衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"};
        int[] y = {5, 20, 36, 10, 10, 20};
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "anaindex";
    }
}}
