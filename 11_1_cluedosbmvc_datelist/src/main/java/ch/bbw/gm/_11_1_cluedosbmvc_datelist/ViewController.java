package ch.bbw.gm._11_1_cluedosbmvc_datelist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Giacun
 * @version 07.09.2022
 */
@Controller
public class ViewController {
    @GetMapping("/")
    public String showCluedoView() {
        System.out.println("ViewController.showCluedoView");
        return "CluedoView.html";
    }
}