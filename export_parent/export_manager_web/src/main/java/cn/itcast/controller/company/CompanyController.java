package cn.itcast.controller.company;

import cn.itcast.domain.company.Company;
import cn.itcast.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 李嘉腾
 */
@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/list",name = "查询所有企业数据")
    public String findAll(HttpServletRequest request){
        List<Company> companyList = companyService.findAll();
        request.setAttribute("list",companyList);
        return "company/company-list";
    }


}
