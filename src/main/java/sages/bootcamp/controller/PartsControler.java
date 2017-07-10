package sages.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sages.bootcamp.services.PartService;
import sages.bootcamp.werchouse.Part;

import javax.validation.Valid;

@Controller
public class PartsControler {


    private PartService productService;

    @Autowired
    public PartsControler(PartService partService) {
        this.productService = partService;
    }

    @RequestMapping("show-parts.html")
    public ModelAndView getAllProducts() {
        ModelAndView modelAndView = new ModelAndView("part");
        modelAndView.addObject("part", productService.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "part-form.html", method = RequestMethod.GET)
    public ModelAndView showProductForm(@RequestParam(name = "id", required = false) Integer id) {
        ModelAndView modelAndView = new ModelAndView("partForm");
        if (id != null) {
            modelAndView.addObject(productService.findPart(id));
            return modelAndView;
        }
        modelAndView.addObject(new Part());
        return modelAndView;
    }

    @RequestMapping(value = "part-form.html", method = RequestMethod.POST)
    public ModelAndView saveProduct(@Valid @ModelAttribute Part part, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("part");
        }
        if (part.getId() == 0) {

        }
        productService.addPart(part);
        return new ModelAndView("onPartSave", "part", part);
    }

}
