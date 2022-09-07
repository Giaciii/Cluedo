package ch.bbw.gm._11_1_cluedosbmvc_datelist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Giacun
 * @version 07.09.2022
 */
@Controller
public class ViewController {
    @Autowired
    private DataService service;
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String showCluedoView(Model model) {
        System.out.println("ViewController.showCluedoView");
        model.addAttribute("persons", service.getPersons() );
        return "CluedoView.html";
    }
}