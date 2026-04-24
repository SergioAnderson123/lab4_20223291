package controller;


import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import repository.apisRepository;
import repository.endpointsRepository;
import repository.equiposRepository;

@Controller
@RequestMapping("/apis")
public class apisController {

    @Autowired
    apisController apisController;

    @Autowired
    endpointsRepository endpointsRepository;

    @Autowired
    equiposRepository equiposRepository;

    // Lista de todas las apis:
    @GetMapping(value = {"", "/"})
    public String listaApis(Model model) {
        model.addAttribute("listaApis", apisRepository.findAll());
        return "apis/list";
    }




}
