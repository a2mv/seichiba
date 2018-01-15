package com.pl10.seichiba.controller;

import com.pl10.seichiba.model.ProductoModel;
import com.pl10.seichiba.service.ProductoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("articulo")
public class articuloController {

    private static final Log LOG = LogFactory.getLog(articuloController.class);

    @Autowired
    @Qualifier("productoService")
    private ProductoService productoService;

    @GetMapping("")
    public ModelAndView articulo(@RequestParam(name="articId", required = true) String articId){
        LOG.info("METHOD: articulo() --PARAM articId="+articId);
        ProductoModel productoModel = productoService.findProductoModel(articId);
        ModelAndView model = new ModelAndView("articulo");
        model.addObject("titlePage", "La Vitrina");
        model.addObject("producto",productoModel);
        return model;
    }
}
