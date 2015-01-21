package cn.com.yxtel.client.server;

import cn.com.yxtel.bean.Product;
import cn.com.yxtel.client.model.ProductModel;
import cn.com.yxtel.service.ILoginRemoteService;
import org.springframework.stereotype.Controller;

/**
 * Created by Linhai on 2014/11/28.
 */
@Controller
public class LoginRemoteService  implements ILoginRemoteService{

    @Override
    public Product login() {

        ProductModel product = new ProductModel();
        product.setName("iPad 3");
        product.setQty(999);

        Product product1 = new Product();
        product1.setName(product.getName());
        System.out.print(product1);
        return product1;
    }

    @Override
    public Product login2(String username ,String mail) {

        ProductModel product = new ProductModel();
        product.setName(username);
        product.setMail(mail);

        Product product1 = new Product();
        product1.setName(product.getName());
        product1.setMail(product.getMail());
        System.out.print(product1);
        return product1;
    }
}
