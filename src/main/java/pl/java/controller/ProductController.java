package pl.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import pl.java.model.Product;

@RestController
public class ProductController {

//    @GetMapping("/products")
//    public Page<Product> getProducts(@PageableDefault(size=10) Pageable pageable) {
//        return productService.getProducts(pageable);
//    }


}
