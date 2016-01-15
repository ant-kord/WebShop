package ru.webshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.webshop.service.WebShopService;

/**
 * Created by Administrator on 06.01.2016.
 */
@Controller
public class ProductController {

    @Autowired
    private WebShopService webShopService;

}
