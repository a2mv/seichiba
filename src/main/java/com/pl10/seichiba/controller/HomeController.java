package com.pl10.seichiba.controller;

import com.pl10.seichiba.component.PageRenderComponent;
import com.pl10.seichiba.model.ProductoModel;
import com.pl10.seichiba.service.ProductoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




@Controller
@RequestMapping("/")
public class HomeController {

    private static final Log LOG = LogFactory.getLog(HomeController.class);

    @Autowired
    @Qualifier("productoService")
    private ProductoService productoService;

    @GetMapping("/")
    public ModelAndView index(@RequestParam(name = "page", defaultValue = "0") int page) {
        LOG.info("METHOD: index() --PARAM page="+page);
        Pageable pageRequest = new PageRequest(page, 8);
        Page<ProductoModel> productoModels = productoService.findAllProductoModel(pageRequest);
        PageRenderComponent<ProductoModel> pageRender = new PageRenderComponent<>("/", productoModels);
        ModelAndView model = new ModelAndView("index");
        model.addObject("titlePage", "La Vitrina");
        model.addObject("productos", productoModels);
        model.addObject("page",pageRender);
        LOG.info("RETURNING: index --OBJECTS "+model);
        return model;
    }

    @GetMapping("/articulo")
    public ModelAndView articulo(){
        LOG.info("METHOD: articulo()");
        ModelAndView model = new ModelAndView("articulo");
        model.addObject("titlePage", "La Vitrina");
        return model;
    }

}
